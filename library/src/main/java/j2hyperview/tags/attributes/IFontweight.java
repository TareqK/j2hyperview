package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IFontweight<T extends Tag<T>> extends IInstance<T>  {
default T withFontweight(final String fontweight_) {return self().attr("fontWeight", fontweight_);
}
default T withCondFontweight(final boolean enable, final String fontweight_) {if (enable){
self().attr("fontWeight", fontweight_);
}
return self();
}
}
