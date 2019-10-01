public class CarManager{

    private Car[] cars = new Car[5];
    private int count;

    public CarManager(int length){
        cars = new Car[length];
    }


    int addCar(Car car){
        int status = 0;

        if(count < cars.length){
            cars[count++] = car;
            status = count;
        }
        
        return status;
    }

    int updateCar(Car car){
        return 0;
    }

    int deleteCar(Car car){
        return 0;
    }

    Car[] searchByCapacity(int capacity){
        return null;
    }

    Car[] searchByMinPrice(double price){
        return null;
    }

    Car[] searchByMaxPrice(double price){
        return null;
    }

    Car searchByPlateNo(String plateNo){
        return null;
    }

    void displayCars(){
        for (int i = 0; i < count; i++){
            Car car = cars[i];

            System.out.println("========================================");
            System.out.println("Car ID: " + car.carID);
            System.out.println("Plate No.: " + car.plateNo);
            System.out.println("Model:" + car.model);
            System.out.println("Price: RM " + car.price);
            System.out.println("Is Auto:" + car.isAuto);
            System.out.println("Is Usable:" + car.isUsable);
            System.out.println("Capacity:" + car.capacity);

        }
    }
}