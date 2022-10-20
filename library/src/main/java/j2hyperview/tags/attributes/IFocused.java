package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IFocused<T extends Tag<T>> extends IInstance<T>  {
default T withFocused(final String focused_) {return self().attr("focused", focused_);
}
default T withCondFocused(final boolean enable, final String focused_) {if (enable){
self().attr("focused", focused_);
}
return self();
}
}
