package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBorderleftcolor<T extends Tag<T>> extends IInstance<T>  {
default T withBorderleftcolor(final String borderleftcolor_) {return self().attr("borderLeftColor", borderleftcolor_);
}
default T withCondBorderleftcolor(final boolean enable, final String borderleftcolor_) {if (enable){
self().attr("borderLeftColor", borderleftcolor_);
}
return self();
}
}
