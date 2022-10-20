package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IContentContainerStyle<T extends Tag<T>> extends IInstance<T>  {
default T withContentContainerStyle(final String contentcontainerstyle_) {return self().attr("content-container-style", contentcontainerstyle_);
}
default T withCondContentContainerStyle(final boolean enable, final String contentcontainerstyle_) {if (enable){
self().attr("content-container-style", contentcontainerstyle_);
}
return self();
}
}
