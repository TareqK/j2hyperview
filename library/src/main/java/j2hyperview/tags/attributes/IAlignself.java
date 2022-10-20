package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IAlignself<T extends Tag<T>> extends IInstance<T>  {
default T withAlignself(final String alignself_) {return self().attr("alignSelf", alignself_);
}
default T withCondAlignself(final boolean enable, final String alignself_) {if (enable){
self().attr("alignSelf", alignself_);
}
return self();
}
}
