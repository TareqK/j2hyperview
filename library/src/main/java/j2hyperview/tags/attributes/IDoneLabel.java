package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IDoneLabel<T extends Tag<T>> extends IInstance<T>  {
default T withDoneLabel(final String donelabel_) {return self().attr("done-label", donelabel_);
}
default T withCondDoneLabel(final boolean enable, final String donelabel_) {if (enable){
self().attr("done-label", donelabel_);
}
return self();
}
}
