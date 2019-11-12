package view.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		super("Car Rental Management System");
		
		GridLayout layout = new GridLayout(3, 1, 10, 10);
		
		
		JButton btnManageCars = new JButton("Manage cars");
		JButton btnManageCustomers = new JButton("Manage Customers");
		JButton btnManageRentals = new JButton("Manage Rentals");
		
		this.add(btnManageCars);
		this.add(btnManageCustomers);
		this.add(btnManageRentals);
	
		this.setSize(300, 200);
		this.setResizable(false);
		this.setLayout(layout);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
