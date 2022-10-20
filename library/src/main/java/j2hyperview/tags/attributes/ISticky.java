package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ISticky<T extends Tag<T>> extends IInstance<T>  {
default T withSticky(final String sticky_) {return self().attr("sticky", sticky_);
}
default T withCondSticky(final boolean enable, final String sticky_) {if (enable){
self().attr("sticky", sticky_);
}
return self();
}
}
