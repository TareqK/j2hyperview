package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IShadowoffsetx<T extends Tag<T>> extends IInstance<T>  {
default T withShadowoffsetx(final String shadowoffsetx_) {return self().attr("shadowOffsetX", shadowoffsetx_);
}
default T withCondShadowoffsetx(final boolean enable, final String shadowoffsetx_) {if (enable){
self().attr("shadowOffsetX", shadowoffsetx_);
}
return self();
}
}
