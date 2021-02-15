import java.io.IOException;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.util.Matrix;

import classes.DIV_Item;
import classes.IMG_Item;
import classes.Item_Container;
import classes.LIST_Item;
import classes.PDF_Item;
import classes.TXT_Item;

public class VolTEXT_Listener implements VolTextListener {
	public PDDocument doc;
	public PDPage page;
	public Item_Container container;
	public String type;
	
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
			doc = new PDDocument();
			container.setDoc(new PDF_Item());
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally {
			System.out.println("Enter PDF");
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPdf(VolTextParser.PdfContext ctx) { 
		try {
			doc.save(container.getDoc().getPath() + container.getDoc().getTitle() + ".pdf");
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
		page = new PDPage();
		type = "page";
		doc.addPage(page);
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
		type = "div";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDiv(VolTextParser.DivContext ctx) { }
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
		System.out.println("Enter IMG");
		IMG_Item img = new IMG_Item(ctx.imgElem().STRING().toString());
		container.setImg(img);
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitImg(VolTextParser.ImgContext ctx) {
		String url = ctx.imgElem().STRING().toString();
		System.out.println(url.substring(1, url.length() - 1));
		/*
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
			PDPageContentStream cstream = new PDPageContentStream(doc, page);
			
			
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
	@Override public void enterList(VolTextParser.ListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitList(VolTextParser.ListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterListElem(VolTextParser.ListElemContext ctx) { }
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
	@Override public void enterTxtattr(VolTextParser.TxtattrContext ctx) {
		
	}
	
	
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
		
	}
	@Override
	public void exitIdval(VolTextParser.IdvalContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void enterTxtval(VolTextParser.TxtvalContext ctx) {
		// TODO Auto-generated method stub
		TXT_Item txt = container.getTxt();
		switch(ctx.children.get(0).toString().toLowerCase()) {
			case "id:":
				txt.setID(ctx.STRING().toString());
				break;
			case "font-family:":
				if(ctx.STRING() != null)
				{
					txt.setFontFamily(ctx.STRING().toString());
				}
				else
				{
					txt.setFontFamilyTTF(ctx.STRING().toString());
				}
				break;
			case "font-size:":
				txt.setFontSize(Integer.parseInt(ctx.NVAL().toString()));
				break;
			case "color:":
				txt.setColor(ctx.COLORVAL().toString());
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
	@Override
	public void exitTxtval(VolTextParser.TxtvalContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void enterPositionv(VolTextParser.PositionvContext ctx) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exitPositionv(VolTextParser.PositionvContext ctx) {
		// TODO Auto-generated method stub
		
	}
}
