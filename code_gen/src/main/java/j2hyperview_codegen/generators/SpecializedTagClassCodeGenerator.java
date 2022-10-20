package j2hyperview_codegen.generators;

import j2hyperview_codgen.GeneratorUtil;
import j2hyperview_codegen.model.AttributesList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static j2hyperview_codegen.generators.TagCreatorCodeGenerator.containerTags;
import static j2hyperview_codegen.generators.TagCreatorCodeGenerator.emptyTags;
import org.apache.commons.text.CaseUtils;

public final class SpecializedTagClassCodeGenerator {

    private static final String relPath = "tags/specialized";

    public static void generate(final Path absPath, final boolean delete) throws IOException {

        //delete all files in the directory for fresh generation
        final Path dir = Paths.get(absPath.toString(), relPath);
        GeneratorUtil.deleteAllFilesInDir(dir);

        //the delete argument serves to give the possibility
        //to delete the classes that were written before
        System.out.println("// HyperviewEmptyTags, generated in " + SpecializedTagClassCodeGenerator.class);

        for (final String tag : emptyTags()) {
            final String className = classNameFromTag(tag);
            final Path path = makePath(absPath, tag);

            final List<String> interfaceNames = getInterfaceNamesForTag(tag);

            final String classString
                    = getClassTemplate(
                            className,
                            Optional.of("HyperviewEmptyTag<" + className + ">"),
                            Arrays.asList(
                                    "j2hyperview.tags.HyperviewEmptyTag",
                                    "j2hyperview.tags.attributes.*"
                            ),
                            tag,
                            interfaceNames
                    );

            /*
            public InputTag() {
                super("input");
            }
             */
            if (!delete) {
                System.out.println("writing to " + path);
                Files.write(path, classString.getBytes());
            }
        }

        System.out.println("// HyperviewContainerTags, generated in " + SpecializedTagClassCodeGenerator.class);

        for (final String tag : containerTags()) {
            final Path path = makePath(absPath, tag);
            final String className = classNameFromTag(tag);

            final List<String> interfaceNames = getInterfaceNamesForTag(tag);

            final String classString
                    = getClassTemplate(
                            className,
                            Optional.of("HyperviewContainerTag<" + className + ">"),
                            Arrays.asList(
                                    "j2hyperview.tags.HyperviewContainerTag",
                                    "j2hyperview.tags.attributes.*"
                            ),
                            tag,
                            interfaceNames
                    );

            if (delete) {
                if (Files.exists(path)) {
                    System.out.println("deleting " + path);
                    Files.delete(path);
                }
            } else {
                System.out.println("writing to " + path);
                Files.write(path, classString.getBytes());
            }
        }
    }

    public static String classNameFromTag(String tageNameLowerCase) {
        String res =  CaseUtils.toCamelCase(tageNameLowerCase, true, new char[]{'-',':'});
        return res + "Tag";
    }

    private static Path makePath(final Path absPath, String tagLowerCase) {
        final String filename = classNameFromTag(tagLowerCase) + ".java";
        return Paths.get(absPath.toString(), relPath, filename);
    }

    private static String getPackage() {
        return "package j2hyperview.tags.specialized;\n";
    }

    private static String getClassTemplate(
            final String className,
            final Optional<String> optExtends,
            final List<String> imports,
            final String tag,
            final List<String> interfaces
    ) {

        final StringBuilder sb = new StringBuilder();

        sb.append(getPackage());
        sb.append("\n");

        for (String importName : imports) {
            sb.append("import ").append(importName).append(";\n");
        }
        sb.append("\n");
        sb.append("public final class ")
                .append(className)
                .append(" ");

        optExtends.ifPresent(ext -> sb.append("extends ").append(ext).append(" "));

        //add the 'implements' clause
        if (!interfaces.isEmpty()) {
            sb.append("\n");
            sb.append("implements ");

            final List<String> genericInterfaceNames
                    = interfaces.stream().map(iName -> iName + "<" + className + ">")
                            .collect(Collectors.toList());
            sb.append(
                    String.join(",", genericInterfaceNames)
            );
        }

        sb.append(" {\n");

        //class contents
        sb.append("public ")
                .append(className)
                .append("() {")
                .append("super(\"").append(tag).append("\");")
                .append("}\n");

        sb.append("}\n");

        return sb.toString();
    }

    private static List<String> getInterfaceNamesForTag(final String tagNameLowercase) {
        return AttributesList.getCustomAttributesForHtmlTag(tagNameLowercase)
                .stream()
                .map(
                        AttributeInterfaceCodeGenerator::interfaceNameFromAttribute
                ).collect(Collectors.toList());
    }

}
