package com.jalen.tts.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jalen.tts.bean.User;
import com.jalen.tts.bean.UserExample;
import com.jalen.tts.dao.UserMapper;
import com.jalen.tts.model.ResultModel;
import com.jalen.tts.model.ResultStatus;
import com.jalen.tts.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	public User selectByUserId(BigDecimal u_id) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserIdEqualTo(u_id);
        List<User> users = this.userMapper.selectByExample(userExample);

        User user;
        try {
            user = users.get(0);
        } catch (Exception e) {
            return null;
        }
        return user;
    }
	
	public ResultModel addUser(User user) {
		
		//字段为空
		if(user.getUsername() == null || user.getPassword() == null) {
			return ResultModel.error(ResultStatus.DATA_NOT_NULL);
		}
		
		//用户已存在
		User newUser = this.selectByUserId(user.getUserId());
        if (null != newUser) {
            return ResultModel.error(ResultStatus.USERNAME_HAS_EXISTS);
        }
        
        //设置默认值
        if(user.getGender() == null) {
        	user.setGender(new BigDecimal('1'));
        }
        
        this.userMapper.insert(user);  //插入数据
		
        user = this.selectByUserId(user.getUserId());
		
		return ResultModel.ok(user); //可以返回用户信息，重新select
	}
	
	public User selectByUserName(String username) {
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<User> users = this.userMapper.selectByExample(userExample);
		
		User user;
		try {
			user = users.get(0);
		} catch (Exception e) {
			return null;
		}
		return user;
	}
	
	public ResultModel updateUser(User user) {
		
        User newUser = this.userMapper.selectByPrimaryKey(user.getUserId());

        // 找不到 user
        if (null == newUser) {
            return ResultModel.error(ResultStatus.USER_NOT_FOUND);
        }

        if (null != user.getPassword()) {
            newUser.setPassword(user.getPassword());
        }
        if (null != user.getPhone()) {
            newUser.setPhone(user.getPhone());
        }
        if (null != user.getGender()) {
            newUser.setGender(user.getGender());
        }
        if (null != user.getUsername()) {
            newUser.setUsername(user.getUsername());
        }
        if (null != user.getIdentityCard()) {
            newUser.setIdentityCard(user.getIdentityCard());
        }
        if (null != user.getAge()) {
            newUser.setAge(user.getAge());
        }

        this.userMapper.updateByPrimaryKey(newUser);

        return ResultModel.ok(newUser);
    }
}
