
public class Test {

	public static void main(String[] args) {
	
		Annuaire annuaire = new Annuaire();	
		
		
		int rep =0; 
		while(rep!=-1){              
			System.out.println("1 ===>  Ajouter un nouveau client"); 
			System.out.println("2 ===>  Afficher la taille de l'annuaire"); 
			System.out.println("3 ===>  Afficher l'annuaire complet"); 
			System.out.println("4 ===>  Rechercher un client par son identifiant"); 
			System.out.println("5 ===>  Supprimer un client par son identifiant"); 
			System.out.println("6 ===>  Crediter le solde d'un client"); 
			System.out.println("7 ===>  Afficher le total des soldes des clients de l'annuaire"); 
			System.out.println("-1 ===>  Quitter"); 
			rep = Saisie.lireEntier("Votre choix ?"); 
			
			if(rep == 1){              
	
				String nom;
				nom = Saisie.lireString("Entrez le nom : ");
				annuaire.newClient(nom);
				
				
			} else if (rep ==2){ 
				
				System.out.println("Taille de l'annuaire : " + annuaire.getTaille());
		
	
			} else if (rep ==3){ 
				
				annuaire.displayAnnuaire();
				
			} else if (rep ==4){ 
				
				int id = Saisie.lireEntier("Entrez un identifiant : ");
				if(annuaire.getClient(id) != null)
					System.out.println("Client n°" + id + " : " + annuaire.getClient(id).nom);
				else
					System.out.println("Cet identifiant ne correspond à aucun client.");
			} else if (rep ==5){
				
				int id = Saisie.lireEntier("Entrez un identifiant : ");
				annuaire.removeClient(id);
				System.out.println("Client supprimé.");
				
			} else if (rep ==6){ 
				
				int id = Saisie.lireEntier("Entrez un identifiant : ");
				int montant = Saisie.lireEntier("Entrez un montant : ");
				annuaire.getClient(id).solde += montant;
				if(montant<0)
					System.out.println("Montant débité.");
				else if(montant>0)
					System.out.println("Montant crédité.");
				else
					System.out.println("Montant nul. Rien n'a été fait.");
				
			} else if (rep ==7){ 
				
				System.out.println("Solde total : " + annuaire.totalSolde());
				
			}
		}
		
		
		
	}
}
