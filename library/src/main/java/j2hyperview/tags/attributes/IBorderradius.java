package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBorderradius<T extends Tag<T>> extends IInstance<T>  {
default T withBorderradius(final String borderradius_) {return self().attr("borderRadius", borderradius_);
}
default T withCondBorderradius(final boolean enable, final String borderradius_) {if (enable){
self().attr("borderRadius", borderradius_);
}
return self();
}
}
