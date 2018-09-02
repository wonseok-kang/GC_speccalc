package Button_Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.Information_Window;

public class Information_Button_Listener implements ActionListener{
	static boolean info_flag = false;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(isInfo_On(info_flag)) {
			Information_Window information_window = new Information_Window();
			
		}
	}
	
	public boolean isInfo_On(boolean info_flag) {
		if(info_flag == false) {
			this.info_flag = true;
			return true;
		}else {		
		return false;
		}
	}
	public void resetFlag() {
		this.info_flag = false;
	}
}