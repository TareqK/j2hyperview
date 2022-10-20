package j2hyperview.tags.specialized;

import j2hyperview.tags.HyperviewEmptyTag;
import j2hyperview.tags.attributes.*;

public final class WebViewTag extends HyperviewEmptyTag<WebViewTag> 
implements IUrl<WebViewTag>,IHtml<WebViewTag>,IActivityIndicatorColor<WebViewTag>,IInjectedJavaScript<WebViewTag> {
public WebViewTag() {super("web-view");}
}
