package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IFlexbasis<T extends Tag<T>> extends IInstance<T>  {
default T withFlexbasis(final String flexbasis_) {return self().attr("flexBasis", flexbasis_);
}
default T withCondFlexbasis(final boolean enable, final String flexbasis_) {if (enable){
self().attr("flexBasis", flexbasis_);
}
return self();
}
}
