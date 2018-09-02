package Button;

import javax.swing.JButton;

import Button_Listener.HowToUse_Button_Listener;

public class HowToUse_Button extends JButton{
	public HowToUse_Button() {
		System.out.println("HowToUse_Button");
		this.setText("사용방법");
		HowToUse_Button_Listener howtouse_button_listener = new HowToUse_Button_Listener();
		this.addActionListener(howtouse_button_listener);
		
	}

}
