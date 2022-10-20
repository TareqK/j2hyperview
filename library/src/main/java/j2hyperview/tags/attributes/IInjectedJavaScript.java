package j2hyperview.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IInjectedJavaScript<T extends Tag<T>> extends IInstance<T>  {
default T withInjectedJavaScript(final String injectedjavascript_) {return self().attr("injected-java-script", injectedjavascript_);
}
default T withCondInjectedJavaScript(final boolean enable, final String injectedjavascript_) {if (enable){
self().attr("injected-java-script", injectedjavascript_);
}
return self();
}
}
