package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IDisplay<T extends Tag<T>> extends IInstance<T>  {
default T withDisplay(final String display_) {return self().attr("display", display_);
}
default T withCondDisplay(final boolean enable, final String display_) {if (enable){
self().attr("display", display_);
}
return self();
}
}
