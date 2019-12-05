package view.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.manager.CarManager;
import model.CarTableModel;

public class ViewCarsDialog extends JDialog implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JTable tblCars = new JTable();

    public ViewCarsDialog(ManageCarsDialog frame) {
        super(frame, "ViewCars", true);

        try {
            tblCars.setModel(new CarTableModel(CarManager.getCars()));
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        this.add(new JScrollPane(tblCars));

        this.pack();
        this.setLocationRelativeTo(frame);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event){

    }
}