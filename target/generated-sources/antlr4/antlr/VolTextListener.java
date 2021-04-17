// Generated from VolText.g4 by ANTLR 4.4

    package antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VolTextParser}.
 */
public interface VolTextListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VolTextParser#pageattr}.
	 * @param ctx the parse tree
	 */
	void enterPageattr(@NotNull VolTextParser.PageattrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#pageattr}.
	 * @param ctx the parse tree
	 */
	void exitPageattr(@NotNull VolTextParser.PageattrContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#img}.
	 * @param ctx the parse tree
	 */
	void enterImg(@NotNull VolTextParser.ImgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#img}.
	 * @param ctx the parse tree
	 */
	void exitImg(@NotNull VolTextParser.ImgContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#txtElem}.
	 * @param ctx the parse tree
	 */
	void enterTxtElem(@NotNull VolTextParser.TxtElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#txtElem}.
	 * @param ctx the parse tree
	 */
	void exitTxtElem(@NotNull VolTextParser.TxtElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(@NotNull VolTextParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(@NotNull VolTextParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#imgElem}.
	 * @param ctx the parse tree
	 */
	void enterImgElem(@NotNull VolTextParser.ImgElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#imgElem}.
	 * @param ctx the parse tree
	 */
	void exitImgElem(@NotNull VolTextParser.ImgElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#fitAttr}.
	 * @param ctx the parse tree
	 */
	void enterFitAttr(@NotNull VolTextParser.FitAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#fitAttr}.
	 * @param ctx the parse tree
	 */
	void exitFitAttr(@NotNull VolTextParser.FitAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#txtattr}.
	 * @param ctx the parse tree
	 */
	void enterTxtattr(@NotNull VolTextParser.TxtattrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#txtattr}.
	 * @param ctx the parse tree
	 */
	void exitTxtattr(@NotNull VolTextParser.TxtattrContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#pdfattr}.
	 * @param ctx the parse tree
	 */
	void enterPdfattr(@NotNull VolTextParser.PdfattrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#pdfattr}.
	 * @param ctx the parse tree
	 */
	void exitPdfattr(@NotNull VolTextParser.PdfattrContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull VolTextParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull VolTextParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#idval}.
	 * @param ctx the parse tree
	 */
	void enterIdval(@NotNull VolTextParser.IdvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#idval}.
	 * @param ctx the parse tree
	 */
	void exitIdval(@NotNull VolTextParser.IdvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#colorBullet}.
	 * @param ctx the parse tree
	 */
	void enterColorBullet(@NotNull VolTextParser.ColorBulletContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#colorBullet}.
	 * @param ctx the parse tree
	 */
	void exitColorBullet(@NotNull VolTextParser.ColorBulletContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#pae}.
	 * @param ctx the parse tree
	 */
	void enterPae(@NotNull VolTextParser.PaeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#pae}.
	 * @param ctx the parse tree
	 */
	void exitPae(@NotNull VolTextParser.PaeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#attrStyle}.
	 * @param ctx the parse tree
	 */
	void enterAttrStyle(@NotNull VolTextParser.AttrStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#attrStyle}.
	 * @param ctx the parse tree
	 */
	void exitAttrStyle(@NotNull VolTextParser.AttrStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(@NotNull VolTextParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(@NotNull VolTextParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull VolTextParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull VolTextParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(@NotNull VolTextParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(@NotNull VolTextParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#figure}.
	 * @param ctx the parse tree
	 */
	void enterFigure(@NotNull VolTextParser.FigureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#figure}.
	 * @param ctx the parse tree
	 */
	void exitFigure(@NotNull VolTextParser.FigureContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#tvalue}.
	 * @param ctx the parse tree
	 */
	void enterTvalue(@NotNull VolTextParser.TvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#tvalue}.
	 * @param ctx the parse tree
	 */
	void exitTvalue(@NotNull VolTextParser.TvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#listElem}.
	 * @param ctx the parse tree
	 */
	void enterListElem(@NotNull VolTextParser.ListElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#listElem}.
	 * @param ctx the parse tree
	 */
	void exitListElem(@NotNull VolTextParser.ListElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull VolTextParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull VolTextParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#positionv}.
	 * @param ctx the parse tree
	 */
	void enterPositionv(@NotNull VolTextParser.PositionvContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#positionv}.
	 * @param ctx the parse tree
	 */
	void exitPositionv(@NotNull VolTextParser.PositionvContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#txtval}.
	 * @param ctx the parse tree
	 */
	void enterTxtval(@NotNull VolTextParser.TxtvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#txtval}.
	 * @param ctx the parse tree
	 */
	void exitTxtval(@NotNull VolTextParser.TxtvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#pdf}.
	 * @param ctx the parse tree
	 */
	void enterPdf(@NotNull VolTextParser.PdfContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#pdf}.
	 * @param ctx the parse tree
	 */
	void exitPdf(@NotNull VolTextParser.PdfContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#imgattr}.
	 * @param ctx the parse tree
	 */
	void enterImgattr(@NotNull VolTextParser.ImgattrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#imgattr}.
	 * @param ctx the parse tree
	 */
	void exitImgattr(@NotNull VolTextParser.ImgattrContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#elemd}.
	 * @param ctx the parse tree
	 */
	void enterElemd(@NotNull VolTextParser.ElemdContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#elemd}.
	 * @param ctx the parse tree
	 */
	void exitElemd(@NotNull VolTextParser.ElemdContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#listattr}.
	 * @param ctx the parse tree
	 */
	void enterListattr(@NotNull VolTextParser.ListattrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#listattr}.
	 * @param ctx the parse tree
	 */
	void exitListattr(@NotNull VolTextParser.ListattrContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#imganumber}.
	 * @param ctx the parse tree
	 */
	void enterImganumber(@NotNull VolTextParser.ImganumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#imganumber}.
	 * @param ctx the parse tree
	 */
	void exitImganumber(@NotNull VolTextParser.ImganumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(@NotNull VolTextParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(@NotNull VolTextParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link VolTextParser#alignment}.
	 * @param ctx the parse tree
	 */
	void enterAlignment(@NotNull VolTextParser.AlignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VolTextParser#alignment}.
	 * @param ctx the parse tree
	 */
	void exitAlignment(@NotNull VolTextParser.AlignmentContext ctx);
}