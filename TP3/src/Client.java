public class Client {
	
	int numeroClient;
	String nom;
	double solde = 0;
	
	
	public Client(String nom) {
		super();
		this.nom = nom;
	}


	public int getNumeroClient() {
		return numeroClient;
	}


	public void setNumeroClient(int numeroClient) {
		this.numeroClient = numeroClient;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	@Override
	public String toString() {
		return "Client [numeroClient=" + numeroClient + ", nom=" + nom
				+ ", solde=" + solde + "]";
	}
	
	
	
}
