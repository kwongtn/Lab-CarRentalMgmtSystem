package controller.manager;

import java.util.Vector;

import model.Car;
public class CarManager{

	private static Vector<Car> cars = new Vector<>();

	public static int addCar(Car car){
		return cars.add(car) ? car.getCarID() : 0;
	}

	public static int updateCar(Car car){
		int index = -1;

		for (int i = 0; i < cars.size(); i++){
			Car temp = cars.get(i);

			if(temp != null && (temp.getCarID() == car.getCarID())){
				cars.set(index, car);
				index = i;

				break;
			}
		}

		return index;
	}

	public static int deleteCar(int carID){
		int index = -1;

		for (int i = 0; i < cars.size(); i++){
			Car temp = cars.get(i);

			if(temp != null && (temp.getCarID() == carID)){
				// cars[i] = null;
				index = i;

				break;
			}
		}

		return cars.remove(index) != null ? 1 : 0;
	}

	public static Vector<Car> getCars(){
		return new Vector<>(cars);
	}
	
	public static Vector<Car> getCars(double maxPrice){
		Vector<Car> temp = new Vector<>();
		for(Car car : cars) {
			if(car.getPrice() < maxPrice) {
				temp.add(car);
			}
		}
		
		return temp;
	}

	public static Vector<Car> getCars(int minCapacity){
		Vector<Car> temp = new Vector<>();
		for(Car car : cars) {
			if(car.getCapacity() < minCapacity) {
				temp.add(car);
			}
		}
		
		return temp;
	}
	
	public static Vector<Car> getCars(boolean auto){
		Vector<Car> temp = new Vector<>();
		for(Car car : cars) {
			if(car.isAuto() == auto) {
				temp.add(car);
			}
		}
		
		return temp;
	}
	
	public static Vector<Car> getCars(String model){
		Vector<Car> temp = new Vector<>();
		for(Car car : cars) {
			if(car != null && car.getModel().toLowerCase().contains(model.toLowerCase())) {
				temp.add(car);
			}
		}
		
		return temp;
	}
	
	public static Car getCar(int carID){
		Car temp = null;
		
		for(Car car : cars) {
			if (car.getCarID() == carID) {
				temp = car;
				break;
			}
		}
		
		return temp;
	}
	
}