import java.io.IOException;
import java.util.ArrayList;


public class Test2 {

	public static void main(String[] args) throws IOException {
		
		IOForme io = new PlainIOForme();
		ArrayList<Forme> formes = new ArrayList<Forme>();
		rectangle r1 = new rectangle(0, 0, 6, 2);
		cercle c1 = new cercle(0, 0, 3);
		formes.add(r1);
		formes.add(c1);
		String chemin="/home/n/c/ncoust/workspace/TP6/text.txt";
		io.sauver(formes, chemin);
		io.lire(chemin);
	}

}
