public class CarManager
{
    //private Car[] cars = new Car[5];
 
    private Car[] cars;
    private int count; 
 
    public CarManager(int length)
    {
        cars=new Car[length];
    }
 
    int addCar(Car car)
    {
        int status = 0;
       
        if (count<cars.length)
        {
            cars[count++]=car;         
            //cars[counts]=car;
            //count++;
            status=count;
        }
               
        return status;
    }
 
    int updateCar(Car car)
    {
        return 0;
    }
   
    int deleteCar(Car car)
    {
        return 0;
    }
   
    void displayCar(int carID)
    {
        for (Car car : cars)//improved for loop
        {
            if (car!=null && car.getCarID()==carID)
            {
                displayCar(car);
            }
        }
    }
   
    void displayCars(double maxPrice)
    {  
        for (Car car : cars)//improved for loop
        {
            if (car!=null && car.getPrice()<=maxPrice)
            {
                displayCar(car);
            }      
        }
    }
 
    void displayCars(int minCapacity)
    {
        for (Car car : cars)//improved for loop
        {
            if (car!=null && car.getCapacity()>=minCapacity)
            {
                displayCar(car);
            }      
        }
    }
   
   
    void displayCars(boolean auto)
    {
        for (Car car : cars)//improved for loop
        {
            if (car!=null && car.isAuto()==auto)
            {
                displayCar(car);
            }      
        }
    }
   
    void displayCars(String model)
    {
        for (Car car : cars)//improved for loop
        {
            if (car!=null && car.getModel().toLowerCase().contains(model.toLowerCase())) //toUpperCase()
            {
                displayCar(car);
            }      
        }
    }
 
 
    void displayCars()
    {
        for (Car car : cars)//improved for loop
        {
            if (car != null)
            {
                displayCar(car);
            }
        }
    }
 
    private void displayCar(Car car)
    {
        System.out.println("Car ID: " + car.getCarID());
        System.out.println("Plate no.: " + car.getPlateNo());
        System.out.println("Model: " + car.getModel());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Is Auto: " + car.isAuto());
        System.out.println("Is Usable: " + car.isUsable());
        System.out.println("Capacity: " + car.getCapacity());
    }
}