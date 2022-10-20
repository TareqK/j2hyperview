package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ITextContentType<T extends Tag<T>> extends IInstance<T>  {
default T withTextContentType(final String textcontenttype_) {return self().attr("text-content-type", textcontenttype_);
}
default T withCondTextContentType(final boolean enable, final String textcontenttype_) {if (enable){
self().attr("text-content-type", textcontenttype_);
}
return self();
}
}
