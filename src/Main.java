import com.sun.corba.se.impl.io.TypeMismatchException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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

        Map<String, String> m = new HashMap<>();


        String path = "translatedCode.java";
        File f = new File(path);
        if(!f.exists() && !f.isDirectory()) {
            try{
                f.createNewFile();
            } catch (IOException e) {
                System.err.println(e);
            }
        }

        PrintWriter writer = new PrintWriter(path);
        writer.print("");
        writer.close();

        try {
            Files.write(Paths.get(path), prefixCodeGen.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println(e);
        }

        System.out.println(prefixCodeGen);
        ParseTree tree = parser.startRule();
        System.out.println(suffixCodeGen);

        try {
            Files.write(Paths.get(path), suffixCodeGen.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}

