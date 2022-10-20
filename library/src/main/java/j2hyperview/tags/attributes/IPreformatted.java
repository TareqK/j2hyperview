package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IPreformatted<T extends Tag<T>> extends IInstance<T>  {
default T withPreformatted(final String preformatted_) {return self().attr("preformatted", preformatted_);
}
default T withCondPreformatted(final boolean enable, final String preformatted_) {if (enable){
self().attr("preformatted", preformatted_);
}
return self();
}
}
