package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ITrigger<T extends Tag<T>> extends IInstance<T>  {
default T withTrigger(final String trigger_) {return self().attr("trigger", trigger_);
}
default T withCondTrigger(final boolean enable, final String trigger_) {if (enable){
self().attr("trigger", trigger_);
}
return self();
}
}
