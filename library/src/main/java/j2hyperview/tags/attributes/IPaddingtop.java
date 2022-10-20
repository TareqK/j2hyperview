package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IPaddingtop<T extends Tag<T>> extends IInstance<T>  {
default T withPaddingtop(final String paddingtop_) {return self().attr("paddingTop", paddingtop_);
}
default T withCondPaddingtop(final boolean enable, final String paddingtop_) {if (enable){
self().attr("paddingTop", paddingtop_);
}
return self();
}
}
