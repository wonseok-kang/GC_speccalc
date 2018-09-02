package Button_Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Button.Exit_Button;

public class Exit_Button_Listener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Exit_Button exit_button = (Exit_Button) e.getSource();
		System.exit(0);
	}

}