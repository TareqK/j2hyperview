package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ITextshadowradius<T extends Tag<T>> extends IInstance<T>  {
default T withTextshadowradius(final String textshadowradius_) {return self().attr("textShadowRadius", textshadowradius_);
}
default T withCondTextshadowradius(final boolean enable, final String textshadowradius_) {if (enable){
self().attr("textShadowRadius", textshadowradius_);
}
return self();
}
}
