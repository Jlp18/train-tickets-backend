package com.jalen.tts.service;

import java.math.BigDecimal;

import com.jalen.tts.bean.User;
import com.jalen.tts.model.ResultModel;

public interface UserService {
	public ResultModel addUser(User user);
	
	public User selectByUserName(String username);
	
	public User selectByUserId(BigDecimal u_id);
	
	public ResultModel updateUser(User user);
}
