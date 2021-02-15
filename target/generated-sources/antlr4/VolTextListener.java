// Generated from VolText.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VolTextParser}.
 */
public interface VolTextListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VolTextParser#pdf}.
	 * @param ctx the parse tree
	 */
	void enterPdf(VolTextParser.PdfContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#pdf}.
	 * @param ctx the parse tree
	 */
	void exitPdf(VolTextParser.PdfContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#pdfattr}.
	 * @param ctx the parse tree
	 */
	void enterPdfattr(VolTextParser.PdfattrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#pdfattr}.
	 * @param ctx the parse tree
	 */
	void exitPdfattr(VolTextParser.PdfattrContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(VolTextParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(VolTextParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(VolTextParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(VolTextParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#attrStyle}.
	 * @param ctx the parse tree
	 */
	void enterAttrStyle(VolTextParser.AttrStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#attrStyle}.
	 * @param ctx the parse tree
	 */
	void exitAttrStyle(VolTextParser.AttrStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(VolTextParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(VolTextParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#pae}.
	 * @param ctx the parse tree
	 */
	void enterPae(VolTextParser.PaeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#pae}.
	 * @param ctx the parse tree
	 */
	void exitPae(VolTextParser.PaeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(VolTextParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(VolTextParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#elemd}.
	 * @param ctx the parse tree
	 */
	void enterElemd(VolTextParser.ElemdContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#elemd}.
	 * @param ctx the parse tree
	 */
	void exitElemd(VolTextParser.ElemdContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#img}.
	 * @param ctx the parse tree
	 */
	void enterImg(VolTextParser.ImgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#img}.
	 * @param ctx the parse tree
	 */
	void exitImg(VolTextParser.ImgContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#imgattr}.
	 * @param ctx the parse tree
	 */
	void enterImgattr(VolTextParser.ImgattrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#imgattr}.
	 * @param ctx the parse tree
	 */
	void exitImgattr(VolTextParser.ImgattrContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#imgElem}.
	 * @param ctx the parse tree
	 */
	void enterImgElem(VolTextParser.ImgElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#imgElem}.
	 * @param ctx the parse tree
	 */
	void exitImgElem(VolTextParser.ImgElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(VolTextParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(VolTextParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#txtattr}.
	 * @param ctx the parse tree
	 */
	void enterTxtattr(VolTextParser.TxtattrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#txtattr}.
	 * @param ctx the parse tree
	 */
	void exitTxtattr(VolTextParser.TxtattrContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#txtElem}.
	 * @param ctx the parse tree
	 */
	void enterTxtElem(VolTextParser.TxtElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#txtElem}.
	 * @param ctx the parse tree
	 */
	void exitTxtElem(VolTextParser.TxtElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(VolTextParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(VolTextParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#listElem}.
	 * @param ctx the parse tree
	 */
	void enterListElem(VolTextParser.ListElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#listElem}.
	 * @param ctx the parse tree
	 */
	void exitListElem(VolTextParser.ListElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#imganumber}.
	 * @param ctx the parse tree
	 */
	void enterImganumber(VolTextParser.ImganumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#imganumber}.
	 * @param ctx the parse tree
	 */
	void exitImganumber(VolTextParser.ImganumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#idval}.
	 * @param ctx the parse tree
	 */
	void enterIdval(VolTextParser.IdvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#idval}.
	 * @param ctx the parse tree
	 */
	void exitIdval(VolTextParser.IdvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#txtval}.
	 * @param ctx the parse tree
	 */
	void enterTxtval(VolTextParser.TxtvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#txtval}.
	 * @param ctx the parse tree
	 */
	void exitTxtval(VolTextParser.TxtvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#positionv}.
	 * @param ctx the parse tree
	 */
	void enterPositionv(VolTextParser.PositionvContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#positionv}.
	 * @param ctx the parse tree
	 */
	void exitPositionv(VolTextParser.PositionvContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#pageattr}.
	 * @param ctx the parse tree
	 */
	void enterPageattr(VolTextParser.PageattrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#pageattr}.
	 * @param ctx the parse tree
	 */
	void exitPageattr(VolTextParser.PageattrContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#listattr}.
	 * @param ctx the parse tree
	 */
	void enterListattr(VolTextParser.ListattrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#listattr}.
	 * @param ctx the parse tree
	 */
	void exitListattr(VolTextParser.ListattrContext ctx);
}