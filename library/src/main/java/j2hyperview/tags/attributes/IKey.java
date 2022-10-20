package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IKey<T extends Tag<T>> extends IInstance<T>  {
default T withKey(final String key_) {return self().attr("key", key_);
}
default T withCondKey(final boolean enable, final String key_) {if (enable){
self().attr("key", key_);
}
return self();
}
}
