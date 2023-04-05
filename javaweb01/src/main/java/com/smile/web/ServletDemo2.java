package com.smile.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns= "/demo2")
public class ServletDemo2 implements Servlet {
    private ServletConfig servletConfig;
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig=servletConfig;
    }
    public ServletConfig getServletConfig() {

        return servletConfig ;
    }


    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello world! xiaolala ");
    }





    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
