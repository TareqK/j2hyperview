package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ILabelFormat<T extends Tag<T>> extends IInstance<T>  {
default T withLabelFormat(final String labelformat_) {return self().attr("label-format", labelformat_);
}
default T withCondLabelFormat(final boolean enable, final String labelformat_) {if (enable){
self().attr("label-format", labelformat_);
}
return self();
}
}
