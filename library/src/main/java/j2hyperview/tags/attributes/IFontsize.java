package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IFontsize<T extends Tag<T>> extends IInstance<T>  {
default T withFontsize(final String fontsize_) {return self().attr("fontSize", fontsize_);
}
default T withCondFontsize(final boolean enable, final String fontsize_) {if (enable){
self().attr("fontSize", fontsize_);
}
return self();
}
}
