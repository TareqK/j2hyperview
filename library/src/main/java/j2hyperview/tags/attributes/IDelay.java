package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IDelay<T extends Tag<T>> extends IInstance<T>  {
default T withDelay(final String delay_) {return self().attr("delay", delay_);
}
default T withCondDelay(final boolean enable, final String delay_) {if (enable){
self().attr("delay", delay_);
}
return self();
}
}
