package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBorderstyle<T extends Tag<T>> extends IInstance<T>  {
default T withBorderstyle(final String borderstyle_) {return self().attr("borderStyle", borderstyle_);
}
default T withCondBorderstyle(final boolean enable, final String borderstyle_) {if (enable){
self().attr("borderStyle", borderstyle_);
}
return self();
}
}
