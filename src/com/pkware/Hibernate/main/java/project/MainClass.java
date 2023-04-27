package project;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import project.entity.Car;
import project.entity.Colour;
import project.impl.ColourImpl;
import project.impl.Implementation;

public class MainClass {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Implementation impl= new Implementation();
		ColourImpl colImpl= new ColourImpl();
		
//		colImpl.addColour(new Colour(101,"Red"), factory);
//		colImpl.addColour(new Colour(102,"Blue"), factory);
//		
//		
//		impl.addCar(new Car("Swift","Hatchback",4),new Colour(101,"Red"), factory);
		impl.addCar(new Car("Venue","Mid-Suv",5),new Colour(103,"Green") , factory);
//		impl.addCar(new Car("Fortuner","Suv",7), factory);
//		
//		impl.listCar(factory);
//		
//		impl.updateCar(1,"Swift zxi",factory);
//		
//		impl.deleteCar(3,factory);
//		
//		impl.listCar(factory);
		
		factory.close();
	}
}
