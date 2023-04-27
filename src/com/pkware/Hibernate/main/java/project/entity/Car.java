package project.entity;

import javax.persistence.*;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID", nullable = false, unique = true, length = 5)
	private int id;
	public Car(String name, String type, int capacity) {
		super();
		this.name = name;
		this.type = type;
		this.capacity = capacity;
	}
	@Column(name = "Name", nullable = false, length = 15)
	private String name;
	@Column(name = "Type", nullable = false, length = 15)
	private String type;
	@Column(name = "Capacity", nullable = false, length = 15)
	private int capacity;
	
	@OneToOne
	private Colour colour;
	

	public Car(int id, String name, String type, int capacity, Colour colour) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.colour = colour;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
}
