package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IColor<T extends Tag<T>> extends IInstance<T>  {
default T withColor(final String color_) {return self().attr("color", color_);
}
default T withCondColor(final boolean enable, final String color_) {if (enable){
self().attr("color", color_);
}
return self();
}
}
