package j2hyperview.tags.specialized;

import j2hyperview.tags.HyperviewContainerTag;
import j2hyperview.tags.attributes.*;

public final class WebViewTag extends HyperviewContainerTag<WebViewTag> 
implements IUrl<WebViewTag>,IHtml<WebViewTag>,IActivityIndicatorColor<WebViewTag>,IInjectedJavaScript<WebViewTag> {
public WebViewTag() {super("web-view");}
}
