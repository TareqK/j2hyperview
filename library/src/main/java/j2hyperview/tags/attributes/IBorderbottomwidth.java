package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IBorderbottomwidth<T extends Tag<T>> extends IInstance<T>  {
default T withBorderbottomwidth(final String borderbottomwidth_) {return self().attr("borderBottomWidth", borderbottomwidth_);
}
default T withCondBorderbottomwidth(final boolean enable, final String borderbottomwidth_) {if (enable){
self().attr("borderBottomWidth", borderbottomwidth_);
}
return self();
}
}
