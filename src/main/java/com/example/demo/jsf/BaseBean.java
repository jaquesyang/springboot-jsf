package com.example.demo.jsf;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by jaquesyang on 2017/7/5.
 */
public class BaseBean {
    protected FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }

    protected Application getApplication() {
        return getFacesContext().getApplication();
    }

    protected HttpSession getHttpSession(boolean bool) {
        Object session = getFacesContext().getExternalContext().getSession(bool);
        return (session == null) ? null : (HttpSession) session;
    }

    protected HttpSession getHttpSession() {
        return getHttpSession(true);
    }

    protected HttpServletRequest getHttpServletRequest() {
        return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
    }

    protected HttpServletResponse getHttpServletResponse() {
        return (HttpServletResponse) (getFacesContext().getExternalContext().getResponse());
    }
}
