package com.jx372.webex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/table")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String row = request.getParameter( "r" );
		if( row == null || row.matches("-?\\d+(\\.\\d+)?") == false) {
			row = "0";
		}
		int nRow = Integer.parseInt( row );
		
		String col = request.getParameter( "c" );
		if( col == null || col.matches("-?\\d+(\\.\\d+)?") == false) {
			col = "0";
		}
		int nCol = Integer.parseInt( col );

		//응답시작
		response.setContentType( "text/html; charset=utf-8" );
		PrintWriter out = response.getWriter();

		out.println( "<table border='1px' cellpadding='10px' cellspacing='0'>" );
		for( int i = 0; i < nRow; i++ ) {
			
			out.println( "<tr>" );

			for( int j = 0; j < nCol; j++ ) {
				out.println( "<td>cell(" + i + "," + j + ")</td>" );
			}
			
			out.println( "</tr>" );
		}
		out.println( "</table>" );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
