// Generated from Hello.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#pdf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPdf(HelloParser.PdfContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(HelloParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(HelloParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#attrStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrStyle(HelloParser.AttrStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(HelloParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#pae}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPae(HelloParser.PaeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#elemp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemp(HelloParser.ElempContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#divae}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivae(HelloParser.DivaeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#elemd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemd(HelloParser.ElemdContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#img}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImg(HelloParser.ImgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#imgElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgElem(HelloParser.ImgElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(HelloParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#txtElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTxtElem(HelloParser.TxtElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(HelloParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#lae}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLae(HelloParser.LaeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#listElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElem(HelloParser.ListElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#pageattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageattr(HelloParser.PageattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#divattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivattr(HelloParser.DivattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#listattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListattr(HelloParser.ListattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#txtattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTxtattr(HelloParser.TxtattrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#imgattr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgattr(HelloParser.ImgattrContext ctx);
}