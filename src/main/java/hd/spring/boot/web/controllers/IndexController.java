package hd.spring.boot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String getIndex(ModelMap map) {
		map.put("user", "Big Joe");
		return "index";
	}
}
