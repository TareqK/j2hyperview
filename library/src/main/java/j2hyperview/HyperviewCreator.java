package j2hyperview;

import j2html.attributes.Attr;
import j2html.tags.DomContent;
import j2hyperview.tags.specialized.AlertOptionTag;
import j2hyperview.tags.specialized.BehaviorTag;
import j2hyperview.tags.specialized.BodyTag;
import j2hyperview.tags.specialized.DateFieldTag;
import j2hyperview.tags.specialized.DocTag;
import j2hyperview.tags.specialized.FormTag;
import j2hyperview.tags.specialized.HeaderTag;
import j2hyperview.tags.specialized.ImageTag;
import j2hyperview.tags.specialized.ItemTag;
import j2hyperview.tags.specialized.ItemsTag;
import j2hyperview.tags.specialized.ListTag;
import j2hyperview.tags.specialized.ModifierTag;
import j2hyperview.tags.specialized.OptionTag;
import j2hyperview.tags.specialized.PickerFieldTag;
import j2hyperview.tags.specialized.PickerItemTag;
import j2hyperview.tags.specialized.ScreenTag;
import j2hyperview.tags.specialized.SectionListTag;
import j2hyperview.tags.specialized.SectionTag;
import j2hyperview.tags.specialized.SectionTitleTag;
import j2hyperview.tags.specialized.SelectMultipleTag;
import j2hyperview.tags.specialized.SelectSingleTag;
import j2hyperview.tags.specialized.SpinnerTag;
import j2hyperview.tags.specialized.StyleTag;
import j2hyperview.tags.specialized.StylesTag;
import j2hyperview.tags.specialized.SwitchTag;
import j2hyperview.tags.specialized.TextAreaTag;
import j2hyperview.tags.specialized.TextFieldTag;
import j2hyperview.tags.specialized.TextTag;
import j2hyperview.tags.specialized.ViewTag;
import j2hyperview.tags.specialized.WebViewTag;

public class HyperviewCreator {

    private HyperviewCreator() {
    }

    public static BehaviorTag behavior() {
        return new BehaviorTag();
    }

    public static BehaviorTag behavior(Attr.ShortForm shortAttr) {
        return (BehaviorTag) Attr.addTo(new BehaviorTag(), shortAttr);
    }

    public static AlertOptionTag alertOption() {
        return new AlertOptionTag();
    }

    public static AlertOptionTag alertOption(Attr.ShortForm shortAttr) {
        return (AlertOptionTag) Attr.addTo(new AlertOptionTag(), shortAttr);
    }

    public static ImageTag image() {
        return new ImageTag();
    }

    public static ImageTag image(Attr.ShortForm shortAttr) {
        return (ImageTag) Attr.addTo(new ImageTag(), shortAttr);
    }

    public static SpinnerTag spinner() {
        return new SpinnerTag();
    }

    public static SpinnerTag spinner(Attr.ShortForm shortAttr) {
        return (SpinnerTag) Attr.addTo(new SpinnerTag(), shortAttr);
    }

    public static WebViewTag webView() {
        return new WebViewTag();
    }

    public static WebViewTag webView(Attr.ShortForm shortAttr) {
        return (WebViewTag) Attr.addTo(new WebViewTag(), shortAttr);
    }

    public static TextFieldTag textField() {
        return new TextFieldTag();
    }

    public static TextFieldTag textField(Attr.ShortForm shortAttr) {
        return (TextFieldTag) Attr.addTo(new TextFieldTag(), shortAttr);
    }

    public static TextAreaTag textArea() {
        return new TextAreaTag();
    }

    public static TextAreaTag textArea(Attr.ShortForm shortAttr) {
        return (TextAreaTag) Attr.addTo(new TextAreaTag(), shortAttr);
    }

    public static PickerItemTag pickerItem() {
        return new PickerItemTag();
    }

    public static PickerItemTag pickerItem(Attr.ShortForm shortAttr) {
        return (PickerItemTag) Attr.addTo(new PickerItemTag(), shortAttr);
    }
//exception because the switch statement is a reserved keyword

    public static SwitchTag toggleSwitch() {
        return new SwitchTag();
    }

    public static SwitchTag toggleSwitch(Attr.ShortForm shortAttr) {
        return (SwitchTag) Attr.addTo(new SwitchTag(), shortAttr);
    }

    public static DateFieldTag dateField() {
        return new DateFieldTag();
    }

