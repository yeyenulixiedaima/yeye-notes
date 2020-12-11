package com.lexed.carmanager.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lexed.carmanager.service.DriverService;

import net.minidev.json.JSONObject;


public class RePassword extends HttpServlet {
	
	private DriverService driverService = new DriverService();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idStr = request.getParameter("id");
		String password = request.getParameter("password");

		JSONObject jsonObj= new JSONObject();
		int id = Integer.parseInt(idStr);
		int re = driverService.repwd(id, password);
		
		
		jsonObj.put("re", re);
		
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().println(jsonObj.toJSONString());
	}

}
