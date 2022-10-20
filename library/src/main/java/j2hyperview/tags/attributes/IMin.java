package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMin<T extends Tag<T>> extends IInstance<T>  {
default T withMin(final String min_) {return self().attr("min", min_);
}
default T withCondMin(final boolean enable, final String min_) {if (enable){
self().attr("min", min_);
}
return self();
}
}
