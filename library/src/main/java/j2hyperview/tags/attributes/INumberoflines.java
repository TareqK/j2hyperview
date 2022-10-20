package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface INumberoflines<T extends Tag<T>> extends IInstance<T>  {
default T withNumberoflines(final String numberoflines_) {return self().attr("numberOfLines", numberoflines_);
}
default T withCondNumberoflines(final boolean enable, final String numberoflines_) {if (enable){
self().attr("numberOfLines", numberoflines_);
}
return self();
}
}
