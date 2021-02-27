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
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
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
			if(div.isFit())
			{
				div.setWidth(width_mm - div.getPosX());
				div.setHeight(height_mm - div.getPosY());
			}
			if(div.getPosX() + div.getWidth() > width_mm)
			{
				div.setWidth(width_mm - div.getPosX());
			}
			if(div.getPosY() + div.getHeight() > height_mm)
			{
				div.setHeight(height_mm - div.getPosY());
			}
			
			float dimx = UnitConverter.convmmPoint(div.getWidth());
			float dimy = UnitConverter.convmmPoint(div.getHeight());
			/* transform */
            cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint((float)div.getPosX())+dimx/2, h_p-dimy/2-UnitConverter.convmmPoint((float)div.getPosY())));
            cont.transform(Matrix.getRotateInstance(Math.toRadians(div.getAngle_Rotation()), 0, 0));
            //TH not needed previousAngle = tAngles[i - 1];
            cont.transform(Matrix.getTranslateInstance(-(UnitConverter.convmmPoint((float)div.getPosX())+dimx/2), -(h_p-dimy/2-UnitConverter.convmmPoint((float)div.getPosY()))));
			//cont.transform(Matrix.getRotateInstance(Math.toRadians(div.getAngle_Rotation()), 0, 0));
			cont.addRect(UnitConverter.convmmPoint(div.getPosX()), h_p - dimy - UnitConverter.convmmPoint(div.getPosY()), dimx, dimy);
			cont.setGraphicsStateParameters(graph);
			//cont.saveGraphicsState();
			cont.fill();
			cont.close();
			System.out.println(dimx);
			//cont.restoreGraphicsState();
			//la riga seguente serve per la gestione dell'uscita da un div, che implica anche che gli
			//elementi interni a esso devono avere dimensione e posizione interne a esso, quindi vanno controllate
			//che le dimensioni e le posizioni non siano maggiori del div. inoltre se il div è ruotato, anche l'immagine o l'elemento interno deve essere ruotato
			container.setDiv(null);
			addItemToDiv(container.getList_tot());
		}
		catch(IOException ioex)
		{
			System.out.println(ioex);
		}
		container.getList_tot().clear();
	}
	
	public void addItemToDiv(List<Item_TOT> list)
	{
		for(Item_TOT item : list)
		{
			if(item.getType() == "IMG")
			{
				PDF_page = PDF_doc.getPage(n_page);
				float heigthPage = PDF_page.getMediaBox().getHeight();
				
				String Path = item.getURL();
				try {
					PDImageXObject pdImage =  PDImageXObject.createFromFile(Path, PDF_doc);
					PDPageContentStream cont = new PDPageContentStream(PDF_doc, PDF_page, AppendMode.APPEND, true); 

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

			//DOMANDA: la posizione di un elemento interno è relativa al div di cui fa parte?
			
				if(container.getDiv() != null)
				{
					if(img.getPosX() >= 0 && img.getPosX() <= container.getDiv().getWidth())
					{
						if(img.isFit())
						{
							img.setWidth(container.getDiv().getWidth() - img.getPosX());
						}
						
						
						
						if(img.getWidth() > container.getDiv().getWidth() - img.getPosX())
						{
							img.setWidth(Math.abs(container.getDiv().getWidth() - img.getPosX()));
						}
						
						img.setPosX(container.getDiv().getPosX() + img.getPosX());
					}
					else
					{
						//img.setWidth(0f);
					}
					
					if(img.getPosY() >= 0 && img.getPosY() <= container.getDiv().getHeight())
					{
						if(img.isFit())
						{
							img.setHeight(container.getDiv().getHeight() - img.getPosY());
						}
						
						
						
						if(img.getHeight() > container.getDiv().getHeight() - img.getPosY())
						{
							img.setHeight(Math.abs(container.getDiv().getHeight() - img.getPosY()));
						}
						
						img.setPosY(container.getDiv().getPosY() + img.getPosY());
					}
					else
					{
						//img.setHeight(0f);
					}
					
				}
				else
				{
					if(img.isFit())
					{
						float w_mm = UnitConverter.convPointmm( PDF_page.getMediaBox().getWidth());
						float h_mm = UnitConverter.convPointmm( PDF_page.getMediaBox().getHeight());
						img.setWidth(w_mm - img.getPosX());
						img.setHeight(h_mm - img.getPosY());
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
						img.isFit(), 
						img.getLayer(), 
						"", 
						"", 
						img.getURL());
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
			org.apache.pdfbox.pdmodel.edit.PDPageContentStream cstream = new org.apache.pdfbox.pdmodel.edit.PDPageContentStream(PDF_doc, PDF_page, true, false); 
			cstream.saveGraphicsState();
			Paragraph p = new Paragraph();
			TXT_Item txt=container.getTxt();
			if(container.getDiv() != null)
			{
				Item_TOT i = new Item_TOT("TXT", 
						false, 
						null, 
						txt.getID(), 
						txt.getFontFamily(), 
						txt.getFontSize(), 
						txt.getrGBAcolor(), 
						txt.isBold(), 
						txt.isItalics(), 
						txt.isUnderline(), 
						txt.getPosition(), 
						txt.getPosX(), 
						txt.getPosY(), 
						txt.getAngle_Rotation(), 
						txt.getWidth(), 
						txt.getHeight(), 
						txt.isFit(), 
						txt.getLayer(), 
						txt.getText(), 
						txt.getFontFamilyTTF(), 
						"");
				container.getList_tot().add(i);
			}
			else
			{
			// Create a new font object by loading a TrueType font into the document
			PDType0Font font = PDType0Font.load(PDF_doc, new File(txt.getFontFamilyTTF()));
			p.addText(txt.getText(), txt.getFontSize(), font);
			p.setMaxWidth(txt.getWidth());
			if(!(container.getDiv()==null)) {
				if(txt.getWidth()>container.getDiv().getWidth()||
				   txt.getHeight()>container.getDiv().getHeight()) {
					System.out.println("Testo " + txt.getID() +" nel div "+
										container.getDiv().getID()+" troncato");
					if(txt.getWidth()>container.getDiv().getWidth()) {
						//?? txt.setWidth(container.getDiv().getWidth());
						p.setMaxWidth(container.getDiv().getWidth());
					}
					if(txt.getHeight()>container.getDiv().getHeight()) {
						//?? txt.setHeight(container.getDiv().getHeight());
					}
					if(p.getHeight()>container.getDiv().getHeight()) {
						System.out.println("Testo " + txt.getID() +" nel div "+
								container.getDiv().getID()+" con troppe righe. Riscrivere il testo");
					}
				}else {
					//CURVATURA DEL PARAGRAFO
				}
				
			}
			
			//DOMANDA: la posizione di un elemento interno è relativa al div di cui fa parte?
			Position pt=new Position(UnitConverter.convmmPoint(txt.getPosX()),h_p-p.getHeight()-UnitConverter.convmmPoint(txt.getPosY()));
			
			if(pt.getY()<0) {
				System.out.println("Il testo " + txt.getID() +" eccede i limiti del foglio. Riscrivere il testo.");
			}
			
			//ERRORE cstream come non appartenente al build path
			p.draw(PDF_doc, cstream, pt, null);
			cstream.close();
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
    		PDPageContentStream cstream = new PDPageContentStream(PDF_doc, PDF_page, AppendMode.APPEND, true);
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
						li.isFit(), 
						li.getLayer(), 
						"", 
						li.getFontFamily(), 
						"");
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
			graph.setNonStrokingAlphaConstant((float) (li.getRGBAcolor().getAlpha() / 255f));
			cstream.setGraphicsStateParameters(graph);
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
        		//DOMANDA: la posizione di un elemento interno è relativa al div di cui fa parte?
			Position pt=new Position(UnitConverter.convmmPoint(li.getPosX()),h_p-pList.getHeight()-UnitConverter.convmmPoint(li.getPosY()));
			//ERRORE cstream come non appartenente al build path
			//pList.draw(container.getPDF_doc(), cstream, pt,null);
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
		Float orientation = ctx.ORIENTATION().toString() == "hor" ? 90f : 0f;
		p.setAngleRotation(orientation);
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
			switch(ctx.children.get(0).toString().toLowerCase()) {
				case "pos-x":
					String unit_posx = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
					switch(unit_posx)
					{
					case "mm":
						div.setPosX(Float.parseFloat((ctx.NVAL().toString())));
						break;
					case "%":
						float perc = Float.parseFloat(ctx.NVAL().toString());
						float widthPage = UnitConverter.convPointmm( PDF_page.getMediaBox().getWidth());
						div.setPosX(widthPage * perc / 100);
						break;
					case "pt":
						float point = Float.parseFloat(ctx.NVAL().toString());
						div.setPosX(UnitConverter.convPointmm(  point));
						break;
					default:
						System.out.println("Unità di misura sconosciuta. Uso dei mm.");
						div.setPosX(Float.parseFloat((ctx.NVAL().toString())));
						break;
					}
					break;
				case "pos-y":
					String unit_posy = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
					switch(unit_posy)
					{
					case "mm":
						div.setPosY(Float.parseFloat((ctx.NVAL().toString())));
						break;
					case "%":
						float perc = Float.parseFloat(ctx.NVAL().toString());
						float heigthPage = UnitConverter.convPointmm( PDF_page.getMediaBox().getHeight());
						div.setPosY(heigthPage * perc / 100);
						break;
					case "pt":
						float point = Float.parseFloat(ctx.NVAL().toString());
						div.setPosY(UnitConverter.convPointmm(  point));
						break;
					default:
						System.out.println("Unità di misura sconosciuta. Uso dei mm.");
						div.setPosY(Float.parseFloat((ctx.NVAL().toString())));
						break;
					}
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
			switch(ctx.children.get(0).toString().toLowerCase()) {
			case "pos-x":
				String unit_posx = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				switch(unit_posx)
				{
				case "mm":
					img.setPosX(Float.parseFloat((ctx.NVAL().toString())));
					break;
				case "%":
					float perc = Float.parseFloat(ctx.NVAL().toString());
					float widthPage = 0.0f;
					if(container.getDiv() != null) 
						widthPage = container.getDiv().getWidth();
					else
						widthPage = UnitConverter.convPointmm(  PDF_page.getMediaBox().getWidth());
					img.setPosX(widthPage * perc / 100);
					break;
				case "pt":
					float point = Float.parseFloat(ctx.NVAL().toString());
					img.setPosX(UnitConverter.convPointmm(  point));
					break;
				default:
					System.out.println("Unità di misura sconosciuta. Uso dei mm.");
					img.setPosX(Float.parseFloat((ctx.NVAL().toString())));
					break;
				}
				break;
			case "pos-y":
				String unit_posy = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				switch(unit_posy)
				{
				case "mm":
					img.setPosY(Float.parseFloat((ctx.NVAL().toString())));
					break;
				case "%":
					float perc = Float.parseFloat(ctx.NVAL().toString());
					float heightPage = 0.0f;
					if(container.getDiv() != null) 
						heightPage = container.getDiv().getHeight();
					else
						heightPage = UnitConverter.convPointmm(  PDF_page.getMediaBox().getHeight());
					img.setPosY(heightPage * perc / 100);
					break;
				case "pt":
					float point = Float.parseFloat(ctx.NVAL().toString());
					img.setPosY(UnitConverter.convPointmm(  point));
					break;
				default:
					System.out.println("Unità di misura sconosciuta. Uso dei mm.");
					img.setPosY(Float.parseFloat((ctx.NVAL().toString())));
					break;
				}
				break;
			case "angle-rotation":
				img.setAngle_Rotation((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "height":
				String unit = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				switch(unit)
				{
				case "mm":
					img.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "%":
					float perc = Float.parseFloat(ctx.NVAL().toString());
					float heightPage = 0.0f;
					if(container.getDiv() != null) 
						heightPage = container.getDiv().getHeight();
					else
						heightPage = UnitConverter.convPointmm(  PDF_page.getMediaBox().getHeight());
					img.setHeight(heightPage * perc / 100);
					break;
				case "pt":
					float point = Float.parseFloat(ctx.NVAL().toString());
					img.setHeight(UnitConverter.convPointmm(  point));
					break;
				default:
					img.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				}
				break;
			case "width":
				String unit_w = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				switch(unit_w)
				{
				case "mm":
					img.setWidth((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "%":
					float perc = Float.parseFloat(ctx.NVAL().toString());
					float widthPage = 0.0f;
					if(container.getDiv() != null) 
						widthPage = container.getDiv().getWidth();
					else
						widthPage = UnitConverter.convPointmm(  PDF_page.getMediaBox().getWidth());
					img.setWidth(widthPage * perc / 100);
					break;
				case "pt":
					float point = Float.parseFloat(ctx.NVAL().toString());
					img.setWidth(UnitConverter.convPointmm(  point));
					break;
				default:
					img.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				}
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
			switch(ctx.children.get(0).toString().toLowerCase()) {
			case "pos-x":
				String unit_posx = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				switch(unit_posx)
				{
				case "mm":
					txt.setPosX(Float.parseFloat((ctx.NVAL().toString())));
					break;
				case "%":
					float perc = Float.parseFloat(ctx.NVAL().toString());
					float widthPage = 0.0f;
					if(container.getDiv() != null) 
						widthPage = container.getDiv().getWidth();
					else
						widthPage = UnitConverter.convPointmm(  PDF_page.getMediaBox().getWidth());
					txt.setPosX(widthPage * perc / 100);
					break;
				case "pt":
					float point = Float.parseFloat(ctx.NVAL().toString());
					txt.setPosX(UnitConverter.convPointmm(  point));
					break;
				default:
					System.out.println("Unità di misura sconosciuta. Uso dei mm.");
					txt.setPosX(Float.parseFloat((ctx.NVAL().toString())));
					break;
				}
				break;
			case "pos-y":
				String unit_posy = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				switch(unit_posy)
				{
				case "mm":
					txt.setPosY(Float.parseFloat((ctx.NVAL().toString())));
					break;
				case "%":
					float perc = Float.parseFloat(ctx.NVAL().toString());
					float heightPage = 0.0f;
					if(container.getDiv() != null) 
						heightPage = container.getDiv().getHeight();
					else
						heightPage = UnitConverter.convPointmm(  PDF_page.getMediaBox().getHeight());
					txt.setPosY(heightPage * perc / 100);
					break;
				case "pt":
					float point = Float.parseFloat(ctx.NVAL().toString());
					txt.setPosY(UnitConverter.convPointmm(  point));
					break;
				default:
					System.out.println("Unità di misura sconosciuta. Uso dei mm.");
					txt.setPosY(Float.parseFloat((ctx.NVAL().toString())));
					break;
				}
				break;
			case "angle-rotation":
				txt.setAngle_Rotation((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "height":
				String unit = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				switch(unit)
				{
				case "mm":
					txt.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "%":
					float perc = Float.parseFloat(ctx.NVAL().toString());
					float heightPage = 0.0f;
					if(container.getDiv() != null) 
						heightPage = container.getDiv().getHeight();
					else
						heightPage = UnitConverter.convPointmm(  PDF_page.getMediaBox().getHeight());
					txt.setHeight(heightPage * perc / 100);
					break;
				case "pt":
					float point = Float.parseFloat(ctx.NVAL().toString());
					txt.setHeight(UnitConverter.convPointmm(  point));
					break;
				default:
					txt.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				}
				break;
			case "width":
				String unit_w = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				switch(unit_w)
				{
				case "mm":
					txt.setWidth((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "%":
					float perc = Float.parseFloat(ctx.NVAL().toString());
					float widthPage = 0.0f;
					if(container.getDiv() != null) 
						widthPage = container.getDiv().getWidth();
					else
						widthPage = UnitConverter.convPointmm(  PDF_page.getMediaBox().getWidth());
					txt.setWidth(widthPage * perc / 100);
					break;
				case "pt":
					float point = Float.parseFloat(ctx.NVAL().toString());
					txt.setWidth(UnitConverter.convPointmm(  point));
					break;
				default:
					txt.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				}
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
			switch(ctx.children.get(0).toString().toLowerCase()) {
			case "pos-x":
				String unit_posx = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				switch(unit_posx)
				{
				case "mm":
					list.setPosX(Float.parseFloat((ctx.NVAL().toString())));
					break;
				case "%":
					float perc = Float.parseFloat(ctx.NVAL().toString());
					float widthPage = 0.0f;
					if(container.getDiv() != null) 
						widthPage = container.getDiv().getWidth();
					else
						widthPage = UnitConverter.convPointmm(  PDF_page.getMediaBox().getWidth());
					list.setPosX(widthPage * perc / 100);
					break;
				case "pt":
					float point = Float.parseFloat(ctx.NVAL().toString());
					list.setPosX(UnitConverter.convPointmm(  point));
					break;
				default:
					System.out.println("Unità di misura sconosciuta. Uso dei mm.");
					list.setPosX(Float.parseFloat((ctx.NVAL().toString())));
					break;
				}
				break;
			case "pos-y":
				String unit_posy = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				switch(unit_posy)
				{
				case "mm":
					list.setPosY(Float.parseFloat((ctx.NVAL().toString())));
					break;
				case "%":
					float perc = Float.parseFloat(ctx.NVAL().toString());
					float heightPage = 0.0f;
					if(container.getDiv() != null) 
						heightPage = container.getDiv().getHeight();
					else
						heightPage = UnitConverter.convPointmm(  PDF_page.getMediaBox().getHeight());
					list.setPosY(heightPage * perc / 100);
					break;
				case "pt":
					float point = Float.parseFloat(ctx.NVAL().toString());
					list.setPosY(UnitConverter.convPointmm(  point));
					break;
				default:
					System.out.println("Unità di misura sconosciuta. Uso dei mm.");
					list.setPosY(Float.parseFloat((ctx.NVAL().toString())));
					break;
				}
				break;
			case "angle-rotation":
				list.setAngle_Rotation((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "height":
				String unit = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				switch(unit)
				{
				case "mm":
					list.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "%":
					float perc = Float.parseFloat(ctx.NVAL().toString());
					float heightPage = 0.0f;
					if(container.getDiv() != null) 
						heightPage = container.getDiv().getHeight();
					else
						heightPage = UnitConverter.convPointmm(  PDF_page.getMediaBox().getHeight());
					list.setHeight(heightPage * perc / 100);
					break;
				case "pt":
					float point = Float.parseFloat(ctx.NVAL().toString());
					list.setHeight(UnitConverter.convPointmm(  point));
					break;
				default:
					list.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				}
				break;
			case "width":
				String unit_w = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
				switch(unit_w)
				{
				case "mm":
					list.setWidth((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "%":
					float perc = Float.parseFloat(ctx.NVAL().toString());
					float widthPage = 0.0f;
					if(container.getDiv() != null) 
						widthPage = container.getDiv().getWidth();
					else
						widthPage = UnitConverter.convPointmm(  PDF_page.getMediaBox().getWidth());
					list.setWidth(widthPage * perc / 100);
					break;
				case "pt":
					float point = Float.parseFloat(ctx.NVAL().toString());
					list.setWidth(UnitConverter.convPointmm(  point));
					break;
				default:
					list.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				}
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
			switch(ctx.children.get(0).toString().toLowerCase()) {
				case "id:":
					txt.setID(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
					break;
				case "font-family:":
					txt.setFontFamily(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
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
			switch(ctx.children.get(0).toString().toLowerCase()) {
				case "id:":
					list.setID(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
					break;
				case "font-family:":
					list.setFontFamily(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
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
		Float width = UnitConverter.convPointmm(  PDF_page.getMediaBox().getWidth());
		Float height = UnitConverter.convPointmm(  PDF_page.getMediaBox().getHeight());
		Float x = 0.0f;
		Float y = 0.0f;
		
		if(ctx.getParent() instanceof VolTextParser.DivContext)
		{
			DIV_Item div = container.getDiv();
			switch(position.toLowerCase().toCharArray()[0])
			{
				case 'l':
					x = 0.0f;
					break;
				case 'c':
					x = (width - div.getWidth())/2;
					break;
				case 'r':
					x = width - div.getWidth();
					break;
			}
			div.setPosX(x);
			switch(position.toLowerCase().toCharArray()[1])
			{
				case 'b':
					y = height - div.getHeight();
					break;
				case 'c':
					y = (height - div.getHeight())/2;
					break;
				case 't':
					y = 0.0f;
					break;
			}
			div.setPosY(y);
			container.setDiv(div);
		}
		else if(ctx.getParent() instanceof VolTextParser.ImgattrContext)
		{
			IMG_Item img = container.getImg();
			switch(position.toLowerCase().toCharArray()[0])
			{
				case 'l':
					x = 0.0f;
					break;
				case 'c':
					x = (width - img.getWidth())/2;
					break;
				case 'r':
					x = width - img.getWidth();
					break;
			}
			img.setPosX(x);
			switch(position.toLowerCase().toCharArray()[1])
			{
				case 'b':
					y = 0.0f;
					break;
				case 'c':
					y = (height - img.getHeight())/2;
					break;
				case 't':
					y = height - img.getHeight();
					break;
			}
			img.setPosY(y);
			container.setImg(img);
		}
		else if(ctx.getParent() instanceof VolTextParser.TxtattrContext)
		{
			TXT_Item txt = container.getTxt();
			switch(position.toLowerCase().toCharArray()[0])
			{
				case 'l':
					x = 0.0f;
					break;
				case 'c':
					x = (width - txt.getWidth())/2;
					break;
				case 'r':
					x = width - txt.getWidth();
					break;
			}
			txt.setPosX(x);
			switch(position.toLowerCase().toCharArray()[1])
			{
				case 'b':
					y = 0.0f;
					break;
				case 'c':
					y = (height - txt.getHeight())/2;
					break;
				case 't':
					y = height - txt.getHeight();
					break;
			}
			txt.setPosY(y);
			container.setTxt(txt);
		}
		else if(ctx.getParent() instanceof VolTextParser.ListattrContext)
		{
			LIST_Item list = container.getList();
			switch(position.toLowerCase().toCharArray()[0])
			{
				case 'l':
					x = 0.0f;
					break;
				case 'c':
					x = (width - list.getWidth())/2;
					break;
				case 'r':
					x = width - list.getWidth();
					break;
			}
			list.setPosX(x);
			switch(position.toLowerCase().toCharArray()[1])
			{
				case 'b':
					y = 0.0f;
					break;
				case 'c':
					y = (height - list.getHeight())/2;
					break;
				case 't':
					y = height - list.getHeight();
					break;
			}
			list.setPosY(y);
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
			txt.setrGBAcolor(c);
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
		if(ctx.getParent() instanceof VolTextParser.DivContext)
		{
			DIV_Item div = container.getDiv();
			div.setFit(tf);
			container.setDiv(div);
		}
		else if(ctx.getParent() instanceof VolTextParser.ImgattrContext)
		{
			IMG_Item img = container.getImg();
			img.setFit(tf);
			container.setImg(img);
		}
		else if(ctx.getParent() instanceof VolTextParser.TxtattrContext)
		{
			TXT_Item txt = container.getTxt();
			txt.setFit(tf);
			container.setTxt(txt);
		}
		else if(ctx.getParent() instanceof VolTextParser.ListattrContext)
		{
			LIST_Item list = container.getList();
			list.setFit(tf);
			container.setList(list);
		}
		else
		{
			System.out.println("ALTRO");
		}
		
	}
	@Override
	public void exitFitAttr(VolTextParser.FitAttrContext ctx) {
		// TODO Auto-generated method stub
		
	}
}
