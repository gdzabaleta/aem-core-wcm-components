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

import java.util.List;

/**
 * Defines the {@code Breadcrumb} Sling Model used for the {@code /apps/core/wcm/components/navigation} component.
 *
 * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
 */
public interface Navigation {

    /**
     * Name of the resource / configuration policy property that defines the site's root for which to build the navigation tree. The
     * property should provide a String value.
     *
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    String PN_SITE_ROOT = "siteRoot";

    /**
     * Name of the resource / configuration policy property that defines the start level of the website's root relative to the absolute
     * root folder. The property should provide a Long value.
     *
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    String PN_CONTENT_START_LEVEL = "startLevel";

    /**
     * Name of the resource / configuration policy property that defines the max depth in the content tree where items will be
     * searched for to build the navigation tree. The property should provide a Long value.
     *
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    String PN_MAX_DEPTH = "maxDepth";

    /**
     * Name of the resource / configuration policy property that defines if the collected items should only be from the current page's
     * tree structure (i.e. only child pages that have a common parent with the current page).
     *
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.2.0
     */
    String PN_CURRENT_PAGE_TREE_ONLY = "currentPageTreeOnly";

    /**
     * Returns the list of navigation items.
     *
     * @return a list of navigation items
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    default List<NavigationItem> getItems() {
        throw new UnsupportedOperationException();
    }

}
