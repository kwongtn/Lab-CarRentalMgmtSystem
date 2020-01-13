package controller.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import model.Car;
public class CarManager{

	private static Vector<Car> cars = new Vector<>();

	public static int addCar(Car car) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbCRMS_B031810219", "root", "password");
		PreparedStatement ps = connection.prepareStatement("INSERT INTO Car(PlateNo, Model, Price, Capacity, Auto, Usable) VALUES (?,?,?,?,?,?)");
		
		ps.setString(1, car.getPlateNo());
		ps.setString(2, car.getModel());
		ps.setDouble(3, car.getPrice());
		ps.setInt(4, car.getCapacity());
		ps.setBoolean(5, car.isAuto());
		ps.setBoolean(6, car.isUsable());

		int status = ps.executeUpdate();

		connection.close();

		return status;
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

	public static Vector<Car> getCars() throws ClassNotFoundException, SQLException{

		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbCRMS_B031810219", "root", "password");
		PreparedStatement ps = connection.prepareStatement("SELECT * FROM Car");
		ResultSet rs = ps.executeQuery();

		Vector<Car> cars = new Vector<>();

		while(rs.next()){
			Car car = new Car();

			car.setPlateNo(rs.getString(2));
			car.setModel(rs.getString(3));
			car.setPrice(rs.getDouble(4));
			car.setCapacity(rs.getInt(5));
			car.setAuto(rs.getBoolean(6));
			car.setUsable(rs.getBoolean(7));

			cars.add(car);
		}

		connection.close();

		return cars;
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