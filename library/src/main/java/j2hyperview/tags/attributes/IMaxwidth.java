package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMaxwidth<T extends Tag<T>> extends IInstance<T>  {
default T withMaxwidth(final String maxwidth_) {return self().attr("maxWidth", maxwidth_);
}
default T withCondMaxwidth(final boolean enable, final String maxwidth_) {if (enable){
self().attr("maxWidth", maxwidth_);
}
return self();
}
}
