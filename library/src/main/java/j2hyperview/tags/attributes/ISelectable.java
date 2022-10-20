package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ISelectable<T extends Tag<T>> extends IInstance<T>  {
default T withSelectable(final String selectable_) {return self().attr("selectable", selectable_);
}
default T withCondSelectable(final boolean enable, final String selectable_) {if (enable){
self().attr("selectable", selectable_);
}
return self();
}
}
