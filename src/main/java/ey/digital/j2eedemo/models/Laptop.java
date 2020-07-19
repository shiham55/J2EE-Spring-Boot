package ey.digital.j2eedemo.models;

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

	public String GetStatus() {
		return "Active";
	}
}
