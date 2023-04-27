package project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Colour {

	@Id
	private int colourId;
	private String clourName;
	public Colour(int colourId, String clourName) {
		super();
		this.colourId = colourId;
		this.clourName = clourName;
	}
	public int getColourId() {
		return colourId;
	}
	public void setColourId(int colourId) {
		this.colourId = colourId;
	}
	public Colour() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getClourName() {
		return clourName;
	}
	public void setClourName(String clourName) {
		this.clourName = clourName;
	}
	
	
}
