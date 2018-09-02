package Button;

import javax.swing.JButton;

import Button_Listener.Exit_Button_Listener;

public class Exit_Button extends JButton {
	public Exit_Button() {
		System.out.println("Exit_Button");
		this.setText("³¡³»±â");

		Exit_Button_Listener exit_button_listener = new Exit_Button_Listener();
		this.addActionListener(exit_button_listener);
		
	}
}
