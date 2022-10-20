package j2hyperview.tags.specialized;

import j2hyperview.tags.HyperviewContainerTag;
import j2hyperview.tags.attributes.*;

public final class BodyTag extends HyperviewContainerTag<BodyTag> 
implements ISafeArea<BodyTag>,IScroll<BodyTag>,IScrollOrientation<BodyTag>,IShowsScrollIndicator<BodyTag> {
public BodyTag() {super("body");}
}
