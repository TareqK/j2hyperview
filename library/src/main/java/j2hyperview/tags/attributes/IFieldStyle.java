package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IFieldStyle<T extends Tag<T>> extends IInstance<T>  {
default T withFieldStyle(final String fieldstyle_) {return self().attr("field-style", fieldstyle_);
}
default T withCondFieldStyle(final boolean enable, final String fieldstyle_) {if (enable){
self().attr("field-style", fieldstyle_);
}
return self();
}
}
