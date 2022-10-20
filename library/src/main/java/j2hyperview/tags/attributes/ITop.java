package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ITop<T extends Tag<T>> extends IInstance<T>  {
default T withTop(final String top_) {return self().attr("top", top_);
}
default T withCondTop(final boolean enable, final String top_) {if (enable){
self().attr("top", top_);
}
return self();
}
}
