package com.tm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


public class Factorial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void service(HttpServletRequest req,HttpServletResponse rep) throws IOException
    {
    	int fact=1;
    	
    	int num=Integer.parseInt(req.getParameter("number1"));
    	for(int i=num;i>=1;i--)
    	{
    		fact=fact*i;
    		
    	}
    	
    	PrintWriter out=rep.getWriter();
    	
    	out.print(fact);
    }

}
