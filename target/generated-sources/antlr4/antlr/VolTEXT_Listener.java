package antlr;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.fontbox.ttf.OTFParser;
import org.apache.fontbox.ttf.OpenTypeFont;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import org.apache.pdfbox.util.Matrix;

import antlr.VolTextParser.ColorBulletContext;
import antlr.VolTextParser.FigureContext;
import antlr.VolTextParser.TvalueContext;
import classes.DIV_Item;
import classes.IMG_Item;
import classes.Item_Container;
import classes.Item_Stylesheet;
import classes.Item_TOT;
import classes.LIST_Item;
import classes.PAGE_Item;
import classes.PDF_Item;
import classes.TXT_Item;
import classes.UnitConverter;
import enums.Figure;
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
	public String ID;
	public Item_Stylesheet styleObject;
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
			//System.out.println(ex);
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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			user_gui.listErrori.add(e.getMessage());
		} finally {
			try {
				PDF_doc.close();
			} catch (IOException e) {
				user_gui.listErrori.add("non riesco a chiudere il pdf");
			}
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStylesheet(VolTextParser.StylesheetContext ctx) {
		container.setDictionary_style(new HashMap<String, Item_Stylesheet>());
	}
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
	@Override public void enterElement(VolTextParser.ElementContext ctx) {
		
		ID = ctx.STRING().toString();
		ID = ID.substring(1, ID.length() - 1);
		styleObject = new Item_Stylesheet(ID);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElement(VolTextParser.ElementContext ctx) {
		container.getDictionary_style().put(ID, styleObject);
		ID = "";
		styleObject = null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttrStyle(VolTextParser.AttrStyleContext ctx) {
		//set the attributes of styleObject with a check of ctx's children
		String classe = ctx.getChild(0).toString().replaceAll("\\s+", "").toLowerCase();
		classe = classe.substring(0, classe.length() - 1);
		if(classe.equals("cross-point"))
		{
			styleObject.setCross_Percentage(Float.parseFloat(ctx.NVAL().toString()));
		}
		else if(classe.equals("shape:"))
		{
			String f = ctx.getChild(1).toString().toLowerCase();
			if(f.equals("rectangle"))
				styleObject.setFigura(Figure.RETTANGOLO);
			else if(f.equals("circle"))
				styleObject.setFigura(Figure.CERCHIO);
			else
				styleObject.setFigura(Figure.TRIANGOLO);
		}
		else if(classe.equals("fit-x"))
		{
			styleObject.setFitX(Boolean.parseBoolean(ctx.TFVAL().toString()));
		}
		else if(classe.equals("fit-y"))
		{
			styleObject.setFitX(Boolean.parseBoolean(ctx.TFVAL().toString()));
		}
		else if(classe.equals("pos-x"))
		{
			String unit = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
			styleObject.setUnitX(unit);
			if(ctx.NOTVAL() == null)
				styleObject.setPosX(Float.parseFloat((ctx.NVAL().toString())));
			else
				styleObject.setPosX(0 - Float.parseFloat((ctx.NVAL().toString())));
		}
		else if(classe.equals("pos-y"))
		{
			String unit = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
			styleObject.setUnitY(unit);
			if(ctx.NOTVAL() == null)
				styleObject.setPosY(Float.parseFloat((ctx.NVAL().toString())));
			else
				styleObject.setPosY(0 - Float.parseFloat((ctx.NVAL().toString())));
		}
		else if(classe.equals("angle-rotation"))
		{
			if(ctx.NOTVAL() == null)
				styleObject.setAngle_Rotation(Float.parseFloat((ctx.NVAL().toString())));
			else
				styleObject.setAngle_Rotation(0 - Float.parseFloat((ctx.NVAL().toString())));
		}
		else if(classe.equals("height"))
		{
			String unit = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
			switch(unit)
			{
			case "mm":
				styleObject.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "%":
				float perc = Float.parseFloat(ctx.NVAL().toString());
				float heightPage = UnitConverter.convPointmm( PDF_page.getMediaBox().getHeight());
				styleObject.setHeight(heightPage * perc / 100);
				break;
			case "pt":
				float point = Float.parseFloat(ctx.NVAL().toString());
				styleObject.setHeight(UnitConverter.convPointmm(  point));
				break;
			default:
				styleObject.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			}
		}
		else if(classe.equals("width"))
		{
			String unit_w = (ctx.UNIT() != null) ? ctx.UNIT().toString() : "mm";
			switch(unit_w)
			{
			case "mm":
				styleObject.setWidth((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			case "%":
				float perc = Float.parseFloat(ctx.NVAL().toString());
				float widthPage = UnitConverter.convPointmm( PDF_page.getMediaBox().getWidth());
				styleObject.setWidth(widthPage * perc / 100);
				break;
			case "pt":
				float point = Float.parseFloat(ctx.NVAL().toString());
				styleObject.setWidth(UnitConverter.convPointmm(  point));
				break;
			default:
				styleObject.setWidth((Float.parseFloat((ctx.NVAL().toString()))));
				break;
			}
		}
		else if(classe.equals("p_width"))
		{
			styleObject.setWidth(Float.parseFloat(ctx.NVAL().toString()));
		}
		else if(classe.equals("p_height"))
		{
			styleObject.setHeight(Float.parseFloat(ctx.NVAL().toString()));
		}
		else if(classe.equals("ordered:"))
		{
			if(ctx.TFVAL().toString().toLowerCase()=="true")
				styleObject.setOrdered(true);
			else
				styleObject.setOrdered(false);
		}
		else if(classe.equals("bullet:"))
		{
			styleObject.setBullet(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
		}
		else if(classe.equals("font-family:"))
		{
			styleObject.setFontFamily(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
		}
		else if(classe.equals("font-family-ttf:"))
		{
			styleObject.setFontFamilyTTF(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
		}
		else if(classe.equals("font-family-otf:"))
		{
			styleObject.setFontFamilyOTF(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
		}
		else if(classe.equals("font-size:"))
		{
			styleObject.setFontSize(Integer.parseInt(ctx.NVAL().toString()));
		}
		else if(classe.equals("bold"))
		{
			if(ctx.TFVAL().toString() == "true")
				styleObject.setBold(true);
			else
				styleObject.setBold(false);
		}
		else if(classe.equals("italics"))
		{
			if(ctx.TFVAL().toString() == "true")
				styleObject.setItalics(true);
			else
				styleObject.setItalics(false);
		}
		else if(classe.equals("underline"))
		{
			if(ctx.TFVAL().toString() == "true")
				styleObject.setUnderline(true);
			else
				styleObject.setUnderline(false);
		}
		else if(classe.equals("colort-bullet:"))
		{
			Color c = null;
			try {
				Field f = Class.forName("java.awt.Color").getField(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
				c=(Color)f.get(null);
			} catch (Exception e) {
				c=Color.BLACK;
			}
			styleObject.setRGBBulletColor(c);
		}
		else if(classe.equals("color-bullet:"))
		{
			Color c = null;
			String colore= ctx.COLORVAL().toString();
			int r = Integer.parseInt(colore.substring(1, 3), 16);
			int g = Integer.parseInt(colore.substring(3, 5), 16);
			int b = Integer.parseInt(colore.substring(5, 7), 16);
			int a = Integer.parseInt(colore.substring(7, 9), 16);
			c = new Color(r, g, b ,a);
			styleObject.setRGBBulletColor(c);
		}
		else if(classe.equals("colort:"))
		{
			Color c = null;
			try {
				Field f = Class.forName("java.awt.Color").getField(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
				c=(Color)f.get(null);
			} catch (Exception e) {
				c=Color.BLACK;
			}
			styleObject.setrGBAcolor(c);
		}
		else if(classe.equals("color:"))
		{
			Color c = null;
			String colore= ctx.COLORVAL().toString();
			int r = Integer.parseInt(colore.substring(1, 3), 16);
			int g = Integer.parseInt(colore.substring(3, 5), 16);
			int b = Integer.parseInt(colore.substring(5, 7), 16);
			int a = Integer.parseInt(colore.substring(7, 9), 16);
			c = new Color(r, g, b ,a);
			styleObject.setrGBAcolor(c);
		}
		else if(classe.equals("position:"))
		{
			String position = ctx.POSVAL().toString();
			styleObject.setPosition(position);
		}
		else if(classe.equals("alignment:"))
		{
			String align = ctx.ALIGNVAL().toString();
			styleObject.setAlignment(align);
		}
		else if(classe.equals("orientation:"))
		{
			Float orientation = ctx.ORIENTATION().toString() == "hor" ? 90f : 0f;
			styleObject.setAngle_Rotation(orientation);
		}
		else if(classe.equals("oob:"))
		{
			styleObject.setOob(Boolean.parseBoolean(ctx.TFVAL().toString()));
		}
		else if(classe.equals("format:"))
		{
			styleObject.setFormat(ctx.FORMATVAL().toString());
		}
	}
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
			if(container.getDiv().getRGBAcolor() != null) graph.setNonStrokingAlphaConstant((float) (div.getRGBAcolor().getAlpha() / 255f));
			
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
					div.setPosY(height_mm - div.getHeight());
					break;
				case 'c':
					div.setPosY((height_mm - div.getHeight()) / 2);
					break;
				case 't':
					div.setPosY(0f);
					break;
				}
			}
			
			if(div.getPosX() + div.getWidth() > width_mm && !container.getPage().isOob())
			{
				div.setWidth(width_mm - div.getPosX());
			}
			if(div.getPosY() + div.getHeight() > height_mm && !container.getPage().isOob())
			{
				div.setHeight(height_mm - div.getPosY());
			}

			container.setDiv(div);

			
			
			float dimx = UnitConverter.convmmPoint(div.getWidth());
			float dimy = UnitConverter.convmmPoint(div.getHeight());
			/* transform */

			
			if(container.getDiv().getFigura().equals(Figure.RETTANGOLO))
			{
			cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint(div.getPosX()) + dimx/2, h_p - dimy/2 - UnitConverter.convmmPoint(div.getPosY())));
			cont.addRect(-dimx/2, -dimy/2 , dimx, dimy);
			cont.transform(Matrix.getRotateInstance(Math.toRadians(div.getAngle_Rotation()), 0, 0));
			cont.setGraphicsStateParameters(graph);
			cont.saveGraphicsState();
			cont.fill();
			cont.transform(Matrix.getRotateInstance(Math.toRadians(-div.getAngle_Rotation()), 0, 0));
			cont.transform(Matrix.getTranslateInstance(-UnitConverter.convmmPoint(div.getPosX()) - dimx/2, -h_p + dimy/2 + UnitConverter.convmmPoint(div.getPosY())));
			cont.close();

			//la riga seguente serve per la gestione dell'uscita da un div, che implica anche che gli
			//elementi interni a esso devono avere dimensione e posizione interne a esso, quindi vanno controllate
			//che le dimensioni e le posizioni non siano maggiori del div. inoltre se il div e' ruotato, anche l'immagine o l'elemento interno deve essere ruotato
			addItemToDiv(container.getList_tot(), div.getWidth(), div.getHeight());
			container.setDiv(null);
			}
			else if(container.getDiv().getFigura().equals(Figure.CERCHIO))
			{
				float k = 0.552284749831f;
				float rx = UnitConverter.convmmPoint(div.getWidth()/2);
				float ry = UnitConverter.convmmPoint(div.getHeight()/2);
				float cx = 0f;
				float cy = 0f;
				cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint(div.getPosX()) + dimx/2, h_p - dimy/2 - UnitConverter.convmmPoint(div.getPosY())));
				cont.transform(Matrix.getRotateInstance(Math.toRadians(div.getAngle_Rotation()), 0, 0));
			    cont.moveTo(-rx, 0);
			    cont.curveTo(- rx, k * ry, -k * rx, ry, 0, ry);
			    cont.curveTo(k * rx, cy + ry, cx + rx, cy + k * ry, cx + rx, cy);
			    cont.curveTo(cx + rx, cy - k * ry, cx + k * rx, cy - ry, cx, cy - ry);
			    cont.curveTo(cx - k * rx, cy - ry, cx - rx, cy - k * ry, cx - rx, cy);
				cont.setGraphicsStateParameters(graph);
				cont.saveGraphicsState();
				cont.fill();
				cont.transform(Matrix.getRotateInstance(Math.toRadians(-div.getAngle_Rotation()), 0, 0));
				cont.transform(Matrix.getTranslateInstance(-UnitConverter.convmmPoint(div.getPosX()) - dimx/2, -h_p + dimy/2 + UnitConverter.convmmPoint(div.getPosY())));
				cont.close();
				container.setDiv(null);
			}
			else if(container.getDiv().getFigura().equals(Figure.TRIANGOLO))
			{
				cont.setStrokingColor(container.getDiv().getRGBAcolor());
				float rx = UnitConverter.convmmPoint(div.getWidth()/2);
				float ry = UnitConverter.convmmPoint(div.getHeight()/2);
				float cross = div.getCross_Percentage();
				cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint(div.getPosX()) + dimx/2, h_p - dimy/2 - UnitConverter.convmmPoint(div.getPosY())));
				cont.addPolygon(new float[] {-rx,  rx, rx - (100 - cross)*2*rx/100}, new float[] {-ry, -ry, ry});
				

				cont.transform(Matrix.getRotateInstance(Math.toRadians(div.getAngle_Rotation()), 0, 0));
				cont.setGraphicsStateParameters(graph);
				cont.saveGraphicsState();
				cont.fill();
				cont.transform(Matrix.getRotateInstance(Math.toRadians(-div.getAngle_Rotation()), 0, 0));
				cont.transform(Matrix.getTranslateInstance(-UnitConverter.convmmPoint(div.getPosX()) - dimx/2, -h_p + dimy/2 + UnitConverter.convmmPoint(div.getPosY())));
				cont.close();
			}
			
			
			
		}
		catch(IOException ioex)
		{
			//System.out.println(ioex);
		}
		container.getList_tot().clear();
	}

	public void addItemToDiv(List<Item_TOT> list, float div_width, float div_height)
	{
		for(Item_TOT item : list)
		{

			
			PDF_page = PDF_doc.getPage(n_page);
			float heigthPage = PDF_page.getMediaBox().getHeight();
			if(item.getType() == "IMG")
			{
				String Path = item.getURL();
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
								item.setPosY(container.getDiv().getPosY() + container.getDiv().getHeight() - item.getHeight());
								break;
							case 'c':
								item.setPosY(container.getDiv().getPosY() + (container.getDiv().getHeight() - item.getHeight()) / 2);
								break;
							case 't':
								item.setPosY(container.getDiv().getPosY());
								break;
							}
						}
					}
					float dimitemx=UnitConverter.convmmPoint(item.getWidth());
					float dimitemy=UnitConverter.convmmPoint(item.getHeight());
					
					float dimx=UnitConverter.convmmPoint(container.getDiv().getWidth());
					float dimy=UnitConverter.convmmPoint(container.getDiv().getHeight());
					/* transform */
					//transizione SUL DIV di posx+dimX/2 asse x, posy+dimY/2 asse y
					//rotazione di n radianti del DIV del contesto 
					//transizione indietro sul div e in avanti sull'oggetto di posx+dimX/2 asse x, posy+dimY/2 asse y
					//rotazione di n radianti dell'oggetto del contesto 
					//DISEGNO ITEM
					//rotazione di - n radianti dell'oggetto del contesto
					//transizione avanti sul div e all'indietro sull'oggetto di posx+dimX/2 asse x, posy+dimY/2 asse y
					//rotazione di -n radianti del DIV del contesto 
					//transizione all'indietro SUL DIV di posx+dimX/2 asse x, posy+dimY/2 asse y
					cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint(container.getDiv().getPosX()) + dimx/2, heigthPage - dimy/2 - UnitConverter.convmmPoint(container.getDiv().getPosY())));
					cont.transform(Matrix.getRotateInstance(Math.toRadians(container.getDiv().getAngle_Rotation()), 0, 0));
					cont.transform(Matrix.getTranslateInstance(-UnitConverter.convmmPoint(container.getDiv().getPosX()) + UnitConverter.convmmPoint((float)item.getPosX()) - dimx/2 + dimitemx/2, UnitConverter.convmmPoint((float)container.getDiv().getPosY()) - UnitConverter.convmmPoint(item.getPosY()) + dimy/2 - dimitemy/2));
					cont.transform(Matrix.getRotateInstance(Math.toRadians(item.getAngle_Rotation()), 0, 0));
					cont.drawImage(pdImage, -dimitemx/2, -dimitemy/2, dimitemx, dimitemy);
					cont.transform(Matrix.getRotateInstance(Math.toRadians(-item.getAngle_Rotation()), 0, 0));
					cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint(container.getDiv().getPosX()) - UnitConverter.convmmPoint((float)item.getPosX()) + dimx/2 - dimitemx/2, -UnitConverter.convmmPoint((float)container.getDiv().getPosY()) + UnitConverter.convmmPoint(item.getPosY()) - dimy/2 + dimitemy/2));
					cont.transform(Matrix.getRotateInstance(-Math.toRadians(container.getDiv().getAngle_Rotation()), 0, 0));
					cont.transform(Matrix.getTranslateInstance(-UnitConverter.convmmPoint(container.getDiv().getPosX()) - dimx/2, -heigthPage + dimy/2 + UnitConverter.convmmPoint(container.getDiv().getPosY())));
					
					cont.close();
					
					//cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint((float)item.getPosX())+dimx/2, heigthPage-dimy/2-UnitConverter.convmmPoint((float)item.getPosY())));
					//cont.transform(Matrix.getRotateInstance(Math.toRadians(item.getAngle_Rotation()), 0, 0));
					//cont.transform(Matrix.getTranslateInstance(-(UnitConverter.convmmPoint((float)item.getPosX())+dimx/2), -(heigthPage-dimy/2-UnitConverter.convmmPoint((float)item.getPosY()))));

					//cont.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					user_gui.listErrori.add(item.getID()+" "+item.getURL()+": "+e.getMessage());
					e.printStackTrace();
				}
			}
			else if(item.getType() == "TXT")
			{
				try {
					
					Alignment al=Alignment.Left;		
					if(item.getAlignment()!=null) {
						if(item.getAlignment().toLowerCase()=="left"||
								item.getAlignment().toLowerCase()=="center"||
								item.getAlignment().toLowerCase()=="right"||
								item.getAlignment().toLowerCase()=="justify")
							al=Alignment.valueOf(item.getAlignment().toLowerCase());
						else
							al=Alignment.Left;
					}
					float textWidth=0f;
					
					Paragraph p = new Paragraph();
					p.setAlignment(al);
					if(item.getWidth()!=null) {
						p.setMaxWidth(UnitConverter.convmmPoint(item.getWidth()));
					}
					// Create a new font object by loading a TrueType font into the document
					BaseFont font=null;
					PDFont rFont=null;
					PDFont bFont=null;
					PDFont iFont=null;
					PDFont biFont=null;
					for(String elem:item.getText()) {
						int bNum=0;
						int iNum=0;
						for(String parola : elem.split(" ")) {
							if(parola.contains("\\bold")) {
								bNum++;
							}
							if(parola.contains("\\italic")) {
								iNum++;
							}

						}
						elem.replace("*", "\\*");
						elem.replace("_", "\\_");
						if(bNum%2==0)
							elem=elem.replace("\\\\bold", "*");
						if(iNum%2==0)
							elem=elem.replace("\\\\italic", "_");

						if(item.getFontFamily()!=null && item.getFontFamily()!="") {
							if(item.isBold())
								if(item.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(item.isItalics())
								elem="_"+elem+"_";
							switch(item.getFontFamily().toLowerCase())
							{
							case "helvetica":
								font=BaseFont.Helvetica;
								break;
							case "courier":
								font=BaseFont.Courier;
								break;
							case "times":
								font=BaseFont.Times;
								break;
							default:
								font=BaseFont.Helvetica;
								break;
							}
						}else {
							if(item.getFontFamilyTTF()!="" && item.getFontFamilyTTF()!=null) {
								//DUBBI SU QUESTA:
								if(item.getFontFamilyOTF().contains(".ttf")) {
									font = null;
									if(item.getFontFamilyTTF().contains("Regular.ttf")) {
									String parent=item.getFontFamilyOTF().substring(0,item.getFontFamilyOTF().lastIndexOf("Regular.ttf"));
									OTFParser otfParser = new OTFParser();
									OpenTypeFont otf = otfParser.parse(new File(parent+"Regular.ttf"));
									rFont = PDType0Font.load(PDF_doc,otf,false);
									try{
										otf=otfParser.parse(new File(parent+"Bold.ttf"));
										bFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										bFont=rFont;
									}
									try{
										otf=otfParser.parse(new File(parent+"Italic.ttf"));
										iFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										iFont=rFont;
									}
									try{
										otf=otfParser.parse(new File(parent+"BoldItalic.ttf"));
										biFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										biFont=rFont;
									}
								}else {
									String parent=item.getFontFamilyTTF();
									rFont = PDType0Font.load(PDF_doc,new File(parent));
									bFont = PDType0Font.load(PDF_doc,new File(parent));
									iFont = PDType0Font.load(PDF_doc,new File(parent));
									biFont = PDType0Font.load(PDF_doc,new File(parent));
								}
								}else {
									font=BaseFont.Helvetica;
								}
								if(item.isBold())
									if(item.isItalics())
										elem="*_"+elem+"_*";
									else
										elem="*"+elem+"*";
								else if(item.isItalics())
									elem="_"+elem+"_";
							}else if(item.getFontFamilyOTF()!="" && item.getFontFamilyOTF()!=null){
								//DUBBI SU QUESTA:
								if(item.getFontFamilyOTF().contains(".otf")) {
									font = null;
									if(item.getFontFamilyTTF().contains("Regular.otf")) {
									String parent=item.getFontFamilyOTF().substring(0,item.getFontFamilyOTF().lastIndexOf("Regular.otf"));
									OTFParser otfParser = new OTFParser();
									OpenTypeFont otf = otfParser.parse(new File(parent+"Regular.otf"));
									rFont = PDType0Font.load(PDF_doc,otf,false);
									try{
										otf=otfParser.parse(new File(parent+"Bold.otf"));
										bFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										bFont=rFont;
									}
									try{
										otf=otfParser.parse(new File(parent+"Italic.otf"));
										iFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										iFont=rFont;
									}
									try{
										otf=otfParser.parse(new File(parent+"BoldItalic.otf"));
										biFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										biFont=rFont;
									}
								}else {
									String parent=item.getFontFamilyTTF();
									rFont = PDType0Font.load(PDF_doc,new File(parent));
									bFont = PDType0Font.load(PDF_doc,new File(parent));
									iFont = PDType0Font.load(PDF_doc,new File(parent));
									biFont = PDType0Font.load(PDF_doc,new File(parent));
								}
								}else {
									font=BaseFont.Helvetica;
								}
								if(item.isBold())
									if(item.isItalics())
										elem="*_"+elem+"_*";
									else
										elem="*"+elem+"*";
								else if(item.isItalics())
									elem="_"+elem+"_";
								//nel case applicare questa:
								//p.addText(elem, item.getFontSize(), PDType0Font.load(PDF_doc, new File(item.getFontFamilyTTF())));
							}else {
								font=BaseFont.Helvetica;
								if(item.isBold())
									if(item.isItalics())
										elem="*_"+elem+"_*";
									else
										elem="*"+elem+"*";
								else if(item.isItalics())
									elem="_"+elem+"_";
							}
						}
						if(font!=null) {
							if(textWidth<(font.getPlainFont().getStringWidth(elem)/1000)*item.getFontSize()){
								textWidth = (font.getPlainFont().getStringWidth(elem)/1000)*item.getFontSize();
							}
						}else {
							if(textWidth<(rFont.getStringWidth(elem)/1000)*item.getFontSize()){
								textWidth = (rFont.getStringWidth(elem)/1000)*item.getFontSize();
							}
						}
						if(item.isUnderline()) {

							PDAnnotationLink txtUnderline = new PDAnnotationLink();
							// add an underline
							PDBorderStyleDictionary underline = new PDBorderStyleDictionary();
							underline.setStyle(PDBorderStyleDictionary.STYLE_UNDERLINE);
							txtUnderline.setBorderStyle(underline);
							if(font!=null) {
							// set up the markup area
							textWidth = (font.getPlainFont().getStringWidth(elem)/1000)*item.getFontSize();
							}else {
									// set up the markup area
									textWidth = (rFont.getStringWidth(elem)/1000)*item.getFontSize();
							}
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
						if(item.getRGBAcolor() != null) {
							StringBuilder sb = new StringBuilder();
							sb.append(Integer.toHexString(item.getRGBAcolor().getRed()));
							if (sb.length() < 2) {
								sb.insert(0, '0'); // pad with leading zero if needed
							}
							sb.append(Integer.toHexString(item.getRGBAcolor().getGreen()));
							if (sb.length() < 4) {
								sb.insert(2, '0'); // pad with leading zero if needed
							}
							sb.append(Integer.toHexString(item.getRGBAcolor().getBlue()));
							if (sb.length() < 6) {
								sb.insert(4, '0'); // pad with leading zero if needed
							}
							String hex = sb.toString();
							elem="{color:#"+hex+"}"+elem.substring(1, elem.length()-1)+"{color:#000000}";
						}
						//p.addText(item.getText(), item.getFontSize(), font);

						if(font!=null) {
							p.addMarkup(elem+"\n", item.getFontSize(), font);
							p.addText("\n",item.getFontSize(), font.getPlainFont());
						}else{
							p.addMarkup(elem+"\n", item.getFontSize(), rFont, bFont, iFont, biFont);
							p.addText("\n",item.getFontSize(), rFont);
						}
						
					}
					if(item.getWidth()==null) {
						item.setWidth(UnitConverter.convPointmm(textWidth>p.getWidth()?textWidth:p.getWidth()));
					}
					if(item.getHeight()==null) {
						item.setHeight(UnitConverter.convPointmm(p.getHeight()));
					}
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
								item.setPosY(container.getDiv().getPosY() + container.getDiv().getHeight() - item.getHeight());
								break;
							case 'c':
								item.setPosY(container.getDiv().getPosY() + (container.getDiv().getHeight() - item.getHeight()) / 2);
								break;
							case 't':
								item.setPosY(container.getDiv().getPosY());
								break;
							}
						}
					}
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
					
					p.setMaxWidth(UnitConverter.convmmPoint(item.getWidth()));
					
					
					if(item.getWidth()>container.getDiv().getWidth() || item.getHeight()>container.getDiv().getHeight()) {
						System.out.println("Testo " + item.getID() +" nel div "+ container.getDiv().getID()+" troncato");
						user_gui.listErrori.add("Testo " + item.getID() +" nel div "+ container.getDiv().getID()+" troncato");
						if(item.getHeight()>container.getDiv().getHeight()) {
							//item.setHeight(container.getDiv().getHeight());
							System.out.println("Altezza testo " + item.getID() +" nel div "+ container.getDiv().getID()+" troppo grande. Riscrivere il testo");
							user_gui.listErrori.add("Altezza testo " + item.getID() +" nel div "+ container.getDiv().getID()+" troppo grande. Riscrivere il testo");
						}
						if(p.getHeight()>container.getDiv().getHeight()) {
							System.out.println("Testo " + item.getID() +" nel div "+ container.getDiv().getID()+" con troppe righe. Riscrivere il testo");
							//item.setHeight(container.getDiv().getHeight());
							user_gui.listErrori.add("Testo " + item.getID() +" nel div "+ container.getDiv().getID()+" con troppe righe. Riscrivere il testo");
						}
					}
					
					float dimitemx=p.getWidth();
					float dimitemy=p.getHeight();
					Position pt=new Position(-dimitemx/2,+dimitemy/2);
					
					//float w_mm=UnitConverter.convPointmm(container.getDiv().getWidth());
					float h_mm=UnitConverter.convPointmm(container.getDiv().getHeight());
					/*if(item.getPosX()<=w_mm)
						if(item.getWidth()+item.getPosX()>w_mm) {
							p.setMaxWidth(container.getDiv().getWidth()-item.getPosX());
							item.setWidth(container.getDiv().getWidth()-item.getPosX());
						}else
							p.setMaxWidth(item.getWidth());
					else
						System.out.println("Testo " + item.getID() + " in posizione esterna al div "+container.getDiv().getID() + " .");
					*/if(-container.getDiv().getPosY()+item.getPosY()+item.getHeight()>h_mm) {
						System.out.println("Il testo " + item.getID() +" eccede i limiti del div" + container.getDiv().getID() + ". Riscrivere il testo.");
						user_gui.listErrori.add("Il testo " + item.getID() +" eccede i limiti del div" + container.getDiv().getID() + ". Riscrivere il testo.");
					}	
					//DOMANDA: la posizione di un elemento interno e' relativa al div di cui fa parte?
										
					if(pt.getY()<0) {
						System.out.println("Il testo " + item.getID() +" eccede i limiti del div" + container.getDiv().getID() + ". Riscrivere il testo.");
						user_gui.listErrori.add("Il testo " + item.getID() +" eccede i limiti del div" + container.getDiv().getID() + ". Riscrivere il testo.");
					}
					
					float dimx=UnitConverter.convmmPoint(container.getDiv().getWidth());
					float dimy=UnitConverter.convmmPoint(container.getDiv().getHeight());
					/* transform */
					//transizione SUL DIV di posx+dimX/2 asse x, posy+dimY/2 asse y
					//rotazione di n radianti del DIV del contesto 
					//transizione indietro sul div e in avanti sull'oggetto di posx+dimX/2 asse x, posy+dimY/2 asse y
					//rotazione di n radianti dell'oggetto del contesto 
					//DISEGNO ITEM
					//rotazione di - n radianti dell'oggetto del contesto
					//transizione avanti sul div e all'indietro sull'oggetto di posx+dimX/2 asse x, posy+dimY/2 asse y
					//rotazione di -n radianti del DIV del contesto 
					//transizione all'indietro SUL DIV di posx+dimX/2 asse x, posy+dimY/2 asse y
					PDPageContentStream cont=new PDPageContentStream(PDF_doc, PDF_page,AppendMode.APPEND, true);
					cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint(container.getDiv().getPosX()) + dimx/2, heigthPage - dimy/2 - UnitConverter.convmmPoint(container.getDiv().getPosY())));
					cont.transform(Matrix.getRotateInstance(Math.toRadians(container.getDiv().getAngle_Rotation()), 0, 0));
					cont.transform(Matrix.getTranslateInstance(-UnitConverter.convmmPoint(container.getDiv().getPosX()) + UnitConverter.convmmPoint((float)item.getPosX()) - dimx/2 + dimitemx/2, UnitConverter.convmmPoint((float)container.getDiv().getPosY()) - UnitConverter.convmmPoint(item.getPosY()) + dimy/2 - dimitemy/2));
					cont.transform(Matrix.getRotateInstance(Math.toRadians(item.getAngle_Rotation()), 0, 0));
					p.draw(PDF_doc,cont, pt, null);
					cont.transform(Matrix.getRotateInstance(Math.toRadians(-item.getAngle_Rotation()), 0, 0));
					cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint(container.getDiv().getPosX()) - UnitConverter.convmmPoint((float)item.getPosX()) + dimx/2 - dimitemx/2, -UnitConverter.convmmPoint((float)container.getDiv().getPosY()) + UnitConverter.convmmPoint(item.getPosY()) - dimy/2 + dimitemy/2));
					cont.transform(Matrix.getRotateInstance(-Math.toRadians(container.getDiv().getAngle_Rotation()), 0, 0));
					cont.transform(Matrix.getTranslateInstance(-UnitConverter.convmmPoint(container.getDiv().getPosX()) - dimx/2, -heigthPage + dimy/2 + UnitConverter.convmmPoint(container.getDiv().getPosY())));
					//cont.saveGraphicsState();
					//cont.fill();
					cont.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					user_gui.listErrori.add(item.getID()+": "+e.getMessage());
					e.printStackTrace();
				} 
			}
			else if(item.getType() == "LIST")
			{
				try {
					
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
					float textWidth=0f;
					
					Paragraph p = new Paragraph();
					p.setAlignment(al);
					if(item.getWidth()!=null) {
						p.setMaxWidth(UnitConverter.convmmPoint(item.getWidth()));
					}
					// Create a new font object by loading a TrueType font into the document
					BaseFont font=null;
					PDFont rFont=null;
					PDFont bFont=null;
					PDFont iFont=null;
					PDFont biFont=null;
					for(String elem:item.getItems()) {
						int bNum=0;
						int iNum=0;
						for(String parola : elem.split(" ")) {
							if(parola.contains("\\bold")) {
								bNum++;
							}
							if(parola.contains("\\italic")) {
								iNum++;
							}

						}
						elem.replace("*", "\\*");
						elem.replace("_", "\\_");
						if(bNum%2==0)
							elem=elem.replace("\\\\bold", "*");
						if(iNum%2==0)
							elem=elem.replace("\\\\italic", "_");

						if(item.getFontFamily()!=null && item.getFontFamily()!="") {
							if(item.isBold())
								if(item.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(item.isItalics())
								elem="_"+elem+"_";
							switch(item.getFontFamily().toLowerCase())
							{
							case "helvetica":
								font=BaseFont.Helvetica;
								break;
							case "courier":
								font=BaseFont.Courier;
								break;
							case "times":
								font=BaseFont.Times;
								break;
							default:
								font=BaseFont.Helvetica;
								break;
							}
						}else {
							if(item.getFontFamilyTTF()!="" && item.getFontFamilyTTF()!=null) {
								//DUBBI SU QUESTA:
								if(item.getFontFamilyOTF().contains(".ttf")) {
									font = null;
									if(item.getFontFamilyTTF().contains("Regular.ttf")) {
									String parent=item.getFontFamilyOTF().substring(0,item.getFontFamilyOTF().lastIndexOf("Regular.ttf"));
									OTFParser otfParser = new OTFParser();
									OpenTypeFont otf = otfParser.parse(new File(parent+"Regular.ttf"));
									rFont = PDType0Font.load(PDF_doc,otf,false);
									try{
										otf=otfParser.parse(new File(parent+"Bold.ttf"));
										bFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										bFont=rFont;
									}
									try{
										otf=otfParser.parse(new File(parent+"Italic.ttf"));
										iFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										iFont=rFont;
									}
									try{
										otf=otfParser.parse(new File(parent+"BoldItalic.ttf"));
										biFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										biFont=rFont;
									}
								}else {
									String parent=item.getFontFamilyTTF();
									rFont = PDType0Font.load(PDF_doc,new File(parent));
									bFont = PDType0Font.load(PDF_doc,new File(parent));
									iFont = PDType0Font.load(PDF_doc,new File(parent));
									biFont = PDType0Font.load(PDF_doc,new File(parent));
								}
								}else {
									font=BaseFont.Helvetica;
								}
								if(item.isBold())
									if(item.isItalics())
										elem="*_"+elem+"_*";
									else
										elem="*"+elem+"*";
								else if(item.isItalics())
									elem="_"+elem+"_";
							}else if(item.getFontFamilyOTF()!="" && item.getFontFamilyOTF()!=null){
								//DUBBI SU QUESTA:
								if(item.getFontFamilyOTF().contains(".otf")) {
									font = null;
									if(item.getFontFamilyTTF().contains("Regular.otf")) {
									String parent=item.getFontFamilyOTF().substring(0,item.getFontFamilyOTF().lastIndexOf("Regular.otf"));
									OTFParser otfParser = new OTFParser();
									OpenTypeFont otf = otfParser.parse(new File(parent+"Regular.otf"));
									rFont = PDType0Font.load(PDF_doc,otf,false);
									try{
										otf=otfParser.parse(new File(parent+"Bold.otf"));
										bFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										bFont=rFont;
									}
									try{
										otf=otfParser.parse(new File(parent+"Italic.otf"));
										iFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										iFont=rFont;
									}
									try{
										otf=otfParser.parse(new File(parent+"BoldItalic.otf"));
										biFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										biFont=rFont;
									}
								}else {
									String parent=item.getFontFamilyTTF();
									rFont = PDType0Font.load(PDF_doc,new File(parent));
									bFont = PDType0Font.load(PDF_doc,new File(parent));
									iFont = PDType0Font.load(PDF_doc,new File(parent));
									biFont = PDType0Font.load(PDF_doc,new File(parent));
								}
								}else {
									font=BaseFont.Helvetica;
								}
								if(item.isBold())
									if(item.isItalics())
										elem="*_"+elem+"_*";
									else
										elem="*"+elem+"*";
								else if(item.isItalics())
									elem="_"+elem+"_";
								//nel case applicare questa:
								//p.addText(elem, item.getFontSize(), PDType0Font.load(PDF_doc, new File(item.getFontFamilyTTF())));
							}else {
								font=BaseFont.Helvetica;
								if(item.isBold())
									if(item.isItalics())
										elem="*_"+elem+"_*";
									else
										elem="*"+elem+"*";
								else if(item.isItalics())
									elem="_"+elem+"_";
							}
						}
						if(font!=null) {
							if(textWidth<(font.getPlainFont().getStringWidth(elem)/1000)*item.getFontSize()){
								textWidth = (font.getPlainFont().getStringWidth(elem)/1000)*item.getFontSize();
							}
						}else {
							if(textWidth<(rFont.getStringWidth(elem)/1000)*item.getFontSize()){
								textWidth = (rFont.getStringWidth(elem)/1000)*item.getFontSize();
							}
						}
						if(item.isUnderline()) {

							PDAnnotationLink txtUnderline = new PDAnnotationLink();
							// add an underline
							PDBorderStyleDictionary underline = new PDBorderStyleDictionary();
							underline.setStyle(PDBorderStyleDictionary.STYLE_UNDERLINE);
							txtUnderline.setBorderStyle(underline);
							if(font!=null) {
								// set up the markup area
								textWidth = (font.getPlainFont().getStringWidth(elem)/1000)*item.getFontSize();
							}else {
								// set up the markup area
								textWidth = (rFont.getStringWidth(elem)/1000)*item.getFontSize();
							}
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
						if(item.getRGBAcolor() != null) {
							StringBuilder sb = new StringBuilder();
							sb.append(Integer.toHexString(item.getRGBAcolor().getRed()));
							if (sb.length() < 2) {
								sb.insert(0, '0'); // pad with leading zero if needed
							}
							sb.append(Integer.toHexString(item.getRGBAcolor().getGreen()));
							if (sb.length() < 4) {
								sb.insert(2, '0'); // pad with leading zero if needed
							}
							sb.append(Integer.toHexString(item.getRGBAcolor().getBlue()));
							if (sb.length() < 6) {
								sb.insert(4, '0'); // pad with leading zero if needed
							}
							String hex = sb.toString();
							elem="{color:#"+hex+"}"+elem.substring(1, elem.length()-1)+"{color:#000000}";
						}
						//p.addText(item.getText(), item.getFontSize(), font);
						String bullet="";
						switch(item.getBullet().substring(0,3)) {
						case "odd":
							bullet= CompatibilityHelper.getBulletCharacter(1) + " ";
							break;
						case "eve":
							bullet= CompatibilityHelper.getBulletCharacter(2) + " ";
							break;
						case "new":
							bullet="-+{"+item.getBullet().substring(item.getBullet().indexOf("("), item.getBullet().lastIndexOf(")"))+":4em} ";  //es: new(<<)
							break;
						default:
							bullet= CompatibilityHelper.getBulletCharacter(1) + " ";
							break;
						}
						 
						RomanEnumerator e = new RomanEnumerator();
						if(item.isOrdered()) {
							p.add(new Indent(e.next() + ". ", 4, SpaceUnit.em, item.getFontSize(),font.getPlainFont(), Alignment.Right));
						}else {
							p.add(new Indent(bullet, 4, SpaceUnit.em, item.getFontSize(),font.getPlainFont(), Alignment.Right));
						}
						
						if(font==null) {
							p.addMarkup(elem+"\n", item.getFontSize(), rFont, bFont, iFont, biFont);
						}else {
							p.addMarkup(elem+"\n", item.getFontSize(), font);
						}
					}
					if(item.getWidth()==null) {
						item.setWidth(UnitConverter.convPointmm(textWidth>p.getWidth()?textWidth:p.getWidth()));
					}
					if(item.getHeight()==null) {
						item.setHeight(UnitConverter.convPointmm(p.getHeight()));
					}
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
								item.setPosY(container.getDiv().getPosY() + container.getDiv().getHeight() - item.getHeight());
								break;
							case 'c':
								item.setPosY(container.getDiv().getPosY() + (container.getDiv().getHeight() - item.getHeight()) / 2);
								break;
							case 't':
								item.setPosY(container.getDiv().getPosY());
								break;
							}
						}
					}
					
					
					p.setMaxWidth(UnitConverter.convmmPoint(item.getWidth()));
					
					
					if(item.getWidth()>container.getDiv().getWidth() || item.getHeight()>container.getDiv().getHeight()) {
						System.out.println("Lista " + item.getID() +" nel div "+ container.getDiv().getID()+" troncata");
						user_gui.listErrori.add("Lista " + item.getID() +" nel div "+ container.getDiv().getID()+" troncata");
						if(item.getHeight()>container.getDiv().getHeight()) {
							//item.setHeight(container.getDiv().getHeight());
							System.out.println("Altezza lista " + item.getID() +" nel div "+ container.getDiv().getID()+" troppo grande. Riscrivere la lista");
							user_gui.listErrori.add("Altezza lista " + item.getID() +" nel div "+ container.getDiv().getID()+" troppo grande. Riscrivere la lista");
						}
						if(p.getHeight()>container.getDiv().getHeight()) {
							System.out.println("Lista " + item.getID() +" nel div "+ container.getDiv().getID()+" con troppe righe. Riscrivere la lista");
							//item.setHeight(container.getDiv().getHeight());
							user_gui.listErrori.add("Lista " + item.getID() +" nel div "+ container.getDiv().getID()+" con troppe righe. Riscrivere la lista");
						}
					}
					
					float dimitemx=p.getWidth();
					float dimitemy=p.getHeight();
					Position pt=new Position(-dimitemx/2,+dimitemy/2);
					
					//float w_mm=UnitConverter.convPointmm(container.getDiv().getWidth());
					float h_mm=UnitConverter.convPointmm(container.getDiv().getHeight());
					/*if(item.getPosX()<=w_mm)
						if(item.getWidth()+item.getPosX()>w_mm) {
							p.setMaxWidth(container.getDiv().getWidth()-item.getPosX());
							item.setWidth(container.getDiv().getWidth()-item.getPosX());
						}else
							p.setMaxWidth(item.getWidth());
					else
						System.out.println("Testo " + item.getID() + " in posizione esterna al div "+container.getDiv().getID() + " .");
					*/if(-container.getDiv().getPosY()+item.getPosY()+item.getHeight()>h_mm) {
						System.out.println("La lista " + item.getID() +" eccede i limiti del div" + container.getDiv().getID() + ". Riscrivere la lista.");
						user_gui.listErrori.add("La lista " + item.getID() +" eccede i limiti del div" + container.getDiv().getID() + ". Riscrivere la lista.");
					}	
					//DOMANDA: la posizione di un elemento interno e' relativa al div di cui fa parte?
										
					if(pt.getY()<0) {
						System.out.println("La lista " + item.getID() +" eccede i limiti del div" + container.getDiv().getID() + ". Riscrivere la lista.");
						user_gui.listErrori.add("La lista " + item.getID() +" eccede i limiti del div" + container.getDiv().getID() + ". Riscrivere la lista.");
					}
					
					float dimx=UnitConverter.convmmPoint(container.getDiv().getWidth());
					float dimy=UnitConverter.convmmPoint(container.getDiv().getHeight());
					/* transform */
					//transizione SUL DIV di posx+dimX/2 asse x, posy+dimY/2 asse y
					//rotazione di n radianti del DIV del contesto 
					//transizione indietro sul div e in avanti sull'oggetto di posx+dimX/2 asse x, posy+dimY/2 asse y
					//rotazione di n radianti dell'oggetto del contesto 
					//DISEGNO ITEM
					//rotazione di - n radianti dell'oggetto del contesto
					//transizione avanti sul div e all'indietro sull'oggetto di posx+dimX/2 asse x, posy+dimY/2 asse y
					//rotazione di -n radianti del DIV del contesto 
					//transizione all'indietro SUL DIV di posx+dimX/2 asse x, posy+dimY/2 asse y
					PDPageContentStream cont=new PDPageContentStream(PDF_doc, PDF_page,AppendMode.APPEND, true);
					cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint(container.getDiv().getPosX()) + dimx/2, heigthPage - dimy/2 - UnitConverter.convmmPoint(container.getDiv().getPosY())));
					cont.transform(Matrix.getRotateInstance(Math.toRadians(container.getDiv().getAngle_Rotation()), 0, 0));
					cont.transform(Matrix.getTranslateInstance(-UnitConverter.convmmPoint(container.getDiv().getPosX()) + UnitConverter.convmmPoint((float)item.getPosX()) - dimx/2 + dimitemx/2, UnitConverter.convmmPoint((float)container.getDiv().getPosY()) - UnitConverter.convmmPoint(item.getPosY()) + dimy/2 - dimitemy/2));
					cont.transform(Matrix.getRotateInstance(Math.toRadians(item.getAngle_Rotation()), 0, 0));
					p.draw(PDF_doc,cont, pt, null);
					cont.transform(Matrix.getRotateInstance(Math.toRadians(-item.getAngle_Rotation()), 0, 0));
					cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint(container.getDiv().getPosX()) - UnitConverter.convmmPoint((float)item.getPosX()) + dimx/2 - dimitemx/2, -UnitConverter.convmmPoint((float)container.getDiv().getPosY()) + UnitConverter.convmmPoint(item.getPosY()) - dimy/2 + dimitemy/2));
					cont.transform(Matrix.getRotateInstance(-Math.toRadians(container.getDiv().getAngle_Rotation()), 0, 0));
					cont.transform(Matrix.getTranslateInstance(-UnitConverter.convmmPoint(container.getDiv().getPosX()) - dimx/2, -heigthPage + dimy/2 + UnitConverter.convmmPoint(container.getDiv().getPosY())));
					//cont.saveGraphicsState();
					//cont.fill();
					cont.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					user_gui.listErrori.add(item.getID()+": "+e.getMessage());
					e.printStackTrace();
				} 
			}
			else
			{
				System.out.println("Elemento non riconosciuto.");
				user_gui.listErrori.add("Elemento non riconosciuto.");
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
			
			if(Path.startsWith("."))
			{
				Path = user_gui.global_path + Path;
			}
			
			
			PDImageXObject pdImage =  PDImageXObject.createFromFile(Path, PDF_doc);

			PDPageContentStream cont = new PDPageContentStream(PDF_doc, PDF_page, AppendMode.APPEND, true); 
			IMG_Item img = container.getImg();
			img.setURL(Path);
			
			if(img.getWidth()==null && img.getHeight()==null)
			{
				img.setWidth(UnitConverter.convPointmm((float)pdImage.getWidth()));
				img.setHeight(UnitConverter.convPointmm((float)pdImage.getHeight()));
			}

			//DOMANDA: la posizione di un elemento interno e' relativa al div di cui fa parte?

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
							img.setPosY(h_mm - img.getHeight());
							break;
						case 'c':
							img.setPosY((h_mm - img.getHeight()) / 2);
							break;
						case 't':
							img.setPosY(0f);
							break;
						}
					}


				}
				
				if(img.getPosX() + img.getWidth() > w_mm && !container.getPage().isOob())
				{
					img.setWidth(w_mm - img.getPosX());
				}

				if(img.getPosY() + img.getHeight() > h_mm && !container.getPage().isOob())
				{
					img.setHeight(h_mm - img.getPosY());
				}
				

			}


			if(container.getDiv() != null)
			{
				Item_TOT i = new Item_TOT("IMG", false, 
						null, 
						null,
						img.getID(), 
						"", 
						0, 
						null, 
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
						null, 
						"",
						null,
						img.getURL(), img.getUnitX(), img.getUnitY(), img.getUnitWidth(), img.getUnitHeight());
				container.getList_tot().add(i);
			}
			else
			{
				float dimx=UnitConverter.convmmPoint(img.getWidth());
				float dimy=UnitConverter.convmmPoint(img.getHeight());
				/* transform */
				//transizione di posx+dimX/2 asse x, posy+dimY/2 asse y
				//rotazione di n radianti del contesto
            	//ritorno indietro di rotazione del contesto (per risettarsi a 0)
				//transizione di ritorno al punto origine
				cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint(img.getPosX()) + dimx/2, heigthPage - dimy/2 - UnitConverter.convmmPoint(img.getPosY())));
				cont.transform(Matrix.getRotateInstance(Math.toRadians(img.getAngle_Rotation()), 0, 0));
				cont.drawImage(pdImage, -dimx/2, -dimy/2, dimx, dimy);
				cont.transform(Matrix.getRotateInstance(Math.toRadians(-img.getAngle_Rotation()), 0, 0));
				cont.transform(Matrix.getTranslateInstance(-UnitConverter.convmmPoint(img.getPosX()) - dimx/2, -heigthPage + dimy/2 + UnitConverter.convmmPoint(img.getPosY())));
			}
			cont.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			user_gui.listErrori.add(container.getImg().getID()+" "+container.getImg().getURL()+": "+e1.getMessage());
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
						null, 
						txt.getID(), 
						txt.getFontFamily(), 
						txt.getFontSize(), 
						txt.getRGBAcolor(), 
						null,
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
						txt.getFontFamilyOTF(),
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
				
				// Create a new font object by loading a TrueType font into the document
				BaseFont font=null;
				PDFont rFont=null;
				PDFont bFont=null;
				PDFont iFont=null;
				PDFont biFont=null;
				
				for(String elem:txt.getText()) {
					int bNum=0;
					int iNum=0;
					for(String parola : elem.split(" ")) {
						if(parola.contains("\\bold")) {
							bNum++;
						}
						if(parola.contains("\\italic")) {
							iNum++;
						}

					}
					elem.replace("*", "\\*");
					elem.replace("_", "\\_");
					if(bNum%2==0)
						elem=elem.replace("\\\\bold", "*");
					if(iNum%2==0)
						elem=elem.replace("\\\\italic", "_");

					if(txt.getFontFamily()!=null && txt.getFontFamily()!="") {
						switch(txt.getFontFamily().toLowerCase())
						{
						case "helvetica":
							font=BaseFont.Helvetica;
							if(txt.isBold())
								if(txt.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(txt.isItalics())
								elem="_"+elem+"_";

							break;
						case "courier":
							font=BaseFont.Courier;
							if(txt.isBold())
								if(txt.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(txt.isItalics())
								elem="_"+elem+"_";
							break;
						case "times":
							font=BaseFont.Times;
							if(txt.isBold())
								if(txt.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(txt.isItalics())
								elem="_"+elem+"_";
							break;
						default:
							font=BaseFont.Helvetica;
							if(txt.isBold())
								if(txt.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(txt.isItalics())
								elem="_"+elem+"_";
							break;
						}
					}else {
						if(txt.getFontFamilyTTF()!="" && txt.getFontFamilyTTF()!=null) {
							if(txt.getFontFamilyOTF().contains(".ttf")) {
								font = null;
								if(txt.getFontFamilyTTF().contains("Regular.ttf")) {
								String parent=txt.getFontFamilyOTF().substring(0,txt.getFontFamilyOTF().lastIndexOf("Regular.ttf"));
								OTFParser otfParser = new OTFParser();
								OpenTypeFont otf = otfParser.parse(new File(parent+"Regular.ttf"));
								rFont = PDType0Font.load(PDF_doc,otf,false);
								try{
									otf=otfParser.parse(new File(parent+"Bold.ttf"));
									bFont=PDType0Font.load(PDF_doc, otf,false);
								}catch(IOException ex) {
									bFont=rFont;
								}
								try{
									otf=otfParser.parse(new File(parent+"Italic.ttf"));
									iFont=PDType0Font.load(PDF_doc, otf,false);
								}catch(IOException ex) {
									iFont=rFont;
								}
								try{
									otf=otfParser.parse(new File(parent+"BoldItalic.ttf"));
									biFont=PDType0Font.load(PDF_doc, otf,false);
								}catch(IOException ex) {
									biFont=rFont;
								}
							}else {
								String parent=txt.getFontFamilyTTF();
								rFont = PDType0Font.load(PDF_doc,new File(parent));
								bFont = PDType0Font.load(PDF_doc,new File(parent));
								iFont = PDType0Font.load(PDF_doc,new File(parent));
								biFont = PDType0Font.load(PDF_doc,new File(parent));
							}
							}else {
								font=BaseFont.Helvetica;
							}

						}else if(txt.getFontFamilyOTF()!="" && txt.getFontFamilyOTF()!=null){
							//DUBBI SU QUESTA:
							if(txt.getFontFamilyOTF().contains(".otf")) {
								font = null;
								if(txt.getFontFamilyTTF().contains("Regular.ttf")) {
								String parent=txt.getFontFamilyOTF().substring(0,txt.getFontFamilyOTF().lastIndexOf("Regular.otf"));
								OTFParser otfParser = new OTFParser();
								OpenTypeFont otf = otfParser.parse(new File(parent+"Regular.otf"));
								rFont = PDType0Font.load(PDF_doc,otf,false);
								try{
									otf=otfParser.parse(new File(parent+"Bold.otf"));
									bFont=PDType0Font.load(PDF_doc, otf,false);
								}catch(IOException ex) {
									bFont=rFont;
								}
								try{
									otf=otfParser.parse(new File(parent+"Italic.otf"));
									iFont=PDType0Font.load(PDF_doc, otf,false);
								}catch(IOException ex) {
									iFont=rFont;
								}
								try{
									otf=otfParser.parse(new File(parent+"BoldItalic.otf"));
									biFont=PDType0Font.load(PDF_doc, otf,false);
								}catch(IOException ex) {
									biFont=rFont;
								}
							}else {
								String parent=txt.getFontFamilyTTF();
								rFont = PDType0Font.load(PDF_doc,new File(parent));
								bFont = PDType0Font.load(PDF_doc,new File(parent));
								iFont = PDType0Font.load(PDF_doc,new File(parent));
								biFont = PDType0Font.load(PDF_doc,new File(parent));
							}
							}else {
								font=BaseFont.Helvetica;
							}
							if(txt.isBold())
								if(txt.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(txt.isItalics())
								elem="_"+elem+"_";
							//nel case applicare questa:
							//p.addText(elem, item.getFontSize(), PDType0Font.load(PDF_doc, new File(item.getFontFamilyTTF())));
						}else {
							font=BaseFont.Helvetica;
							if(txt.isBold())
								if(txt.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(txt.isItalics())
								elem="_"+elem+"_";
						}
					}
					
					if(txt.isUnderline()) {

						PDAnnotationLink txtUnderline = new PDAnnotationLink();
						// add an underline
						PDBorderStyleDictionary underline = new PDBorderStyleDictionary();
						underline.setStyle(PDBorderStyleDictionary.STYLE_UNDERLINE);
						txtUnderline.setBorderStyle(underline);
						Float textWidth;
						if(font!=null) {
							// set up the markup area
							textWidth = (font.getPlainFont().getStringWidth(elem)/1000)*txt.getFontSize();
						}else {
							// set up the markup area
							textWidth = (rFont.getStringWidth(elem)/1000)*txt.getFontSize();
						}
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
					if(txt.getRGBAcolor() != null) {
						StringBuilder sb = new StringBuilder();
						sb.append(Integer.toHexString(txt.getRGBAcolor().getRed()));
						if (sb.length() < 2) {
							sb.insert(0, '0'); // pad with leading zero if needed
						}
						sb.append(Integer.toHexString(txt.getRGBAcolor().getGreen()));
						if (sb.length() < 4) {
							sb.insert(2, '0'); // pad with leading zero if needed
						}
						sb.append(Integer.toHexString(txt.getRGBAcolor().getBlue()));
						if (sb.length() < 6) {
							sb.insert(4, '0'); // pad with leading zero if needed
						}
						String hex = sb.toString();
						elem="{color:#"+hex+"}"+elem.substring(1, elem.length()-1)+"{color:#000000}";
					}
					//p.addText(item.getText(), item.getFontSize(), font);
					if(font!=null) {
						p.addMarkup(elem+"\n", txt.getFontSize(), font);
						p.addText("\n",txt.getFontSize(), font.getPlainFont());
					}else {
						p.addMarkup(elem+"\n", txt.getFontSize(), rFont, bFont, iFont, biFont);
						p.addText("\n",txt.getFontSize(), rFont);
					}
					
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
					txt.setWidth(UnitConverter.convPointmm(p.getWidth()));
				}
				if(txt.getHeight()==null) {
					txt.setHeight(UnitConverter.convPointmm(p.getHeight()));
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

					if(txt.getPosX() + txt.getWidth() > w_mm && !container.getPage().isOob())
					{
						txt.setWidth(w_mm - txt.getPosX());
					}

					if(txt.getPosY() + txt.getHeight() > h_mm && !container.getPage().isOob())
					{
						txt.setHeight(h_mm - txt.getPosY());
					}
				}
				p.setMaxWidth(UnitConverter.convmmPoint(txt.getWidth()));
				if(txt.getPosX()<=w_mm) {
					if(txt.getWidth()+txt.getPosX()>w_mm) {
						p.setMaxWidth(PDF_page.getMediaBox().getWidth()-UnitConverter.convmmPoint(txt.getPosX()));
						txt.setWidth(w_mm-txt.getPosX());
					}
				}
				else{
					System.out.println("Testo " + txt.getID() + " in posizione esterna alla pagina.");
					user_gui.listErrori.add("Testo " + txt.getID() + " in posizione esterna alla pagina.");
				}
				if(txt.getPosY()+txt.getHeight()>h_mm) {
					System.out.println("Il testo " + txt.getID() +" eccede i limiti del foglio. Riscrivere il testo.");
					user_gui.listErrori.add("Il testo " + txt.getID() +" eccede i limiti del foglio. Riscrivere il testo.");
				}	
				float dimx=p.getWidth();
				System.out.println("dimx:"+dimx);
				float dimy=p.getHeight();
				//DOMANDA: la posizione di un elemento interno e' relativa al div di cui fa parte?
				System.out.println("txt_posX: "+txt.getPosX());
				System.out.println("txt_posY: "+txt.getPosY());
				Position pt=new Position(-dimx/2,+dimy/2);


				if(txt.getPosY()<0) {
					System.out.println("Il testo " + txt.getID() +" eccede i limiti del foglio. Riscrivere il testo.");
					user_gui.listErrori.add("Il testo " + txt.getID() +" eccede i limiti del foglio. Riscrivere il testo.");
				}



				/* transform */
				p.setAlignment(al);
				PDPageContentStream cont=new PDPageContentStream(PDF_doc, PDF_page,AppendMode.APPEND,true);
				cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint(txt.getPosX()) + dimx/2, h_p - dimy/2 - UnitConverter.convmmPoint(txt.getPosY())));
				cont.transform(Matrix.getRotateInstance(Math.toRadians(txt.getAngle_Rotation()), 0, 0));
				p.draw(PDF_doc,cont, pt,null);
				//ritorno indietro di rotazione del contesto (per risettarsi a 0)
				cont.transform(Matrix.getRotateInstance(Math.toRadians(-txt.getAngle_Rotation()), 0, 0));
				//transizione di ritorno al punto origine
				cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint(-txt.getPosX()) - dimx/2, -h_p +dimy/2+ UnitConverter.convmmPoint(txt.getPosY())));		
				cont.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			user_gui.listErrori.add(container.getTxt().getID()+": "+e.getMessage());
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
		txt.addText(ctx.STRING().toString());
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
			
			float h_p = PDF_page.getMediaBox().getHeight();
			LIST_Item li=container.getList();
			if(li.getRGBBulletColor()==null) {
				li.setRGBBulletColor(li.getRGBAcolor());
			}
			if(container.getDiv() != null)
			{
				Item_TOT i = new Item_TOT("LIST", 
						li.isOrdered(), 
						li.getBullet(), 
						li.getItems(),
						li.getID(), 
						li.getFontFamily(), 
						li.getFontSize(), 
						li.getRGBAcolor(), 
						li.getRGBBulletColor(),
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
						null, 
						li.getFontFamilyTTF(), 
						li.getFontFamilyOTF(),
						"", li.getUnitX(), li.getUnitY(), li.getUnitWidth(), li.getUnitHeight());
				container.getList_tot().add(i);
			}
			else
			{
				Alignment al=null;
				float w_mm = UnitConverter.convPointmm(PDF_page.getMediaBox().getWidth());
				float h_mm = UnitConverter.convPointmm(PDF_page.getMediaBox().getHeight());
				

				if(li.getAlignment()!=null) {
					if(li.getAlignment().toLowerCase()=="left"||
							li.getAlignment().toLowerCase()=="center"||
							li.getAlignment().toLowerCase()=="right"||
							li.getAlignment().toLowerCase()=="justify")
						al=Alignment.valueOf(li.getAlignment().toLowerCase());
					else
						al=Alignment.Left;
				}else
					al=Alignment.Left;

				Paragraph p = new Paragraph();
				
				// Create a new font object by loading a TrueType font into the document
				BaseFont font=null;
				PDFont rFont=null;
				PDFont bFont=null;
				PDFont iFont=null;
				PDFont biFont=null;
				for(String elem:li.getItems()) {
					int bNum=0;
					int iNum=0;
					for(String parola : elem.split(" ")) {
						if(parola.contains("\\bold")) {
							bNum++;
						}
						if(parola.contains("\\italic")) {
							iNum++;
						}

					}
					elem.replace("*", "\\*");
					elem.replace("_", "\\_");
					if(bNum%2==0)
						elem=elem.replace("\\\\bold", "*");
					if(iNum%2==0)
						elem=elem.replace("\\\\italic", "_");

					if(li.getFontFamily()!=null && li.getFontFamily()!="") {
						switch(li.getFontFamily().toLowerCase())
						{
						case "helvetica":
							font=BaseFont.Helvetica;
							if(li.isBold())
								if(li.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(li.isItalics())
								elem="_"+elem+"_";

							break;
						case "courier":
							font=BaseFont.Courier;
							if(li.isBold())
								if(li.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(li.isItalics())
								elem="_"+elem+"_";
							break;
						case "times":
							font=BaseFont.Times;
							if(li.isBold())
								if(li.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(li.isItalics())
								elem="_"+elem+"_";
							break;
						default:
							font=BaseFont.Helvetica;
							if(li.isBold())
								if(li.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(li.isItalics())
								elem="_"+elem+"_";
							break;
						}
					}else {
						if(li.getFontFamilyTTF()!="" && li.getFontFamilyTTF()!=null) {
							//DUBBI SU QUESTA:
							if(li.getFontFamilyTTF().contains(".ttf")) {
									font = null;
									if(li.getFontFamilyTTF().contains("Regular.ttf")) {
									String parent=li.getFontFamilyOTF().substring(0,li.getFontFamilyOTF().lastIndexOf("Regular.ttf"));
									OTFParser otfParser = new OTFParser();
									OpenTypeFont otf = otfParser.parse(new File(parent+"Regular.ttf"));
									rFont = PDType0Font.load(PDF_doc,otf,false);
									try{
										otf=otfParser.parse(new File(parent+"Bold.ttf"));
										bFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										bFont=rFont;
									}
									try{
										otf=otfParser.parse(new File(parent+"Italic.ttf"));
										iFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										iFont=rFont;
									}
									try{
										otf=otfParser.parse(new File(parent+"BoldItalic.ttf"));
										biFont=PDType0Font.load(PDF_doc, otf,false);
									}catch(IOException ex) {
										biFont=rFont;
									}
								}else {
									String parent=li.getFontFamilyTTF();
									rFont = PDType0Font.load(PDF_doc,new File(parent));
									bFont = PDType0Font.load(PDF_doc,new File(parent));
									iFont = PDType0Font.load(PDF_doc,new File(parent));
									biFont = PDType0Font.load(PDF_doc,new File(parent));
								}
								}else {
									font=BaseFont.Helvetica;
								}
							if(li.isBold())
								if(li.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(li.isItalics())
								elem="_"+elem+"_";
							//nel case applicare questa:
							//p.addText(elem, item.getFontSize(), PDType0Font.load(PDF_doc, new File(item.getFontFamilyTTF())));

						}else if(li.getFontFamilyOTF()!="" && li.getFontFamilyOTF()!=null){
							//DUBBI SU QUESTA:
							if(li.getFontFamilyOTF().contains(".otf")) {
								font = null;
								if(li.getFontFamilyTTF().contains("Regular.otf")) {
								String parent=li.getFontFamilyOTF().substring(0,li.getFontFamilyOTF().lastIndexOf("Regular.otf"));
								OTFParser otfParser = new OTFParser();
								OpenTypeFont otf = otfParser.parse(new File(parent+"Regular.otf"));
								rFont = PDType0Font.load(PDF_doc,otf,false);
								try{
									otf=otfParser.parse(new File(parent+"Bold.otf"));
									bFont=PDType0Font.load(PDF_doc, otf,false);
								}catch(IOException ex) {
									bFont=rFont;
								}
								try{
									otf=otfParser.parse(new File(parent+"Italic.otf"));
									iFont=PDType0Font.load(PDF_doc, otf,false);
								}catch(IOException ex) {
									iFont=rFont;
								}
								try{
									otf=otfParser.parse(new File(parent+"BoldItalic.otf"));
									biFont=PDType0Font.load(PDF_doc, otf,false);
								}catch(IOException ex) {
									biFont=rFont;
								}
							}else {
								String parent=li.getFontFamilyTTF();
								rFont = PDType0Font.load(PDF_doc,new File(parent));
								bFont = PDType0Font.load(PDF_doc,new File(parent));
								iFont = PDType0Font.load(PDF_doc,new File(parent));
								biFont = PDType0Font.load(PDF_doc,new File(parent));
							}
							}else {
								font=BaseFont.Helvetica;
							}
							if(li.isBold())
								if(li.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(li.isItalics())
								elem="_"+elem+"_";
							//nel case applicare questa:
							//p.addText(elem, item.getFontSize(), PDType0Font.load(PDF_doc, new File(item.getFontFamilyTTF())));
						}else {
							font=BaseFont.Helvetica;
							if(li.isBold())
								if(li.isItalics())
									elem="*_"+elem+"_*";
								else
									elem="*"+elem+"*";
							else if(li.isItalics())
								elem="_"+elem+"_";
						}
					}
					
					if(li.isUnderline()) {

						PDAnnotationLink txtUnderline = new PDAnnotationLink();
						// add an underline
						PDBorderStyleDictionary underline = new PDBorderStyleDictionary();
						underline.setStyle(PDBorderStyleDictionary.STYLE_UNDERLINE);
						txtUnderline.setBorderStyle(underline);
						Float textWidth;
						if(font!=null) {
							// set up the markup area
							textWidth = (font.getPlainFont().getStringWidth(elem)/1000)*li.getFontSize();
						}else {
							// set up the markup area
							textWidth = (rFont.getStringWidth(elem)/1000)*li.getFontSize();
						}
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
			}*/String hex = "000000";
					if(li.getRGBAcolor() != null) {
						StringBuilder sb = new StringBuilder();
						sb.append(Integer.toHexString(li.getRGBAcolor().getRed()));
						if (sb.length() < 2) {
							sb.insert(0, '0'); // pad with leading zero if needed
						}
						sb.append(Integer.toHexString(li.getRGBAcolor().getGreen()));
						if (sb.length() < 4) {
							sb.insert(2, '0'); // pad with leading zero if needed
						}
						sb.append(Integer.toHexString(li.getRGBAcolor().getBlue()));
						if (sb.length() < 6) {
							sb.insert(4, '0'); // pad with leading zero if needed
						}
						hex=sb.toString();
						elem="{color:#"+hex+"}"+elem.substring(1, elem.length()-1)+"{color:#000000}";
					}
					//p.addText(item.getText(), item.getFontSize(), font);
					String bullet="";
					switch(li.getBullet().substring(0,3)) {
					case "odd":
						bullet= CompatibilityHelper.getBulletCharacter(1) + " ";
						break;
					case "eve":
						bullet= CompatibilityHelper.getBulletCharacter(2) + " ";
						break;
					case "new":
						bullet="-+{"+li.getBullet().substring(li.getBullet().indexOf("("), li.getBullet().lastIndexOf(")"))+":4em} ";
						break;
					default:
						bullet= CompatibilityHelper.getBulletCharacter(1) + " ";
						break;
					}
					 
					RomanEnumerator e = new RomanEnumerator();
					if(li.isOrdered()) {
						p.add(new Indent(e.next() + ". ", 4, SpaceUnit.em, li.getFontSize(),font.getPlainFont(), Alignment.Right,li.getRGBBulletColor()));
					}else {
						p.add(new Indent(bullet, 4, SpaceUnit.em, li.getFontSize(),font.getPlainFont(), Alignment.Right,li.getRGBBulletColor()));
					}
					if(font!=null) {
						p.addMarkup(elem+"\n", li.getFontSize(), font);
						p.addText("\n",li.getFontSize(), font.getPlainFont());
					}else {
						p.addMarkup(elem+"\n", li.getFontSize(), rFont, bFont, iFont, biFont);
						p.addText("\n",li.getFontSize(), rFont);
					}
					
				}
				if(li.isFitX())
				{
					li.setWidth(w_mm);
					li.setPosX(0f);

				}
				if(li.isFitY())
				{
					li.setHeight(h_mm);
					li.setPosY(0f);
				}
				if(li.getWidth()==null) {
					li.setWidth(UnitConverter.convPointmm(p.getWidth()));
				}
				if(li.getHeight()==null) {
					li.setHeight(UnitConverter.convPointmm(p.getHeight()));
				}
				if(li.getUnitX().toCharArray()[0] == '%')
				{
					li.setUnitX("mm");
					if(li.getPosX() >= 0)
						li.setPosX(w_mm * (li.getPosX() / 100));
					else
						li.setPosX(w_mm - li.getWidth() + w_mm * (li.getPosX() / 100));
				}
				else if(li.getUnitX() == "pt")
				{
					li.setUnitX("mm");
					if(li.getPosX() >= 0)
						li.setPosX(UnitConverter.convPointmm(li.getPosX()));
					else
						li.setPosX(w_mm - li.getWidth() + UnitConverter.convPointmm(li.getPosX()));
				}
				else
				{
					if(li.getPosX() < 0)
						li.setPosX(w_mm - li.getWidth() + li.getPosX());
				}

				if(li.getUnitY().toCharArray()[0] == '%')
				{
					li.setUnitY("mm");
					if(li.getPosY() >= 0)
						li.setPosY(h_mm * (li.getPosY() / 100));
					else
						li.setPosY(h_mm - li.getHeight() + h_mm * (li.getPosY() / 100));
				}
				else if(li.getUnitY() == "pt")
				{
					li.setUnitY("mm");
					if(li.getPosY() >= 0)
						li.setPosY(UnitConverter.convPointmm(li.getPosY()));
					else
						li.setPosY(h_mm - li.getHeight() + UnitConverter.convPointmm(li.getPosY()));
				}
				else
				{
					if(li.getPosY() < 0)
						li.setPosY(h_mm - li.getHeight() + li.getPosY());
				}

				if(li.getUnitWidth().toCharArray()[0] == '%')
				{
					li.setUnitWidth("mm");
					if(li.getWidth()!=null)
						li.setWidth(w_mm * (li.getWidth() / 100));
				}
				else if(li.getUnitWidth() == "pt")
				{
					li.setUnitWidth("mm");
					li.setWidth(UnitConverter.convPointmm(li.getWidth()));
				}

				if(li.getUnitHeight().toCharArray()[0] == '%')
				{
					li.setUnitHeight("mm");
					li.setHeight(h_mm * (li.getHeight() / 100));
				}
				else if(li.getUnitWidth() == "pt")
				{
					li.setUnitHeight("mm");
					li.setHeight(UnitConverter.convPointmm(li.getHeight()));
				}

				if(li.getPosition() != "")
				{
					if(!li.isFitX())
					{
						switch(li.getPosition().toCharArray()[0])
						{
						case 'l':
							li.setPosX(0f);

							break;
						case 'c':
							li.setPosX((w_mm - li.getWidth()) / 2);

							break;
						case 'r':
							li.setPosX(w_mm - li.getWidth());

							break;
						default:
							li.setPosX(0f);

							break;
						}
					}

					if(!li.isFitY())
					{
						switch(li.getPosition().toCharArray()[1])
						{
						case 'b':
							li.setPosY(0f);
							break;
						case 'c':
							li.setPosY((h_mm - li.getHeight()) / 2);
							break;
						case 't':
							li.setPosY(h_mm - li.getHeight());
							break;
						default:
							li.setPosY(0f);
							break;
						}
					}
					if(li.getPosX() + li.getWidth() > w_mm && !container.getPage().isOob())
					{
						li.setWidth(w_mm - li.getPosX());
					}

					if(li.getPosY() + li.getHeight() > h_mm && !container.getPage().isOob())
					{
						li.setHeight(h_mm - li.getPosY());
					}
				}
				p.setMaxWidth(UnitConverter.convmmPoint(li.getWidth()));
				if(li.getPosX()<=w_mm) {
					if(li.getWidth()+li.getPosX()>w_mm) {
						p.setMaxWidth(PDF_page.getMediaBox().getWidth()-UnitConverter.convmmPoint(li.getPosX()));
						li.setWidth(w_mm-li.getPosX());
					}
				}
				else {
					System.out.println("Lista " + li.getID() + " in posizione esterna alla pagina.");
					user_gui.listErrori.add("Lista " + li.getID() + " in posizione esterna alla pagina.");
				}
				if(li.getPosY()+li.getHeight()>h_mm) {
					System.out.println("La lista " + li.getID() +" eccede i limiti del foglio. Riscrivere la lista.");
					user_gui.listErrori.add("La lista " + li.getID() +" eccede i limiti del foglio. Riscrivere la lista.");
				}	
				float dimx=p.getWidth();
				System.out.println("dimx:"+dimx);
				float dimy=p.getHeight();
				//DOMANDA: la posizione di un elemento interno e' relativa al div di cui fa parte?
				System.out.println("li_posX: "+li.getPosX());
				System.out.println("li_posY: "+li.getPosY());
				Position pt=new Position(-dimx/2,+dimy/2);


				if(li.getPosY()<0) {
					System.out.println("La lista " + li.getID() +" eccede i limiti del foglio. Riscrivere la lista.");
					user_gui.listErrori.add("La lista " + li.getID() +" eccede i limiti del foglio. Riscrivere la lista.");
				}



				/* transform */
				p.setAlignment(al);
				PDPageContentStream cont=new PDPageContentStream(PDF_doc, PDF_page,AppendMode.APPEND,true);
				cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint(li.getPosX()) + dimx/2, h_p - dimy/2 - UnitConverter.convmmPoint(li.getPosY())));
				cont.transform(Matrix.getRotateInstance(Math.toRadians(li.getAngle_Rotation()), 0, 0));
				p.draw(PDF_doc,cont, pt,null);
				//ritorno indietro di rotazione del contesto (per risettarsi a 0)
				cont.transform(Matrix.getRotateInstance(Math.toRadians(-li.getAngle_Rotation()), 0, 0));
				//transizione di ritorno al punto origine
				cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint(-li.getPosX()) - dimx/2, -h_p +dimy/2+ UnitConverter.convmmPoint(li.getPosY())));		
				cont.close();
				

			}
		}catch(IOException ex) {
			// TODO Auto-generated catch block
			user_gui.listErrori.add(container.getList().getID()+": "+ex.getMessage());
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
		LIST_Item li=container.getList();
		li.addItem(elem);
		container.setList(li);
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
			if(ctx.getChild(0).toString().replaceAll("\\s+", "").equals("p_width"))
				p.setWidth(Float.parseFloat(ctx.NVAL().toString()));
			else
				p.setHeight(Float.parseFloat(ctx.NVAL().toString()));
		}
		PDRectangle pdrect = new PDRectangle(p.getWidth(), p.getHeight());
		if(p.getFormat() != "")
		{
			//System.out.println("Inserito formato pagina e almeno una dimensione personalizzata. Verra' preso in considerazione il formato della pagina.");
			//user_gui.listErrori.add("Inserito formato pagina e almeno una dimensione personalizzata. Verra' preso in considerazione il formato della pagina.");
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
	@Override public void enterListattr(VolTextParser.ListattrContext ctx) { 
		LIST_Item list = container.getList();
			switch(ctx.getChild(0).toString().toLowerCase()) {
			case "ordered:":
				if(ctx.TFVAL().toString().toLowerCase()=="true")
					list.setOrdered(true);
				else
					list.setOrdered(false);
				break;
			case "bullet:":
				list.setBullet(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
				break;
			default:
				//System.out.println("Valore non riconosciuto");
				//user_gui.listErrori.add("listattrcontext "+ctx.getChild(0).toString().toLowerCase()+" Valore non riconosciuto");
			}
			container.setList(list);
		
		
	}
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
	@Override public void visitErrorNode(ErrorNode node) { 
		
	}
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
			String p = ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1);
			if (p.startsWith("."))
			{
				p = user_gui.global_path  + p;
			}
			pdf.setPath(p);
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
				if(ctx.NOTVAL() == null)
					div.setAngle_Rotation(Float.parseFloat((ctx.NVAL().toString())));
				else
					div.setAngle_Rotation(0 - Float.parseFloat((ctx.NVAL().toString())));
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
					div.setWidth((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				}
				break;
			case "layer":
				div.setLayer(Integer.parseInt(ctx.NVAL().toString()));
				break;
			default:
				System.out.println("Valore non riconosciuto");
				user_gui.listErrori.add("imganumber div "+ctx.getChild(0).toString().toLowerCase()+" Valore non riconosciuto");
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
				if(ctx.NOTVAL() == null)
					img.setAngle_Rotation(Float.parseFloat((ctx.NVAL().toString())));
				else
					img.setAngle_Rotation(0 - Float.parseFloat((ctx.NVAL().toString())));
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
				user_gui.listErrori.add("imganumber img "+ctx.getChild(0).toString().toLowerCase()+" Valore non riconosciuto");
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
				if(ctx.NOTVAL() == null)
					txt.setAngle_Rotation(Float.parseFloat((ctx.NVAL().toString())));
				else
					txt.setAngle_Rotation(0 - Float.parseFloat((ctx.NVAL().toString())));
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
				user_gui.listErrori.add("imganumber txt "+ctx.getChild(0).toString().toLowerCase()+" Valore non riconosciuto");
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
				if(ctx.NOTVAL() == null)
					list.setAngle_Rotation(Float.parseFloat((ctx.NVAL().toString())));
				else
					list.setAngle_Rotation(0 - Float.parseFloat((ctx.NVAL().toString())));
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
				user_gui.listErrori.add("imganumber list "+ctx.getChild(0).toString().toLowerCase()+" Valore non riconosciuto");
			}
			container.setList(list);
		}
		else
		{
			System.out.println("ALTRO");
			user_gui.listErrori.add("ALTRO");
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
			if(container.getDictionary_style().containsKey(div.getID()))
			{
				Item_Stylesheet is = container.getDictionary_style().get(div.getID());
				if(!div.getAngle_Rotation().equals(is.getAngle_Rotation()) && div.getAngle_Rotation().equals(0f))
					div.setAngle_Rotation(is.getAngle_Rotation());
				if(!div.getPosX().equals(is.getPosX()) && div.getPosX().equals(0f))
					div.setPosX(is.getPosX());
				if(!div.getPosY().equals(is.getPosY()) && div.getPosY().equals(0f))
					div.setPosY(is.getPosY());
				if(!div.getWidth().equals(is.getWidth()) && div.getWidth().equals(0f))
					div.setWidth(is.getWidth());
				if(!div.getHeight().equals(is.getHeight()) && div.getHeight().equals(0f))
					div.setHeight(is.getHeight());
				if(!div.getPosition().equals(is.getPosition()) && div.getPosition().equals(""))
					div.setPosition(is.getPosition());
				if(div.isFitX() != is.isFitX() && !div.isFitX())
					div.setFitX(is.isFitX());
				if(div.isFitY() != is.isFitY() && !div.isFitY())
					div.setFitY(is.isFitY());
				if(!div.getRGBAcolor().equals(is.getrGBAcolor()) && div.getRGBAcolor().getRed() == 0 && div.getRGBAcolor().getGreen() == 0 && div.getRGBAcolor().getBlue() == 0 && div.getRGBAcolor().getAlpha() == 0)
					div.setRGBAcolor(is.getrGBAcolor());
				if(!div.getFigura().equals(is.getFigura()) && div.getFigura().equals(Figure.RETTANGOLO))
					div.setFigura(is.getFigura());
				if(!div.getCross_Percentage().equals(is.getCross_Percentage()) && div.getCross_Percentage().equals(0f))
					div.setCross_Percentage(is.getCross_Percentage());
				if(!div.getUnitX().equals(is.getUnitX()) && div.getUnitX().equals("mm"))
					div.setUnitX(is.getUnitX());
				if(!div.getUnitY().equals(is.getUnitY()) && div.getUnitY().equals("mm"))
					div.setUnitY(is.getUnitY());
				if(!div.getUnitWidth().equals(is.getUnitWidth()) && div.getUnitWidth().equals("mm"))
					div.setUnitWidth(is.getUnitWidth());
				if(!div.getUnitHeight().equals(is.getUnitHeight()) && div.getUnitHeight().equals("mm"))
					div.setUnitHeight(is.getUnitHeight());
			}
			container.setDiv(div);
		}
		else if(ctx.getParent() instanceof VolTextParser.ImgattrContext)
		{
			IMG_Item img = container.getImg();
			img.setID(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
			if(container.getDictionary_style().containsKey(img.getID()))
			{
				Item_Stylesheet is = container.getDictionary_style().get(img.getID());
				if(!img.getAngle_Rotation().equals(is.getAngle_Rotation()) && img.getAngle_Rotation().equals(0f))
					img.setAngle_Rotation(is.getAngle_Rotation());
				if(!img.getPosX().equals(is.getPosX()) && img.getPosX().equals(0f))
					img.setPosX(is.getPosX());
				if(!img.getPosY().equals(is.getPosY()) && img.getPosY().equals(0f))
					img.setPosY(is.getPosY());
				if(!img.getWidth().equals(is.getWidth()) && img.getWidth().equals(0f))
					img.setWidth(is.getWidth());
				if(!img.getHeight().equals(is.getHeight()) && img.getHeight().equals(0f))
					img.setHeight(is.getHeight());
				if(!img.getPosition().equals(is.getPosition()) && img.getPosition().equals(""))
					img.setPosition(is.getPosition());
				if(img.isFitX() != is.isFitX() && !img.isFitX())
					img.setFitX(is.isFitX());
				if(img.isFitY() != is.isFitY() && !img.isFitY())
					img.setFitY(is.isFitY());
				if(!img.getUnitX().equals(is.getUnitX()) && img.getUnitX().equals("mm"))
					img.setUnitX(is.getUnitX());
				if(!img.getUnitY().equals(is.getUnitY()) && img.getUnitY().equals("mm"))
					img.setUnitY(is.getUnitY());
				if(!img.getUnitWidth().equals(is.getUnitWidth()) && img.getUnitWidth().equals("mm"))
					img.setUnitWidth(is.getUnitWidth());
				if(!img.getUnitHeight().equals(is.getUnitHeight()) && img.getUnitHeight().equals("mm"))
					img.setUnitHeight(is.getUnitHeight());
			}
			container.setImg(img);
		}
		else if(ctx.getParent() instanceof VolTextParser.TxtattrContext)
		{
			TXT_Item txt = container.getTxt();
			txt.setID(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
			if(container.getDictionary_style().containsKey(txt.getID()))
			{
				Item_Stylesheet is = container.getDictionary_style().get(txt.getID());
				if(!txt.getRGBAcolor().equals(is.getrGBAcolor()) && txt.getRGBAcolor().getRed() == 0 && txt.getRGBAcolor().getGreen() == 0 && txt.getRGBAcolor().getBlue() == 0 && txt.getRGBAcolor().getAlpha() == 0)
					txt.setRGBAcolor(is.getrGBAcolor());
				if(!txt.getAngle_Rotation().equals(is.getAngle_Rotation()) && txt.getAngle_Rotation().equals(0f))
					txt.setAngle_Rotation(is.getAngle_Rotation());
				if(!txt.getPosX().equals(is.getPosX()) && txt.getPosX().equals(0f))
					txt.setPosX(is.getPosX());
				if(!txt.getPosY().equals(is.getPosY()) && txt.getPosY().equals(0f))
					txt.setPosY(is.getPosY());
				if(!txt.getWidth().equals(is.getWidth()) && txt.getWidth().equals(0f))
					txt.setWidth(is.getWidth());
				if(!txt.getHeight().equals(is.getHeight()) && txt.getHeight().equals(0f))
					txt.setHeight(is.getHeight());
				if(!txt.getPosition().equals(is.getPosition()) && txt.getPosition().equals(""))
					txt.setPosition(is.getPosition());
				if(txt.isFitX() != is.isFitX() && !txt.isFitX())
					txt.setFitX(is.isFitX());
				if(txt.isFitY() != is.isFitY() && !txt.isFitY())
					txt.setFitY(is.isFitY());
				if(!txt.getUnitX().equals(is.getUnitX()) && txt.getUnitX().equals("mm"))
					txt.setUnitX(is.getUnitX());
				if(!txt.getUnitY().equals(is.getUnitY()) && txt.getUnitY().equals("mm"))
					txt.setUnitY(is.getUnitY());
				if(!txt.getUnitWidth().equals(is.getUnitWidth()) && txt.getUnitWidth().equals("mm"))
					txt.setUnitWidth(is.getUnitWidth());
				if(!txt.getUnitHeight().equals(is.getUnitHeight()) && txt.getUnitHeight().equals("mm"))
					txt.setUnitHeight(is.getUnitHeight());
				if(!txt.getFontFamily().equals(is.getFontFamily()) && txt.getFontFamily().equals(""))
					txt.setFontFamily(is.getFontFamily());
				if(!txt.getFontFamilyTTF().equals(is.getFontFamilyTTF()) && txt.getFontFamilyTTF().equals(null))
					txt.setFontFamilyTTF(is.getFontFamilyTTF());
				if(!txt.getFontFamilyOTF().equals(is.getFontFamilyOTF()) && txt.getFontFamilyOTF().equals(null))
					txt.setFontFamilyOTF(is.getFontFamilyOTF());
				if(txt.isBold() != is.isBold() && !txt.isBold())
					txt.setBold(is.isBold());
				if(txt.isItalics() != is.isItalics() && !txt.isItalics())
					txt.setItalics(is.isItalics());
				if(txt.isUnderline() != is.isUnderline() && !txt.isUnderline())
					txt.setUnderline(is.isUnderline());
				if(!txt.getAlignment().equals(is.getAlignment()) && txt.getAlignment().equals(""))
					txt.setAlignment(is.getAlignment());
				if(!txt.getFontSize().equals(is.getFontSize()) && txt.getFontSize().equals(12))
					txt.setFontSize(is.getFontSize());
			}
			container.setTxt(txt);
		}
		else if(ctx.getParent() instanceof VolTextParser.ListattrContext)
		{
			LIST_Item list = container.getList();
			list.setID(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
			if(container.getDictionary_style().containsKey(list.getID()))
			{
				Item_Stylesheet is = container.getDictionary_style().get(list.getID());
				if(!list.getRGBAcolor().equals(is.getrGBAcolor()) && list.getRGBAcolor().getRed() == 0 && list.getRGBAcolor().getGreen() == 0 && list.getRGBAcolor().getBlue() == 0 && list.getRGBAcolor().getAlpha() == 0)
					list.setRGBAcolor(is.getrGBAcolor());
				if(!list.getAngle_Rotation().equals(is.getAngle_Rotation()) && list.getAngle_Rotation().equals(0f))
					list.setAngle_Rotation(is.getAngle_Rotation());
				if(!list.getPosX().equals(is.getPosX()) && list.getPosX().equals(0f))
					list.setPosX(is.getPosX());
				if(!list.getPosY().equals(is.getPosY()) && list.getPosY().equals(0f))
					list.setPosY(is.getPosY());
				if(!list.getWidth().equals(is.getWidth()) && list.getWidth().equals(0f))
					list.setWidth(is.getWidth());
				if(!list.getHeight().equals(is.getHeight()) && list.getHeight().equals(0f))
					list.setHeight(is.getHeight());
				if(!list.getPosition().equals(is.getPosition()) && list.getPosition().equals(""))
					list.setPosition(is.getPosition());
				if(list.isFitX() != is.isFitX() && !list.isFitX())
					list.setFitX(is.isFitX());
				if(list.isFitY() != is.isFitY() && !list.isFitY())
					list.setFitY(is.isFitY());
				if(!list.getUnitX().equals(is.getUnitX()) && list.getUnitX().equals("mm"))
					list.setUnitX(is.getUnitX());
				if(!list.getUnitY().equals(is.getUnitY()) && list.getUnitY().equals("mm"))
					list.setUnitY(is.getUnitY());
				if(!list.getUnitWidth().equals(is.getUnitWidth()) && list.getUnitWidth().equals("mm"))
					list.setUnitWidth(is.getUnitWidth());
				if(!list.getUnitHeight().equals(is.getUnitHeight()) && list.getUnitHeight().equals("mm"))
					list.setUnitHeight(is.getUnitHeight());
				if(!list.getFontFamily().equals(is.getFontFamily()) && list.getFontFamily().equals(""))
					list.setFontFamily(is.getFontFamily());
				if(!list.getFontFamilyTTF().equals(is.getFontFamilyTTF()) && list.getFontFamilyTTF().equals(null))
					list.setFontFamilyTTF(is.getFontFamilyTTF());
				if(!list.getFontFamilyOTF().equals(is.getFontFamilyOTF()) && list.getFontFamilyOTF().equals(null))
					list.setFontFamilyOTF(is.getFontFamilyOTF());
				if(list.isBold() != is.isBold() && !list.isBold())
					list.setBold(is.isBold());
				if(list.isItalics() != is.isItalics() && !list.isItalics())
					list.setItalics(is.isItalics());
				if(list.isUnderline() != is.isUnderline() && !list.isUnderline())
					list.setUnderline(is.isUnderline());
				if(!list.getAlignment().equals(is.getAlignment()) && list.getAlignment().equals(""))
					list.setAlignment(is.getAlignment());
				if(!list.getFontSize().equals(is.getFontSize()) && list.getFontSize().equals(12))
					list.setFontSize(is.getFontSize());
				if(!list.getBullet().equals(is.getBullet()) && list.getBullet().equals("odd"))
					list.setBullet(is.getBullet());
				if(!list.getRGBBulletColor().equals(is.getRGBBulletColor()) && list.getRGBBulletColor().equals(null))
					list.setRGBBulletColor(is.getRGBBulletColor());
			}
			container.setList(list);
		}
		else if(ctx.getParent() instanceof VolTextParser.PageattrContext)
		{
			PAGE_Item page = container.getPage();
			page.setID(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
			if(container.getDictionary_style().containsKey(page.getID()))
			{
				Item_Stylesheet is = container.getDictionary_style().get(page.getID());
				if(!page.getAngleRotation().equals(is.getAngle_Rotation()) && page.getAngleRotation().equals(0f))
					page.setAngleRotation(is.getAngle_Rotation());
				if(page.isOob() != is.isOob() && !page.isOob())
					page.setOob(is.isOob());
				if(!page.getFormat().equals(is.getFormat()) && is.getFormat().equals(""))
					page.setFormat(is.getFormat());
				if(!page.getWidth().equals(is.getWidth()) && page.getWidth().equals(0f))
					page.setWidth(is.getWidth());
				if(!page.getHeight().equals(is.getHeight()) && page.getHeight().equals(0f))
					page.setHeight(is.getHeight());
				
			}
			container.setPage(page);
		}
		else
		{
			System.out.println("ALTRO");
			user_gui.listErrori.add("ALTRO");
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
			case "font-family-otf:":
				txt.setFontFamilyOTF(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
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
				user_gui.listErrori.add("txtattrcontext "+ctx.getChild(0).toString().toLowerCase()+" Valore non riconosciuto");
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
			case "font-family-otf:":
				list.setFontFamilyOTF(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
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
				user_gui.listErrori.add("listattrcontext "+ctx.getChild(0).toString().toLowerCase()+" Valore non riconosciuto");
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
			user_gui.listErrori.add("ALTRO");
		}
	}
	@Override
	public void exitPositionv(VolTextParser.PositionvContext ctx) {
		// TODO Auto-generated method stub

	}
	@Override
	public void enterColor(VolTextParser.ColorContext ctx) {
		// TODO Auto-generated method stub
		Color c = null;
		switch(ctx.getChild(0).toString().toLowerCase()) {
			case "color:":
				 String colore= ctx.COLORVAL().toString();
				 int r = Integer.parseInt(colore.substring(1, 3), 16);
				 int g = Integer.parseInt(colore.substring(3, 5), 16);
				 int b = Integer.parseInt(colore.substring(5, 7), 16);
				 int a = Integer.parseInt(colore.substring(7, 9), 16);
				 c = new Color(r, g, b ,a);
				break;
			case "colort:":
				
				try {
					Field f = Class.forName("java.awt.Color").getField(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
					c=(Color)f.get(null);
				} catch (Exception e) {
					c=Color.BLACK;
				}

				break;
			default:
				c=Color.BLACK;
				break;
		}
		

		

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
			user_gui.listErrori.add("color ALTRO elemento");
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
				System.out.println("ALTRO fitx elemento");
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
				user_gui.listErrori.add("ALTRO fity elemento");
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
			user_gui.listErrori.add("ALTRO alignment elemento");
		}
		
	}
	@Override
	public void exitAlignment(VolTextParser.AlignmentContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void enterColorBullet(ColorBulletContext ctx) {
		// TODO Auto-generated method stub
				Color c = null;
				switch(ctx.getChild(0).toString().toLowerCase()) {
					case "color-bullet:":
						 String colore= ctx.COLORVAL().toString();
						 int r = Integer.parseInt(colore.substring(1, 3), 16);
						 int g = Integer.parseInt(colore.substring(3, 5), 16);
						 int b = Integer.parseInt(colore.substring(5, 7), 16);
						 int a = Integer.parseInt(colore.substring(7, 9), 16);
						 c = new Color(r, g, b ,a);
						break;
					case "colort-bullet:":
						
						try {
							Field f = Class.forName("java.awt.Color").getField(ctx.STRING().toString().substring(1, ctx.STRING().toString().length() - 1));
							c=(Color)f.get(null);
						} catch (Exception e) {
							c=Color.BLACK;
						}

						break;
					default:
						c=Color.BLACK;
						break;
				}
				if(ctx.getParent() instanceof VolTextParser.ListattrContext)
				{
					LIST_Item list = container.getList();
					list.setRGBBulletColor(c);
					container.setList(list);
				}
				else
				{
					System.out.println("il colore del bullet non puo' essere inserito nell'elemento");
					user_gui.listErrori.add("il colore del bullet non puo' essere inserito nell'elemento");
				}
		
	}
	@Override
	public void exitColorBullet(ColorBulletContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void enterFigure(FigureContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitFigure(FigureContext ctx) {
		// TODO Auto-generated method stub
		String f = ctx.getChild(1).toString().toLowerCase();
		if(f.equals("rectangle"))
			container.getDiv().setFigura(Figure.RETTANGOLO);
		else if(f.equals("circle"))
			container.getDiv().setFigura(Figure.CERCHIO);
		else
			container.getDiv().setFigura(Figure.TRIANGOLO);
	}
	@Override
	public void enterTvalue(TvalueContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitTvalue(TvalueContext ctx) {
		// TODO Auto-generated method stub
		container.getDiv().setCross_Percentage(Float.parseFloat(ctx.NVAL().toString()));
	}
	
	

}
