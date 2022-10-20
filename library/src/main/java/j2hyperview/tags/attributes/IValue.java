package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IValue<T extends Tag<T>> extends IInstance<T>  {
default T withValue(final String value_) {return self().attr("value", value_);
}
default T withCondValue(final boolean enable, final String value_) {if (enable){
self().attr("value", value_);
}
return self();
}
}
