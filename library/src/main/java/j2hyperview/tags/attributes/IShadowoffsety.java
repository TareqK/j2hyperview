package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IShadowoffsety<T extends Tag<T>> extends IInstance<T>  {
default T withShadowoffsety(final String shadowoffsety_) {return self().attr("shadowOffsetY", shadowoffsety_);
}
default T withCondShadowoffsety(final boolean enable, final String shadowoffsety_) {if (enable){
self().attr("shadowOffsetY", shadowoffsety_);
}
return self();
}
}
