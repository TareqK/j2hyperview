package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IPadding<T extends Tag<T>> extends IInstance<T>  {
default T withPadding(final String padding_) {return self().attr("padding", padding_);
}
default T withCondPadding(final boolean enable, final String padding_) {if (enable){
self().attr("padding", padding_);
}
return self();
}
}
