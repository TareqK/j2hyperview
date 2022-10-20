package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IFieldTextStyle<T extends Tag<T>> extends IInstance<T>  {
default T withFieldTextStyle(final String fieldtextstyle_) {return self().attr("field-text-style", fieldtextstyle_);
}
default T withCondFieldTextStyle(final boolean enable, final String fieldtextstyle_) {if (enable){
self().attr("field-text-style", fieldtextstyle_);
}
return self();
}
}
