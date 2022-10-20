package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ICancelLabel<T extends Tag<T>> extends IInstance<T>  {
default T withCancelLabel(final String cancellabel_) {return self().attr("cancel-label", cancellabel_);
}
default T withCondCancelLabel(final boolean enable, final String cancellabel_) {if (enable){
self().attr("cancel-label", cancellabel_);
}
return self();
}
}
