import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CharStream codePointCharStream = CharStreams.fromFileName("doc.txt");
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
