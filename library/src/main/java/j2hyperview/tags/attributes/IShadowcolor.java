package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IShadowcolor<T extends Tag<T>> extends IInstance<T>  {
default T withShadowcolor(final String shadowcolor_) {return self().attr("shadowColor", shadowcolor_);
}
default T withCondShadowcolor(final boolean enable, final String shadowcolor_) {if (enable){
self().attr("shadowColor", shadowcolor_);
}
return self();
}
}
