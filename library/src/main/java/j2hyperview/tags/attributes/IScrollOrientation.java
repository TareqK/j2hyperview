package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IScrollOrientation<T extends Tag<T>> extends IInstance<T>  {
default T withScrollOrientation(final String scrollorientation_) {return self().attr("scroll-orientation", scrollorientation_);
}
default T withCondScrollOrientation(final boolean enable, final String scrollorientation_) {if (enable){
self().attr("scroll-orientation", scrollorientation_);
}
return self();
}
}
