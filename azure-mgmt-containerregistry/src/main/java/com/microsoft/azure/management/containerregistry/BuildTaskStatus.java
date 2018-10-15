/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for BuildTaskStatus.
 */
public final class BuildTaskStatus extends ExpandableStringEnum<BuildTaskStatus> {
    /** Static value Disabled for BuildTaskStatus. */
    public static final BuildTaskStatus DISABLED = fromString("Disabled");

    /** Static value Enabled for BuildTaskStatus. */
    public static final BuildTaskStatus ENABLED = fromString("Enabled");

    /**
     * Creates or finds a BuildTaskStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding BuildTaskStatus
     */
    @JsonCreator
    public static BuildTaskStatus fromString(String name) {
        return fromString(name, BuildTaskStatus.class);
    }

    /**
     * @return known BuildTaskStatus values
     */
    public static Collection<BuildTaskStatus> values() {
        return values(BuildTaskStatus.class);
    }
}
