
public class Test2 {
	
	public static void main(String[] args) {
		
		Annuaire annuaire = new Annuaire();
		
		annuaire.newClient("Loeb");
		Client C2 = new Client("Gautier");
		
		if(annuaire.contient(C2))
			System.out.println("L'annuaire contient le client.");
		else
			System.out.println("L'annuaire ne contient pas le client.");
	}
	
}
