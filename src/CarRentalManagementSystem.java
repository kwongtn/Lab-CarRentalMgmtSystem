public class CarRentalManagementSystem
{
    public static void main(String args[])
    {
        CarManager carManager = new CarManager(10);
 
        Car car1 = new Car(1001);
        car1.setPlateNo("ABC 1234");
        car1.setModel("Perodua Kancil");
        car1.setPrice(5);
        car1.setAuto(false);
        car1.setUsable(true);
        car1.setCapacity(4);
 
        Car car2 = new Car(1002);
        car1.setPlateNo("DEF 1234");
        car2.setModel("Perodua Alza");
        car2.setPrice(10);
        car2.setAuto(true);
        car2.setUsable(true);
        car2.setCapacity(6);
 
        Car car3 = new Car(1003);
        car3.setPlateNo("GHI 1123");
        car3.setModel("Perodua Myvi");
        car3.setPrice(8);
        car3.setAuto(true);
        car3.setUsable(false);
        car3.setCapacity(5);
 
        if (carManager.addCar(car1)!=0)
            System.out.println("Car added");
        else
            System.out.println("Cannot add car");
       
        if (carManager.addCar(car2)!=0)
            System.out.println("Car added");
        else
            System.out.println("Cannot add car");
       
        if (carManager.addCar(car3)!=0)
            System.out.println("Car added");
        else
            System.out.println("Cannot add car");
 
        carManager.displayCars();
        carManager.displayCar(1003);
        carManager.displayCars(8.0);//8.0=8D
        carManager.displayCars(true);
        carManager.displayCars("Kancil");
    }
 
}