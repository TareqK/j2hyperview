package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IMinheight<T extends Tag<T>> extends IInstance<T>  {
default T withMinheight(final String minheight_) {return self().attr("minHeight", minheight_);
}
default T withCondMinheight(final boolean enable, final String minheight_) {if (enable){
self().attr("minHeight", minheight_);
}
return self();
}
}
