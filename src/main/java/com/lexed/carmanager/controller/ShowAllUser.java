package com.lexed.carmanager.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lexed.carmanager.database.pojo.Driver;
import com.lexed.carmanager.service.DriverService;

import net.minidev.json.JSONArray;

public class ShowAllUser extends HttpServlet {
	
	private DriverService driverService = new DriverService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Driver> list = driverService.showAll();
		response.setContentType("application/json;charset=utf-8");
		
		JSONArray jsonArray = new JSONArray();
		jsonArray.addAll(list);
		
		response.getWriter().print(jsonArray.toJSONString());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
