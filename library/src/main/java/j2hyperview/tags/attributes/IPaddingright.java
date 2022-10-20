package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IPaddingright<T extends Tag<T>> extends IInstance<T>  {
default T withPaddingright(final String paddingright_) {return self().attr("paddingRight", paddingright_);
}
default T withCondPaddingright(final boolean enable, final String paddingright_) {if (enable){
self().attr("paddingRight", paddingright_);
}
return self();
}
}
