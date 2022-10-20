package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMargin<T extends Tag<T>> extends IInstance<T>  {
default T withMargin(final String margin_) {return self().attr("margin", margin_);
}
default T withCondMargin(final boolean enable, final String margin_) {if (enable){
self().attr("margin", margin_);
}
return self();
}
}
