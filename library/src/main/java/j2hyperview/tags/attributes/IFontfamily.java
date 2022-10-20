package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IFontfamily<T extends Tag<T>> extends IInstance<T>  {
default T withFontfamily(final String fontfamily_) {return self().attr("fontFamily", fontfamily_);
}
default T withCondFontfamily(final boolean enable, final String fontfamily_) {if (enable){
self().attr("fontFamily", fontfamily_);
}
return self();
}
}
