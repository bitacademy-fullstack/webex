package com.jx372.webex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gc")
public class GetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		
		response.setContentType( "text/html; charset=utf-8" ); 
		PrintWriter out = response.getWriter();
		
		if( cookies == null ) {
			out.println( "no cookie" );
		} else {
			for( Cookie cookie : cookies ) {
				out.print( cookie.getName() + ":" + cookie.getValue() );
				out.print( "<br>");
			}
		}
	
	}


}
