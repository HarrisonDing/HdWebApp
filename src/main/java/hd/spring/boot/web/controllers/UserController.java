package hd.spring.boot.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hd.spring.boot.web.service.UserServiceI;

@RestController
public class UserController {

	@Autowired
	private UserServiceI userService;

	@RequestMapping("/restIndex")
	public String restIndex() {
		userService.createUser("Harrison-" + System.currentTimeMillis(), 18);
		return "success";
	}
}
