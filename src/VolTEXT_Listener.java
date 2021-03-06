import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import org.apache.pdfbox.util.Matrix;

import classes.DIV_Item;
import classes.IMG_Item;
import classes.Item_Container;
import classes.Item_TOT;
import classes.LIST_Item;
import classes.PAGE_Item;
import classes.PDF_Item;
import classes.TXT_Item;
import classes.UnitConverter;
import rst.pdfbox.layout.elements.Paragraph;
import rst.pdfbox.layout.text.Alignment;
import rst.pdfbox.layout.text.BaseFont;
import rst.pdfbox.layout.text.Indent;
import rst.pdfbox.layout.text.Position;
import rst.pdfbox.layout.text.SpaceUnit;
import rst.pdfbox.layout.util.CompatibilityHelper;
import rst.pdfbox.layout.util.Enumerators.RomanEnumerator;

public class VolTEXT_Listener implements VolTextListener {
	public Item_Container container;
	public PDDocument PDF_doc;
	public PDPage PDF_page;
	public int n_page;
	public float prev_angle;

	public VolTEXT_Listener()
	{
		container = new Item_Container();
		n_page = -1;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPdf(VolTextParser.PdfContext ctx) { 
		try {
			PDF_doc = new PDDocument();
			container.setDoc(new PDF_Item());
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally {
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPdf(VolTextParser.PdfContext ctx) { 
		try {
			PDF_doc.save(container.getDoc().getPath() + container.getDoc().getTitle() + ".pdf");
			PDF_doc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStylesheet(VolTextParser.StylesheetContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStylesheet(VolTextParser.StylesheetContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElement(VolTextParser.ElementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElement(VolTextParser.ElementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttrStyle(VolTextParser.AttrStyleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttrStyle(VolTextParser.AttrStyleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPage(VolTextParser.PageContext ctx) {
		n_page = n_page + 1;
		PDF_page = (new PDPage(PDRectangle.A4));
		PDF_doc.addPage(PDF_page);
		container.setPage(new PAGE_Item());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPage(VolTextParser.PageContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPae(VolTextParser.PaeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPae(VolTextParser.PaeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDiv(VolTextParser.DivContext ctx) {
		container.setDiv(new DIV_Item());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 * @throws IOException 
	 */
	@Override public void exitDiv(VolTextParser.DivContext ctx){
		float h_p = PDF_page.getMediaBox().getHeight();
		try (PDPageContentStream cont = new PDPageContentStream(PDF_doc, PDF_page, AppendMode.APPEND, true))
		{
			DIV_Item div = container.getDiv();
			float height_mm = UnitConverter.convPointmm(  h_p);
			System.out.println(PDF_page.getArtBox().getWidth());
			float width_mm = UnitConverter.convPointmm(  PDF_page.getArtBox().getWidth());
			if(container.getDiv().getRGBAcolor() != null) cont.setNonStrokingColor(div.getRGBAcolor());
			PDExtendedGraphicsState graph = new PDExtendedGraphicsState();
			if(container.getDiv().getRGBAcolor() != null) graph.setStrokingAlphaConstant((float) (div.getRGBAcolor().getAlpha() / 255f));
			
			if(div.getUnitX().toCharArray()[0] == '%')
			{
				div.setUnitX("mm");
				if(div.getPosX() >= 0)
					div.setPosX(width_mm * div.getPosX() / 100);
				else
					div.setPosX(width_mm - div.getWidth() + width_mm * div.getPosX() / 100);
			}
			else if(div.getUnitX() == "pt")
			{
				div.setUnitX("mm");
				if(div.getPosX() >= 0)
					div.setPosX(UnitConverter.convPointmm(div.getPosX()));
				else
					div.setPosX(width_mm - div.getWidth() + UnitConverter.convPointmm(div.getPosX()));
			}
			else
			{
				if(div.getPosX() < 0)
					div.setPosX(width_mm - div.getWidth() + div.getPosX());
			}
			
			if(div.getUnitY().toCharArray()[0] == '%')
			{
				div.setUnitY("mm");
				if(div.getPosY() >= 0)
					div.setPosY(height_mm * div.getPosY() / 100);
				else
					div.setPosY(height_mm - div.getHeight() + height_mm * div.getPosY() / 100);
			}
			else if(div.getUnitY() == "pt")
			{
				div.setUnitY("mm");
				if(div.getPosY() >= 0)
					div.setPosY(UnitConverter.convPointmm(div.getPosY()));
				else
					div.setPosY(height_mm - div.getHeight() + UnitConverter.convPointmm(div.getPosY()));
			}
			else
			{
				if(div.getPosY() < 0)
					div.setPosY(height_mm - div.getHeight() + div.getPosY());
			}
			
			if(div.isFitX())
			{
				div.setWidth(width_mm);
				div.setPosX(0f);
			}
			if(div.isFitY())
			{
				div.setPosY(0f);
				div.setHeight(height_mm);
			}
			if(div.getPosX() + div.getWidth() > width_mm)
			{
				div.setWidth(width_mm - div.getPosX());
			}
			if(div.getPosY() + div.getHeight() > height_mm)
			{
				div.setHeight(height_mm - div.getPosY());
			}

			if(!div.isFitX() && div.getPosition() != "")
			{
				switch(div.getPosition().toCharArray()[0])
				{
				case 'l':
					div.setPosX(0f);
					break;
				case 'c':
					div.setPosX((width_mm - div.getWidth()) / 2);
					break;
				case 'r':
					div.setPosX(width_mm - div.getWidth());
					break;
				}
			}

			if(!div.isFitY() && div.getPosition() != "")
			{
				switch(div.getPosition().toCharArray()[1])
				{
				case 'b':
					div.setPosY(0f);
					break;
				case 'c':
					div.setPosY((height_mm - div.getHeight()) / 2);
					break;
				case 't':
					div.setPosY(height_mm - div.getHeight());
					break;
				}
			}
			container.setDiv(div);

			float dimx = UnitConverter.convmmPoint(div.getWidth());
			float dimy = UnitConverter.convmmPoint(div.getHeight());
			/* transform */
			//cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint((float)div.getPosX())+dimx/2, h_p-dimy/2-UnitConverter.convmmPoint((float)div.getPosY())));
			cont.transform(Matrix.getRotateInstance(Math.toRadians(div.getAngle_Rotation()), 0, 0));
			//TH not needed previousAngle = tAngles[i - 1];
			//cont.transform(Matrix.getRotateInstance(Math.toRadians(div.getAngle_Rotation()), 0, 0));
			cont.addRect(UnitConverter.convmmPoint(div.getPosX()), h_p - dimy - UnitConverter.convmmPoint(div.getPosY()), dimx, dimy);
			cont.setGraphicsStateParameters(graph);
			cont.saveGraphicsState();
			cont.fill();
			//cont.transform(Matrix.getTranslateInstance(-(UnitConverter.convmmPoint((float)div.getPosX())+dimx/2), -(h_p-dimy/2-UnitConverter.convmmPoint((float)div.getPosY()))));
			cont.transform(Matrix.getRotateInstance(Math.toRadians(-div.getAngle_Rotation()), 0, 0));
			
			cont.close();
			//cont.restoreGraphicsState();
			//la riga seguente serve per la gestione dell'uscita da un div, che implica anche che gli
			//elementi interni a esso devono avere dimensione e posizione interne a esso, quindi vanno controllate
			//che le dimensioni e le posizioni non siano maggiori del div. inoltre se il div � ruotato, anche l'immagine o l'elemento interno deve essere ruotato
			addItemToDiv(container.getList_tot(), div.getWidth(), div.getHeight());
			container.setDiv(null);
			
		}
		catch(IOException ioex)
		{
			System.out.println(ioex);
		}
		container.getList_tot().clear();
	}

	public void addItemToDiv(List<Item_TOT> list, float div_width, float div_height)
	{
		for(Item_TOT item : list)
		{
			if(item.getUnitX().toCharArray()[0] == '%')
			{
				item.setUnitX("mm");
				if(item.getPosX() >= 0)
					item.setPosX(div_width * (item.getPosX() / 100));
				else
					item.setPosX(div_width - item.getWidth() + div_width * (item.getPosX() / 100));
			}
			else if(item.getUnitX() == "pt")
			{
				item.setUnitX("mm");
				if(item.getPosX() >= 0)
					item.setPosX(UnitConverter.convPointmm(item.getPosX()));
				else
					item.setPosX(div_width - item.getWidth() + UnitConverter.convPointmm(item.getPosX()));
			}
			else
			{
				if(item.getPosX() < 0)
					item.setPosX(div_width - item.getWidth() + item.getPosX());
			}
				
			if(item.getUnitY().toCharArray()[0] == '%')
			{
				item.setUnitY("mm");
				if(item.getPosY() >= 0)
					item.setPosY(div_height * (item.getPosY() / 100));
				else
					item.setPosY(div_height - item.getHeight() + div_height * (item.getPosY() / 100));
			}
			else if(item.getUnitY() == "pt")
			{
				item.setUnitY("mm");
				if(item.getPosY() >= 0)
					item.setPosY(UnitConverter.convPointmm(item.getPosY()));
				else
					item.setPosY(div_height - item.getHeight() + UnitConverter.convPointmm(item.getPosY()));
			}
			else
			{
				if(item.getPosY() < 0)
					item.setPosY(div_height - item.getHeight() + item.getPosY());
			}
				
			if(item.getUnitWidth().toCharArray()[0] == '%')
			{
				item.setUnitWidth("mm");
				item.setWidth(container.getDiv().getWidth() * (item.getWidth() / 100));
			}
			else if(item.getUnitWidth() == "pt")
			{
				item.setUnitWidth("mm");
				item.setWidth(UnitConverter.convPointmm(item.getWidth()));
			}
				
			if(item.getUnitHeight().toCharArray()[0] == '%')
			{
				item.setUnitHeight("mm");
				item.setHeight(container.getDiv().getHeight() * (item.getHeight() / 100));
			}
			else if(item.getUnitWidth() == "pt")
			{
				item.setUnitHeight("mm");
				item.setHeight(UnitConverter.convPointmm(item.getHeight()));
			}
			
			PDF_page = PDF_doc.getPage(n_page);
			float heigthPage = PDF_page.getMediaBox().getHeight();
			if(item.getType() == "IMG")
			{
				String Path = item.getURL();
				
				try {
					PDImageXObject pdImage =  PDImageXObject.createFromFile(Path, PDF_doc);
					PDPageContentStream cont = new PDPageContentStream(PDF_doc, PDF_page, AppendMode.APPEND, true); 
					if(item.getPosX() >= 0 && item.getPosX() <= container.getDiv().getWidth())
					{
						if(item.isFitX())
						{
							item.setPosX(container.getDiv().getPosX());
							item.setWidth(container.getDiv().getWidth());
						}
						else {
						if(item.getWidth() > container.getDiv().getWidth())
						{
							item.setWidth(container.getDiv().getWidth() - item.getPosX());
						}
						item.setPosX(container.getDiv().getPosX() + item.getPosX());
						}
						if(item.getPosition() != "" && !item.isFitX())
						{
							switch(item.getPosition().toCharArray()[0])
							{
							case 'l':
								item.setPosX(container.getDiv().getPosX());
								break;
							case 'c':
								item.setPosX(container.getDiv().getPosX() + (container.getDiv().getWidth() - item.getWidth()) / 2);
								break;
							case 'r':
								item.setPosX(container.getDiv().getPosX() + container.getDiv().getWidth() - item.getWidth());
								break;
							}
						}
					}

					if(item.getPosY() >= 0 && item.getPosY() <= container.getDiv().getHeight())
					{
						if(item.isFitY())
						{
							item.setHeight(container.getDiv().getHeight() - item.getPosY());
							item.setPosY(container.getDiv().getPosY());
						}
						else {
						if(item.getHeight() > container.getDiv().getHeight())
						{
							item.setHeight(container.getDiv().getHeight() - item.getPosY());
						}
						item.setPosY(container.getDiv().getPosY() + item.getPosY());
						}
						if(item.getPosition() != "" && !item.isFitY())
						{
							switch(item.getPosition().toCharArray()[1])
							{
							case 'b':
								item.setPosY(container.getDiv().getPosY());
								break;
							case 'c':
								item.setPosY(container.getDiv().getPosY() + (container.getDiv().getHeight() - item.getHeight()) / 2);
								break;
							case 't':
								item.setPosY(container.getDiv().getPosY() + container.getDiv().getHeight() - item.getHeight());
								break;
							}
						}
					}
					float dimx=UnitConverter.convmmPoint(item.getWidth());
					float dimy=UnitConverter.convmmPoint(item.getHeight());
					/* transform */
					cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint((float)item.getPosX())+dimx/2, heigthPage-dimy/2-UnitConverter.convmmPoint((float)item.getPosY())));
					cont.transform(Matrix.getRotateInstance(Math.toRadians(item.getAngle_Rotation()), 0, 0));
					cont.transform(Matrix.getTranslateInstance(-(UnitConverter.convmmPoint((float)item.getPosX())+dimx/2), -(heigthPage-dimy/2-UnitConverter.convmmPoint((float)item.getPosY()))));

					cont.drawImage(pdImage, UnitConverter.convmmPoint((float)item.getPosX()), heigthPage-dimy-UnitConverter.convmmPoint((float)item.getPosY()), dimx, dimy);
					cont.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(item.getType() == "TXT")
			{
				try {
					Paragraph p = new Paragraph();
					
					if(item.getPosX() >= 0 && item.getPosX() <= container.getDiv().getWidth())
					{
						if(item.isFitX())
						{
							item.setPosX(container.getDiv().getPosX());
							item.setWidth(container.getDiv().getWidth());
						}
						else {
							if(item.getWidth() > container.getDiv().getWidth())
							{
								item.setWidth(container.getDiv().getWidth() - item.getPosX());
							}
							item.setPosX(container.getDiv().getPosX() + item.getPosX());
						}
						if(item.getPosition() != "" && !item.isFitX())
						{
							switch(item.getPosition().toCharArray()[0])
							{
								case 'l':
									item.setPosX(container.getDiv().getPosX());
									break;
								case 'c':
									item.setPosX(container.getDiv().getPosX() + (container.getDiv().getWidth() - item.getWidth()) / 2);
									break;
								case 'r':
									item.setPosX(container.getDiv().getPosX() + container.getDiv().getWidth() - item.getWidth());
									break;
								default:
									item.setPosX(container.getDiv().getPosX());
									break;
							}
						}
					}

					if(item.getPosY() >= 0 && item.getPosY() <= container.getDiv().getHeight())
					{
						if(item.isFitY())
						{
							item.setHeight(container.getDiv().getHeight());
							item.setPosY(container.getDiv().getPosY());
						}
						else {
							if(item.getHeight() > container.getDiv().getHeight())
							{
								item.setHeight(container.getDiv().getHeight() - item.getPosY());
							}
							item.setPosY(container.getDiv().getPosY() + item.getPosY());
						}
						if(item.getPosition() != "" && !item.isFitY())
						{
							switch(item.getPosition().toCharArray()[1])
							{
							case 'b':
								item.setPosY(container.getDiv().getPosY());
								break;
							case 'c':
								item.setPosY(container.getDiv().getPosY() + (container.getDiv().getHeight() - item.getHeight()) / 2);
								break;
							case 't':
								item.setPosY(container.getDiv().getPosY() + container.getDiv().getHeight() - item.getHeight());
								break;
							default:
								item.setPosY(container.getDiv().getPosY());
								break;
							}
						}
					}
					p.setMaxWidth(UnitConverter.convmmPoint(item.getWidth()));
					BaseFont font=null;
					int bNum=0;
					int iNum=0;
					int uNum=0;
					for(String parola :item.getText().split(" ")) {
						if(parola=="bold") {
							bNum++;
						}
						if(parola=="\\italic") {
							iNum++;
						}
						if(parola=="\\underline") {
							uNum++;
						}
						
					}
					item.getText().replace("*", "\\*");
					item.getText().replace("_", "\\_");
					if(bNum%2==0)
						item.getText().replace("\\\\bold", "*");
					if(iNum%2==0)
						item.getText().replace("\\\\italic", "_");
					if(uNum%2==0)
						item.getText().replace("\\\\underline", " __ ");
					
					if(item.getFontFamily()!=null && item.getFontFamily()!="") {
						switch(item.getFontFamily().toLowerCase())
						{
							case "helvetica":
								font=BaseFont.Helvetica;
								if(item.isBold())
									if(item.isItalics())
										item.setText("*_"+item.getText()+"_*");
									else
										item.setText("*"+item.getText()+"*");
								else if(item.isItalics())
									item.setText("_"+item.getText()+"_");
								
								break;
							case "courier":
								font=BaseFont.Courier;
								if(item.isBold())
									if(item.isItalics())
										item.setText("*_"+item.getText()+"_*");
									else
										item.setText("*"+item.getText()+"*");
								else if(item.isItalics())
									item.setText("_"+item.getText()+"_");
								break;
							case "times":
								font=BaseFont.Times;
								if(item.isBold())
									if(item.isItalics())
										item.setText("*_"+item.getText()+"_*");
									else
										item.setText("*"+item.getText()+"*");
								else if(item.isItalics())
									item.setText("_"+item.getText()+"_");
								break;
							default:
								font=BaseFont.Helvetica;
								if(item.isBold())
									if(item.isItalics())
										item.setText("*_"+item.getText()+"_*");
									else
										item.setText("*"+item.getText()+"*");
								else if(item.isItalics())
									item.setText("_"+item.getText()+"_");
								break;
						}
					}else {
						if(item.getFontFamilyTTF()!="") {
							//DUBBI SU QUESTA:
							font = BaseFont.valueOf(PDType0Font.load(PDF_doc, new File(item.getFontFamilyTTF())).getBaseFont());
							if(item.isBold())
								if(item.isItalics())
									item.setText("*_"+item.getText()+"_*");
								else
									item.setText("*"+item.getText()+"*");
							else if(item.isItalics())
								item.setText("_"+item.getText()+"_");
							//nel case applicare questa:
							//p.addText(item.getText(), item.getFontSize(), PDType0Font.load(PDF_doc, new File(item.getFontFamilyTTF())));
							break;
						}else {
							font=BaseFont.Helvetica;
							if(item.isBold())
								if(item.isItalics())
									item.setText("*_"+item.getText()+"_*");
								else
									item.setText("*"+item.getText()+"*");
							else if(item.isItalics())
								item.setText("_"+item.getText()+"_");
						}
					}
					if(item.isUnderline()) {
						item.setText("__"+item.getText()+"__");
					}
					if(item.getRGBAcolor() != null) item.setText("{color:#"+Integer.toHexString(item.getRGBAcolor().getRed())+
																			Integer.toHexString(item.getRGBAcolor().getGreen())+
																			Integer.toHexString(item.getRGBAcolor().getBlue())+"}"+item.getText()+"{color:#000000");
					//p.addText(item.getText(), item.getFontSize(), font);
					p.addMarkup(item.getText(), item.getFontSize(), font);
					
					if(item.getWidth()>container.getDiv().getWidth() || item.getHeight()>container.getDiv().getHeight()) {
						System.out.println("Testo " + item.getID() +" nel div "+ container.getDiv().getID()+" troncato");
						if(item.getHeight()>container.getDiv().getHeight()) {
							//item.setHeight(container.getDiv().getHeight());
							System.out.println("Altezza testo " + item.getID() +" nel div "+ container.getDiv().getID()+" troppo grande. Riscrivere il testo");
						}
						if(p.getHeight()>container.getDiv().getHeight()) {
							System.out.println("Testo " + item.getID() +" nel div "+ container.getDiv().getID()+" con troppe righe. Riscrivere il testo");
							//item.setHeight(container.getDiv().getHeight());
						}
					}
					Alignment al=null;		
					if(item.getAlignment()!=null) {
						if(item.getAlignment().toLowerCase()=="left"||
								item.getAlignment().toLowerCase()=="center"||
								item.getAlignment().toLowerCase()=="right"||
								item.getAlignment().toLowerCase()=="justify")
							al=Alignment.valueOf(item.getAlignment().toLowerCase());
						else
							al=Alignment.Left;
					}else
						al=Alignment.Left;
					Position pt=new Position(UnitConverter.convmmPoint(item.getPosX()),UnitConverter.convmmPoint(item.getPosY()));
					
					float w_mm=UnitConverter.convPointmm(container.getDiv().getWidth());
					float h_mm=UnitConverter.convPointmm(container.getDiv().getHeight());
					if(item.getPosX()<=w_mm)
						if(item.getWidth()+item.getPosX()>w_mm) {
							p.setMaxWidth(container.getDiv().getWidth());
							item.setWidth(container.getDiv().getWidth());
						}else
							p.setMaxWidth(item.getWidth());
					else
						System.out.println("Testo " + item.getID() + " in posizione esterna al div "+container.getDiv().getID() + " .");
					if(item.getPosY()+item.getHeight()>h_mm) {
						System.out.println("Il testo " + item.getID() +" eccede i limiti del div" + container.getDiv().getID() + ". Riscrivere il testo.");
					}	
					float dimx=UnitConverter.convmmPoint(item.getWidth());
		            float dimy=UnitConverter.convmmPoint(item.getHeight());
					//DOMANDA: la posizione di un elemento interno � relativa al div di cui fa parte?
										
					if(pt.getY()<0) {
						System.out.println("Il testo " + item.getID() +" eccede i limiti del del div" + container.getDiv().getID() + ". Riscrivere il testo.");
					}
					
					/* transform */
					PDPageContentStream cont=new PDPageContentStream(PDF_doc, PDF_page,AppendMode.APPEND, true);
		            cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint((float)item.getPosX())+dimx/2, PDF_page.getMediaBox().getHeight()-dimy/2-UnitConverter.convmmPoint((float)item.getPosY())));
		            cont.transform(Matrix.getRotateInstance(Math.toRadians(item.getAngle_Rotation()), 0, 0));
		            cont.transform(Matrix.getTranslateInstance(-(UnitConverter.convmmPoint((float)item.getPosX())+dimx/2), -(PDF_page.getMediaBox().getHeight()-dimy/2-UnitConverter.convmmPoint((float)item.getPosY()))));
					//cont.saveGraphicsState();
					cont.fill();
					p.drawText(cont, pt,al, null);
					cont.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			else if(item.getType() == "LIST")
			{

			}
			else
			{
				System.out.println("Elemento non riconosciuto.");
			}
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElemd(VolTextParser.ElemdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElemd(VolTextParser.ElemdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterImg(VolTextParser.ImgContext ctx) { 
		container.setImg(new IMG_Item(ctx.imgElem().STRING().toString().substring(1, ctx.imgElem().STRING().toString().length() - 1)));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitImg(VolTextParser.ImgContext ctx) {
		try {
			PDF_page = PDF_doc.getPage(n_page);
			float heigthPage = PDF_page.getMediaBox().getHeight();

			String Path = ctx.imgElem().STRING().toString().substring(1, ctx.imgElem().STRING().toString().length() - 1);
			PDImageXObject pdImage =  PDImageXObject.createFromFile(Path, PDF_doc);

			PDPageContentStream cont = new PDPageContentStream(PDF_doc, PDF_page, AppendMode.APPEND, true); 
			IMG_Item img = container.getImg();
			img.setURL(Path);
			
			if(img.getWidth()==null && img.getHeight()==null)
			{
				img.setWidth(UnitConverter.convPointmm((float)pdImage.getWidth()));
				img.setHeight(UnitConverter.convPointmm((float)pdImage.getHeight()));
			}

			//DOMANDA: la posizione di un elemento interno � relativa al div di cui fa parte?

			if(container.getDiv() == null)
			{
				float w_mm = UnitConverter.convPointmm(PDF_page.getMediaBox().getWidth());
				float h_mm = UnitConverter.convPointmm(PDF_page.getMediaBox().getHeight());
				
				if(img.getUnitWidth().contentEquals("%"))
				{
					img.setUnitWidth("mm");
					img.setWidth(w_mm * img.getWidth() / 100);
				}
				else if(img.getUnitWidth().contentEquals("pt"))
				{
					img.setUnitWidth("mm");
					img.setWidth(UnitConverter.convPointmm(img.getWidth()));
				}
				
				if(img.getUnitHeight().contentEquals("%"))
				{
					img.setUnitHeight("mm");
					img.setHeight(h_mm * img.getHeight() / 100);
				}
				else if(img.getUnitHeight().contentEquals("pt"))
				{
					img.setUnitHeight("mm");
					img.setHeight(UnitConverter.convPointmm(img.getHeight()));
				}
				
				if(img.getUnitX().contentEquals("%"))
				{
					img.setUnitX("mm");
					if(img.getPosX() >= 0)
						img.setPosX(w_mm * img.getPosX() / 100);
					else
						img.setPosX(w_mm - img.getWidth() + w_mm * img.getPosX() / 100);
				}
				else if(img.getUnitX().contentEquals("pt"))
				{
					img.setUnitX("mm");
					if(img.getPosX() >= 0)
						img.setPosX(UnitConverter.convPointmm(img.getPosX()));
					else
						img.setPosX(w_mm - img.getWidth() + UnitConverter.convPointmm(img.getPosX()));
				}
				else
				{
					if(img.getPosX() < 0)
						img.setPosX(w_mm - img.getWidth() + img.getPosX());
				}
				
				if(img.getUnitY().contentEquals("%"))
				{
					img.setUnitY("mm");
					if(img.getPosY() >= 0)
						img.setPosY(h_mm * img.getPosY() / 100);
					else
						img.setPosY(h_mm - img.getHeight() + h_mm * img.getPosY() / 100);
				}
				else if(img.getUnitY().contentEquals("pt"))
				{
					img.setUnitY("mm");
					if(img.getPosY() >= 0)
						img.setPosY(UnitConverter.convPointmm(img.getPosY()));
					else
						img.setPosY(h_mm - img.getHeight() + UnitConverter.convPointmm(img.getPosY()));
				}
				else
				{
					if(img.getPosY() < 0)
						img.setPosY(h_mm - img.getHeight() + img.getPosY());
				}
				
				if(img.isFitX())
				{
					img.setWidth(w_mm);
					img.setPosX(0f);
				}
				if(img.isFitY())
				{
					img.setHeight(h_mm);
					img.setPosY(0f);
				}
				if(img.getPosX() + img.getWidth() > w_mm)
				{
					img.setWidth(w_mm - img.getPosX());
				}
				if(img.getPosY() + img.getHeight() > h_mm)
				{
					img.setHeight(h_mm - img.getPosY());
				}
				if(img.getPosition() != "")
				{
					if(!img.isFitX())
					{
						switch(img.getPosition().toCharArray()[0])
						{
						case 'l':
							img.setPosX(0f);
							break;
						case 'c':
							img.setPosX((w_mm - img.getWidth()) / 2);
							break;
						case 'r':
							img.setPosX(w_mm - img.getWidth());
							break;
						}
					}

					if(!img.isFitY())
					{
						switch(img.getPosition().toCharArray()[1])
						{
						case 'b':
							img.setPosY(0f);
							break;
						case 'c':
							img.setPosY((h_mm - img.getHeight()) / 2);
							break;
						case 't':
							img.setPosY(h_mm - img.getHeight());
							break;
						}
					}


				}

			}


			if(container.getDiv() != null)
			{
				Item_TOT i = new Item_TOT("IMG", false, 
						null, 
						img.getID(), 
						"", 
						0, 
						null, 
						false, 
						false, 
						false, 
						img.getPosition(), 
						img.getPosX(), 
						img.getPosY(), 
						img.getAngle_Rotation(), 
						img.getWidth(), img.getHeight(), 
						img.isFitX(), 
						img.isFitY(), 
						null,
						img.getLayer(), 
						"", 
						"", 
						img.getURL(), img.getUnitX(), img.getUnitY(), img.getUnitWidth(), img.getUnitHeight());
				container.getList_tot().add(i);
			}
			else
			{
				float dimx=UnitConverter.convmmPoint(img.getWidth());
				float dimy=UnitConverter.convmmPoint(img.getHeight());
				/* transform */
				cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint((float)img.getPosX())+dimx/2, heigthPage-dimy/2-UnitConverter.convmmPoint((float)img.getPosY())));
				cont.transform(Matrix.getRotateInstance(Math.toRadians(img.getAngle_Rotation()), 0, 0));
				cont.transform(Matrix.getTranslateInstance(-(UnitConverter.convmmPoint((float)img.getPosX())+dimx/2), -(heigthPage-dimy/2-UnitConverter.convmmPoint((float)img.getPosY()))));

				cont.drawImage(pdImage, UnitConverter.convmmPoint((float)img.getPosX()), heigthPage-dimy-UnitConverter.convmmPoint((float)img.getPosY()), dimx, dimy);
			}
			cont.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterImgElem(VolTextParser.ImgElemContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitImgElem(VolTextParser.ImgElemContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterText(VolTextParser.TextContext ctx) { 
		container.setTxt(new TXT_Item());

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitText(VolTextParser.TextContext ctx) {
		try {
			float h_p = PDF_page.getMediaBox().getHeight();
			
			
			TXT_Item txt=container.getTxt();
			if(container.getDiv() != null)
			{
				Item_TOT i = new Item_TOT("TXT", 
						false, 
						null, 
						txt.getID(), 
						txt.getFontFamily(), 
						txt.getFontSize(), 
						txt.getRGBAcolor(), 
						txt.isBold(), 
						txt.isItalics(), 
						txt.isUnderline(), 
						txt.getPosition(), 
						txt.getPosX(), 
						txt.getPosY(), 
						txt.getAngle_Rotation(), 
						txt.getWidth(), 
						txt.getHeight(), 
						txt.isFitX(), 
						txt.isFitY(), 
						txt.getAlignment(),
						txt.getLayer(), 
						txt.getText(), 
						txt.getFontFamilyTTF(), 
						"",
						txt.getUnitX(), 
						txt.getUnitY(), 
						txt.getUnitWidth(), 
						txt.getUnitHeight());
				container.getList_tot().add(i);
			}
			else
			{
				Alignment al=null;
				float w_mm = UnitConverter.convPointmm(PDF_page.getMediaBox().getWidth());
				float h_mm = UnitConverter.convPointmm(PDF_page.getMediaBox().getHeight());
				if(txt.getUnitX().toCharArray()[0] == '%')
				{
					txt.setUnitX("mm");
					if(txt.getPosX() >= 0)
						txt.setPosX(w_mm * (txt.getPosX() / 100));
					else
						txt.setPosX(w_mm - txt.getWidth() + w_mm * (txt.getPosX() / 100));
				}
				else if(txt.getUnitX() == "pt")
				{
					txt.setUnitX("mm");
					if(txt.getPosX() >= 0)
						txt.setPosX(UnitConverter.convPointmm(txt.getPosX()));
					else
						txt.setPosX(w_mm - txt.getWidth() + UnitConverter.convPointmm(txt.getPosX()));
				}
				else
				{
					if(txt.getPosX() < 0)
						txt.setPosX(w_mm - txt.getWidth() + txt.getPosX());
				}
					
				if(txt.getUnitY().toCharArray()[0] == '%')
				{
					txt.setUnitY("mm");
					if(txt.getPosY() >= 0)
						txt.setPosY(h_mm * (txt.getPosY() / 100));
					else
						txt.setPosY(h_mm - txt.getHeight() + h_mm * (txt.getPosY() / 100));
				}
				else if(txt.getUnitY() == "pt")
				{
					txt.setUnitY("mm");
					if(txt.getPosY() >= 0)
						txt.setPosY(UnitConverter.convPointmm(txt.getPosY()));
					else
						txt.setPosY(h_mm - txt.getHeight() + UnitConverter.convPointmm(txt.getPosY()));
				}
				else
				{
					if(txt.getPosY() < 0)
						txt.setPosY(h_mm - txt.getHeight() + txt.getPosY());
				}
					
				if(txt.getUnitWidth().toCharArray()[0] == '%')
				{
					txt.setUnitWidth("mm");
					if(txt.getWidth()!=null)
					txt.setWidth(w_mm * (txt.getWidth() / 100));
				}
				else if(txt.getUnitWidth() == "pt")
				{
					txt.setUnitWidth("mm");
					txt.setWidth(UnitConverter.convPointmm(txt.getWidth()));
				}
					
				if(txt.getUnitHeight().toCharArray()[0] == '%')
				{
					txt.setUnitHeight("mm");
					txt.setHeight(h_mm * (txt.getHeight() / 100));
				}
				else if(txt.getUnitWidth() == "pt")
				{
					txt.setUnitHeight("mm");
					txt.setHeight(UnitConverter.convPointmm(txt.getHeight()));
				}
				
				if(txt.isFitX())
				{
					txt.setWidth(w_mm);
					txt.setPosX(0f);
					
				}
				if(txt.isFitY())
				{
					txt.setHeight(h_mm);
					txt.setPosY(0f);
				}
				if(txt.getWidth()==null) {
					txt.setWidth(w_mm-txt.getPosX());
				}
				if(txt.getHeight()==null) {
					txt.setHeight(w_mm-txt.getPosY());
				}
				if(txt.getPosX() + txt.getWidth() > w_mm)
				{
					txt.setWidth(w_mm - txt.getPosX());
				}
				if(txt.getPosY() + txt.getHeight() > h_mm)
				{
					txt.setHeight(h_mm - txt.getPosY());
				}
				if(txt.getPosition() != "")
				{
					if(!txt.isFitX())
					{
						switch(txt.getPosition().toCharArray()[0])
						{
							case 'l':
								txt.setPosX(0f);
								
								break;
							case 'c':
								txt.setPosX((w_mm - txt.getWidth()) / 2);
								
								break;
							case 'r':
								txt.setPosX(w_mm - txt.getWidth());
								
								break;
							default:
								txt.setPosX(0f);
								
								break;
						}
					}

					if(!txt.isFitY())
					{
						switch(txt.getPosition().toCharArray()[1])
						{
							case 'b':
								txt.setPosY(0f);
								break;
							case 'c':
								txt.setPosY((h_mm - txt.getHeight()) / 2);
								break;
							case 't':
								txt.setPosY(h_mm - txt.getHeight());
								break;
							default:
								txt.setPosY(0f);
								break;
						}
					}


				}
				if(txt.getAlignment()!=null) {
					if(txt.getAlignment().toLowerCase()=="left"||
							txt.getAlignment().toLowerCase()=="center"||
							txt.getAlignment().toLowerCase()=="right"||
							txt.getAlignment().toLowerCase()=="justify")
						al=Alignment.valueOf(txt.getAlignment().toLowerCase());
					else
						al=Alignment.Left;
				}else
					al=Alignment.Left;

			Paragraph p = new Paragraph();
			p.setMaxWidth(UnitConverter.convmmPoint(txt.getWidth()));
			// Create a new font object by loading a TrueType font into the document
			BaseFont font=null;
			int bNum=0;
			int iNum=0;
			for(String parola : txt.getText().split(" ")) {
				if(parola.contains("\\bold")) {
					bNum++;
				}
				if(parola.contains("\\italic")) {
					iNum++;
				}
							
			}
			txt.getText().replace("*", "\\*");
			txt.getText().replace("_", "\\_");
			if(bNum%2==0)
				txt.setText(txt.getText().replace("\\\\bold", "*"));
			if(iNum%2==0)
				txt.setText(txt.getText().replace("\\\\italic", "_"));
			
			if(txt.getFontFamily()!=null && txt.getFontFamily()!="") {
				switch(txt.getFontFamily().toLowerCase())
				{
					case "helvetica":
						font=BaseFont.Helvetica;
						if(txt.isBold())
							if(txt.isItalics())
								txt.setText("*_"+txt.getText()+"_*");
							else
								txt.setText("*"+txt.getText()+"*");
						else if(txt.isItalics())
							txt.setText("_"+txt.getText()+"_");
						
						break;
					case "courier":
						font=BaseFont.Courier;
						if(txt.isBold())
							if(txt.isItalics())
								txt.setText("*_"+txt.getText()+"_*");
							else
								txt.setText("*"+txt.getText()+"*");
						else if(txt.isItalics())
							txt.setText("_"+txt.getText()+"_");
						break;
					case "times":
						font=BaseFont.Times;
						if(txt.isBold())
							if(txt.isItalics())
								txt.setText("*_"+txt.getText()+"_*");
							else
								txt.setText("*"+txt.getText()+"*");
						else if(txt.isItalics())
							txt.setText("_"+txt.getText()+"_");
						break;
					default:
						font=BaseFont.Helvetica;
						if(txt.isBold())
							if(txt.isItalics())
								txt.setText("*_"+txt.getText()+"_*");
							else
								txt.setText("*"+txt.getText()+"*");
						else if(txt.isItalics())
							txt.setText("_"+txt.getText()+"_");
						break;
				}
			}else {
				if(txt.getFontFamilyTTF()!="" && txt.getFontFamilyTTF()!=null) {
					//DUBBI SU QUESTA:
					font = BaseFont.valueOf(PDType0Font.load(PDF_doc, new File(txt.getFontFamilyTTF())).getBaseFont());
					if(txt.isBold())
						if(txt.isItalics())
							txt.setText("*_"+txt.getText()+"_*");
						else
							txt.setText("*"+txt.getText()+"*");
					else if(txt.isItalics())
						txt.setText("_"+txt.getText()+"_");
					//nel case applicare questa:
					//p.addText(item.getText(), item.getFontSize(), PDType0Font.load(PDF_doc, new File(item.getFontFamilyTTF())));
					
				}else {
					font=BaseFont.Helvetica;
					if(txt.isBold())
						if(txt.isItalics())
							txt.setText("*_"+txt.getText()+"_*");
						else
							txt.setText("*"+txt.getText()+"*");
					else if(txt.isItalics())
						txt.setText("_"+txt.getText()+"_");
				}
			}
			if(txt.isUnderline()) {
				
        		PDAnnotationLink txtUnderline = new PDAnnotationLink();
				// add an underline
				PDBorderStyleDictionary underline = new PDBorderStyleDictionary();
				underline.setStyle(PDBorderStyleDictionary.STYLE_UNDERLINE);
				txtUnderline.setBorderStyle(underline);
				        		 
				// set up the markup area
				float textWidth = (font.getPlainFont().getStringWidth(txt.getText())/1000)*txt.getFontSize();
				PDRectangle position = new PDRectangle();
				position.setLowerLeftX(0);
				position.setLowerLeftY(p.getHeight() - 24f);
				position.setUpperRightX(textWidth);
				position.setUpperRightY(p.getHeight() -4);
				txtUnderline.setRectangle(position);
				        		 
				PDF_page.getAnnotations().add(txtUnderline);
			}
			/*if(txt.isUnderline()) {
				txt.setText("__"+txt.getText()+"__");
			}*/
			StringBuilder sb = new StringBuilder();
			sb.append(Integer.toHexString(txt.getRGBAcolor().getRed()));
			if (sb.length() < 2) {
			    sb.insert(0, '0'); // pad with leading zero if needed
			}
			sb.append(Integer.toHexString(txt.getRGBAcolor().getGreen()));
			if (sb.length() < 2) {
			    sb.insert(0, '0'); // pad with leading zero if needed
			}
			sb.append(Integer.toHexString(txt.getRGBAcolor().getBlue()));
			if (sb.length() < 2) {
			    sb.insert(0, '0'); // pad with leading zero if needed
			}
			String hex = sb.toString();
			if(txt.getRGBAcolor() != null) txt.setText("{color:#"+hex+"}"+txt.getText().substring(1, txt.getText().length()-1)+"{color:#000000}");
			//p.addText(item.getText(), item.getFontSize(), font);
			p.addMarkup(txt.getText(), txt.getFontSize(), font);
			if(txt.getPosX()<=w_mm) {
				if(txt.getWidth()+txt.getPosX()>w_mm) {
					p.setMaxWidth(PDF_page.getMediaBox().getWidth()-UnitConverter.convmmPoint(txt.getPosX()));
					txt.setWidth(w_mm-txt.getPosX());
				}
			}
			else
				System.out.println("Testo " + txt.getID() + " in posizione esterna alla pagina.");
			if(txt.getPosY()+txt.getHeight()>h_mm) {
				System.out.println("Il testo " + txt.getID() +" eccede i limiti del foglio. Riscrivere il testo.");
			}	
			float dimx=UnitConverter.convmmPoint(txt.getWidth());
            float dimy=UnitConverter.convmmPoint(txt.getHeight());
			//DOMANDA: la posizione di un elemento interno � relativa al div di cui fa parte?
            System.out.println("txt_posX "+txt.getPosX());
            System.out.println("txt_posY "+txt.getPosY());
			Position pt=new Position(UnitConverter.convmmPoint(txt.getPosX()),UnitConverter.convmmPoint(txt.getPosY()));
			
			
			if(pt.getY()<0) {
				System.out.println("Il testo " + txt.getID() +" eccede i limiti del foglio. Riscrivere il testo.");
			}
			
			/* transform */
			
			PDPageContentStream cont=new PDPageContentStream(PDF_doc, PDF_page,AppendMode.APPEND,true);
            if(txt.getAngle_Rotation()!=0f) {
            	cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint((float)txt.getPosX())+dimx/2, h_p-dimy/2-UnitConverter.convmmPoint((float)txt.getPosY())));
            	cont.transform(Matrix.getRotateInstance(Math.toRadians(txt.getAngle_Rotation()), 0, 0));
            	cont.transform(Matrix.getTranslateInstance(-(UnitConverter.convmmPoint((float)txt.getPosX())+dimx/2), -(h_p-dimy/2-UnitConverter.convmmPoint((float)txt.getPosY()))));
            }
            p.setAlignment(al);
			p.draw(PDF_doc,cont, pt,null);
			
			//cstream.close();
			cont.close();
			}
			//cstream.restoreGraphicsState();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTxtElem(VolTextParser.TxtElemContext ctx) {
		TXT_Item txt = container.getTxt();
		txt.setText(ctx.STRING().toString());
		container.setTxt(txt);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTxtElem(VolTextParser.TxtElemContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterList(VolTextParser.ListContext ctx) {
		container.setList(new LIST_Item());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitList(VolTextParser.ListContext ctx) {
		try{
			PDPageContentStream cstream = new PDPageContentStream(PDF_doc, PDF_page,AppendMode.APPEND, true); 
			float h_p = PDF_page.getMediaBox().getHeight();
			LIST_Item li=container.getList();
			if(container.getDiv() != null)
			{
				Item_TOT i = new Item_TOT("LIST", 
						false, 
						null, 
						li.getID(), 
						li.getFontFamily(), 
						li.getFontSize(), 
						li.getRGBAcolor(), 
						li.isBold(), 
						li.isItalics(), 
						li.isUnderline(), 
						li.getPosition(), 
						li.getPosX(), 
						li.getPosY(), 
						li.getAngle_Rotation(), 
						li.getWidth(), 
						li.getHeight(), 
						li.isFitX(), 
						li.isFitY(), 
						li.getAlignment(),
						li.getLayer(), 
						"", 
						li.getFontFamilyTTF(), 
						"", li.getUnitX(), li.getUnitY(), li.getUnitWidth(), li.getUnitHeight());
				container.getList_tot().add(i);
			}
			else
			{
				Paragraph pList = new Paragraph();
				pList.setMaxWidth(li.getWidth());
				if(!(container.getDiv()==null)) {
					if(li.getWidth()>container.getDiv().getWidth()||
							li.getHeight()>container.getDiv().getHeight()) {
						System.out.println("Lista " + li.getID() +" nel div "+
								container.getDiv().getID()+" troncata");
						if(li.getWidth()>container.getDiv().getWidth()) {
							//?? txt.setWidth(container.getDiv().getWidth());
							pList.setMaxWidth(container.getDiv().getWidth());
						}
						if(li.getHeight()>container.getDiv().getHeight()) {
							//?? txt.setHeight(container.getDiv().getHeight());
						}
						if(li.getHeight()>container.getDiv().getHeight()) {
							System.out.println("Lista " + li.getID() +" nel div "+
									container.getDiv().getID()+" con troppe righe. Riscrivere il testo");
						}
					}else {
						//CURVATURA DEL PARAGRAFO
					}

				}
				PDType0Font font = PDType0Font.load(PDF_doc, new File(li.getFontFamily()));
				Color fontColor=li.getRGBAcolor();
				cstream.setNonStrokingColor(fontColor);
				PDExtendedGraphicsState graph=new PDExtendedGraphicsState();
				graph.setStrokingAlphaConstant((float) (li.getRGBAcolor().getAlpha() / 255f));
				// il nuovo cstream non accetta graphicsStateParameters
				//cstream.setGraphicsStateParameters(graph);
				String bulletOdd = CompatibilityHelper.getBulletCharacter(1) + " ";
				String bulletEven = CompatibilityHelper.getBulletCharacter(2) + " ";
				RomanEnumerator e = new RomanEnumerator();
				for(String item: li.getItems()) {
					if(li.isOrdered()) {
						pList.add(new Indent(e.next() + ". ", 4, SpaceUnit.em, li.getFontSize(),font, Alignment.Right));
					}else {
						pList.add(new Indent(bulletOdd, 4, SpaceUnit.em, li.getFontSize(),font, Alignment.Right));
					}
					pList.addMarkup(item+"\n", li.getFontSize(), BaseFont.valueOf(font.getBaseFont()));
				}
				//DOMANDA: la posizione di un elemento interno � relativa al div di cui fa parte?
				Position pt=new Position(UnitConverter.convmmPoint(li.getPosX()),h_p-pList.getHeight()-UnitConverter.convmmPoint(li.getPosY()));
				//ERRORE cstream come non appartenente al build path
				pList.draw(PDF_doc, cstream, pt, null);
				cstream.close();
				cstream.restoreGraphicsState();
			}
		}catch(IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterListElem(VolTextParser.ListElemContext ctx) {
		String elem = ctx.STRING().toString();
		container.getList().getItems().add(elem);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitListElem(VolTextParser.ListElemContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPageattr(VolTextParser.PageattrContext ctx) {
		PAGE_Item p = container.getPage();
		if(ctx.ORIENTATION()!=null) {
			Float orientation = ctx.ORIENTATION().toString() == "hor" ? 90f : 0f;
			p.setAngleRotation(orientation);
		}
		else if(ctx.TFVAL() != null)
		{
			p.setOob(Boolean.parseBoolean(ctx.TFVAL().toString()));
		}
		else if(ctx.FORMATVAL() != null)
		{
			p.setFormat(ctx.FORMATVAL().toString());
		}
		else
		{
			if(ctx.getChild(0).toString().replaceAll("\\s+", "").equals("width"))
				p.setWidth(Float.parseFloat(ctx.NVAL().toString()));
			else
				p.setHeight(Float.parseFloat(ctx.NVAL().toString()));
		}
		PDRectangle pdrect = new PDRectangle(p.getWidth(), p.getHeight());
		if(p.getFormat() != "")
		{
			System.out.println("Inserito formato pagina e almeno una dimensione personalizzata. Verr� preso in considerazione il formato della pagina.");
			switch(p.getFormat()) {
			case "A0":
				pdrect = PDRectangle.A0;
				break;
			case "A1":
				pdrect = PDRectangle.A1;
				break;
			case "A2":
				pdrect = PDRectangle.A2;
				break;
			case "A3":
				pdrect = PDRectangle.A3;
				break;
			case "A4":
				pdrect = PDRectangle.A4;
				break;
			case "A5":
				pdrect = PDRectangle.A5;
				break;
			case "A6":
				pdrect = PDRectangle.A6;
				break;
			}
		}
		if(p.getFormat() == "" && p.getWidth() != 0f && p.getHeight() != 0f)
			pdrect = new PDRectangle(UnitConverter.convmmPoint(p.getWidth()), UnitConverter.convmmPoint(p.getHeight()));
		if(p.getFormat() == "" && (p.getWidth() == 0f || p.getHeight() == 0f))
			pdrect = PDRectangle.A4;

		PDF_doc.removePage(PDF_page);
		PDF_page=new PDPage(pdrect);
		PDF_page.setRotation(p.getAngleRotation().intValue());
		PDF_doc.addPage(PDF_page);
		container.setPage(p);

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPageattr(VolTextParser.PageattrContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterListattr(VolTextParser.ListattrContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitListattr(VolTextParser.ListattrContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTxtattr(VolTextParser.TxtattrContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTxtattr(VolTextParser.TxtattrContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterImgattr(VolTextParser.ImgattrContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitImgattr(VolTextParser.ImgattrContext ctx) { 

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
	@Override
	public void enterPdfattr(VolTextParser.PdfattrContext ctx) {
		// TODO Auto-generated method stub
		PDF_Item pdf = container.getDoc();
		switch(ctx.getChild(0).toString().toLowerCase())
		{
		case "title:":
			pdf.setTitle(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
			break;
		case "author:":
			pdf.setAuthor(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
			break;
		case "path:":
			pdf.setPath(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
			break;
		}
		container.setDoc(pdf);
	}
	@Override
	public void exitPdfattr(VolTextParser.PdfattrContext ctx) {
		// TODO Auto-generated method stub

	}
	@Override
	public void enterImganumber(VolTextParser.ImganumberContext ctx) {
		// TODO Auto-generated method stub
		if(ctx.getParent() instanceof VolTextParser.DivContext)
		{
			DIV_Item div = container.getDiv();
			switch(ctx.getChild(0).toString().toLowerCase()) {
			case "pos-x":
				String unit_posx = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				div.setUnitX(unit_posx);
				if(ctx.NOTVAL() == null)
					div.setPosX(Float.parseFloat((ctx.NVAL().toString())));
				else
					div.setPosX(0 - Float.parseFloat((ctx.NVAL().toString())));
				break;
			case "pos-y":
				String unit_posy = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				div.setUnitY(unit_posy);
				if(ctx.NOTVAL() == null)
					div.setPosY(Float.parseFloat((ctx.NVAL().toString())));
				else
					div.setPosY(0 - Float.parseFloat((ctx.NVAL().toString())));
				break;
			case "angle-rotation":
				div.setAngle_Rotation((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "height":
				String unit = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				switch(unit)
				{
				case "mm":
					div.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "%":
					float perc = Float.parseFloat(ctx.NVAL().toString());
					float heightPage = UnitConverter.convPointmm( PDF_page.getMediaBox().getHeight());
					div.setHeight(heightPage * perc / 100);
					break;
				case "pt":
					float point = Float.parseFloat(ctx.NVAL().toString());
					div.setHeight(UnitConverter.convPointmm(  point));
					break;
				default:
					div.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				}
				break;
			case "width":
				String unit_w = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				switch(unit_w)
				{
				case "mm":
					div.setWidth((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "%":
					float perc = Float.parseFloat(ctx.NVAL().toString());
					float widthPage = UnitConverter.convPointmm( PDF_page.getMediaBox().getWidth());
					div.setWidth(widthPage * perc / 100);
					break;
				case "pt":
					float point = Float.parseFloat(ctx.NVAL().toString());
					div.setWidth(UnitConverter.convPointmm(  point));
					break;
				default:
					div.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				}
				break;
			case "layer":
				div.setLayer(Integer.parseInt(ctx.NVAL().toString()));
				break;
			default:
				System.out.println("Valore non riconosciuto");
			}
			container.setDiv(div);
		}
		else if(ctx.getParent() instanceof VolTextParser.ImgattrContext)
		{
			IMG_Item img = container.getImg();
			switch(ctx.getChild(0).toString().toLowerCase()) {
			case "pos-x":
				String unit_posx = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				img.setUnitX(unit_posx);
				if(ctx.NOTVAL() == null)
					img.setPosX(Float.parseFloat((ctx.NVAL().toString())));
				else
					img.setPosX(0 - Float.parseFloat((ctx.NVAL().toString())));
				break;
			case "pos-y":
				String unit_posy = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				img.setUnitY(unit_posy);
				if(ctx.NOTVAL() == null)
					img.setPosY(Float.parseFloat((ctx.NVAL().toString())));
				else
					img.setPosY(0 - Float.parseFloat((ctx.NVAL().toString())));
				break;
			case "angle-rotation":
				img.setAngle_Rotation((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "height":
				String unit = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				img.setUnitHeight(unit);
				img.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "width":
				String unit_w = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				img.setUnitWidth(unit_w);
				img.setWidth((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "layer":
				img.setLayer(Integer.parseInt(ctx.NVAL().toString()));
				break;
			default:
				System.out.println("Valore non riconosciuto");
			}
			container.setImg(img);
		}
		else if(ctx.getParent() instanceof VolTextParser.TxtattrContext)
		{
			TXT_Item txt = container.getTxt();
			switch(ctx.getChild(0).toString().toLowerCase()) {
			case "pos-x":
				String unit_posx = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				txt.setUnitX(unit_posx);
				if(ctx.NOTVAL() == null)
					txt.setPosX(Float.parseFloat((ctx.NVAL().toString())));
				else
					txt.setPosX(0 - Float.parseFloat((ctx.NVAL().toString())));
				break;
			case "pos-y":
				String unit_posy = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				txt.setUnitY(unit_posy);
				if(ctx.NOTVAL() == null)
					txt.setPosY(Float.parseFloat((ctx.NVAL().toString())));
				else
					txt.setPosY(0 - Float.parseFloat((ctx.NVAL().toString())));
				break;
			case "angle-rotation":
				txt.setAngle_Rotation((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "height":
				String unit = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				txt.setUnitHeight(unit);
				txt.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "width":
				String unit_w = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				txt.setUnitWidth(unit_w);
				txt.setWidth((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "layer":
				txt.setLayer(Integer.parseInt(ctx.NVAL().toString()));
				break;
			default:
				System.out.println("Valore non riconosciuto");
			}
			container.setTxt(txt);
		}
		else if(ctx.getParent() instanceof VolTextParser.ListattrContext)
		{
			LIST_Item list = container.getList();
			switch(ctx.getChild(0).toString().toLowerCase()) {
			case "pos-x":
				String unit_posx = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				list.setUnitX(unit_posx);
				if(ctx.NOTVAL() == null)
					list.setPosX(Float.parseFloat((ctx.NVAL().toString())));
				else
					list.setPosX(0 - Float.parseFloat((ctx.NVAL().toString())));
				break;
			case "pos-y":
				String unit_posy = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				list.setUnitY(unit_posy);
				if(ctx.NOTVAL() == null)
					list.setPosY(Float.parseFloat((ctx.NVAL().toString())));
				else
					list.setPosY(0 - Float.parseFloat((ctx.NVAL().toString())));
				break;
			case "angle-rotation":
				list.setAngle_Rotation((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "height":
				String unit = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				list.setUnitHeight(unit);
				list.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "width":
				String unit_w = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				list.setUnitWidth(unit_w);
				list.setWidth((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "layer":
				list.setLayer(Integer.parseInt(ctx.NVAL().toString()));
				break;
			default:
				System.out.println("Valore non riconosciuto");
			}
			container.setList(list);
		}
		else
		{
			System.out.println("ALTRO");
		}


	}
	@Override
	public void exitImganumber(VolTextParser.ImganumberContext ctx) {
		// TODO Auto-generated method stub

	}
	@Override
	public void enterIdval(VolTextParser.IdvalContext ctx) {
		// TODO Auto-generated method stub
		if(ctx.getParent() instanceof VolTextParser.DivContext)
		{
			DIV_Item div = container.getDiv();
			div.setID(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
			container.setDiv(div);
		}
		else if(ctx.getParent() instanceof VolTextParser.ImgattrContext)
		{
			IMG_Item img = container.getImg();
			img.setID(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
			container.setImg(img);
		}
		else if(ctx.getParent() instanceof VolTextParser.TxtattrContext)
		{
			TXT_Item txt = container.getTxt();
			txt.setID(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
			container.setTxt(txt);
		}
		else if(ctx.getParent() instanceof VolTextParser.ListattrContext)
		{
			LIST_Item list = container.getList();
			list.setID(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
			container.setList(list);
		}
		else
		{
			System.out.println("ALTRO");
		}
	}
	@Override
	public void exitIdval(VolTextParser.IdvalContext ctx) {
		// TODO Auto-generated method stub

	}
	@Override
	public void enterTxtval(VolTextParser.TxtvalContext ctx) {
		// TODO Auto-generated method stub
		if(ctx.getParent() instanceof VolTextParser.TxtattrContext)
		{
			TXT_Item txt = container.getTxt();
			switch(ctx.getChild(0).toString().toLowerCase()) {
			case "id:":
				txt.setID(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
				break;
			case "font-family:":
				txt.setFontFamily(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
				break;
			case "font-family-ttf:":
				txt.setFontFamilyTTF(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
				break;
			case "font-size:":
				txt.setFontSize(Integer.parseInt(ctx.NVAL().toString()));
				break;
			case "bold:":
				if(ctx.TFVAL().toString() == "true")
					txt.setBold(true);
				else
					txt.setBold(false);
				break;
			case "italics:":
				if(ctx.TFVAL().toString() == "true")
					txt.setItalics(true);
				else
					txt.setItalics(false);
				break;
			case "underline:":
				if(ctx.TFVAL().toString() == "true")
					txt.setUnderline(true);
				else
					txt.setUnderline(false);
				break;
			default:
				System.out.println("Valore non riconosciuto");
			}
			container.setTxt(txt);
		}
		else if(ctx.getParent() instanceof VolTextParser.ListattrContext)
		{
			LIST_Item list = container.getList();
			switch(ctx.getChild(0).toString().toLowerCase()) {
			case "id:":
				list.setID(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
				break;
			case "font-family:":
				list.setFontFamily(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
				break;
			case "font-family-ttf:":
				list.setFontFamilyTTF(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
				break;
			case "font-size:":
				list.setFontSize(Integer.parseInt(ctx.NVAL().toString()));
				break;
			case "bold:":
				if(ctx.TFVAL().toString() == "true")
					list.setBold(true);
				else
					list.setBold(false);
				break;
			case "italics:":
				if(ctx.TFVAL().toString() == "true")
					list.setItalics(true);
				else
					list.setItalics(false);
				break;
			case "underline:":
				if(ctx.TFVAL().toString() == "true")
					list.setUnderline(true);
				else
					list.setUnderline(false);
				break;
			default:
				System.out.println("Valore non riconosciuto");
			}
			container.setList(list);
		}
	}
	@Override
	public void exitTxtval(VolTextParser.TxtvalContext ctx) {
		// TODO Auto-generated method stub

	}
	@Override
	public void enterPositionv(VolTextParser.PositionvContext ctx) {
		// TODO Auto-generated method stub
		String position = ctx.POSVAL().toString();

		if(ctx.getParent() instanceof VolTextParser.DivContext)
		{
			DIV_Item div = container.getDiv();
			div.setPosition(position);
			container.setDiv(div);
		}
		else if(ctx.getParent() instanceof VolTextParser.ImgattrContext)
		{
			IMG_Item img = container.getImg();
			img.setPosition(position);
			container.setImg(img);
		}
		else if(ctx.getParent() instanceof VolTextParser.TxtattrContext)
		{
			TXT_Item txt = container.getTxt();
			txt.setPosition(position);
			container.setTxt(txt);
		}
		else if(ctx.getParent() instanceof VolTextParser.ListattrContext)
		{
			LIST_Item list = container.getList();
			list.setPosition(position);
			container.setList(list);
		}
		else
		{
			System.out.println("ALTRO");
		}
	}
	@Override
	public void exitPositionv(VolTextParser.PositionvContext ctx) {
		// TODO Auto-generated method stub

	}
	@Override
	public void enterColor(VolTextParser.ColorContext ctx) {
		// TODO Auto-generated method stub

		String colore = ctx.COLORVAL().toString();
		Color c = new Color(Integer.parseInt(colore.substring(1, 3), 16), 
				Integer.parseInt(colore.substring(3, 5), 16), 
				Integer.parseInt(colore.substring(5, 7), 16), 
				Integer.parseInt(colore.substring(7, 9), 16));

		if(ctx.getParent() instanceof VolTextParser.DivContext)
		{
			DIV_Item div = container.getDiv();
			div.setRGBAcolor(c);
			container.setDiv(div);
		}
		else if(ctx.getParent() instanceof VolTextParser.TxtattrContext)
		{
			TXT_Item txt = container.getTxt();
			txt.setRGBAcolor(c);
			container.setTxt(txt);
		}
		else if(ctx.getParent() instanceof VolTextParser.ListattrContext)
		{
			LIST_Item list = container.getList();
			list.setRGBAcolor(c);
			container.setList(list);
		}
		else
		{
			System.out.println("ALTRO");
		}
	}
	@Override
	public void exitColor(VolTextParser.ColorContext ctx) {
		// TODO Auto-generated method stub

	}
	@Override
	public void enterFitAttr(VolTextParser.FitAttrContext ctx) {
		// TODO Auto-generated method stub
		boolean tf = false;
		System.out.println(ctx.TFVAL().toString());
		tf = Boolean.parseBoolean(ctx.TFVAL().toString());
		if(ctx.getChild(0).toString().equals("fit-x")) {
			if(ctx.getParent() instanceof VolTextParser.DivContext)
			{
				DIV_Item div = container.getDiv();
				div.setFitX(tf);
				container.setDiv(div);
			}
			else if(ctx.getParent() instanceof VolTextParser.ImgattrContext)
			{
				IMG_Item img = container.getImg();
				img.setFitX(tf);
				container.setImg(img);
			}
			else if(ctx.getParent() instanceof VolTextParser.TxtattrContext)
			{
				TXT_Item txt = container.getTxt();
				txt.setFitX(tf);
				container.setTxt(txt);
			}
			else if(ctx.getParent() instanceof VolTextParser.ListattrContext)
			{
				LIST_Item list = container.getList();
				list.setFitX(tf);
				container.setList(list);
			}
			else
			{
				System.out.println("ALTRO");
			}
		}else {
			if(ctx.getParent() instanceof VolTextParser.DivContext)
			{
				DIV_Item div = container.getDiv();
				div.setFitY(tf);
				container.setDiv(div);
			}
			else if(ctx.getParent() instanceof VolTextParser.ImgattrContext)
			{
				IMG_Item img = container.getImg();
				img.setFitY(tf);
				container.setImg(img);
			}
			else if(ctx.getParent() instanceof VolTextParser.TxtattrContext)
			{
				TXT_Item txt = container.getTxt();
				txt.setFitY(tf);
				container.setTxt(txt);
			}
			else if(ctx.getParent() instanceof VolTextParser.ListattrContext)
			{
				LIST_Item list = container.getList();
				list.setFitY(tf);
				container.setList(list);
			}
			else
			{
				System.out.println("ALTRO");
			}
		}

	}
	@Override
	public void exitFitAttr(VolTextParser.FitAttrContext ctx) {
		// TODO Auto-generated method stub

	}
	@Override
	public void enterAlignment(VolTextParser.AlignmentContext ctx) {
		// TODO Auto-generated method stub
		String align = ctx.ALIGNVAL().toString();

		if(ctx.getParent() instanceof VolTextParser.TxtattrContext)
		{
			TXT_Item txt = container.getTxt();
			txt.setAlignment(align);
			container.setTxt(txt);
		}
		else if(ctx.getParent() instanceof VolTextParser.ListattrContext)
		{
			LIST_Item list = container.getList();
			list.setAlignment(align);
			container.setList(list);
		}
		else
		{
			System.out.println("ALTRO");
		}
		
	}
	@Override
	public void exitAlignment(VolTextParser.AlignmentContext ctx) {
		// TODO Auto-generated method stub
		
	}
}
