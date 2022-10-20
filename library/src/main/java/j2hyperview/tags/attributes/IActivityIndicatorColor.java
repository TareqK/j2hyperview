package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IActivityIndicatorColor<T extends Tag<T>> extends IInstance<T>  {
default T withActivityIndicatorColor(final String activityindicatorcolor_) {return self().attr("activity-indicator-color", activityindicatorcolor_);
}
default T withCondActivityIndicatorColor(final boolean enable, final String activityindicatorcolor_) {if (enable){
self().attr("activity-indicator-color", activityindicatorcolor_);
}
return self();
}
}
