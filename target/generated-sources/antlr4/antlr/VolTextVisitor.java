// Generated from VolText.g4 by ANTLR 4.9

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VolTextParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VolTextVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VolTextParser#pdf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPdf(VolTextParser.PdfContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#pdfattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPdfattr(VolTextParser.PdfattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(VolTextParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(VolTextParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#attrStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrStyle(VolTextParser.AttrStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(VolTextParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#pae}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPae(VolTextParser.PaeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(VolTextParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#tvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTvalue(VolTextParser.TvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigure(VolTextParser.FigureContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#elemd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemd(VolTextParser.ElemdContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#img}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImg(VolTextParser.ImgContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#imgattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgattr(VolTextParser.ImgattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#imgElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgElem(VolTextParser.ImgElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(VolTextParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#listElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElem(VolTextParser.ListElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(VolTextParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#txtattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTxtattr(VolTextParser.TxtattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#txtElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTxtElem(VolTextParser.TxtElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#fitAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFitAttr(VolTextParser.FitAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#imganumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImganumber(VolTextParser.ImganumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#idval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdval(VolTextParser.IdvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#listattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListattr(VolTextParser.ListattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#txtval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTxtval(VolTextParser.TxtvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#colorBullet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorBullet(VolTextParser.ColorBulletContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(VolTextParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#positionv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionv(VolTextParser.PositionvContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#alignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignment(VolTextParser.AlignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#pageattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageattr(VolTextParser.PageattrContext ctx);
}