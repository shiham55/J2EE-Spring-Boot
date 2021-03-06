package ey.digital.j2eedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class J2eedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(J2eedemoApplication.class, args);
	}

	/*
	 * @GetMapping("/") public String home() {
	 * 
	 * Developer dev = context.getBean(Developer.class);
	 * 
	 * return dev.getLaptop().GetStatus(); }
	 * 
	 * @GetMapping("/hello") public String hello(@RequestParam(value = "name",
	 * defaultValue = "World") String name) { return String.format("Hello %s!",
	 * name); }
	 */
}
