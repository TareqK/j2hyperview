package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ILeft<T extends Tag<T>> extends IInstance<T>  {
default T withLeft(final String left_) {return self().attr("left", left_);
}
default T withCondLeft(final boolean enable, final String left_) {if (enable){
self().attr("left", left_);
}
return self();
}
}