    public static DateFieldTag dateField(Attr.ShortForm shortAttr) {
        return (DateFieldTag) Attr.addTo(new DateFieldTag(), shortAttr);
    }

// ContainerTags, generated in class j2hyperview_codegen.generators.TagCreatorCodeGenerator
    public static DocTag doc() {
        return (DocTag) new DocTag();
    }

    public static DocTag doc(String text) {
        return (DocTag) new DocTag().withText(text);
    }

    public static DocTag doc(DomContent... dc) {
        return (DocTag) new DocTag().with(dc);
    }

    public static DocTag doc(Attr.ShortForm shortAttr) {
        return (DocTag) Attr.addTo(new DocTag(), shortAttr);
    }

    public static DocTag doc(Attr.ShortForm shortAttr, String text) {
        return (DocTag) Attr.addTo(new DocTag().withText(text), shortAttr);
    }

    public static DocTag doc(Attr.ShortForm shortAttr, DomContent... dc) {
        return (DocTag) Attr.addTo(new DocTag().with(dc), shortAttr);
    }

    public static ScreenTag screen() {
        return (ScreenTag) new ScreenTag();
    }

    public static ScreenTag screen(String text) {
        return (ScreenTag) new ScreenTag().withText(text);
    }

    public static ScreenTag screen(DomContent... dc) {
        return (ScreenTag) new ScreenTag().with(dc);
    }

    public static ScreenTag screen(Attr.ShortForm shortAttr) {
        return (ScreenTag) Attr.addTo(new ScreenTag(), shortAttr);
    }

    public static ScreenTag screen(Attr.ShortForm shortAttr, String text) {
        return (ScreenTag) Attr.addTo(new ScreenTag().withText(text), shortAttr);
    }

    public static ScreenTag screen(Attr.ShortForm shortAttr, DomContent... dc) {
        return (ScreenTag) Attr.addTo(new ScreenTag().with(dc), shortAttr);
    }

    public static HeaderTag header() {
        return (HeaderTag) new HeaderTag();
    }

    public static HeaderTag header(String text) {
        return (HeaderTag) new HeaderTag().withText(text);
    }

    public static HeaderTag header(DomContent... dc) {
        return (HeaderTag) new HeaderTag().with(dc);
    }

    public static HeaderTag header(Attr.ShortForm shortAttr) {
        return (HeaderTag) Attr.addTo(new HeaderTag(), shortAttr);
    }

    public static HeaderTag header(Attr.ShortForm shortAttr, String text) {
        return (HeaderTag) Attr.addTo(new HeaderTag().withText(text), shortAttr);
    }

    public static HeaderTag header(Attr.ShortForm shortAttr, DomContent... dc) {
        return (HeaderTag) Attr.addTo(new HeaderTag().with(dc), shortAttr);
    }

    public static BodyTag body() {
        return (BodyTag) new BodyTag();
    }

    public static BodyTag body(String text) {
        return (BodyTag) new BodyTag().withText(text);
    }

    public static BodyTag body(DomContent... dc) {
        return (BodyTag) new BodyTag().with(dc);
    }

    public static BodyTag body(Attr.ShortForm shortAttr) {
        return (BodyTag) Attr.addTo(new BodyTag(), shortAttr);
    }

    public static BodyTag body(Attr.ShortForm shortAttr, String text) {
        return (BodyTag) Attr.addTo(new BodyTag().withText(text), shortAttr);
    }

    public static BodyTag body(Attr.ShortForm shortAttr, DomContent... dc) {
        return (BodyTag) Attr.addTo(new BodyTag().with(dc), shortAttr);
    }

    public static ViewTag view() {
        return (ViewTag) new ViewTag();
    }

    public static ViewTag view(String text) {
        return (ViewTag) new ViewTag().withText(text);
    }

    public static ViewTag view(DomContent... dc) {
        return (ViewTag) new ViewTag().with(dc);
    }

    public static ViewTag view(Attr.ShortForm shortAttr) {
        return (ViewTag) Attr.addTo(new ViewTag(), shortAttr);
    }

    public static ViewTag view(Attr.ShortForm shortAttr, String text) {
        return (ViewTag) Attr.addTo(new ViewTag().withText(text), shortAttr);
    }

    public static ViewTag view(Attr.ShortForm shortAttr, DomContent... dc) {
        return (ViewTag) Attr.addTo(new ViewTag().with(dc), shortAttr);
    }

