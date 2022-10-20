package j2hyperview.tags.specialized;

import j2hyperview.tags.HyperviewContainerTag;
import j2hyperview.tags.attributes.*;

public final class TextFieldTag extends HyperviewContainerTag<TextFieldTag> 
implements IHide<TextFieldTag>,IName<TextFieldTag>,IValue<TextFieldTag>,IPlaceholder<TextFieldTag>,IMultiline<TextFieldTag>,IKeyboardType<TextFieldTag>,IMask<TextFieldTag>,IAutoFocus<TextFieldTag>,ISecureText<TextFieldTag>,ITextContentType<TextFieldTag> {
public TextFieldTag() {super("text-field");}
}
