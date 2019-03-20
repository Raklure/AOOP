import java.io.File;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Entrez le nom du fichier : ");
		Scanner sc = new Scanner(System.in);
		String chemin = sc.next();
		sc.close();
		
		try {
			File f = new File(chemin);
			if(f.exists()) {
				if(f.isDirectory()) {
					System.out.println("C'est un répertoire.");
					System.out.println("Voici la liste des fichiers : ");
					File[] files;
					files = f.listFiles();
					for(File file:files) {
						System.out.println(file);
					}
				}
				else {
					System.out.println("C'est un fichier, voici sa taille : ");
					System.out.println(f.length() + " bytes");
					System.out.println(f.getAbsolutePath());
				}
			}
			else {
				System.out.println("Ce chemin ne mène à rien.");
			}
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}
