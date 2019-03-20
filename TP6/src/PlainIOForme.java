import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;


public class PlainIOForme implements IOForme {

	public Collection<Forme> lire(String fileName) throws IOException {
		ArrayList<Forme> formes = new ArrayList();
		rectangle r;
		cercle c;
		String[] words;
		BufferedReader in = null;
		try {
			//ouverture du fichier
			in = new BufferedReader(new FileReader(fileName));
			//lecture des données
			String ligne = null;
			while ((ligne=in.readLine()) != null) {
				words = ligne.split(" ");
				switch(words.length) {
					case 5 :
						r = new rectangle(words[1], words[2], words[3], words[4]);
				}
			}
		}
		finally {
			//fermeture du fichier
			if(in != null) {
				in.close();
			}
		}
		return null;
	}

	public void sauver(Collection<Forme> formes, String fileName) throws IOException {
		PrintWriter out = null;
		String name = "";
		try {
			//ouverture du fichier
			out = new PrintWriter(new FileWriter(fileName));
			//écriture dans le fichier
			for(Forme forme : formes) {
				name = forme.getClass().getSimpleName();
				out.println(name + " " + forme.x + " " + forme.y + forme.toString());
			}
		}
		finally {
			//fermeture du fichier
			if(out != null) {
				out.close();
			}
		}
	}

}
