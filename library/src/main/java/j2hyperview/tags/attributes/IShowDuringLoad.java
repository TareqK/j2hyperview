package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IShowDuringLoad<T extends Tag<T>> extends IInstance<T>  {
default T withShowDuringLoad(final String showduringload_) {return self().attr("show-during-load", showduringload_);
}
default T withCondShowDuringLoad(final boolean enable, final String showduringload_) {if (enable){
self().attr("show-during-load", showduringload_);
}
return self();
}
}
