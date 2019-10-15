package com.naveen;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.naveen.services.AddService;

@Controller
public class Add
{
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
	{
		int a = Integer.parseInt(request.getParameter("f1"));
		int b = Integer.parseInt(request.getParameter("f2"));
			
		int result = new AddService().add(a, b);

		System.out.println("control reached to the controller"+a+"  "+b);
		ModelAndView m = new ModelAndView();
		m.setViewName("resultpage");
		m.addObject("result",result);
		
		
		return m;
	}
}