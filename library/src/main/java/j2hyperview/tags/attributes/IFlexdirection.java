package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IFlexdirection<T extends Tag<T>> extends IInstance<T>  {
default T withFlexdirection(final String flexdirection_) {return self().attr("flexDirection", flexdirection_);
}
default T withCondFlexdirection(final boolean enable, final String flexdirection_) {if (enable){
self().attr("flexDirection", flexdirection_);
}
return self();
}
}
