package j2hyperview.tags.specialized;

import j2hyperview.tags.HyperviewContainerTag;
import j2hyperview.tags.attributes.*;

public final class SelectSingleTag extends HyperviewContainerTag<SelectSingleTag> 
implements IHide<SelectSingleTag>,IName<SelectSingleTag>,IAllowDeselect<SelectSingleTag> {
public SelectSingleTag() {super("select-single");}
}
