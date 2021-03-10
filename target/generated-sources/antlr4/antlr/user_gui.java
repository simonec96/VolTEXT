package antlr;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class user_gui {
	/*public static void main(String[] args) throws IOException {
		String str="{\r\n" + 
			"	title:\"pdf_prova\";\r\n" + 
			"	page:{\r\n" + 
			"	}\r\n" + 
			"}";
		generaPDF(str);
	}*/
	
	
	public static void generaPDF(String grammar) throws IOException {
		// TODO Auto-generated method stub
		CharStream codePointCharStream = CharStreams.fromString(grammar);
		//ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("doc.txt") );
	    
		VolTextLexer lexer = new VolTextLexer(codePointCharStream);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		VolTextParser parser = new VolTextParser(tokens);
		ParseTree tree = parser.pdf(); // begin parsing at rule 'r'
		VolTEXT_Listener vtbl = new VolTEXT_Listener();
		ParseTreeWalker ptw = new ParseTreeWalker();
		ptw.walk(vtbl, tree);
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		
	}

}
