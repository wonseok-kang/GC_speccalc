package Button;

import java.awt.event.WindowAdapter;

import javax.swing.JButton;

import Button_Listener.Information_Button_Listener;

public class Information_Button extends JButton{
	public Information_Button() {
		System.out.println("Information_Button");
		this.setText("���α׷� ����");
		Information_Button_Listener informaion_button_listener = new Information_Button_Listener();
		this.addActionListener(informaion_button_listener);
	}
}
