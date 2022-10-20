package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IKeyboardType<T extends Tag<T>> extends IInstance<T>  {
default T withKeyboardType(final String keyboardtype_) {return self().attr("keyboard-type", keyboardtype_);
}
default T withCondKeyboardType(final boolean enable, final String keyboardtype_) {if (enable){
self().attr("keyboard-type", keyboardtype_);
}
return self();
}
}
