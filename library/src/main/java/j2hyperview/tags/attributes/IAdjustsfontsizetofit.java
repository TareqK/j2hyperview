package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IAdjustsfontsizetofit<T extends Tag<T>> extends IInstance<T>  {
default T withAdjustsfontsizetofit(final String adjustsfontsizetofit_) {return self().attr("adjustsFontSizeToFit", adjustsfontsizetofit_);
}
default T withCondAdjustsfontsizetofit(final boolean enable, final String adjustsfontsizetofit_) {if (enable){
self().attr("adjustsFontSizeToFit", adjustsfontsizetofit_);
}
return self();
}
}
