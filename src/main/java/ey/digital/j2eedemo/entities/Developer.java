package ey.digital.j2eedemo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Developer {

	@Id
	private int id;
	private String name;
	private String tech;

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
