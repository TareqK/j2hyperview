package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IAllowDeselect<T extends Tag<T>> extends IInstance<T>  {
default T withAllowDeselect(final String allowdeselect_) {return self().attr("allow-deselect", allowdeselect_);
}
default T withCondAllowDeselect(final boolean enable, final String allowdeselect_) {if (enable){
self().attr("allow-deselect", allowdeselect_);
}
return self();
}
}