    public static TextTag text() {
        return (TextTag) new TextTag();
    }

    public static TextTag text(String text) {
        return (TextTag) new TextTag().withText(text);
    }

    public static TextTag text(DomContent... dc) {
        return (TextTag) new TextTag().with(dc);
    }

    public static TextTag text(Attr.ShortForm shortAttr) {
        return (TextTag) Attr.addTo(new TextTag(), shortAttr);
    }

    public static TextTag text(Attr.ShortForm shortAttr, String text) {
        return (TextTag) Attr.addTo(new TextTag().withText(text), shortAttr);
    }

    public static TextTag text(Attr.ShortForm shortAttr, DomContent... dc) {
        return (TextTag) Attr.addTo(new TextTag().with(dc), shortAttr);
    }

    public static ListTag list() {
        return (ListTag) new ListTag();
    }

    public static ListTag list(String text) {
        return (ListTag) new ListTag().withText(text);
    }

    public static ListTag list(DomContent... dc) {
        return (ListTag) new ListTag().with(dc);
    }

    public static ListTag list(Attr.ShortForm shortAttr) {
        return (ListTag) Attr.addTo(new ListTag(), shortAttr);
    }

    public static ListTag list(Attr.ShortForm shortAttr, String text) {
        return (ListTag) Attr.addTo(new ListTag().withText(text), shortAttr);
    }

    public static ListTag list(Attr.ShortForm shortAttr, DomContent... dc) {
        return (ListTag) Attr.addTo(new ListTag().with(dc), shortAttr);
    }

    public static SectionListTag sectionList() {
        return (SectionListTag) new SectionListTag();
    }

    public static SectionListTag sectionList(String text) {
        return (SectionListTag) new SectionListTag().withText(text);
    }

    public static SectionListTag sectionList(DomContent... dc) {
        return (SectionListTag) new SectionListTag().with(dc);
    }

    public static SectionListTag sectionList(Attr.ShortForm shortAttr) {
        return (SectionListTag) Attr.addTo(new SectionListTag(), shortAttr);
    }

    public static SectionListTag sectionList(Attr.ShortForm shortAttr, String text) {
        return (SectionListTag) Attr.addTo(new SectionListTag().withText(text), shortAttr);
    }

    public static SectionListTag sectionList(Attr.ShortForm shortAttr, DomContent... dc) {
        return (SectionListTag) Attr.addTo(new SectionListTag().with(dc), shortAttr);
    }

    public static SectionTag section() {
        return (SectionTag) new SectionTag();
    }

    public static SectionTag section(String text) {
        return (SectionTag) new SectionTag().withText(text);
    }

    public static SectionTag section(DomContent... dc) {
        return (SectionTag) new SectionTag().with(dc);
    }

    public static SectionTag section(Attr.ShortForm shortAttr) {
        return (SectionTag) Attr.addTo(new SectionTag(), shortAttr);
    }

    public static SectionTag section(Attr.ShortForm shortAttr, String text) {
        return (SectionTag) Attr.addTo(new SectionTag().withText(text), shortAttr);
    }

    public static SectionTag section(Attr.ShortForm shortAttr, DomContent... dc) {
        return (SectionTag) Attr.addTo(new SectionTag().with(dc), shortAttr);
    }

    public static SectionTitleTag sectionTitle() {
        return (SectionTitleTag) new SectionTitleTag();
    }

    public static SectionTitleTag sectionTitle(String text) {
        return (SectionTitleTag) new SectionTitleTag().withText(text);
    }

    public static SectionTitleTag sectionTitle(DomContent... dc) {
        return (SectionTitleTag) new SectionTitleTag().with(dc);
    }

    public static SectionTitleTag sectionTitle(Attr.ShortForm shortAttr) {
        return (SectionTitleTag) Attr.addTo(new SectionTitleTag(), shortAttr);
    }

    public static SectionTitleTag sectionTitle(Attr.ShortForm shortAttr, String text) {
        return (SectionTitleTag) Attr.addTo(new SectionTitleTag().withText(text), shortAttr);
    }

    public static SectionTitleTag sectionTitle(Attr.ShortForm shortAttr, DomContent... dc) {
        return (SectionTitleTag) Attr.addTo(new SectionTitleTag().with(dc), shortAttr);
    }

    public static ItemsTag items() {
        return (ItemsTag) new ItemsTag();
    }

