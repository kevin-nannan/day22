package com.zck.day29;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ForwardServlet extends HttpServlet {
        /**
         * 
         */
        private static final long serialVersionUID = 1L;

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                System.out.println("ForwardServlet's doGet");
        
                String path="TestServlet";
                RequestDispatcher requestDispatcher =req.getRequestDispatcher("/"+path);
                requestDispatcher.forward(req, resp);
                
                
        } 
}
