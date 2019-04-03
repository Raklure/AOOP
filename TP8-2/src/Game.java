
public class Game {

	int[][] grille = null;
	int turn;
	
	public void play(int x, int y) {
		grille[x][y] = turn;
		
		int cptCol = 0;
		int cptLig = 0;
		
		for(int i=0; i<3; ++i) {
			
			for(int j=0; j<3; ++j) {
				
				if(grille[i][j] == turn)
					cptLig++;
				if(grille[j][i] == turn)
					cptCol++;
				
			}
			if(cptLig == 3 || cptCol == 3) {
				System.out.println("Le joueur " + turn + " a gagné");
				System.exit(0);
			}
			
			cptLig = 0;
			cptCol = 0;
			
		}
		
		if(grille[0][0] == turn && grille[1][1] == turn && grille[2][2] == turn) {
			System.out.println("Le joueur " + turn + " a gagné");
			System.exit(0);
		}
		if(grille[0][2] == turn && grille[1][1] == turn && grille[2][0] == turn) {
			System.out.println("Le joueur " + turn + " a gagné");
			System.exit(0);
		}
		
		int cptNull = 0;
		for(int i=0; i<3; ++i) {
			for(int j=0; j<3; ++j) {
				cptNull+=grille[i][j];
			}
		}
		if(cptNull == 13) {
			System.out.println("Egalité. Partie terminée");
			System.exit(0);
		}
		
		switch(turn) {
			case 1:
				turn = 2;
				break;
			case 2:
				turn = 1;
				break;
		}
	}
	
	public void display() {
		for(int i=0; i<3; ++i) {
			for(int j=0; j<3; ++j) {
				System.out.print(grille[i][j]);
			}
			System.out.println();
		}
	}
	
	public Game() {
		this.grille = new int[3][3];
		this.turn = 1;
	}
	
}
