package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IPaddingleft<T extends Tag<T>> extends IInstance<T>  {
default T withPaddingleft(final String paddingleft_) {return self().attr("paddingLeft", paddingleft_);
}
default T withCondPaddingleft(final boolean enable, final String paddingleft_) {if (enable){
self().attr("paddingLeft", paddingleft_);
}
return self();
}
}
