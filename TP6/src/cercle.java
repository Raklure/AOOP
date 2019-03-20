
public class cercle extends Forme {
	int rayon;
	
	public String toString() {
		return " " + rayon;
	}

	public cercle(int x, int y, int rayon) {
		super(x, y);
		this.rayon = rayon;
	}
}
