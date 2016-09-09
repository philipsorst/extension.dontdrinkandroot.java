/**
 * Copyright (C) 2012-2014 Philip W. Sorst <philip@sorst.net>
 * and individual contributors as indicated
 * by the @authors tag.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.dontdrinkandroot.extension.wicket.headeritem;

import org.apache.wicket.ajax.WicketEventJQueryResourceReference;
import org.apache.wicket.markup.head.HeaderItem;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.JavaScriptUrlReferenceHeaderItem;

import java.util.Collections;
import java.util.List;


public class ExternalJQueryUiJsHeaderItem extends JavaScriptUrlReferenceHeaderItem
{
    public ExternalJQueryUiJsHeaderItem(boolean defer)
    {
        super("http://code.jquery.com/ui/1.9.2/jquery-ui.js", "jqueryui.base", defer, null, null);
    }

    @Override
    public List<HeaderItem> getDependencies()
    {
        final HeaderItem jQuery = JavaScriptHeaderItem.forReference(WicketEventJQueryResourceReference.get());

        return Collections.singletonList(jQuery);
    }
}