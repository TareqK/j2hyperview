package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOverflow<T extends Tag<T>> extends IInstance<T>  {
default T withOverflow(final String overflow_) {return self().attr("overflow", overflow_);
}
default T withCondOverflow(final boolean enable, final String overflow_) {if (enable){
self().attr("overflow", overflow_);
}
return self();
}
}
