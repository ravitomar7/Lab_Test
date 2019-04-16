package com.tm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



public class Addservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void service(HttpServletRequest req, HttpServletResponse rep) throws IOException
   {
	   int num1=Integer.parseInt(req.getParameter("number1"));
	   int num2=Integer.parseInt(req.getParameter("number2"));
	   PrintWriter out=rep.getWriter();
	   out.print(num1+num2);
   }

}
