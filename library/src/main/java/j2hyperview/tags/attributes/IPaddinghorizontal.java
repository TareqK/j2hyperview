package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IPaddinghorizontal<T extends Tag<T>> extends IInstance<T>  {
default T withPaddinghorizontal(final String paddinghorizontal_) {return self().attr("paddingHorizontal", paddinghorizontal_);
}
default T withCondPaddinghorizontal(final boolean enable, final String paddinghorizontal_) {if (enable){
self().attr("paddingHorizontal", paddinghorizontal_);
}
return self();
}
}
