package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IJustifycontent<T extends Tag<T>> extends IInstance<T>  {
default T withJustifycontent(final String justifycontent_) {return self().attr("justifyContent", justifycontent_);
}
default T withCondJustifycontent(final boolean enable, final String justifycontent_) {if (enable){
self().attr("justifyContent", justifycontent_);
}
return self();
}
}
