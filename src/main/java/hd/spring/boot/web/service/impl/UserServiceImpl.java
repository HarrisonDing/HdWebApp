package hd.spring.boot.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import hd.spring.boot.web.service.UserServiceI;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void createUser(String name, Integer age) {
		System.out.println("name: " + name + ", age: " + age);
		jdbcTemplate.update("insert into users values(null,?,?);", name, age);
		// jdbcTemplate.update("insert into users(name, age) values(?,?);", name, age);
	}

}
