package j2hyperview.tags.specialized;

import j2hyperview.tags.HyperviewContainerTag;
import j2hyperview.tags.attributes.*;

public final class TextAreaTag extends HyperviewContainerTag<TextAreaTag> 
implements IHide<TextAreaTag>,IName<TextAreaTag>,IValue<TextAreaTag>,IPlaceholder<TextAreaTag>,ITextContentType<TextAreaTag> {
public TextAreaTag() {super("text-area");}
}
