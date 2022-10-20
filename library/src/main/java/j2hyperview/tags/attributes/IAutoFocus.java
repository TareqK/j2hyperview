package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IAutoFocus<T extends Tag<T>> extends IInstance<T>  {
default T withAutoFocus(final String autofocus_) {return self().attr("auto-focus", autofocus_);
}
default T withCondAutoFocus(final boolean enable, final String autofocus_) {if (enable){
self().attr("auto-focus", autofocus_);
}
return self();
}
}
