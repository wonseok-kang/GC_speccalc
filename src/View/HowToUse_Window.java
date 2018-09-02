package View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import Button_Listener.HowToUse_Button_Listener;

public class HowToUse_Window extends JFrame{

	public HowToUse_Window() {
		this.setAlwaysOnTop(true);
		this.setTitle("사용 방법");
		this.setSize(300, 300);
		this.setLocation(800, 500);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Closed");
				e.getWindow().dispose();
				HowToUse_Button_Listener howtouse_button_listener = new HowToUse_Button_Listener();
				howtouse_button_listener.resetFlag();
			}
		});
	}
}