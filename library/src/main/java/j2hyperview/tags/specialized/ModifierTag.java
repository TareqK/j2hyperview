package j2hyperview.tags.specialized;

import j2hyperview.tags.HyperviewContainerTag;
import j2hyperview.tags.attributes.*;

public final class ModifierTag extends HyperviewContainerTag<ModifierTag> 
implements IFocused<ModifierTag>,IPressed<ModifierTag>,ISelected<ModifierTag> {
public ModifierTag() {super("modifier");}
}
