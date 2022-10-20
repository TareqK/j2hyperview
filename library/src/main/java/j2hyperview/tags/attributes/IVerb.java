package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IVerb<T extends Tag<T>> extends IInstance<T>  {
default T withVerb(final String verb_) {return self().attr("verb", verb_);
}
default T withCondVerb(final boolean enable, final String verb_) {if (enable){
self().attr("verb", verb_);
}
return self();
}
}
