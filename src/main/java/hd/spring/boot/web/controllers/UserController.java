package hd.spring.boot.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hd.spring.boot.web.mapper.UserMapper;
import hd.spring.boot.web.model.UserEntity;
import hd.spring.boot.web.service.UserServiceI;

@RestController
public class UserController {

	@Autowired
	private UserServiceI	userService;

	@Autowired
	private UserMapper		userMapper;

	@RequestMapping("/restIndex")
	public String restIndex() {
		userService.createUser("Harrison-" + System.currentTimeMillis(), 18);
		return "success";
	}
<<<<<<< .mine

	// http://localhost:8080/getuser?name=Harrison-1533392050650
	@ResponseBody
	@RequestMapping("/getuser")
	public UserEntity getUser(String name) {
		return userMapper.findUser(name);
	}
=======

	@ResponseBody
	@RequestMapping("/getuser")
	public UserEntity getUser(String name) {
		return userMapper.findUser(name);
	}

>>>>>>> .theirs
}
