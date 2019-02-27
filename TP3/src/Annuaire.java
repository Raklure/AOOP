import java.util.ArrayList;

public class Annuaire {
	
	ArrayList<Client> annuaire = new ArrayList<Client>();
	
	
	
	
	public Annuaire() {
		super();
		Client C1 = new Client("Coustance");
		C1.numeroClient = 1;
		Client C2 = new Client("Gautier");
		C2.numeroClient = 2;
		Client C3 = new Client("Martinez");
		C3.numeroClient = 3;
		annuaire.add(C1);
		annuaire.add(C2);
		annuaire.add(C3);
	}
	

	public void newClient(String nom) {
		Client C = new Client(nom);
		C.numeroClient = annuaire.size()+1;
		annuaire.add(C);
	}
	
	public void removeClient(int i) {
		annuaire.remove(i-1);
	}
	
	public void displayAnnuaire() {
		
		Client C;
		for (int i=0; i<annuaire.size(); ++i) {
			C = annuaire.get(i);
			System.out.println(C.numeroClient + " : " + C.nom);
		}
	}
	
	public int getTaille() {
		int cpt = 0;
		for (int i=0; i<annuaire.size(); ++i) {
			cpt++;
		}
		return cpt;
	}
	
	public Client getClient(int id) {
		Client C = null;
		for (int i=0; i<annuaire.size(); ++i) {
			if(annuaire.get(i).numeroClient == id) {
				C = annuaire.get(i);
				
			}
		}
		return C;
	}
	
	public double totalSolde() {
		double r = 0;
		for(int i=0; i<annuaire.size(); ++i) {
			r += annuaire.get(i).solde;
		}
		return r;
	}
	
	public boolean contient(Client C) {
		for(int i=0; i<annuaire.size(); i++) {
			if(C.nom == annuaire.get(i).nom)
				return true;
		}
		return false;
	}
}
