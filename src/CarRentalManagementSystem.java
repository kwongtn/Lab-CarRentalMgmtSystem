public class CarRentalManagementSystem{
    public static void main(String args[]){
        CarManager carManager = new CarManager(8);

        Car car1 = new Car();
        car1.carID = 1001;
        car1.plateNo = "ABC 1234";
        car1.model = "Perodua Kancil";
        car1.isAuto = false;
        car1.isUsable = true;
        car1.capacity = 4;
        car1.rentalRate = 5;

        Car car2 = new Car();
        car2.carID = 1003;
        car2.plateNo = "DEF 5678";
        car2.model = "Perodua Alza";
        car2.isAuto = true;
        car2.isUsable = true;
        car2.capacity = 6;
        car2.rentalRate = 10;

        Car car3 = new Car();
        car3.carID = 1005;
        car3.plateNo = "GHI 9012";
        car3.model = "Perodua Myvi";
        car3.isAuto = false;
        car3.isUsable = true;
        car3.capacity = 4;
        car3.rentalRate = 8;

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
    }
}