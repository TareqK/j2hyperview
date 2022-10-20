package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMinwidth<T extends Tag<T>> extends IInstance<T>  {
default T withMinwidth(final String minwidth_) {return self().attr("minWidth", minwidth_);
}
default T withCondMinwidth(final boolean enable, final String minwidth_) {if (enable){
self().attr("minWidth", minwidth_);
}
return self();
}
}
