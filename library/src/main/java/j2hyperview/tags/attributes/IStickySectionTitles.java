package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IStickySectionTitles<T extends Tag<T>> extends IInstance<T>  {
default T withStickySectionTitles(final String stickysectiontitles_) {return self().attr("sticky-section-titles", stickysectiontitles_);
}
default T withCondStickySectionTitles(final boolean enable, final String stickysectiontitles_) {if (enable){
self().attr("sticky-section-titles", stickysectiontitles_);
}
return self();
}
}
