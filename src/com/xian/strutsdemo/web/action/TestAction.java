package com.xian.strutsdemo.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class TestAction extends Action {
	private Logger logger = Logger.getLogger(TestAction.class);
	
	public TestAction() {
		logger.info("TestAction被实例化！");
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setAttribute("msg", "你好！struts");
		
		return mapping.findForward("success");
	}
	
}
