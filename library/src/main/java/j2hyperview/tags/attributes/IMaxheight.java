package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMaxheight<T extends Tag<T>> extends IInstance<T>  {
default T withMaxheight(final String maxheight_) {return self().attr("maxHeight", maxheight_);
}
default T withCondMaxheight(final boolean enable, final String maxheight_) {if (enable){
self().attr("maxHeight", maxheight_);
}
return self();
}
}
