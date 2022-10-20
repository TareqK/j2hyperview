package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IFlexwrap<T extends Tag<T>> extends IInstance<T>  {
default T withFlexwrap(final String flexwrap_) {return self().attr("flexWrap", flexwrap_);
}
default T withCondFlexwrap(final boolean enable, final String flexwrap_) {if (enable){
self().attr("flexWrap", flexwrap_);
}
return self();
}
}
