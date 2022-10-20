package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IAvoidKeyboard<T extends Tag<T>> extends IInstance<T>  {
default T withAvoidKeyboard(final String avoidkeyboard_) {return self().attr("avoid-keyboard", avoidkeyboard_);
}
default T withCondAvoidKeyboard(final boolean enable, final String avoidkeyboard_) {if (enable){
self().attr("avoid-keyboard", avoidkeyboard_);
}
return self();
}
}
