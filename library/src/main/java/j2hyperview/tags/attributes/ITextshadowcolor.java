package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ITextshadowcolor<T extends Tag<T>> extends IInstance<T>  {
default T withTextshadowcolor(final String textshadowcolor_) {return self().attr("textShadowColor", textshadowcolor_);
}
default T withCondTextshadowcolor(final boolean enable, final String textshadowcolor_) {if (enable){
self().attr("textShadowColor", textshadowcolor_);
}
return self();
}
}
