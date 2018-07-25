package hd.spring.boot.web.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object> exceptionHandler() {
		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("Code ", "500");
		hashMap.put("Msg", "You make a mistake ...");
		return hashMap;
	}
}
