package Data_Panel;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import Button.Exit_Button;
import Button.ShowHistory_Button;
import Button.HowToUse_Button;
import Button.Information_Button;

public class Top_Menu extends JPanel{
	private JLabel id_Label = new JLabel();
	private Exit_Button exit_button;
	private ShowHistory_Button showhistory_button;
	private HowToUse_Button howtouse_button;
	private Information_Button information_button;
	
	
	
	public Top_Menu() {
		this.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 7));
		
		//Information Button
		information_button = new Information_Button();
		this.add(information_button);

		//How to use Button
		howtouse_button = new HowToUse_Button();
		this.add(howtouse_button);

		//Show History Button		
		showhistory_button = new ShowHistory_Button();
		this.add(showhistory_button);
		
		//Exit Button
		exit_button = new Exit_Button();
		this.add(exit_button);
	}
	
	

}
