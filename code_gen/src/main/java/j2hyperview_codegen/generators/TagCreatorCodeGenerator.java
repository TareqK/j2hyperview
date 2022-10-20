package j2hyperview_codegen.generators;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.text.CaseUtils;

public final class TagCreatorCodeGenerator {

    public static void print() {
        System.out.println("// EmptyTags, generated in " + TagCreatorCodeGenerator.class);

        for (String tag : emptyTags()) {
            final String className = SpecializedTagClassCodeGenerator.classNameFromTag(tag);
            final String publicstaticTypeMethod = "public static " + className + " " + methodNameFromTag(tag)+ " ";
            final String castReturn = " return (" + className + ") ";
            final String construct = " new " + className + "()";

            String emptyA1 = publicstaticTypeMethod + "()";
            String emptyA2 = "{ return " + construct + "; }";
            // Attr shorthands
            String emptyB1 = publicstaticTypeMethod + "(Attr.ShortForm shortAttr)";
            String emptyB2 = "{ " + castReturn + " Attr.addTo(" + construct + ", shortAttr); }";
            // Print
            System.out.println(String.format("%-80s%1s", emptyA1, emptyA2));
            System.out.println(String.format("%-80s%1s", emptyB1, emptyB2));
            System.out.println();
        }

        System.out.println("// ContainerTags, generated in " + TagCreatorCodeGenerator.class);

        for (String tag : containerTags()) {
            final String className = SpecializedTagClassCodeGenerator.classNameFromTag(tag);
            final String publicstaticTypeMethod = "public static " + className + " " + methodNameFromTag(tag) + " ";
            final String castReturn = " return (" + className + ") ";
            final String construct = " new " + className + "()";

            String containerA1 = publicstaticTypeMethod + "()";
            String containerA2 = "{ " + castReturn + construct + "; }";

            String containerB1 = publicstaticTypeMethod + "(String text)";
            String containerB2 = "{ " + castReturn + construct + ".withText(text); }";

            String containerC1 = publicstaticTypeMethod + "(DomContent... dc)";
            String containerC2 = "{ " + castReturn + construct + ".with(dc); }";
            // Attr shorthands
            String containerD1 = publicstaticTypeMethod + "(Attr.ShortForm shortAttr)";
            String containerD2 = "{ " + castReturn + " Attr.addTo(" + construct + ", shortAttr); }";

            String containerE1 = publicstaticTypeMethod + "(Attr.ShortForm shortAttr, String text)";
            String containerE2 = "{ " + castReturn + " Attr.addTo(" + construct + ".withText(text), shortAttr); }";

            String containerF1 = publicstaticTypeMethod + "(Attr.ShortForm shortAttr, DomContent... dc)";
            String containerF2 = "{ " + castReturn + " Attr.addTo(" + construct + ".with(dc), shortAttr); }";
            // Print
            System.out.println(String.format("%-80s%1s", containerA1, containerA2));
            System.out.println(String.format("%-80s%1s", containerB1, containerB2));
            System.out.println(String.format("%-80s%1s", containerC1, containerC2));
            System.out.println(String.format("%-80s%1s", containerD1, containerD2));
            System.out.println(String.format("%-80s%1s", containerE1, containerE2));
            System.out.println(String.format("%-80s%1s", containerF1, containerF2));
            System.out.println();
        }
    }

    public static String methodNameFromTag(String tageNameLowerCase) {
        return CaseUtils.toCamelCase(tageNameLowerCase, false, new char[]{'-', ':'});
    }

    //  This is a method that contains all ContainerTags, there is nothing below it
    public static List<String> emptyTags() {
        return Arrays.asList(
                "behavior",
                "alert:option",
                "image",
                "spinner",
                "web-view",
                "text-field",
                "text-area",
                "picker-item",
                "switch",
                "date-field"
        );
    }

    public static List<String> containerTags() {
        return Arrays.asList(
                "doc",
                "screen",
                "header",
                "body",
                "view",
                "text",
                "list",
                "section-list",
                "section",
                "section-title",
                "items",
                "item",
                "form",
                "select-single",
                "select-multiple",
                "option",
                "picker-field",
                "styles",
                "style",
                "modifier"
        );
    }
}
