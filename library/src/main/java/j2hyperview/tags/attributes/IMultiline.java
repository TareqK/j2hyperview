package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMultiline<T extends Tag<T>> extends IInstance<T>  {
default T withMultiline(final String multiline_) {return self().attr("multiline", multiline_);
}
default T withCondMultiline(final boolean enable, final String multiline_) {if (enable){
self().attr("multiline", multiline_);
}
return self();
}
}
