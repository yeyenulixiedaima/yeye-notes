package com.lexed.carmanager.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lexed.carmanager.database.mapping.DriverMapper;
import com.lexed.carmanager.database.pojo.Driver;
import com.lexed.carmanager.database.test.Application;

import net.minidev.json.JSONObject;

public class DriverService {
	
	
	// 登录方法
	public String login(String uesrname, String password){
		SqlSession sqlSession = Application.openSession();
		DriverMapper driverMapper = sqlSession.getMapper(DriverMapper.class);
		

		Driver driver = driverMapper.selectByUesrname(uesrname);
	
		
		JSONObject json = new JSONObject();
		
		if(driver != null && (driver.getPassword() == null || "".equals(driver.getPassword().trim()))){
			json.put("status", 0);
			json.get(driver.getId());
			json.put("msg", "初始化密码");
		}else if(driver != null && driver.getPassword().equals(password)){
			json.put("status", 1);
			json.put("msg", "登录成功");
			json.put("uesrname", driver.getUesrname());
			json.put("primary", driver.getPrimary());
		}else{
			json.put("status", 2);
			json.put("msg", "用户名或密码错误");
		}
		sqlSession.close();
		return json.toJSONString();
	}
	
	public int repwd(int id,String password){
		SqlSession sqlSession = Application.openSession();
		DriverMapper driverMapper = sqlSession.getMapper(DriverMapper.class);
		Driver driver = new Driver();
		driver.setId(id);
		driver.setPassword(password);
		int re = driverMapper.updateByPrimaryKeySelective(driver);
		sqlSession.close();
		return re;
		
	} 
	
	public List<Driver> showAll(){
		SqlSession sqlSession = Application.openSession();
		DriverMapper driverMapper = sqlSession.getMapper(DriverMapper.class);
		Driver driver = new Driver();
		List<Driver> list = driverMapper.selectAll();
		sqlSession.close();
		return list;
	}
	
	public int adduser(Driver driver){
		SqlSession sqlSession = Application.openSession();
		DriverMapper driverMapper = sqlSession.getMapper(DriverMapper.class);
		int re = driverMapper.insertSelective(driver);
		sqlSession.close();
		return re;	
	}

}
