package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IHideDuringLoad<T extends Tag<T>> extends IInstance<T>  {
default T withHideDuringLoad(final String hideduringload_) {return self().attr("hide-during-load", hideduringload_);
}
default T withCondHideDuringLoad(final boolean enable, final String hideduringload_) {if (enable){
self().attr("hide-during-load", hideduringload_);
}
return self();
}
}
