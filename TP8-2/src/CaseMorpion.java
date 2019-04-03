import java.awt.event.*;
import javax.swing.*;

public class CaseMorpion {

	JButton jButt;
	Game actualGame;
	int x;
	int y;
	
	public CaseMorpion(final Game actualGame, final int x, final int y) {

		this.actualGame = actualGame;
		this.x = x;
		this.y = y;
		
		jButt = new JButton();
		
		jButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				actualGame.play(x,y);
				if(actualGame.turn == 1)
					jButt.setText("X");
				else if(actualGame.turn == 2)
					jButt.setText("O");
				jButt.setEnabled(false);
			}
		});
		
	}
	
}
