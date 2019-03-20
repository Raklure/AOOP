
public class rectangle extends Forme {

	int longueur;
	int largeur;
	
	public String toString() {
		return " " + longueur + " " + largeur;
	}

	public rectangle(int x, int y, int longueur, int largeur) {
		super(x, y);
		this.longueur = longueur;
		this.largeur = largeur;
	}
}
