package com.accolite.mini_au.maven.servlet;
import com.accolite.mini_au.maven_app.App;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.accolite.mini_au.maven_app.*;

public class MavenServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out =resp.getWriter();
		for(String s:App.returnList())
		{
			System.out.println(s);
			out.write(s+"\n");
		}
	}
	
}
