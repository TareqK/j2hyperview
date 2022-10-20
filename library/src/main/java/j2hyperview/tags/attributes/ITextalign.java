package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ITextalign<T extends Tag<T>> extends IInstance<T>  {
default T withTextalign(final String textalign_) {return self().attr("textAlign", textalign_);
}
default T withCondTextalign(final boolean enable, final String textalign_) {if (enable){
self().attr("textAlign", textalign_);
}
return self();
}
}
