package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IPosition<T extends Tag<T>> extends IInstance<T>  {
default T withPosition(final String position_) {return self().attr("position", position_);
}
default T withCondPosition(final boolean enable, final String position_) {if (enable){
self().attr("position", position_);
}
return self();
}
}
