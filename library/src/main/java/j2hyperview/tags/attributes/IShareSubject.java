package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IShareSubject<T extends Tag<T>> extends IInstance<T>  {
default T withShareSubject(final String sharesubject_) {return self().attr("share:subject", sharesubject_);
}
default T withCondShareSubject(final boolean enable, final String sharesubject_) {if (enable){
self().attr("share:subject", sharesubject_);
}
return self();
}
}
