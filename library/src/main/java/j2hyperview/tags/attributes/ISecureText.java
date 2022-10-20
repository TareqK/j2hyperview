package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ISecureText<T extends Tag<T>> extends IInstance<T>  {
default T withSecureText(final String securetext_) {return self().attr("secure-text", securetext_);
}
default T withCondSecureText(final boolean enable, final String securetext_) {if (enable){
self().attr("secure-text", securetext_);
}
return self();
}
}
