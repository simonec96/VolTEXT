package antlr;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Test {
	public void start(String URL)
	{
		CharStream codePointCharStream;
		try {
			codePointCharStream = CharStreams.fromFileName(URL);
			VolTextLexer lexer = new VolTextLexer(codePointCharStream);

			CommonTokenStream tokens = new CommonTokenStream(lexer);
	
			VolTextParser parser = new VolTextParser(tokens);
			ParseTree tree = parser.pdf(); // begin parsing at rule 'r'
			VolTEXT_Listener vtbl = new VolTEXT_Listener();
			ParseTreeWalker ptw = new ParseTreeWalker();
			ptw.walk(vtbl, tree);
			System.out.println(tree.toStringTree(parser));
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("doc.txt") );
	    

	}
}
