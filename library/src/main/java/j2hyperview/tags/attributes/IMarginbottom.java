package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMarginbottom<T extends Tag<T>> extends IInstance<T>  {
default T withMarginbottom(final String marginbottom_) {return self().attr("marginBottom", marginbottom_);
}
default T withCondMarginbottom(final boolean enable, final String marginbottom_) {if (enable){
self().attr("marginBottom", marginbottom_);
}
return self();
}
}
