package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IFontstyle<T extends Tag<T>> extends IInstance<T>  {
default T withFontstyle(final String fontstyle_) {return self().attr("fontStyle", fontstyle_);
}
default T withCondFontstyle(final boolean enable, final String fontstyle_) {if (enable){
self().attr("fontStyle", fontstyle_);
}
return self();
}
}