    public static ItemsTag items(String text) {
        return (ItemsTag) new ItemsTag().withText(text);
    }

    public static ItemsTag items(DomContent... dc) {
        return (ItemsTag) new ItemsTag().with(dc);
    }

    public static ItemsTag items(Attr.ShortForm shortAttr) {
        return (ItemsTag) Attr.addTo(new ItemsTag(), shortAttr);
    }

    public static ItemsTag items(Attr.ShortForm shortAttr, String text) {
        return (ItemsTag) Attr.addTo(new ItemsTag().withText(text), shortAttr);
    }

    public static ItemsTag items(Attr.ShortForm shortAttr, DomContent... dc) {
        return (ItemsTag) Attr.addTo(new ItemsTag().with(dc), shortAttr);
    }

    public static ItemTag item() {
        return (ItemTag) new ItemTag();
    }

    public static ItemTag item(String text) {
        return (ItemTag) new ItemTag().withText(text);
    }

    public static ItemTag item(DomContent... dc) {
        return (ItemTag) new ItemTag().with(dc);
    }

    public static ItemTag item(Attr.ShortForm shortAttr) {
        return (ItemTag) Attr.addTo(new ItemTag(), shortAttr);
    }

    public static ItemTag item(Attr.ShortForm shortAttr, String text) {
        return (ItemTag) Attr.addTo(new ItemTag().withText(text), shortAttr);
    }

    public static ItemTag item(Attr.ShortForm shortAttr, DomContent... dc) {
        return (ItemTag) Attr.addTo(new ItemTag().with(dc), shortAttr);
    }

    public static FormTag form() {
        return (FormTag) new FormTag();
    }

    public static FormTag form(String text) {
        return (FormTag) new FormTag().withText(text);
    }

    public static FormTag form(DomContent... dc) {
        return (FormTag) new FormTag().with(dc);
    }

    public static FormTag form(Attr.ShortForm shortAttr) {
        return (FormTag) Attr.addTo(new FormTag(), shortAttr);
    }

    public static FormTag form(Attr.ShortForm shortAttr, String text) {
        return (FormTag) Attr.addTo(new FormTag().withText(text), shortAttr);
    }

    public static FormTag form(Attr.ShortForm shortAttr, DomContent... dc) {
        return (FormTag) Attr.addTo(new FormTag().with(dc), shortAttr);
    }

    public static SelectSingleTag selectSingle() {
        return (SelectSingleTag) new SelectSingleTag();
    }

    public static SelectSingleTag selectSingle(String text) {
        return (SelectSingleTag) new SelectSingleTag().withText(text);
    }

    public static SelectSingleTag selectSingle(DomContent... dc) {
        return (SelectSingleTag) new SelectSingleTag().with(dc);
    }

    public static SelectSingleTag selectSingle(Attr.ShortForm shortAttr) {
        return (SelectSingleTag) Attr.addTo(new SelectSingleTag(), shortAttr);
    }

    public static SelectSingleTag selectSingle(Attr.ShortForm shortAttr, String text) {
        return (SelectSingleTag) Attr.addTo(new SelectSingleTag().withText(text), shortAttr);
    }

    public static SelectSingleTag selectSingle(Attr.ShortForm shortAttr, DomContent... dc) {
        return (SelectSingleTag) Attr.addTo(new SelectSingleTag().with(dc), shortAttr);
    }

    public static SelectMultipleTag selectMultiple() {
        return (SelectMultipleTag) new SelectMultipleTag();
    }

    public static SelectMultipleTag selectMultiple(String text) {
        return (SelectMultipleTag) new SelectMultipleTag().withText(text);
    }

    public static SelectMultipleTag selectMultiple(DomContent... dc) {
        return (SelectMultipleTag) new SelectMultipleTag().with(dc);
    }

    public static SelectMultipleTag selectMultiple(Attr.ShortForm shortAttr) {
        return (SelectMultipleTag) Attr.addTo(new SelectMultipleTag(), shortAttr);
    }

    public static SelectMultipleTag selectMultiple(Attr.ShortForm shortAttr, String text) {
        return (SelectMultipleTag) Attr.addTo(new SelectMultipleTag().withText(text), shortAttr);
    }

    public static SelectMultipleTag selectMultiple(Attr.ShortForm shortAttr, DomContent... dc) {
        return (SelectMultipleTag) Attr.addTo(new SelectMultipleTag().with(dc), shortAttr);
    }

