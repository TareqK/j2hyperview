package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOnce<T extends Tag<T>> extends IInstance<T>  {
default T withOnce(final String once_) {return self().attr("once", once_);
}
default T withCondOnce(final boolean enable, final String once_) {if (enable){
self().attr("once", once_);
}
return self();
}
}
