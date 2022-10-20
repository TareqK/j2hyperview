package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMarginright<T extends Tag<T>> extends IInstance<T>  {
default T withMarginright(final String marginright_) {return self().attr("marginRight", marginright_);
}
default T withCondMarginright(final boolean enable, final String marginright_) {if (enable){
self().attr("marginRight", marginright_);
}
return self();
}
}
