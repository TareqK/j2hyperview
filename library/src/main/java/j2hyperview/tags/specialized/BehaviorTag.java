package j2hyperview.tags.specialized;

import j2hyperview.tags.HyperviewEmptyTag;
import j2hyperview.tags.attributes.*;

public final class BehaviorTag extends HyperviewEmptyTag<BehaviorTag> 
implements IAlertTitle<BehaviorTag>,IAlertMessage<BehaviorTag>,IShareDialogTitle<BehaviorTag>,IShareSubject<BehaviorTag>,IShareMessage<BehaviorTag>,IShareUrl<BehaviorTag>,IShareTitle<BehaviorTag> {
public BehaviorTag() {super("behavior");}
}
