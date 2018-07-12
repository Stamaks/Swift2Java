import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.io.IOException;
import java.util.*;

/**
 * Created by alena on 12.07.18.
 */
public class Main
{
    static String prefixCodeGen = "public class Main\n{\n\tpublic static void main(String args[]){\n";

    static String suffixCodeGen = "\t}\n}";

    public static void main(String args[]) throws IOException {

        CharStream input = CharStreams.fromStream(System.in);
        // create a lexer that feeds off of input CharStream
        SwiftToJavaLexer lexer = new SwiftToJavaLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream((TokenSource) lexer);
        // create a parser that feeds off the tokens buffer
        SwiftToJavaParser parser = new SwiftToJavaParser(tokens);

        System.out.println(prefixCodeGen);
        ParseTree tree = parser.startRule();
        System.out.println(suffixCodeGen);
    }
}
