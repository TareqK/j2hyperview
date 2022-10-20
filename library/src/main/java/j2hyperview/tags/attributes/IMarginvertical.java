package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMarginvertical<T extends Tag<T>> extends IInstance<T>  {
default T withMarginvertical(final String marginvertical_) {return self().attr("marginVertical", marginvertical_);
}
default T withCondMarginvertical(final boolean enable, final String marginvertical_) {if (enable){
self().attr("marginVertical", marginvertical_);
}
return self();
}
}
