// Generated from VolText.g4 by ANTLR 4.4

    package antlr;

import org.antlr.v4.runtime.misc.NotNull;
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
	 * Visit a parse tree produced by {@link VolTextParser#pageattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageattr(@NotNull VolTextParser.PageattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#img}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImg(@NotNull VolTextParser.ImgContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#txtElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTxtElem(@NotNull VolTextParser.TxtElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(@NotNull VolTextParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#imgElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgElem(@NotNull VolTextParser.ImgElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#fitAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFitAttr(@NotNull VolTextParser.FitAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#txtattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTxtattr(@NotNull VolTextParser.TxtattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#pdfattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPdfattr(@NotNull VolTextParser.PdfattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull VolTextParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#idval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdval(@NotNull VolTextParser.IdvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#colorBullet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorBullet(@NotNull VolTextParser.ColorBulletContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#pae}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPae(@NotNull VolTextParser.PaeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#attrStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrStyle(@NotNull VolTextParser.AttrStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(@NotNull VolTextParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull VolTextParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(@NotNull VolTextParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigure(@NotNull VolTextParser.FigureContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#tvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTvalue(@NotNull VolTextParser.TvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#listElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElem(@NotNull VolTextParser.ListElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull VolTextParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#positionv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionv(@NotNull VolTextParser.PositionvContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#txtval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTxtval(@NotNull VolTextParser.TxtvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#pdf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPdf(@NotNull VolTextParser.PdfContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#imgattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgattr(@NotNull VolTextParser.ImgattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#elemd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemd(@NotNull VolTextParser.ElemdContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#listattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListattr(@NotNull VolTextParser.ListattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#imganumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImganumber(@NotNull VolTextParser.ImganumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(@NotNull VolTextParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link VolTextParser#alignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignment(@NotNull VolTextParser.AlignmentContext ctx);
}