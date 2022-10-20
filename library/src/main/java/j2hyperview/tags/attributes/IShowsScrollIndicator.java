package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IShowsScrollIndicator<T extends Tag<T>> extends IInstance<T>  {
default T withShowsScrollIndicator(final String showsscrollindicator_) {return self().attr("shows-scroll-indicator", showsscrollindicator_);
}
default T withCondShowsScrollIndicator(final boolean enable, final String showsscrollindicator_) {if (enable){
self().attr("shows-scroll-indicator", showsscrollindicator_);
}
return self();
}
}
