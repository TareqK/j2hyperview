package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IAlignitems<T extends Tag<T>> extends IInstance<T>  {
default T withAlignitems(final String alignitems_) {return self().attr("alignItems", alignitems_);
}
default T withCondAlignitems(final boolean enable, final String alignitems_) {if (enable){
self().attr("alignItems", alignitems_);
}
return self();
}
}
