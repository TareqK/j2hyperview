package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IModalStyle<T extends Tag<T>> extends IInstance<T>  {
default T withModalStyle(final String modalstyle_) {return self().attr("modal-style", modalstyle_);
}
default T withCondModalStyle(final boolean enable, final String modalstyle_) {if (enable){
self().attr("modal-style", modalstyle_);
}
return self();
}
}
