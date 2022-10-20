package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IShareMessage<T extends Tag<T>> extends IInstance<T>  {
default T withShareMessage(final String sharemessage_) {return self().attr("share:message", sharemessage_);
}
default T withCondShareMessage(final boolean enable, final String sharemessage_) {if (enable){
self().attr("share:message", sharemessage_);
}
return self();
}
}
