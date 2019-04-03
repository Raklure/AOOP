
public class Game {

	int[][] grille = null;
	int turn = 1;

	public void fill(int size) {
		grille = new int[size][size];
		for(int i=0; i<size; ++i) {
			for(int j=0; j<size; ++j) {
				grille[i][j] = 0;
			}
		}
	}
	
	public void play(int x, int y) {
		grille[x][y] = turn;
		switch(turn) {
			case 1:
				turn = 2;
				break;
			case 2:
				turn = 1;
				break;
		}
	}
	
	public Game() {
		super();
	}
	
}
