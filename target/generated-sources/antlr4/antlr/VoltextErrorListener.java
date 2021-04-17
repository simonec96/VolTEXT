package antlr;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class VoltextErrorListener extends BaseErrorListener {

	public static final VoltextErrorListener INSTANCE = new VoltextErrorListener();

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
			throws ParseCancellationException {
		      user_gui.listErrori.add("line " + line + ":" + charPositionInLine + " " + msg);
	}
}
