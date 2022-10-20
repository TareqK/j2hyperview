package j2hyperview.tags.specialized;

import j2hyperview.tags.HyperviewContainerTag;
import j2hyperview.tags.attributes.*;

public final class BehaviorTag extends HyperviewContainerTag<BehaviorTag> 
implements IAlertTitle<BehaviorTag>,IAlertMessage<BehaviorTag>,IShareDialogTitle<BehaviorTag>,IShareSubject<BehaviorTag>,IShareMessage<BehaviorTag>,IShareUrl<BehaviorTag>,IShareTitle<BehaviorTag> {
public BehaviorTag() {super("behavior");}
}
