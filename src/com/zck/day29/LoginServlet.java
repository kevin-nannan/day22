package com.zck.day29;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginServlet implements Servlet{

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
        public void service(ServletRequest req, ServletResponse res) 
                        throws ServletException, IOException {
                // TODO �Զ����ɵķ������
                System.out.println("��Ϣ����");
                String user=req.getParameter("user");
                String password=req.getParameter("password");
                System.out.println(user+","+password);
                
                
                String [] inters=req.getParameterValues("inter");
                for(String interest:inters) {
                        System.out.println(interest);
                }
                
                Enumeration<String> names=req.getParameterNames();
                while(names.hasMoreElements()) {
                        String name=names.nextElement();
                        String value=req.getParameter(name);
                        System.out.println(name+"---"+value);
                }
                
                Map<String,String[]> map=req.getParameterMap();
                for(Map.Entry<String, String[]> entry:map.entrySet()) {
                        System.out.println("**"+entry.getKey()+":"+Arrays.asList(entry));
                }
//                res.setContentType("application/msword");������Ӧ�����ͣ���helloword���Ϊword
                
                
                PrintWriter out=res.getWriter();
                out.println("helloworld...");
                
        }
        public LoginServlet() {
                System.out.print("11");
        }
}
