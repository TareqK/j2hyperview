package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IShareUrl<T extends Tag<T>> extends IInstance<T>  {
default T withShareUrl(final String shareurl_) {return self().attr("share:url", shareurl_);
}
default T withCondShareUrl(final boolean enable, final String shareurl_) {if (enable){
self().attr("share:url", shareurl_);
}
return self();
}
}
