package com.lexed.carmanager.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lexed.carmanager.database.pojo.Driver;
import com.lexed.carmanager.service.DriverService;

public class AddUserServlet extends HttpServlet {
	
	private DriverService driverService = new DriverService();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dname = request.getParameter("dname");
		String dsex = request.getParameter("dsex");
		String idcard = request.getParameter("idcard");
		String ctype = request.getParameter("ctype");
		String dstatus = request.getParameter("dstatus");
		String uesrname = request.getParameter("uesrname");
		String primary = request.getParameter("primary");
		
		Driver driver =new Driver();
		driver.setDname(dname);
		driver.setDsex(dsex);
		driver.setIdcard(idcard);
		driver.setCtype(ctype);
		driver.setDstatus(dstatus);
		driver.setUesrname(uesrname);
		driver.setPrimary(primary);
		
		System.out.println(driverService.adduser(driver));
		
		response.getWriter().append("ok");
		
	}

}
