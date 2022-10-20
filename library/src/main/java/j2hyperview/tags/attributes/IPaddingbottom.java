package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IPaddingbottom<T extends Tag<T>> extends IInstance<T>  {
default T withPaddingbottom(final String paddingbottom_) {return self().attr("paddingBottom", paddingbottom_);
}
default T withCondPaddingbottom(final boolean enable, final String paddingbottom_) {if (enable){
self().attr("paddingBottom", paddingbottom_);
}
return self();
}
}
