
public class Tonneau extends Thread {

	String nom;
	int volume;
	int volumeMax;
	int debit;
	Tonneau suivant;
	
	public Tonneau(String nom, int volumeInit, int debit, Tonneau suivant)
	{
		super();
		this.nom = nom;
		this.volume = volumeInit;
		this.volumeMax = 12;
		this.debit = debit;
		this.suivant = suivant;
	}
	
	public synchronized int ajoutVolume(int volumeAjout)
	{
		if ((volume+volumeAjout) <= volumeMax)
		{
			volume += volumeAjout;
			System.out.println(nom + ", ajout de " + volumeAjout + ". Volume actuel :" + volume);
		}
		else
		{
			System.out.println("Le tonneau " + nom + " déborde.");
			System.out.println(nom + ", ajout de " + (volumeMax-volume) + ". Volume actuel :" + volume);
			volume = volumeMax;
		}
		return volumeAjout;
	}
	
	public synchronized int retirerVolume(int volumeFuite)
	{
		
		if (volume >= volumeFuite)
		{
			volume -= volumeFuite;
			System.out.println(nom + ", fuite de " + volumeFuite + ". Volume actuel :" + volume);
		}
		else
		{
			System.out.println(nom + ", fuite de " + volume + ". Volume actuel : 0");
			volume = 0;
		}
		if (volume < debit)
		{
			debit = volume;
		}
		
		return volumeFuite;
	}
	
	public void run()
	{
		while(true)
		{
			try {
				retirerVolume(debit);
				if (suivant != null)
				{
					suivant.ajoutVolume(debit);
				}
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
