package com.x.portal.assemble.designer.jaxrs;

import javax.servlet.annotation.WebFilter;

import com.x.base.core.application.jaxrs.CipherManagerUserJaxrsFilter;

@WebFilter(urlPatterns = { "/servlet/portal/*" })
public class PortalServletFilter extends CipherManagerUserJaxrsFilter {

}
