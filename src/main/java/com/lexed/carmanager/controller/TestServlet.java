package com.lexed.carmanager.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lexed.carmanager.database.mapping.CarstatusMapper;
import com.lexed.carmanager.database.pojo.Carstatus;
import com.lexed.carmanager.database.pojo.bean.UserPrim;
import com.lexed.carmanager.database.test.Application;
import com.lexed.carmanager.service.DriverService;

import net.minidev.json.JSONArray;

public class TestServlet extends HttpServlet {
	
	//CarstatusMapper carstatusMapper = Application.openSession().getMapper(CarstatusMapper.class);
	
	DriverService driverService = new DriverService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//List<Carstatus> carstatus = carstatusMapper.selectAll();
		//JSONArray jsonArray = new JSONArray();
		//jsonArray.addAll(carstatus);
		
		String uesrname = request.getParameter("uesrname");
		String password = request.getParameter("password");
		String re = driverService.login(uesrname, password);
		
		ObjectMapper objMapper = new ObjectMapper();
		UserPrim userPrim = objMapper.readValue(re, UserPrim.class);
		System.out.println(userPrim);
		// 登录成功
		if(userPrim.getStatus() == 1){
			// 将信息存放在session中
			HttpSession session = request.getSession();
			session.setAttribute("userPrim", userPrim);
		}
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().println(re);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}
