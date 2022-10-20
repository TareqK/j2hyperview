package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IPaddingvertical<T extends Tag<T>> extends IInstance<T>  {
default T withPaddingvertical(final String paddingvertical_) {return self().attr("paddingVertical", paddingvertical_);
}
default T withCondPaddingvertical(final boolean enable, final String paddingvertical_) {if (enable){
self().attr("paddingVertical", paddingvertical_);
}
return self();
}
}
