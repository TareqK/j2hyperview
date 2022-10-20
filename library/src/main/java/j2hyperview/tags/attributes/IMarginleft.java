package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMarginleft<T extends Tag<T>> extends IInstance<T>  {
default T withMarginleft(final String marginleft_) {return self().attr("marginLeft", marginleft_);
}
default T withCondMarginleft(final boolean enable, final String marginleft_) {if (enable){
self().attr("marginLeft", marginleft_);
}
return self();
}
}
