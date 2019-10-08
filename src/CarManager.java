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
    
    // Display all cars
    void displayCars(){
        for (Car car : cars){
            if(car != null){
                displayCar(car);
            }
        }
    }
    
    void displayCar(int carID){
        for (Car car : cars){
            if(car != null && car.getCarID() == carID){
                displayCar(car);
            }
        }
    }

    void displayCars(double maxPrice){
        for (Car car : cars){
            if(car != null && car.getPrice() < maxPrice){
                displayCar(car);
            }
        }
    }

    void displayCars(int minCapacity){
        for (Car car : cars){
            if(car != null && car.getCapacity() >= minCapacity){
                displayCar(car);
            }
        }
    }
    
    void displayCars(boolean transmissionSearch){
        for (Car car : cars){
            if(car != null && car.isAuto() == transmissionSearch){
                displayCar(car);
            }
        }
    }

    void displayCars(String model){
        for (Car car : cars){
            if (car != null && car.getModel().toLowerCase().contains(model.toLowerCase())){
                displayCar(car);
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