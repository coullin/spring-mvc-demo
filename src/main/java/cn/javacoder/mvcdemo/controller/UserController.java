package cn.javacoder.mvcdemo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

import cn.javacoder.mvcdemo.factory.SimpleFactory;

@Controller
public class UserController {

	@RequestMapping(value="login")
	public void login(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		response.getWriter().write("welcome to javacoder.cn");
	}
	
	@RequestMapping(value="json")
	public String json(Map<String, Object> model) {
		model.put("name", "javacoder.cn");
		model.put("list", new ArrayList<String>());
		return "jsonView";
	}
	
	@RequestMapping(value="report")
	public String report(Map<String, Object> model){
		model.put("reportDataKey", SimpleFactory.test());
		return "simpleReport";
	}
}
