package org.wso2.carbon.sp.mgt.workflow.internal;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.identity.application.mgt.listener.AbstractApplicationMgtListener;
import org.wso2.carbon.identity.application.mgt.listener.ApplicationMgtListener;
import org.wso2.carbon.identity.workflow.mgt.extension.WorkflowRequestHandler;
import org.wso2.carbon.sp.mgt.workflow.impl.SPCreateHandler;
import org.wso2.carbon.sp.mgt.workflow.impl.SPWorkflowListener;

/**
 * @scr.component name="tenant.mgt.workflow" immediate="true"
 */
public class SPWorkflowServiceComponent {

    protected void activate(ComponentContext context) {

        BundleContext bundleContext = context.getBundleContext();
        bundleContext.registerService(ApplicationMgtListener.class.getName(), new SPWorkflowListener(), null);
        bundleContext.registerService(WorkflowRequestHandler.class.getName(), new SPCreateHandler(), null);
    }
}
