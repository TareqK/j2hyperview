package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBorderwidth<T extends Tag<T>> extends IInstance<T>  {
default T withBorderwidth(final String borderwidth_) {return self().attr("borderWidth", borderwidth_);
}
default T withCondBorderwidth(final boolean enable, final String borderwidth_) {if (enable){
self().attr("borderWidth", borderwidth_);
}
return self();
}
}
