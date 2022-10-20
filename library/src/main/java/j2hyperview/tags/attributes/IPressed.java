package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IPressed<T extends Tag<T>> extends IInstance<T>  {
default T withPressed(final String pressed_) {return self().attr("pressed", pressed_);
}
default T withCondPressed(final boolean enable, final String pressed_) {if (enable){
self().attr("pressed", pressed_);
}
return self();
}
}
