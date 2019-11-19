package view.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class ManageCarsDialog extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;

	public ManageCarsDialog(MainFrame frame) {
		super(frame, "Manage Cars", true);
		
		this.setSize(300, 200);
		this.setLocationRelativeTo(frame);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
