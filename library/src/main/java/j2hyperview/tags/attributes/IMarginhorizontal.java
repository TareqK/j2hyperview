package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMarginhorizontal<T extends Tag<T>> extends IInstance<T>  {
default T withMarginhorizontal(final String marginhorizontal_) {return self().attr("marginHorizontal", marginhorizontal_);
}
default T withCondMarginhorizontal(final boolean enable, final String marginhorizontal_) {if (enable){
self().attr("marginHorizontal", marginhorizontal_);
}
return self();
}
}
