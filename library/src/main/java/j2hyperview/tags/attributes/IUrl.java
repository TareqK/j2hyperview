package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IUrl<T extends Tag<T>> extends IInstance<T>  {
default T withUrl(final String url_) {return self().attr("url", url_);
}
default T withCondUrl(final boolean enable, final String url_) {if (enable){
self().attr("url", url_);
}
return self();
}
}
