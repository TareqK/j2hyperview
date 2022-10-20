package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IZindex<T extends Tag<T>> extends IInstance<T>  {
default T withZindex(final String zindex_) {return self().attr("zIndex", zindex_);
}
default T withCondZindex(final boolean enable, final String zindex_) {if (enable){
self().attr("zIndex", zindex_);
}
return self();
}
}
