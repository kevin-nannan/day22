package com.zck.day29;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Helloservlet implements Servlet{

        @Override
        public void destroy() {
                // TODO 自动生成的方法存根
                System.out.println("destroy");
                
        }

        @Override
        public ServletConfig getServletConfig() {
                System.out.println("ServletConfig");
                return null;
        }

        @Override
        public String getServletInfo() {
                System.out.println("getServletInfo()");
                return null;
        }

        @Override
        public void init(ServletConfig arg0) throws ServletException {
                System.out.println("init");
                
        }

        @Override
        public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
                System.out.println("service");
                
        }
        public  Helloservlet() {
                System.out.println("123helloServlet constructor....");
        }
        
}
