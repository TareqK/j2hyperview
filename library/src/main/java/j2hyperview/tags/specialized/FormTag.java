package j2hyperview.tags.specialized;

import j2hyperview.tags.HyperviewContainerTag;
import j2hyperview.tags.attributes.*;

public final class FormTag extends HyperviewContainerTag<FormTag> 
implements IHide<FormTag>,IScroll<FormTag>,IScrollOrientation<FormTag>,IShowsScrollIndicator<FormTag> {
public FormTag() {super("form");}
}
