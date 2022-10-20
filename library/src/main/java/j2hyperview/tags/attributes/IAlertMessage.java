package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IAlertMessage<T extends Tag<T>> extends IInstance<T>  {
default T withAlertMessage(final String alertmessage_) {return self().attr("alert:message", alertmessage_);
}
default T withCondAlertMessage(final boolean enable, final String alertmessage_) {if (enable){
self().attr("alert:message", alertmessage_);
}
return self();
}
}
