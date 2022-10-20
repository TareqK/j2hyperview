package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IAligncontent<T extends Tag<T>> extends IInstance<T>  {
default T withAligncontent(final String aligncontent_) {return self().attr("alignContent", aligncontent_);
}
default T withCondAligncontent(final boolean enable, final String aligncontent_) {if (enable){
self().attr("alignContent", aligncontent_);
}
return self();
}
}
