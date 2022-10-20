package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IHtml<T extends Tag<T>> extends IInstance<T>  {
default T withHtml(final String html_) {return self().attr("html", html_);
}
default T withCondHtml(final boolean enable, final String html_) {if (enable){
self().attr("html", html_);
}
return self();
}
}
