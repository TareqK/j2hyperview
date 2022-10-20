package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IShadowradius<T extends Tag<T>> extends IInstance<T>  {
default T withShadowradius(final String shadowradius_) {return self().attr("shadowRadius", shadowradius_);
}
default T withCondShadowradius(final boolean enable, final String shadowradius_) {if (enable){
self().attr("shadowRadius", shadowradius_);
}
return self();
}
}
