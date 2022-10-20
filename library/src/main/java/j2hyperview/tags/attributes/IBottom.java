package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBottom<T extends Tag<T>> extends IInstance<T>  {
default T withBottom(final String bottom_) {return self().attr("bottom", bottom_);
}
default T withCondBottom(final boolean enable, final String bottom_) {if (enable){
self().attr("bottom", bottom_);
}
return self();
}
}
