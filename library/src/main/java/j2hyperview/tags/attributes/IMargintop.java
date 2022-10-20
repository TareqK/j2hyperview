package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMargintop<T extends Tag<T>> extends IInstance<T>  {
default T withMargintop(final String margintop_) {return self().attr("marginTop", margintop_);
}
default T withCondMargintop(final boolean enable, final String margintop_) {if (enable){
self().attr("marginTop", margintop_);
}
return self();
}
}
