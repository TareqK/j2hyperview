package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ISelected<T extends Tag<T>> extends IInstance<T>  {
default T withSelected(final String selected_) {return self().attr("selected", selected_);
}
default T withCondSelected(final boolean enable, final String selected_) {if (enable){
self().attr("selected", selected_);
}
return self();
}
}
