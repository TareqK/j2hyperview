package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBorderleftwidth<T extends Tag<T>> extends IInstance<T>  {
default T withBorderleftwidth(final String borderleftwidth_) {return self().attr("borderLeftWidth", borderleftwidth_);
}
default T withCondBorderleftwidth(final boolean enable, final String borderleftwidth_) {if (enable){
self().attr("borderLeftWidth", borderleftwidth_);
}
return self();
}
}
