package com.lexed.carmanager.database.pojo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPrim {
	
	private int id;
	private String uesrname;
	private String primary;
	private String msg;
	private int status;

}
