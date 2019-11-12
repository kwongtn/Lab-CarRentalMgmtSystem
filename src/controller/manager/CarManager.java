package controller.manager;

import java.util.Vector;

import model.Car;
public class CarManager{

	private static Vector<Car> cars = new Vector<>();

	public static int addCar(Car car){
//		int index = -1;
//
//		for (int i = 0; i < cars.length; i++){
//			Car temp = cars[i];
//
//			if(temp == null){
//				cars[i] = car;
//				index = i;
//
//				break;
//			}
//		}
//
//		return index;
		
		
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

	public static Car[] searchByCapacity(int capacity){
		return null;
	}

	// Display all cars
	public static void displayCars(){
		for (Car car : cars){
			if(car != null){
				displayCar(car);
			}
		}
	}

	public static void displayCar(int carID){
		for (Car car : cars){
			if(car != null && car.getCarID() == carID){
				displayCar(car);
			}
		}
	}

	public static void displayCars(double maxPrice){
		for (Car car : cars){
			if(car != null && car.getPrice() < maxPrice){
				displayCar(car);
			}
		}
	}

	public static void displayCars(int minCapacity){
		for (Car car : cars){
			if(car != null && car.getCapacity() >= minCapacity){
				displayCar(car);
			}
		}
	}

	public static void displayCars(boolean transmissionSearch){
		for (Car car : cars){
			if(car != null && car.isAuto() == transmissionSearch){
				displayCar(car);
			}
		}
	}

	public static void displayCars(String model){
		for (Car car : cars){
			if (car != null && car.getModel().toLowerCase().contains(model.toLowerCase())){
				displayCar(car);
			}
		}
	}

	private static void displayCar(Car car){
		System.out.println("========================================");
		System.out.println("Car ID: " + car.getCarID());
		System.out.println("Plate No.: " + car.getPlateNo());
		System.out.println("Model:" + car.getModel());
		System.out.println("Price: RM " + car.getPrice());
		System.out.println("Is Auto:" + car.isAuto());
		System.out.println("Is Usable:" + car.isUsable());
		System.out.println("Capacity:" + car.getCapacity());
		System.out.println();
	}
}