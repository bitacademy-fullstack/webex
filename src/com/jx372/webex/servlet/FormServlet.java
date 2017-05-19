package com.jx372.webex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding( "UTF-8" );
		response.setContentType( "text/html; charset=utf-8" ); 

		String no = request.getParameter( "no" );
		String email = request.getParameter( "email" );
		String password = request.getParameter( "password" );
		String birthYear = request.getParameter( "birth-year" );
		String gender = request.getParameter( "gender" );
		String[] hobbies = request.getParameterValues( "hobbies" );
		String selfIntro = request.getParameter( "self-intro" );
		
		PrintWriter out = response.getWriter();
		out.println( no );
		out.println( "<br>" );
		out.println( email );
		out.println( "<br>" );
		out.println( password );
		out.println( "<br>" );
		out.println( gender );
		out.println( "<br>" );
		if( hobbies != null ) {
			for( String hobby : hobbies ) {
				out.println( hobby + "," );
			}
		}
		out.println( "<br>" );
		out.println( selfIntro );
		out.println( "<br>" );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
