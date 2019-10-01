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
    
    // Display all cars
    void displayCars(){
        for (int i = 0; i < count; i++){
            displayCar(cars[i]);
        }
    }
    
    void searchCarByID(int carID){
        for (int i = 0; i < count; i++){
            if(cars[i].getCarID() == carID){
                displayCar(cars[i]);
            }
        }
    }

    void searchCarsByMaxPrice(int maxPrice){
        for (int i = 0; i < count; i++){
            if(cars[i].getPrice() < maxPrice){
                displayCar(cars[i]);
            }
        }
    }

    void searchCarsByMinCapacity(int minCapacity){
        for (int i = 0; i < count; i++){
            if(cars[i].getCapacity() >= minCapacity){
                displayCar(cars[i]);
            }
        }
    }
    
    void searchCarsByTransmission(boolean transmissionSearch){
        for (int i = 0; i < count; i++){
            if(cars[i].isAuto() == transmissionSearch){
                displayCar(cars[i]);
            }
        }
    }

    private void displayCar(Car car){
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