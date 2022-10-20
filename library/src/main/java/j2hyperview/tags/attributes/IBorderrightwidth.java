package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBorderrightwidth<T extends Tag<T>> extends IInstance<T>  {
default T withBorderrightwidth(final String borderrightwidth_) {return self().attr("borderRightWidth", borderrightwidth_);
}
default T withCondBorderrightwidth(final boolean enable, final String borderrightwidth_) {if (enable){
self().attr("borderRightWidth", borderrightwidth_);
}
return self();
}
}
