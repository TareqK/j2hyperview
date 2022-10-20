package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IFlex<T extends Tag<T>> extends IInstance<T>  {
default T withFlex(final String flex_) {return self().attr("flex", flex_);
}
default T withCondFlex(final boolean enable, final String flex_) {if (enable){
self().attr("flex", flex_);
}
return self();
}
}
