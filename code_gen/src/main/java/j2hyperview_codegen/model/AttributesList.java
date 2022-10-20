package j2hyperview_codegen.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class AttributesList {

    //https://www.w3schools.com/tags/ref_attributes.asp
    public static List<String> getCustomAttributesForHtmlTag(final String tagLowercase) {

        final List<String> attrs = new ArrayList<>();
        for (AttrD attrD : attributesDescriptive()) {
            if (Arrays.asList(attrD.tags).contains(tagLowercase)) {
                attrs.add(attrD.attr);
            }
        }
        return attrs;
    }

    public static List<AttrD> attributesDescriptive() {
        return Arrays.asList(
                new AttrD("trigger", true), //global tag
                new AttrD("verb", true), //global tag
                new AttrD("action", true), //global tag
                new AttrD("target", true), //global tag
                new AttrD("href", true), //global tag
                //new AttrD("id", true), //global tag covered by base Tag
                //new AttrD("style", true), //global tag covered by base Tag
                new AttrD("alert:title", true, "behavior"),
                new AttrD("alert:message", true, "behavior"),
                new AttrD("alert:label", true, "alert:option"),
                new AttrD("share:dialog-title", true, "behavior"),
                new AttrD("share:subject", true, "behavior"),
                new AttrD("share:message", true, "behavior"),
                new AttrD("share:url", true, "behavior"),
                new AttrD("share:title", true, "behavior"),
                new AttrD("safe-area", true, "header", "body", "view"),
                new AttrD("hide", true, "date-field", "switch", "picker-field", "header", "view", "text", "image", "list", "section-list", "section", "section-title", "item", "form", "text-field", "text-area", "select-single", "select-multiple", "option"),
                new AttrD("scroll", true, "body", "view", "form"),
                new AttrD("scroll-orientation", true, "body", "view", "list", "form"),
                new AttrD("shows-scroll-indicator", true, "body", "view", "list", "form"),
                new AttrD("content-container-style", true, "view"),
                new AttrD("scroll-to-input-offset", true, "view"),
                new AttrD("avoid-keyboard", true, "view"),
                new AttrD("sticky", true, "view"),
                new AttrD("numberOfLines", true, "text"),
                new AttrD("selectable", true, "text"),
                new AttrD("adjustsFontSizeToFit", true, "text"),
                new AttrD("preformatted", true, "text"),
                new AttrD("source", true, "image"),
                new AttrD("itemHeight", true, "list"),
                new AttrD("key", true, "item"),
                new AttrD("sticky-section-titles", true, "section-list"),
                new AttrD("color", true, "spinner"),
                new AttrD("url", true, "web-view"),
                new AttrD("html", true, "web-view"),
                new AttrD("activity-indicator-color", true, "web-view"),
                new AttrD("injected-java-script", true, "web-view"),
                new AttrD("name", true, "date-field", "switch", "picker-field", "text-field", "text-area", "select-single", "select-multiple"),
                new AttrD("value", true, "date-field", "switch", "picker-item", "picker-field", "text-field", "text-area", "option"),
                new AttrD("placeholder", true, "date-field", "picker-field", "text-field", "text-area"),
                new AttrD("multiline", true, "text-field"),
                new AttrD("keyboard-type", true, "text-field"),
                new AttrD("mask", true, "text-field"),
                new AttrD("auto-focus", true, "text-field"),
                new AttrD("secure-text", true, "text-field"),
                new AttrD("text-content-type", true, "text-field", "text-area"),
                new AttrD("allow-deselect", true, "select-single"),
                new AttrD("done-label", true, "picker-field"),
                new AttrD("cancel-label", true, "picker-field"),
                new AttrD("field-style", true, "picker-field", "date-field"),
                new AttrD("field-text-style", true, "picker-field", "date-field"),
                new AttrD("modal-style", true, "picker-field", "date-field"),
                new AttrD("modal-text-style", true, "picker-field", "date-field"),
                new AttrD("label", true, "picker-item"),
                new AttrD("label-format", true, "date-field"),
                new AttrD("mode", true, "date-field"),
                new AttrD("min", true, "date-field"),
                new AttrD("max", true, "date-field"),
                new AttrD("alignContent", true, "style"),
                new AttrD("alignItems", true, "style"),
                new AttrD("alignSelf", true, "style"),
                new AttrD("borderBottomWidth", true, "style"),
                new AttrD("borderLeftWidth", true, "style"),
                new AttrD("borderRightWidth", true, "style"),
                new AttrD("borderTopWidth", true, "style"),
                new AttrD("borderWidth", true, "style"),
                new AttrD("bottom", true, "style"),
                new AttrD("display", true, "style"),
                new AttrD("flex", true, "style"),
                new AttrD("flexBasis", true, "style"),
                new AttrD("flexDirection", true, "style"),
                new AttrD("flexGrow", true, "style"),
                new AttrD("flexShrink", true, "style"),
                new AttrD("flexWrap", true, "style"),
                new AttrD("height", true, "style"),
                new AttrD("justifyContent", true, "style"),
                new AttrD("left", true, "style"),
                new AttrD("margin", true, "style"),
                new AttrD("marginBottom", true, "style"),
                new AttrD("marginHorizontal", true, "style"),
                new AttrD("marginLeft", true, "style"),
                new AttrD("marginRight", true, "style"),
                new AttrD("marginTop", true, "style"),
                new AttrD("marginVertical", true, "style"),
                new AttrD("maxHeight", true, "style"),
                new AttrD("maxWidth", true, "style"),
                new AttrD("minHeight", true, "style"),
                new AttrD("minWidth", true, "style"),
                new AttrD("overflow", true, "style"),
                new AttrD("padding", true, "style"),
                new AttrD("paddingBottom", true, "style"),
                new AttrD("paddingHorizontal", true, "style"),
                new AttrD("paddingLeft", true, "style"),
                new AttrD("paddingRight", true, "style"),
                new AttrD("paddingTop", true, "style"),
                new AttrD("paddingVertical", true, "style"),
                new AttrD("position", true, "style"),
                new AttrD("right", true, "style"),
                new AttrD("top", true, "style"),
                new AttrD("width", true, "style"),
                new AttrD("zIndex", true, "style"),
                new AttrD("borderRightColor", true, "style"),
                new AttrD("borderBottomColor", true, "style"),
                new AttrD("borderBottomLeftRadius", true, "style"),
                new AttrD("borderBottomRightRadius", true, "style"),
                new AttrD("borderColor", true, "style"),
                new AttrD("borderLeftColor", true, "style"),
                new AttrD("borderRadius", true, "style"),
                new AttrD("backgroundColor", true, "style"),
                new AttrD("borderStyle", true, "style"),
                new AttrD("borderTopColor", true, "style"),
                new AttrD("borderTopLeftRadius", true, "style"),
                new AttrD("borderTopRightRadius", true, "style"),
                new AttrD("elevation", true, "style"),
                new AttrD("opacity", true, "style"),
                new AttrD("shadowColor", true, "style"),
                new AttrD("shadowOffsetX", true, "style"),
                new AttrD("shadowOffsetY", true, "style"),
                new AttrD("shadowOpacity", true, "style"),
                new AttrD("shadowRadius", true, "style"),
                new AttrD("color", true, "style"),
                new AttrD("fontSize", true, "style"),
                new AttrD("fontStyle", true, "style"),
                new AttrD("fontWeight", true, "style"),
                new AttrD("lineHeight", true, "style"),
                new AttrD("textAlign", true, "style"),
                new AttrD("textShadowColor", true, "style"),
                new AttrD("fontFamily", true, "style"),
                new AttrD("textShadowRadius", true, "style"),
                new AttrD("focused",true,"modifier"),
                new AttrD("pressed",true,"modifier"),
                new AttrD("selected",true,"modifier")
        );
    }
}
