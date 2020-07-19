package ey.digital.j2eedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
