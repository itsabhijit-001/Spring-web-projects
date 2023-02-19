
import java.util.List;

import org.antwalk.Dao.CarDaoImpl;
import org.antwalk.Model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		CarDaoImpl car = context.getBean("CarDaoImpl", CarDaoImpl.class);
		System.out.println("Adding Car Records");
		
		  car.create("Bugatti", 3000000); 
		  car.create("BMW", 2000000);
		  car.create("Merc", 6000000);
		  car.create("Tata", 700000);
		 

		System.out.println("List of cars :  ");
		List<Car> cars = car.listCar();
		for (Car val : cars) {
			System.out.println("Id:" + val.getId());
			System.out.println("Brand:" + val.getBrand());
			System.out.println("Price:" + val.getPrice());
		}
	}
}
