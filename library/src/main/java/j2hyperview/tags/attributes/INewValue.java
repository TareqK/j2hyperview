package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface INewValue<T extends Tag<T>> extends IInstance<T>  {
default T withNewValue(final String newvalue_) {return self().attr("new-value", newvalue_);
}
default T withCondNewValue(final boolean enable, final String newvalue_) {if (enable){
self().attr("new-value", newvalue_);
}
return self();
}
}
