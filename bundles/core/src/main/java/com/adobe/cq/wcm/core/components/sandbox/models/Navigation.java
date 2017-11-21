/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2017 Adobe Systems Incorporated
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.wcm.core.components.sandbox.models;

import javax.annotation.Nonnull;
import java.util.List;

import com.adobe.cq.export.json.ComponentExporter;

/**
 * Defines the {@code Navigation} Sling Model used for the {@code /apps/core/wcm/components/navigation} component.
 *
 * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
 */
public interface Navigation extends ComponentExporter {

    /**
     * Name of the resource / configuration policy property that defines the site's navigation root for which to build the navigation tree.
     * The property should provide a String value.
     *
     * @since com.adobe.cq.wcm.core.components.sandbox.models 6.0.0
     */
    String PN_NAVIGATION_ROOT = "navigationRoot";

    /**
     * Name of the resource / configuration policy property that defines if the resulted navigation tree should skip including the
     * navigation root, but include its children. The property should provide a Boolean value ({@code true} if the site root should be
     * omitted, {@code false} otherwise).
     *
     * @since com.adobe.cq.wcm.core.components.sandbox.models 6.0.0
     */
    String PN_SKIP_NAVIGATION_ROOT = "skipNavigationRoot";

    /**
     * Name of the resource / configuration policy property that defines if the resulted navigation tree should collect all child pages
     * of the configured {@link #PN_NAVIGATION_ROOT}. The property should provide a Boolean value. When this value property is set to
     * {@code true}, the {@link #PN_MAX_DEPTH} property will be ignored.
     *
     * @since com.adobe.cq.wcm.core.components.sandbox.models 6.0.0
     */
    String PN_COLLECT_ALL_PAGES = "collectAllPages";

    /**
     * Name of the resource / configuration policy property that defines the max depth level in the content tree, relative to the
     * {@link #PN_NAVIGATION_ROOT}, where items will be searched to build the navigation tree. The property should provide a Long value.
     *
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    String PN_MAX_DEPTH = "maxDepth";

    /**
     * Returns the list of navigation items.
     *
     * @return a list of navigation items
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    default List<NavigationItem> getItems() {
        throw new UnsupportedOperationException();
    }

    /**
     * @since com.adobe.cq.wcm.core.components.sandbox.models 3.1.0
     */
    @Nonnull
    @Override
    default String getExportedType() {
        throw new UnsupportedOperationException();
    }

}
