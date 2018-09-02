package Data_Panel;

import java.awt.FlowLayout;

import javax.swing.JPanel;

import Button.Calculate_Button;
import Button.Reset_Button;

public class Bottom_Button extends JPanel {
	private Calculate_Button calculate_button;
	private Reset_Button reset_button;
	
	
	
	
	public Bottom_Button() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 7));

		// Calculate Button
		calculate_button = new Calculate_Button();
		this.add(calculate_button);
		// Reset button
		reset_button = new Reset_Button();
		this.add(reset_button);
		
		
	} 
	

}
