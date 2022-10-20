package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IAlertLabel<T extends Tag<T>> extends IInstance<T>  {
default T withAlertLabel(final String alertlabel_) {return self().attr("alert:label", alertlabel_);
}
default T withCondAlertLabel(final boolean enable, final String alertlabel_) {if (enable){
self().attr("alert:label", alertlabel_);
}
return self();
}
}
