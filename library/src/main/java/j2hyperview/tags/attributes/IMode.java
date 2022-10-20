package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMode<T extends Tag<T>> extends IInstance<T>  {
default T withMode(final String mode_) {return self().attr("mode", mode_);
}
default T withCondMode(final boolean enable, final String mode_) {if (enable){
self().attr("mode", mode_);
}
return self();
}
}
