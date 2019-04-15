import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TabelaMain {
   public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input:
      ANTLRInputStream input = new ANTLRInputStream(System.in);
        // create a lexer that feeds off of input CharStream:
      TabelaLexer lexer = new TabelaLexer(input);
        // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer:
      TabelaParser parser = new TabelaParser(tokens);
        // begin parsing at program rule:
      ParseTree tree = parser.program();
      if (parser.getNumberOfSyntaxErrors() == 0) {
           // print LISP-style tree:
         // System.out.println(tree.toStringTree(parser));
           // listeners:
         ParseTreeWalker walker = new ParseTreeWalker();
         myTabelaListener listener0 = new myTabelaListener();
         walker.walk(listener0, tree);
         listener0.codeGen("Output");
      }
   }
}
