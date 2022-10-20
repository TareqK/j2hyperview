package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBorderbottomcolor<T extends Tag<T>> extends IInstance<T>  {
default T withBorderbottomcolor(final String borderbottomcolor_) {return self().attr("borderBottomColor", borderbottomcolor_);
}
default T withCondBorderbottomcolor(final boolean enable, final String borderbottomcolor_) {if (enable){
self().attr("borderBottomColor", borderbottomcolor_);
}
return self();
}
}
