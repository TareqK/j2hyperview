package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IScrollToInputOffset<T extends Tag<T>> extends IInstance<T>  {
default T withScrollToInputOffset(final String scrolltoinputoffset_) {return self().attr("scroll-to-input-offset", scrolltoinputoffset_);
}
default T withCondScrollToInputOffset(final boolean enable, final String scrolltoinputoffset_) {if (enable){
self().attr("scroll-to-input-offset", scrolltoinputoffset_);
}
return self();
}
}
