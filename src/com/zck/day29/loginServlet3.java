package com.zck.day29;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet3 extends HttpServlet{
        /**
         * 
         */
        private static final long serialVersionUID = 1L;

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                String username=req.getParameter("username");
                String password=req.getParameter("password");
                
                String sql="Select count(id) From user where username=?" +
                "and password=?";
                Connection connection=null;
                PreparedStatement statement=null;
                ResultSet resultSet=null;
                PrintWriter out = resp.getWriter();
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                       connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatab" 
                                + "ase?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true"
                                + "&useLegacyDatetimeCode=false&serverTimezone=UTC","root","zck9522zck");
                        statement =connection.prepareStatement(sql);
                        statement.setString(1, username);
                        statement.setString(2, password);
                        
                        resultSet=statement.executeQuery();
                        
                        if(resultSet.next()) {
                                int count =resultSet.getInt(1);
                                if(count>0) {
                                      out.print("Heloo:"+username);  
                                }else {
                                        out.print("Sorry:"+username);
                                }
                                
                        }
                        
                } catch (ClassNotFoundException e) {
                        // TODO 自动生成的 catch 块
                        e.printStackTrace();
                } catch (SQLException e) {
                        // TODO 自动生成的 catch 块
                        e.printStackTrace();
                }finally {
                        if(resultSet!=null) {
                                try {
                                        statement.close();
                                } catch (SQLException e) {
                                        // TODO 自动生成的 catch 块
                                        e.printStackTrace();
                                }
                        }
                }
                
        } 
}