    public static OptionTag option() {
        return (OptionTag) new OptionTag();
    }

    public static OptionTag option(String text) {
        return (OptionTag) new OptionTag().withText(text);
    }

    public static OptionTag option(DomContent... dc) {
        return (OptionTag) new OptionTag().with(dc);
    }

    public static OptionTag option(Attr.ShortForm shortAttr) {
        return (OptionTag) Attr.addTo(new OptionTag(), shortAttr);
    }

    public static OptionTag option(Attr.ShortForm shortAttr, String text) {
        return (OptionTag) Attr.addTo(new OptionTag().withText(text), shortAttr);
    }

    public static OptionTag option(Attr.ShortForm shortAttr, DomContent... dc) {
        return (OptionTag) Attr.addTo(new OptionTag().with(dc), shortAttr);
    }

    public static PickerFieldTag pickerField() {
        return (PickerFieldTag) new PickerFieldTag();
    }

    public static PickerFieldTag pickerField(String text) {
        return (PickerFieldTag) new PickerFieldTag().withText(text);
    }

    public static PickerFieldTag pickerField(DomContent... dc) {
        return (PickerFieldTag) new PickerFieldTag().with(dc);
    }

    public static PickerFieldTag pickerField(Attr.ShortForm shortAttr) {
        return (PickerFieldTag) Attr.addTo(new PickerFieldTag(), shortAttr);
    }

    public static PickerFieldTag pickerField(Attr.ShortForm shortAttr, String text) {
        return (PickerFieldTag) Attr.addTo(new PickerFieldTag().withText(text), shortAttr);
    }

    public static PickerFieldTag pickerField(Attr.ShortForm shortAttr, DomContent... dc) {
        return (PickerFieldTag) Attr.addTo(new PickerFieldTag().with(dc), shortAttr);
    }

    public static StylesTag styles() {
        return (StylesTag) new StylesTag();
    }

    public static StylesTag styles(String text) {
        return (StylesTag) new StylesTag().withText(text);
    }

    public static StylesTag styles(DomContent... dc) {
        return (StylesTag) new StylesTag().with(dc);
    }

    public static StylesTag styles(Attr.ShortForm shortAttr) {
        return (StylesTag) Attr.addTo(new StylesTag(), shortAttr);
    }

    public static StylesTag styles(Attr.ShortForm shortAttr, String text) {
        return (StylesTag) Attr.addTo(new StylesTag().withText(text), shortAttr);
    }

    public static StylesTag styles(Attr.ShortForm shortAttr, DomContent... dc) {
        return (StylesTag) Attr.addTo(new StylesTag().with(dc), shortAttr);
    }

    public static StyleTag style() {
        return (StyleTag) new StyleTag();
    }

    public static StyleTag style(String text) {
        return (StyleTag) new StyleTag().withText(text);
    }

    public static StyleTag style(DomContent... dc) {
        return (StyleTag) new StyleTag().with(dc);
    }

    public static StyleTag style(Attr.ShortForm shortAttr) {
        return (StyleTag) Attr.addTo(new StyleTag(), shortAttr);
    }

    public static StyleTag style(Attr.ShortForm shortAttr, String text) {
        return (StyleTag) Attr.addTo(new StyleTag().withText(text), shortAttr);
    }

    public static StyleTag style(Attr.ShortForm shortAttr, DomContent... dc) {
        return (StyleTag) Attr.addTo(new StyleTag().with(dc), shortAttr);
    }

    public static ModifierTag modifier() {
        return (ModifierTag) new ModifierTag();
    }

    public static ModifierTag modifier(String text) {
        return (ModifierTag) new ModifierTag().withText(text);
    }

    public static ModifierTag modifier(DomContent... dc) {
        return (ModifierTag) new ModifierTag().with(dc);
    }

    public static ModifierTag modifier(Attr.ShortForm shortAttr) {
        return (ModifierTag) Attr.addTo(new ModifierTag(), shortAttr);
    }

    public static ModifierTag modifier(Attr.ShortForm shortAttr, String text) {
        return (ModifierTag) Attr.addTo(new ModifierTag().withText(text), shortAttr);
    }

    public static ModifierTag modifier(Attr.ShortForm shortAttr, DomContent... dc) {
        return (ModifierTag) Attr.addTo(new ModifierTag().with(dc), shortAttr);
    }
}
