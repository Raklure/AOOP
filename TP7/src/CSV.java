import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CSV {
	
	public CSV() {
		super();
	}

	//Cette fonction rempli un ArrayList de tableau composés des lignes du csv
	public ArrayList<String []> readFile(String path) throws IOException {
		ArrayList<String []> result = new ArrayList<String []>();
		String [] words;
		
		BufferedReader br = null;
		
		try {
			//ouverture du fichier
			br = new BufferedReader(new FileReader(path));
			
			for (String line = br.readLine(); line != null; line = br.readLine()) {
				words = line.split(",");
				result.add(words);
			}
		}
		finally {
			//fermeture du fichier
			if(br != null) {
				br.close();
			}
		}
		
		return result;
	}
	
	public void saveFile(ArrayList<Region> regions, String path) throws IOException {
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter(path));
			
			pw.println("Type,Nom,POP,PIB,Nbr Communes,Superficie");
			for(Region region : regions) {
				pw.println(region.toString());
			}
		}
		finally {
			if(pw != null)
				pw.close();
		}
	}
	
}
