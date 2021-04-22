package antlr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class user_gui {
	/*public static void main(String[] args) throws IOException {
		String str="{\r\n" + 
				"	title:\"TestA8_circle\";\r\n" + 
				"	path:\"./PageDiv/\";\r\n" + 
				"	page:{\r\n" + 
				"		width:1200;\r\n" + 
				"		height:1200;\r\n" + 
				"		div:{\r\n" + 
				"			id:\"A\";\r\n" + 
				"			shape:\"CIRCLE\";\r\n" + 
				"			color:#482A4822;\r\n" + 
				"			width:50mm;\r\n" + 
				"			height:50mm;\r\n" + 
				"			pos-x:100;\r\n" + 
				"			pos-y:100;\r\n" + 
				"			position:cc;\r\n" + 
				"			fit-x:true;\r\n" + 
				"			angle-rotation:56;\r\n" + 
				"		}\r\n" + 
				"		div:{\r\n" + 
				"			id:\"B\";\r\n" + 
				"			position:lc;\r\n" + 
				"			color:#58184544;\r\n" + 
				"			width:50mm;\r\n" + 
				"			height:50mm;\r\n" + 
				"			pos-x:60%;\r\n" + 
				"			pos-y:60%;\r\n" + 
				"			fit-y:true;\r\n" + 
				"		}\r\n" + 
				"		div:{\r\n" + 
				"			id:\"C\";\r\n" + 
				"			shape:\"CIRCLE\";\r\n" + 
				"			color:#900C3F66;\r\n" + 
				"			width:200mm;\r\n" + 
				"			height:200mm;\r\n" + 
				"			pos-x:300pt;\r\n" + 
				"			position:rb;\r\n" + 
				"			pos-y:400pt;\r\n" + 
				"		}\r\n" + 
				"		div:{\r\n" + 
				"			id:\"-A\";\r\n" + 
				"			color:#C70039FF;\r\n" + 
				"			width:50mm;\r\n" + 
				"			height:50mm;\r\n" + 
				"			pos-x:-100;\r\n" + 
				"			pos-y:-100;\r\n" + 
				"			fit-y:true;\r\n" + 
				"		}\r\n" + 
				"		div:{\r\n" + 
				"			id:\"-B\";\r\n" + 
				"			shape:\"TRIANGLE\";\r\n" + 
				"			cross-point:50;\r\n" + 
				"			color:#FF5733FF;\r\n" + 
				"			width:200mm;\r\n" + 
				"			height:200mm;\r\n" + 
				"			pos-x:-60%;\r\n" + 
				"			pos-y:-60%;\r\n" + 
				"		}\r\n" + 
				"		div:{\r\n" + 
				"			id:\"-C\";\r\n" + 
				"			color:#FFC300FF;\r\n" + 
				"			width:50mm;\r\n" + 
				"			fit-x:true;\r\n" + 
				"			height:50mm;\r\n" + 
				"			pos-x:-300pt;\r\n" + 
				"			pos-y:-400pt;\r\n" + 
				"		}\r\n" + 
				"	}\r\n" + 
				"	page:{\r\n" + 
				"		format:A4;\r\n" + 
				"		img:{\r\n" + 
				"			URL:\"./Sid.png\";\r\n" + 
				"			position:lb;\r\n" + 
				"			angle-rotation:30;\r\n" + 
				"			width:30%;\r\n" + 
				"			height:30%;\r\n" + 
				"		}\r\n" + 
				"		div:{\r\n" + 
				"			position:cc;\r\n" + 
				"			color:#AA36F0FF;\r\n" + 
				"			height: 30%;\r\n" + 
				"			width: 30%;\r\n" + 
				"			angle-rotation: 90;\r\n" + 
				"			img:{\r\n" + 
				"				URL:\"./Sid.png\";\r\n" + 
				"				width:30%;\r\n" + 
				"				height:30%;\r\n" + 
				"			}\r\n" + 
				"			img:{\r\n" + 
				"				URL:\"./Sid.png\";\r\n" + 
				"				position:lc;\r\n" + 
				"				width:30%;\r\n" + 
				"				height:30%;\r\n" + 
				"				angle-rotation: 30;\r\n" + 
				"			}\r\n" + 
				"			img:{\r\n" + 
				"				URL:\"./Sid.png\";\r\n" + 
				"				position:ct;\r\n" + 
				"				width:30%;\r\n" + 
				"				height:30%;\r\n" + 
				"				angle-rotation: 40;\r\n" + 
				"			}\r\n" + 
				"		}\r\n" + 
				"	}\r\n" + 
				"	page:{\r\n" + 
				"		format:A4;\r\n" + 
				"		div:{\r\n" + 
				"			position:cc;\r\n" + 
				"			color:#581845FF;\r\n" + 
				"			height: 50%;\r\n" + 
				"			width: 170mm;\r\n" + 
				"			\r\n" + 
				"			\r\n" + 
				"			text:{\r\n" + 
				"				id:\"TESTO2\";\r\n" + 
				"				colorT:\"red\";\r\n" + 
				"				position:ct;\r\n" + 
				"				height:30mm;\r\n" + 
				"				string:\"io non sono bello ma spaccio (solo fin quando posso)\";\r\n" + 
				"				angle-rotation: 0;\r\n" + 
				"			}\r\n" + 
				"		}\r\n" + 
				"	}\r\n" + 
				"	page:{\r\n" + 
				"		format:A4;\r\n" + 
				"		text:{\r\n" + 
				"				id:\"TESTO\";\r\n" + 
				"				colorT:\"blue\";\r\n" + 
				"				position:lc;\r\n" + 
				"				string:\"io non sono bello ma spaccio (solo fin quando posso)\";\r\n" + 
				"				angle-rotation: 0;\r\n" + 
				"		}\r\n" + 
				"		list:{\r\n" + 
				"				id:\"LISTA\";\r\n" + 
				"				position:cc;\r\n" + 
				"				item:\"Hola 1\";\r\n" + 
				"				item:\"Hola 2\";\r\n" + 
				"		}\r\n" + 
				"	}\r\n" + 
				"}";
		generaPDF(str);
	}*/
	
	public static List<String> listErrori=new ArrayList<String>();
	public static String global_path;

	public static List<String> generaPDF(String grammar, String p) throws IOException {
		global_path = p;
		// TODO Auto-generated method stub
		CharStream codePointCharStream = CharStreams.fromString(grammar);
		//ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("doc.txt") );
	    listErrori=new ArrayList<String>();
		VolTextLexer lexer = new VolTextLexer(codePointCharStream);
		lexer.removeErrorListeners();
		lexer.addErrorListener(VoltextErrorListener.INSTANCE);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		VolTextParser parser = new VolTextParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(VoltextErrorListener.INSTANCE);
		ParseTree tree = parser.pdf(); // begin parsing at rule 'r'
		VolTEXT_Listener vtbl = new VolTEXT_Listener();
		ParseTreeWalker ptw = new ParseTreeWalker();
		ptw.walk(vtbl, tree);
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		return listErrori;
		
	}

}
