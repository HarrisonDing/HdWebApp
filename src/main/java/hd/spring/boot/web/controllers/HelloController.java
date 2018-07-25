package hd.spring.boot.web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET, value = "/index", produces = "text/plain")
	public String index() {
		return "Hello World";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/null")
	public String exc() {
		int i = 1 / 0;
		return "Hello World";
	}

}
