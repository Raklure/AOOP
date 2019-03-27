import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) throws IOException {
		
		String path = "/home/n/c/ncoust/workspace/TP7/src/regions.csv";
		CSV file = new CSV();
		ArrayList<String []> liste = new ArrayList<String []>();
		ArrayList<Region> regions = new ArrayList<Region>();
		Region r;
		
		//On rempli la liste avec readFile de CSV
		liste = file.readFile(path);
		
		//On transforme la liste de tableaux en liste de régions
		for (int i=1; i<liste.size(); ++i) {
			r = new Region(liste.get(i));
			regions.add(r);
		}
		
		//On trie la liste grâce au compareTo() de Region
		Collections.sort(regions);
		//Affichage
		for (int i=0; i<regions.size(); ++i) {
			System.out.println(regions.get(i).toString());
		}
		
		//On trie la liste en fonction de compare() de SortByDensity
		Collections.sort(regions, new SortByDensity());
		//Affichage
		for (int i=0; i<regions.size(); ++i) {
			System.out.println(regions.get(i).toString());
		}
		//Sauvegarde de la dernière version de regions dans le csv
		file.saveFile(regions, path);
	}

}
