package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBackgroundcolor<T extends Tag<T>> extends IInstance<T>  {
default T withBackgroundcolor(final String backgroundcolor_) {return self().attr("backgroundColor", backgroundcolor_);
}
default T withCondBackgroundcolor(final boolean enable, final String backgroundcolor_) {if (enable){
self().attr("backgroundColor", backgroundcolor_);
}
return self();
}
}
