package ey.digital.j2eedemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private int id;
	private int model;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	
}
