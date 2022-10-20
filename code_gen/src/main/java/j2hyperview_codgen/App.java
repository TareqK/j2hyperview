package j2hyperview_codgen;

import j2hyperview_codegen.generators.AttributeInterfaceCodeGenerator;
import j2hyperview_codegen.generators.SpecializedTagClassCodeGenerator;
import j2hyperview_codegen.generators.TagCreatorCodeGenerator;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class App
{
    public static void main( String[] args )
    {
        final Path relPath = Paths.get("../library/src/main/java/j2hyperview/");
        final Path absPath = relPath.toAbsolutePath();

        System.out.println("writing in "+absPath);

        //decide if the files should be
        //deleted or generated
        final boolean delete = false;

        try {
            AttributeInterfaceCodeGenerator.generate(absPath, delete);
            SpecializedTagClassCodeGenerator.generate(absPath, delete);
            TagCreatorCodeGenerator.print();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //don't forget to auto-reformat the generated code.
    }
}
