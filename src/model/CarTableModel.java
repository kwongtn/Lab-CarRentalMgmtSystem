package model;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class CarTableModel extends DefaultTableModel {

    private static final long serialVersionUID = 1L;

    public CarTableModel(Vector<Car> cars) {
        int size = cars.size();
        String[][] data = new String[size][6];

        for (int i = 0; i < size; i++) {
            Car car = cars.get(i);

            data[i][0] = car.getPlateNo();
            data[i][1] = car.getModel();
            data[i][2] = String.valueOf(car.getPrice());
            data[i][3] = String.valueOf(car.getCapacity());
            data[i][4] = String.valueOf(car.isAuto());
            data[i][5] = String.valueOf(car.isUsable());
        }

        setDataVector(data, new String[] { "Plate No.", "Model", "Price (RM)", "Capacity", "Auto", "Usable" });
    }

}