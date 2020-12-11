package com.lexed.carmanager.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lexed.carmanager.database.pojo.bean.UserPrim;
import com.lexed.carmanager.service.DriverService;

public class LoginServlet extends HttpServlet {
	
	private DriverService driverService = new DriverService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		}else if(userPrim.getStatus() == 0){//初始化用户
			// 获取session
			HttpSession session = request.getSession();
			// 设置session属性userid
			session.setAttribute("userid", userPrim.getId());
		}
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().println(re);
	}

}
