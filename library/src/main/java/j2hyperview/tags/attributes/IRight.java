package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IRight<T extends Tag<T>> extends IInstance<T>  {
default T withRight(final String right_) {return self().attr("right", right_);
}
default T withCondRight(final boolean enable, final String right_) {if (enable){
self().attr("right", right_);
}
return self();
}
}
