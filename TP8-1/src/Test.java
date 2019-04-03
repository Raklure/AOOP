import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test {
	
	public static void main(String[] args) {
		
		JFrame win = new JFrame();
		FlowLayout fl = new FlowLayout();
		JLabel jlab = new JLabel("What is your name ?");
		JButton jbut = new JButton("OK");
		final JTextField jtext = new JTextField(20);
		
		jbut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println(jtext.getText());
			}
		});
		
		win.setSize(400, 400);
		win.setLayout(fl);
		win.add(jlab);
		win.add(jbut);
		win.add(jtext);
		
		win.setVisible(true);
		
	}

}
