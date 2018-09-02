package Data_Panel;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ID_Panel extends JPanel{
	private JLabel id_Label = new JLabel();
	public ID_Panel(String ID) {
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 30,7));
		id_Label.setText("ID : "+ID);
		this.add(id_Label);
	}
}