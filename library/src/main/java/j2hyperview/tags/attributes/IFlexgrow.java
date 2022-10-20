package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IFlexgrow<T extends Tag<T>> extends IInstance<T>  {
default T withFlexgrow(final String flexgrow_) {return self().attr("flexGrow", flexgrow_);
}
default T withCondFlexgrow(final boolean enable, final String flexgrow_) {if (enable){
self().attr("flexGrow", flexgrow_);
}
return self();
}
}
