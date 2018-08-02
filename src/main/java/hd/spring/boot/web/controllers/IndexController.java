package hd.spring.boot.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String getIndex(ModelMap map) {
		map.put("user", "Big Joe");
		map.put("sex", 1);

		List<String> userList = new ArrayList<>();
		userList.add("DING one");
		userList.add("DING two");
		userList.add("DING three");

		map.put("userList", userList);
		return "index";
	}

	@RequestMapping("/jspind")
	public String jspind() {
		return "jspind";
	}
}
