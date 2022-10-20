package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBordertopleftradius<T extends Tag<T>> extends IInstance<T>  {
default T withBordertopleftradius(final String bordertopleftradius_) {return self().attr("borderTopLeftRadius", bordertopleftradius_);
}
default T withCondBordertopleftradius(final boolean enable, final String bordertopleftradius_) {if (enable){
self().attr("borderTopLeftRadius", bordertopleftradius_);
}
return self();
}
}
