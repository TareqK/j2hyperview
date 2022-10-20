package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBordertopcolor<T extends Tag<T>> extends IInstance<T>  {
default T withBordertopcolor(final String bordertopcolor_) {return self().attr("borderTopColor", bordertopcolor_);
}
default T withCondBordertopcolor(final boolean enable, final String bordertopcolor_) {if (enable){
self().attr("borderTopColor", bordertopcolor_);
}
return self();
}
}
