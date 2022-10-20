package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IShareDialogTitle<T extends Tag<T>> extends IInstance<T>  {
default T withShareDialogTitle(final String sharedialogtitle_) {return self().attr("share:dialog-title", sharedialogtitle_);
}
default T withCondShareDialogTitle(final boolean enable, final String sharedialogtitle_) {if (enable){
self().attr("share:dialog-title", sharedialogtitle_);
}
return self();
}
}
