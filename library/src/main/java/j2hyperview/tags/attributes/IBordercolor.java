package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBordercolor<T extends Tag<T>> extends IInstance<T>  {
default T withBordercolor(final String bordercolor_) {return self().attr("borderColor", bordercolor_);
}
default T withCondBordercolor(final boolean enable, final String bordercolor_) {if (enable){
self().attr("borderColor", bordercolor_);
}
return self();
}
}
