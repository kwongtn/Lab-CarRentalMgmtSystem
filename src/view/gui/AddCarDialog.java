package view.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddCarDialog extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JTextField txtPlateNo = new JTextField();
	private JTextField txtModel = new JTextField(15);
	private JTextField txtPrice = new JTextField();
	private JTextField txtCapacity = new JTextField();
	private JCheckBox chkAuto = new JCheckBox("Auto");
	private JCheckBox chkUsable = new JCheckBox("Yes", true);
	private JButton btnSubmit = new JButton("Submit");
	private JButton btnReset = new JButton("Reset");

	public AddCarDialog(ManageCarsDialog dialog) {
		super(dialog, "Add Car", true);
		
		JPanel pnlCenter = new JPanel(new GridLayout(6, 2, 10, 10));
		JPanel pnlSouth = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));

		pnlCenter.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10));
		pnlSouth.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));

		pnlCenter.add(new JLabel("Plate Number: ", JLabel.RIGHT));
		pnlCenter.add(txtPlateNo);
		pnlCenter.add(new JLabel("Model: ", JLabel.RIGHT));
		pnlCenter.add(txtModel);
		pnlCenter.add(new JLabel("Price (RM): ", JLabel.RIGHT));
		pnlCenter.add(txtPrice);
		pnlCenter.add(new JLabel("Capacity: ", JLabel.RIGHT));
		pnlCenter.add(txtCapacity);
		pnlCenter.add(new JLabel("Transmission: ", JLabel.RIGHT));
		pnlCenter.add(chkAuto);
		pnlCenter.add(new JLabel("Usable: ", JLabel.RIGHT));
		pnlCenter.add(chkUsable);

		pnlSouth.add(btnSubmit);
		pnlSouth.add(btnReset);
		
		this.add(pnlCenter);
		this.add(pnlSouth, BorderLayout.SOUTH);

		this.getRootPane().setDefaultButton(btnSubmit);
		this.setResizable(false);
		this.pack();
		this.setLocationRelativeTo(dialog);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();

		if (source == btnSubmit){
			String plateNo = null, model = null;

			plateNo = Validator.validate("Plate number", txtPlateNo.getText(), true, 15);
			Car car = new Car();

			car.setPlateNo(txtPlateNo.getText());
			car.setModel(txtModel.getText());
			car.setPrice(Double.parseDouble(txtPrice.getText()));
			car.setCapacity(Integer.parseInt(txtCapacity.getText()));
			car.setAuto(chkAuto.isSelected());
			car.setUsable(chkUsable.isSelected());

			if (CarManager.addCar(car) != -1){
				JOptionPane.showMessageDialog(this, "Car with ID " + car.getCarID() + " has been succesfully added.", "Success", JOptionPane.INFORMATION_MESSAGE);
				reset();

			} else {
				JOptionPane.showMessageDialog(this, "Unable to add new car.", "Unsuccesful", JOptionPane.WARNING_MESSAGE);
			}

		}else if (source == btnReset){
			reset();
		}
		
	}
	
	private void reset(){
		txtPlateNo.setText("");
		txtModel.setText("");
		txtPrice.setText("");
		txtCapacity.setText("");
		chkAuto.setSelected(false);
		chkUsable.setSelected(true);
		txtPlateNo.grabFocus();
	}
}
