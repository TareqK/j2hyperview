package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IFlexshrink<T extends Tag<T>> extends IInstance<T>  {
default T withFlexshrink(final String flexshrink_) {return self().attr("flexShrink", flexshrink_);
}
default T withCondFlexshrink(final boolean enable, final String flexshrink_) {if (enable){
self().attr("flexShrink", flexshrink_);
}
return self();
}
}
