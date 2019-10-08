public class CarRentalManagementSystem{
    public static void main(String args[]){
        CarManager carManager = new CarManager(8);
        

        Car car1 = new Car(1001);
        car1.setPlateNo("ABC 1234");
        car1.setModel("Perodua Kancil");
        car1.setAuto(false);
        car1.setUsable(true);
        car1.setCapacity(4);
        car1.setPrice(5);

        Car car2 = new Car(1003);
        car2.setPlateNo("DEF 5678");
        car2.setModel("Perodua Alza");
        car2.setAuto(true);
        car2.setUsable(true);
        car2.setCapacity(6);
        car2.setPrice(10);

        Car car3 = new Car(1005);
        car3.setPlateNo("GHI 9012");
        car3.setModel("Perodua Myvi");
        car3.setAuto(false);
        car3.setUsable(true);
        car3.setCapacity(4);
        car3.setPrice(8);

        if (carManager.addCar(car1) != 0){
            System.out.println("Car Added");
        } else {
            System.out.println("Car Cannot be Added.");
        }
        if (carManager.addCar(car2) != 0){
            System.out.println("Car Added");
        } else {
            System.out.println("Car Cannot be Added.");
        }
        if (carManager.addCar(car3) != 0){
            System.out.println("Car Added");
        } else {
            System.out.println("Car Cannot be Added.");
        }

        carManager.displayCars();
        carManager.displayCars(1003);
        carManager.displayCars(8D);
        carManager.displayCars(4);
        carManager.displayCars(true);
        carManager.displayCars("KANCIL");
    }
}