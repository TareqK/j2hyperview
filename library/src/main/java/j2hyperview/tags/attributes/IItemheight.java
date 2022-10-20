package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IItemheight<T extends Tag<T>> extends IInstance<T>  {
default T withItemheight(final String itemheight_) {return self().attr("itemHeight", itemheight_);
}
default T withCondItemheight(final boolean enable, final String itemheight_) {if (enable){
self().attr("itemHeight", itemheight_);
}
return self();
}
}
