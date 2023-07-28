package com.chberndt.liferay.control.menu.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Christian Berndt
 */
@Component(
	property = {
		"javax.portlet.name=com_liferay_layout_admin_web_portlet_GroupPagesPortlet",
		"mvc.command.name=/namespace/action"
	},
	service = MVCActionCommand.class
)
public class CustomMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		_log.info("doProcessAction()");
	}

	private static Log _log = LogFactoryUtil.getLog(
		CustomMVCActionCommand.class);

}