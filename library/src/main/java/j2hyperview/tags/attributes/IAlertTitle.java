package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IAlertTitle<T extends Tag<T>> extends IInstance<T>  {
default T withAlertTitle(final String alerttitle_) {return self().attr("alert:title", alerttitle_);
}
default T withCondAlertTitle(final boolean enable, final String alerttitle_) {if (enable){
self().attr("alert:title", alerttitle_);
}
return self();
}
}
