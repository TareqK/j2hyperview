package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IShadowopacity<T extends Tag<T>> extends IInstance<T>  {
default T withShadowopacity(final String shadowopacity_) {return self().attr("shadowOpacity", shadowopacity_);
}
default T withCondShadowopacity(final boolean enable, final String shadowopacity_) {if (enable){
self().attr("shadowOpacity", shadowopacity_);
}
return self();
}
}
