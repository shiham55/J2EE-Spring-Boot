package ey.digital.j2eedemo.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ey.digital.j2eedemo.dao.DeveloperRepo;
import ey.digital.j2eedemo.entities.Developer;

@RestController
public class DeveloperApiController {

	@Autowired
	DeveloperRepo devRepo;

	@RequestMapping("/api/developers")
	public List<Developer> getdevs() {
		return devRepo.findAll();
	}

	@RequestMapping("/api/developers/{id}")
	public Optional<Developer> getdev(@PathVariable("id") int id) {
		return devRepo.findById(id);
	}
}
