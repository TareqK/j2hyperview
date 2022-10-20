package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ILineheight<T extends Tag<T>> extends IInstance<T>  {
default T withLineheight(final String lineheight_) {return self().attr("lineHeight", lineheight_);
}
default T withCondLineheight(final boolean enable, final String lineheight_) {if (enable){
self().attr("lineHeight", lineheight_);
}
return self();
}
}
