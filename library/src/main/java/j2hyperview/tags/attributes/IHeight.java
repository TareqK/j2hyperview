package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IHeight<T extends Tag<T>> extends IInstance<T>  {
default T withHeight(final String height_) {return self().attr("height", height_);
}
default T withCondHeight(final boolean enable, final String height_) {if (enable){
self().attr("height", height_);
}
return self();
}
}
