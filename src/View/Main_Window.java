package View;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Data_Panel.Bottom_Button;
import Data_Panel.ID_Panel;
import Data_Panel.Top_Menu;

public class Main_Window extends JFrame {
	String ID = "";
	JFrame main_frame = new JFrame();
	JFrame id_input_frame = new JFrame();
	JPanel main_panel = new JPanel();
	private Top_Menu top_menu;
	private ID_Panel id_panel;
	private Bottom_Button bottom_button;
	static final int width = 1000;
	static final int height = 600;
	

	public Main_Window() {
		ID = JOptionPane.showInputDialog(null, "닉네임을 입력해주세요", "스펙지수 Ver 1.3", JOptionPane.PLAIN_MESSAGE);
		System.out.println(ID);
		
		this.setSize(width,height);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("스펙지수 Ver 1.3");
		this.setLocation(500, 200);
		
		id_panel = new ID_Panel(ID);
		id_panel.setBounds(0, 0, 200, (int)(height*0.08));
		id_panel.setBackground(Color.yellow);
		
		top_menu = new Top_Menu();
		top_menu.setBounds(300,0,width-300,(int)(height*0.08));
		top_menu.setBackground(Color.red);
		
		bottom_button = new Bottom_Button();
		bottom_button.setBounds(0,height-80,width,(int)(height*0.08));
		bottom_button.setBackground(Color.blue);

		System.out.println("Main_Frame");

		this.add(id_panel);
		this.add(top_menu);
		this.add(bottom_button);
	}
}
