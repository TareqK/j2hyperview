package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBorderbottomleftradius<T extends Tag<T>> extends IInstance<T>  {
default T withBorderbottomleftradius(final String borderbottomleftradius_) {return self().attr("borderBottomLeftRadius", borderbottomleftradius_);
}
default T withCondBorderbottomleftradius(final boolean enable, final String borderbottomleftradius_) {if (enable){
self().attr("borderBottomLeftRadius", borderbottomleftradius_);
}
return self();
}
}
