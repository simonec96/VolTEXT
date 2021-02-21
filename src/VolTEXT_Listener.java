import java.awt.Color;
import java.io.File;
import java.io.IOException;

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
import classes.LIST_Item;
import classes.PDF_Item;
import classes.TXT_Item;
import classes.UnitConverter;
import rst.pdfbox.layout.elements.Paragraph;
import rst.pdfbox.layout.shape.Rect;
import rst.pdfbox.layout.text.Alignment;
import rst.pdfbox.layout.text.Position;

public class VolTEXT_Listener implements VolTextListener {
	public Item_Container container;
	
	public VolTEXT_Listener()
	{
		container = new Item_Container();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPdf(VolTextParser.PdfContext ctx) { 
		try {
			container.setPDF_doc(new PDDocument());
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
			container.getPDF_doc().save(container.getDoc().getPath() + container.getDoc().getTitle() + ".pdf");
			container.getPDF_doc().close();
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
		System.out.println("Enter Page");
		container.setPDF_page(new PDPage());
		container.getPDF_doc().addPage(container.getPDF_page());
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
		float h_p = container.getPDF_page().getMediaBox().getHeight();
		try (PDPageContentStream cont = new PDPageContentStream(container.getPDF_doc(), container.getPDF_page(), AppendMode.APPEND, true))
		{
			DIV_Item div = new DIV_Item();
			cont.setNonStrokingColor(div.getRGBAcolor());
			PDExtendedGraphicsState graph = new PDExtendedGraphicsState();
			graph.setNonStrokingAlphaConstant((float) (div.getRGBAcolor().getAlpha() / 255f));
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
			cont.saveGraphicsState();
			cont.fill();
			cont.restoreGraphicsState();
		}
		catch(IOException ioex)
		{
			System.out.println(ioex);
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
		container.setImg(new IMG_Item(ctx.imgElem().STRING().toString()));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitImg(VolTextParser.ImgContext ctx) {
	    /*
	     * String url = ctx.imgElem().STRING().toString();
	     * System.out.println(url.substring(1, url.length() - 1));
	     * 
		 * try {
		 * 
		 * String Path = ctx.imgElem().STRING().toString(); PDImageXObject pdImage =
		 * PDImageXObject.createFromFile(Path, doc);
		 * 
		 * PDPageContentStream cont = new PDPageContentStream(doc, page); IMG_Item img =
		 * container.getImg(); Matrix at = new Matrix(img.getWidth() * (float)
		 * Math.cos(Math.toRadians(img.getAngle_Rotation()) + img.getHeight() * (float)
		 * Math.cos(Math.toRadians(90) - Math.toRadians(img.getAngle_Rotation()))), 0,
		 * 0, img.getHeight() * (float) Math.cos(Math.toRadians(img.getAngle_Rotation())
		 * + img.getWidth() * (float) Math.cos(Math.toRadians(90) -
		 * Math.toRadians(img.getAngle_Rotation()))), img.getPosX(), img.getPosY());
		 * at.rotate(Math.toRadians(img.getAngle_Rotation())); cont.drawImage(pdImage,
		 * at); cont.close();
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		float heigthPage=container.getPDF_page().getMediaBox().getHeight();
		try {
			
			String Path = ctx.imgElem().STRING().toString(); 
			PDImageXObject pdImage =  PDImageXObject.createFromFile(Path, container.getPDF_doc());
		  
			PDPageContentStream cont = new PDPageContentStream(container.getPDF_doc(), container.getPDF_page(),AppendMode.APPEND, true); 
			cont.saveGraphicsState();
			IMG_Item img = container.getImg(); 
			float dimx=UnitConverter.convmmPoint(img.getWidth());
            float dimy=UnitConverter.convmmPoint(img.getHeight());
            /* transform */
            cont.transform(Matrix.getTranslateInstance(UnitConverter.convmmPoint((float)img.getPosX())+dimx/2, heigthPage-dimy/2-UnitConverter.convmmPoint((float)img.getPosY())));
            cont.transform(Matrix.getRotateInstance(Math.toRadians(img.getAngle_Rotation()), 0, 0));
            //TH not needed previousAngle = tAngles[i - 1];
            cont.transform(Matrix.getTranslateInstance(-(UnitConverter.convmmPoint((float)img.getPosX())+dimx/2), -(heigthPage-dimy/2-UnitConverter.convmmPoint((float)img.getPosY()))));
			/*Matrix at = new Matrix(img.getWidth() * (float)  Math.cos(Math.toRadians(img.getAngle_Rotation()) + img.getHeight() * (float)  Math.cos(Math.toRadians(90) - Math.toRadians(img.getAngle_Rotation()))),
				  				   0,
				  				   0,
				  				   img.getHeight() * (float) Math.cos(Math.toRadians(img.getAngle_Rotation()) + img.getWidth() * (float) Math.cos(Math.toRadians(90) -  Math.toRadians(img.getAngle_Rotation()))),
				  				   img.getPosX(),
				  				   img.getPosY());
			at.rotate(Math.toRadians(img.getAngle_Rotation())); */
			
			cont.drawImage(pdImage, UnitConverter.convmmPoint((float)img.getPosX()), heigthPage-dimy-UnitConverter.convmmPoint((float)img.getPosY())); 
			cont.close();
			cont.restoreGraphicsState();
		  
		 } catch (IOException e) { // TODO Auto-generated catch block
			 e.printStackTrace(); 
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
			PDPageContentStream cstream = new PDPageContentStream(container.getPDF_doc(), container.getPDF_page(),AppendMode.APPEND, true); 
			cstream.saveGraphicsState();
			Paragraph p = new Paragraph();
			TXT_Item txt=container.getTxt();
			// Create a new font object by loading a TrueType font into the document
			PDType0Font font = PDType0Font.load(container.getPDF_doc(), new File(txt.getFontFamilyTTF()));
			p.addText(txt.getText(), txt.getFontSize(), font);
			p.setMaxWidth(txt.getWidth());
			Position pt=new Position(UnitConverter.convmmPoint(txt.getPosX()),container.getPDF_page().getMediaBox().getHeight()-p.getHeight()-UnitConverter.convmmPoint(txt.getPosY()));
			//p.draw(container.getPDF_doc(), cstream, pt, null);
			cstream.close();
			cstream.restoreGraphicsState();
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
		for(String s : container.getList().getItems())
		{
			
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
	@Override public void enterPageattr(VolTextParser.PageattrContext ctx) { }
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
			pdf.setTitle(ctx.STRING().toString());
			break;
		case "author:":
			pdf.setAuthor(ctx.STRING().toString());
			break;
		case "path:":
			pdf.setPath(ctx.STRING().toString());
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
					div.setPosX(Float.parseFloat((ctx.NVAL().toString())));
					break;
				case "pos-y":
					div.setPosY(Float.parseFloat((ctx.NVAL().toString())));
					break;
				case "angle-rotation":
					div.setAngle_Rotation((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "h-img":
					div.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "w-img":
					div.setWidth((Float.parseFloat((ctx.NVAL().toString()))));
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
					img.setPosX(Float.parseFloat((ctx.NVAL().toString())));
					break;
				case "pos-y":
					img.setPosY(Float.parseFloat((ctx.NVAL().toString())));
					break;
				case "angle-rotation":
					img.setAngle_Rotation((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "h-img":
					img.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "w-img":
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
			switch(ctx.children.get(0).toString().toLowerCase()) {
				case "pos-x":
					txt.setPosX(Float.parseFloat((ctx.NVAL().toString())));
					break;
				case "pos-y":
					txt.setPosY(Float.parseFloat((ctx.NVAL().toString())));
					break;
				case "angle-rotation":
					txt.setAngle_Rotation((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "h-img":
					txt.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "w-img":
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
			switch(ctx.children.get(0).toString().toLowerCase()) {
				case "pos-x":
					list.setPosX(Float.parseFloat((ctx.NVAL().toString())));
					break;
				case "pos-y":
					list.setPosY(Float.parseFloat((ctx.NVAL().toString())));
					break;
				case "angle-rotation":
					list.setAngle_Rotation((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "h-img":
					list.setHeight((Float.parseFloat((ctx.NVAL().toString()))));
					break;
				case "w-img":
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
			div.setID(ctx.STRING().toString());
			container.setDiv(div);
		}
		else if(ctx.getParent() instanceof VolTextParser.ImgattrContext)
		{
			IMG_Item img = container.getImg();
			img.setID(ctx.STRING().toString());
			container.setImg(img);
		}
		else if(ctx.getParent() instanceof VolTextParser.TxtattrContext)
		{
			TXT_Item txt = container.getTxt();
			txt.setID(ctx.STRING().toString());
			container.setTxt(txt);
		}
		else if(ctx.getParent() instanceof VolTextParser.ListattrContext)
		{
			LIST_Item list = container.getList();
			list.setID(ctx.STRING().toString());
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
					txt.setID(ctx.STRING().toString());
					break;
				case "font-family:":
					txt.setFontFamily(ctx.STRING().toString());
					break;
				case "font-size:":
					txt.setFontSize(Integer.parseInt(ctx.NVAL().toString()));
					break;
				case "bold:":
					if(ctx.TFVAL().toString() == "T")
						txt.setBold(true);
					else
						txt.setBold(false);
					break;
				case "italics:":
					if(ctx.TFVAL().toString() == "T")
						txt.setItalics(true);
					else
						txt.setItalics(false);
					break;
				case "underline:":
					if(ctx.TFVAL().toString() == "T")
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
					list.setID(ctx.STRING().toString());
					break;
				case "font-family:":
					list.setFontFamily(ctx.STRING().toString());
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
		Float width = container.getPDF_page().getBBox().getWidth();
		Float height = container.getPDF_page().getBBox().getHeight();
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
					y = 0.0f;
					break;
				case 'c':
					y = (height - div.getHeight())/2;
					break;
				case 'u':
					y = height - div.getHeight();
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
				case 'u':
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
				case 'u':
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
				case 'u':
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
			list.setrGBAcolor(c);
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
}
