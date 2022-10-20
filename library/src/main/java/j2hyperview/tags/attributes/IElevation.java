package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IElevation<T extends Tag<T>> extends IInstance<T>  {
default T withElevation(final String elevation_) {return self().attr("elevation", elevation_);
}
default T withCondElevation(final boolean enable, final String elevation_) {if (enable){
self().attr("elevation", elevation_);
}
return self();
}
}
