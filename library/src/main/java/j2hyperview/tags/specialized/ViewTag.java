package j2hyperview.tags.specialized;

import j2hyperview.tags.HyperviewContainerTag;
import j2hyperview.tags.attributes.*;

public final class ViewTag extends HyperviewContainerTag<ViewTag> 
implements ISafeArea<ViewTag>,IHide<ViewTag>,IScroll<ViewTag>,IScrollOrientation<ViewTag>,IShowsScrollIndicator<ViewTag>,IContentContainerStyle<ViewTag>,IScrollToInputOffset<ViewTag>,IAvoidKeyboard<ViewTag>,ISticky<ViewTag> {
public ViewTag() {super("view");}
}
