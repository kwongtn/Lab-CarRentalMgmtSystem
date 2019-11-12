package view;

import java.util.Scanner;

import controller.manager.CarManager;
import model.Car;

public class CarView extends View {

	public void displayOptions() {
		System.out.println("Manage Cars");
		System.out.println("YEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEET");
		System.out.println("1 \t Add Car");
		System.out.println("2 \t Update Car");
		System.out.println("3 \t Delete Car");
		System.out.println("4 \t Display All Cars");
		System.out.println("5 \t Display cars by maximum price");
		System.out.println("6 \t Display cars by minimum capacity");
		System.out.println("7 \t Display cars by transmission");
		System.out.println("8 \t Display cars by model");
		System.out.println("9 \t Display cars by single car");
		System.out.println("0 \t Back to main menu");
	}

	public void processOption(Scanner scanner, int choice) {
		if (choice == 1) {
			Car car = new Car();

			scanner.nextLine();

			System.out.println("Please enter the car details: ");

			System.out.println("Plate No.: ");
			car.setPlateNo(scanner.nextLine());

			System.out.println("Model: ");
			car.setModel(scanner.nextLine());

			System.out.println("Price: RM ");
			car.setPrice(scanner.nextDouble());

			System.out.println("Auto: ");
			car.setAuto(scanner.nextBoolean());

			System.out.println("Usable: ");
			car.setUsable(scanner.nextBoolean());

			System.out.println("Capacity: ");
			car.setCapacity(scanner.nextInt());

			if(CarManager.addCar(car) != 0){
				System.out.println("Succesfull added a new car.");
			} else {
				System.err.println("Unable to add a new car.");
			}
		} else if (choice == 4){
			CarManager.displayCars();
		}
	}
}