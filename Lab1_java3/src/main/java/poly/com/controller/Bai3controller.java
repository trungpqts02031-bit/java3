package poly.com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet({"/bai3", "/nv/insert", "/nv/update", "/nv/delete", "/nv/find"})
public class Bai3controller extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("bai3.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url=req.getRequestURI();
		if(url.contains("/nv/insert"))
		{
			resp.getWriter().print("<h1>insert data<h1>");
		}
		else if (url.contains("nv/update"))
			resp.getWriter().print("<h1>update<h1>");
		else if (url.contains("/nv/delete"))
			resp.getWriter().print("<h1>delete <h1>");
		else
			resp.getWriter().print("<h1>find ...<h1>");
		
	}
	
	
}
