
public class Region implements Comparable<Region> {

	String type;
	String nom;
	int pop;
	int pib;
	int nbCommunes;
	int superf;
	
	//Création d'une région à partir d'un tableau de String
	public Region(String [] liste) {
		super();
		this.type = liste[0];
		this.nom = liste[1];	
		this.pop = Integer.parseInt(liste[2]);
		this.pib = Integer.parseInt(liste[3]);
		this.nbCommunes = Integer.parseInt(liste[4]);
		this.superf = Integer.parseInt(liste[5]);
	}
	
	public int compareTo(Region r) {
		return this.nom.compareTo(r.nom);
	}
	
	@Override
	public String toString() {
		return type + "," + nom + "," + pop + "," + pib + "," + nbCommunes + "," + superf;
	}
}
