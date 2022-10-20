package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOpacity<T extends Tag<T>> extends IInstance<T>  {
default T withOpacity(final String opacity_) {return self().attr("opacity", opacity_);
}
default T withCondOpacity(final boolean enable, final String opacity_) {if (enable){
self().attr("opacity", opacity_);
}
return self();
}
}
