package com.jx372.webex.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sc")
public class SetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie 
			= new Cookie( "mycookie", "hello cookie");
		cookie.setPath( "/webex" );
		cookie.setMaxAge( 1 * 24 * 60 * 60 );
		
		response.addCookie( cookie );
		
		response.getWriter().println( "Baking Cookie!!" );
	}
}
