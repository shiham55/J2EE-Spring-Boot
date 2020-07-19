package ey.digital.j2eedemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ey.digital.j2eedemo.dao.DeveloperRepo;
import ey.digital.j2eedemo.entities.Developer;

@Controller
public class DeveloperController {

	@Autowired
	DeveloperRepo devRepo;

	@RequestMapping("/adddeveloper")
	public String adddeveloper() {
		return "adddeveloper";
	}

	@PostMapping("/adddeveloper")
	public String adddeveloper(Developer dev) {
		devRepo.save(dev);
		return "adddeveloper";
	}

	@RequestMapping("/getdeveloper")
	public String getdeveloper() {
		return "getdeveloper";
	}

	@PostMapping("/getdeveloper")
	public ModelAndView getdeveloper(int id) {

		ModelAndView mv = new ModelAndView("getdeveloper");
		Developer dev = devRepo.findById(id).orElse(new Developer());
		mv.addObject("dev", dev);
		return mv;
	}

	// API methods
	@RequestMapping("/api/developers")
	@ResponseBody
	public List<Developer> getdevs() {
		return devRepo.findAll();
	}

	@RequestMapping("/api/developers/{id}")
	@ResponseBody
	public Optional<Developer> getdev(@PathVariable("id") int id) {
		return devRepo.findById(id);
	}
}
