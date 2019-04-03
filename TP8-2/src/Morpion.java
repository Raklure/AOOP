import java.awt.*;
import javax.swing.*;


public class Morpion {

	public static void main(String[] args) {
		
		Game actualGame = new Game();
		JFrame win = new JFrame();
		JLabel jLab = new JLabel();
		CaseMorpion C1 = new CaseMorpion(actualGame, 0, 0);
		CaseMorpion C2 = new CaseMorpion(actualGame, 0, 1);
		CaseMorpion C3 = new CaseMorpion(actualGame, 0, 2);
		CaseMorpion C4 = new CaseMorpion(actualGame, 1, 0);
		CaseMorpion C5 = new CaseMorpion(actualGame, 1, 1);
		CaseMorpion C6 = new CaseMorpion(actualGame, 1, 2);
		CaseMorpion C7 = new CaseMorpion(actualGame, 2, 0);
		CaseMorpion C8 = new CaseMorpion(actualGame, 2, 1);
		CaseMorpion C9 = new CaseMorpion(actualGame, 2, 2);
		
		win.setSize(500,500);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		win.setLayout(new GridLayout(4, 3));
		
		win.getContentPane().add(C1.jButt);
		win.getContentPane().add(C2.jButt);
		win.getContentPane().add(C3.jButt);
		win.getContentPane().add(C4.jButt);
		win.getContentPane().add(C5.jButt);
		win.getContentPane().add(C6.jButt);
		win.getContentPane().add(C7.jButt);
		win.getContentPane().add(C8.jButt);
		win.getContentPane().add(C9.jButt);
		
		win.setVisible(true);
	}

}
