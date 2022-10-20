package j2hyperview_codegen.wattsi;

public interface AttributeDefinition {

    String name();

    boolean appliesTo(ElementDefinition element);

    boolean isObsolete();
}
