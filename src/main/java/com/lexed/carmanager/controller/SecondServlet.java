package com.lexed.carmanager.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lexed.carmanager.database.pojo.bean.UserPrim;

import net.minidev.json.JSONObject;

public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		// 如果是重置密码userid
		UserPrim userPrim = (UserPrim)session.getAttribute("userPrim");
		
		Integer userid = (Integer)session.getAttribute("userid");
		
		System.out.println("userPrim"+userPrim);
		JSONObject jsonObj= new JSONObject();
		if(userPrim != null){
			jsonObj.put("uesrname", userPrim.getUesrname());
			jsonObj.put("primary", userPrim.getPrimary());
			jsonObj.put("status", userPrim.getStatus());
			jsonObj.put("msg", userPrim.getMsg());
		}else if(userPrim == null){ // 没有用户权限信息  userid>0
			jsonObj.put("status", 2);
		}
		
		if(userid != null && userid > 0){ // 如果需要重置密码  userid 大于0 
			System.out.println("userid"+ userid);
			jsonObj.put("userid", userid);
		}
		
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().println(jsonObj.toJSONString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
