package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ISafeArea<T extends Tag<T>> extends IInstance<T>  {
default T withSafeArea(final String safearea_) {return self().attr("safe-area", safearea_);
}
default T withCondSafeArea(final boolean enable, final String safearea_) {if (enable){
self().attr("safe-area", safearea_);
}
return self();
}
}
