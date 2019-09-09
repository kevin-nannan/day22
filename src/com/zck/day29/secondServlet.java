package com.zck.day29;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class secondServlet implements Servlet{

        @Override
        public void destroy() {
                // TODO 自动生成的方法存根
                
        }

        @Override
        public ServletConfig getServletConfig() {
                // TODO 自动生成的方法存根
                return null;
        }

        @Override
        public String getServletInfo() {
                // TODO 自动生成的方法存根
                return null;
        }

        @Override
        public void init(ServletConfig config) throws ServletException {
               ServletContext servletcontext =config.getServletContext();
               System.out.println(servletcontext.getInitParameter("driver"));
               
               Enumeration<String> names=servletcontext.getInitParameterNames();
               while(names.hasMoreElements()) {
                       String name=names.nextElement();
                       System.out.println(servletcontext.getInitParameter(name));
               }
               String realPath=servletcontext.getRealPath("/hello.jsp");
               System.out.println(realPath);
               
               ClassLoader classLoader=getClass().getClassLoader();
               InputStream is=classLoader.getResourceAsStream("jdbc.properties");
               System.out.println(is+"is1");
               
               InputStream is2=servletcontext.getResourceAsStream("/WEB-INF/classes/jdbc.properties");
               System.out.println(is2+"is2");
               
        }

        @Override
        public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
               System.out.println("Secondservlet service");
                
        }

}
