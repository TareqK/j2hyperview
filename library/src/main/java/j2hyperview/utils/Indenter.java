package j2hyperview.utils;

@FunctionalInterface
public interface Indenter {
    String indent(int level, String text);
}
