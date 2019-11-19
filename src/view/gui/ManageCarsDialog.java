package view.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class ManageCarsDialog extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JButton btnAddCar = new JButton("Add Car");
	private JButton btnUpdateCar = new JButton("Update Car");
	private JButton btnDeleteCar = new JButton("Delete Car");
	private JButton btnViewAllCars = new JButton("View All Cars");
	private JButton btnViewCarsByMaxPrice = new JButton("View Cars by Max Price");
	private JButton btnViewCarsByMinCapacity = new JButton("View Cars by Minimum Capacity");
	private JButton btnViewCarsByTransmission = new JButton("View Cars by Transmission");
	private JButton btnViewCarsByModel = new JButton("View Cars by Model");

	public ManageCarsDialog(MainFrame frame) {
		super(frame, "Manage Cars", true);
		
		GridLayout layout = new GridLayout(8, 1, 10, 10);
		
		this.add(btnAddCar);
		this.add(btnUpdateCar);
		this.add(btnDeleteCar);
		this.add(btnViewAllCars);
		this.add(btnViewCarsByMaxPrice);
		this.add(btnViewCarsByMinCapacity);
		this.add(btnViewCarsByTransmission);
		this.add(btnViewCarsByModel);

		btnAddCar.addActionListener(this);
		btnUpdateCar.addActionListener(this);
		btnDeleteCar.addActionListener(this);
		btnViewAllCars.addActionListener(this);
		btnViewCarsByMaxPrice.addActionListener(this);
		btnViewCarsByMinCapacity.addActionListener(this);
		btnViewCarsByTransmission.addActionListener(this);
		btnViewCarsByModel.addActionListener(this);

		this.setLayout(layout);
		this.pack();
		this.setLocationRelativeTo(frame);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();

		if(source == btnAddCar){
			new AddCarDialog(this);
		}

	}

}
