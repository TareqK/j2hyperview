package j2hyperview.tags.specialized;

import j2hyperview.tags.HyperviewContainerTag;
import j2hyperview.tags.attributes.*;

public final class TextTag extends HyperviewContainerTag<TextTag> 
implements IHide<TextTag>,INumberoflines<TextTag>,ISelectable<TextTag>,IAdjustsfontsizetofit<TextTag>,IPreformatted<TextTag> {
public TextTag() {super("text");}
}
