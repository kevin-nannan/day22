package com.zck.day29;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyGenericServlet implements Servlet{

        @Override
        public void destroy() {
                // TODO �Զ����ɵķ������
                
        }

        @Override
        public ServletConfig getServletConfig() {
                // TODO �Զ����ɵķ������
                return null;
        }

        @Override
        public String getServletInfo() {
                // TODO �Զ����ɵķ������
                return null;
        }

        @Override
        public void init(ServletConfig config) throws ServletException {
                // TODO �Զ����ɵķ������
                
        }

        @Override
        public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
                // TODO �Զ����ɵķ������
                
        }

}
