package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IScroll<T extends Tag<T>> extends IInstance<T>  {
default T withScroll(final String scroll_) {return self().attr("scroll", scroll_);
}
default T withCondScroll(final boolean enable, final String scroll_) {if (enable){
self().attr("scroll", scroll_);
}
return self();
}
}
