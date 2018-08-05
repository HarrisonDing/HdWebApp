package hd.spring.boot.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hd.spring.boot.web.repository.JpaUserRepository;

@RestController
public class JpaUserController {

	@Autowired
	private JpaUserRepository userRepository;

	@RequestMapping("/jpauser")
	public String jpaUser(Integer id) {
		return userRepository.findById(id).toString();
	}
}
