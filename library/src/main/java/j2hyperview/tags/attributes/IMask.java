package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMask<T extends Tag<T>> extends IInstance<T>  {
default T withMask(final String mask_) {return self().attr("mask", mask_);
}
default T withCondMask(final boolean enable, final String mask_) {if (enable){
self().attr("mask", mask_);
}
return self();
}
}
