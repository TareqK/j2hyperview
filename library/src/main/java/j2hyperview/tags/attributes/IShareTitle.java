package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IShareTitle<T extends Tag<T>> extends IInstance<T>  {
default T withShareTitle(final String sharetitle_) {return self().attr("share:title", sharetitle_);
}
default T withCondShareTitle(final boolean enable, final String sharetitle_) {if (enable){
self().attr("share:title", sharetitle_);
}
return self();
}
}
