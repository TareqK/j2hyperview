/*
 * Copyright 2022 tareq.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package j2hyperview.tags;

import j2html.tags.ContainerTag;
import j2hyperview.tags.attributes.IAction;
import j2hyperview.tags.attributes.IHref;
import j2hyperview.tags.attributes.ITarget;
import j2hyperview.tags.attributes.ITrigger;
import j2hyperview.tags.attributes.IVerb;

/**
 *
 * @author tareq
 */
public class HyperviewContainerTag<T extends HyperviewContainerTag<T>> extends ContainerTag<T>
        implements IHref<T>, IAction<T>, ITarget<T>, ITrigger<T>, IVerb<T> {

    public HyperviewContainerTag(String tagName) {
        super(tagName);
        if (tagName != null && "doc".equalsIgnoreCase(tagName)) {
            this.attr("xmlns", "https://hyperview.org/hyperview");
        }
    }

}
