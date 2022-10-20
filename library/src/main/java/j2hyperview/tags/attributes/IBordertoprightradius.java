package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBordertoprightradius<T extends Tag<T>> extends IInstance<T>  {
default T withBordertoprightradius(final String bordertoprightradius_) {return self().attr("borderTopRightRadius", bordertoprightradius_);
}
default T withCondBordertoprightradius(final boolean enable, final String bordertoprightradius_) {if (enable){
self().attr("borderTopRightRadius", bordertoprightradius_);
}
return self();
}
}
