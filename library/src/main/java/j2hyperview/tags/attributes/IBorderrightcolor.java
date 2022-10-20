package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBorderrightcolor<T extends Tag<T>> extends IInstance<T>  {
default T withBorderrightcolor(final String borderrightcolor_) {return self().attr("borderRightColor", borderrightcolor_);
}
default T withCondBorderrightcolor(final boolean enable, final String borderrightcolor_) {if (enable){
self().attr("borderRightColor", borderrightcolor_);
}
return self();
}
}
