package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBorderbottomrightradius<T extends Tag<T>> extends IInstance<T>  {
default T withBorderbottomrightradius(final String borderbottomrightradius_) {return self().attr("borderBottomRightRadius", borderbottomrightradius_);
}
default T withCondBorderbottomrightradius(final boolean enable, final String borderbottomrightradius_) {if (enable){
self().attr("borderBottomRightRadius", borderbottomrightradius_);
}
return self();
}
}
