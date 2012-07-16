/*
 * Copyright 2012 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.drools.guvnor.client.workbench.widgets.events;

import org.drools.guvnor.client.workbench.WorkbenchPart;

/**
 * An event when a WorkbenchPart looses focus
 */
public class WorkbenchPartLostFocusEvent {

    private final WorkbenchPart deselectedWorkbenchPart;

    public WorkbenchPartLostFocusEvent(final WorkbenchPart deselectedWorkbenchPart) {
        this.deselectedWorkbenchPart = deselectedWorkbenchPart;
    }

    public WorkbenchPart getDeselectedWorkbenchPart() {
        return deselectedWorkbenchPart;
    }

}