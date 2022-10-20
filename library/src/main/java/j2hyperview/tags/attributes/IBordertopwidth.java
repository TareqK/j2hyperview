package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBordertopwidth<T extends Tag<T>> extends IInstance<T>  {
default T withBordertopwidth(final String bordertopwidth_) {return self().attr("borderTopWidth", bordertopwidth_);
}
default T withCondBordertopwidth(final boolean enable, final String bordertopwidth_) {if (enable){
self().attr("borderTopWidth", bordertopwidth_);
}
return self();
}
}
