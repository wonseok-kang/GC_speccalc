package View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import Button_Listener.Information_Button_Listener;

public class Information_Window extends JFrame{

	public Information_Window() {
		this.setAlwaysOnTop(true);
		this.setTitle("프로그램 정보");
		this.setLocation(800, 300);
		this.setSize(500, 500);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Closed");
				e.getWindow().dispose();
				Information_Button_Listener information_button_listener = new Information_Button_Listener();
				information_button_listener.resetFlag();
			}
		});
	}
}