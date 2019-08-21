package com.jalen.tts.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.jalen.tts.authorization.manager.TokenManager;
//import com.jalen.tts.authorization.model.TokenModel;
import com.jalen.tts.bean.User;
import com.jalen.tts.model.ResultModel;
import com.jalen.tts.model.ResultStatus;
import com.jalen.tts.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
//	@Autowired
//	private TokenManager tokenManager;
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	@CrossOrigin
	public ResponseEntity<ResultModel> register(User user){
		ResultModel result = userService.addUser(user);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	

	@RequestMapping(value="/login", method=RequestMethod.POST)
	@CrossOrigin
	public ResponseEntity<ResultModel> login(String password, String username){
		System.out.println("username:"+username);
		if(null == username || null == password) {
			return new ResponseEntity<ResultModel>(ResultModel.error(ResultStatus.DATA_NOT_NULL), HttpStatus.BAD_REQUEST);
		}
		User user = this.userService.selectByUserName(username);
		if(null == user) {  //未注册
			return new ResponseEntity<ResultModel>(ResultModel.error(ResultStatus.USER_NOT_FOUND), HttpStatus.NOT_FOUND);
		}
		if(!user.getPassword().equals(password)) {
			return new ResponseEntity<ResultModel>(ResultModel.error(ResultStatus.USERNAME_OR_PASSWORD_ERROR), HttpStatus.NOT_FOUND);
		}
		
		//登录成功生成一个token
		//TokenModel model = this.tokenManager.createToken(user.getUserId().intValue());
		return new ResponseEntity<>(ResultModel.ok(user), HttpStatus.OK);
	}
	
	@RequestMapping(value="/getUserInfo", method=RequestMethod.POST)
	public ResponseEntity<ResultModel> login(BigDecimal userid){
		System.out.println("userid:"+ userid);
		User user = this.userService.selectByUserId(userid);
		
		return new ResponseEntity<>(ResultModel.ok(user), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/updateUserInfo", method = RequestMethod.POST)
    public ResponseEntity<ResultModel> updateUser(User user) {
        ResultModel resultModel = this.userService.updateUser(user);

        if (resultModel.getCode() == -1002) {
            return new ResponseEntity<ResultModel>(resultModel, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<ResultModel>(resultModel, HttpStatus.OK);
    }
}
