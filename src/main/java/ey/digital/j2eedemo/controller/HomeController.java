package ey.digital.j2eedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ey.digital.j2eedemo.models.Developer;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView home(Developer dev) {
		ModelAndView mv = new ModelAndView();

		mv.addObject("dev", dev);
		mv.setViewName("homepage");

		return mv;
	}
}
