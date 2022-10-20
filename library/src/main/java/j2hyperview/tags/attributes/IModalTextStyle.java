package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IModalTextStyle<T extends Tag<T>> extends IInstance<T>  {
default T withModalTextStyle(final String modaltextstyle_) {return self().attr("modal-text-style", modaltextstyle_);
}
default T withCondModalTextStyle(final boolean enable, final String modaltextstyle_) {if (enable){
self().attr("modal-text-style", modaltextstyle_);
}
return self();
}
}
