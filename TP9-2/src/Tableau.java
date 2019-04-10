
public class Tableau extends Thread {

	int[] tab;

	public Tableau(int[] tab) {
		super();
		this.tab = tab;
	}
	
	public int partitionner(Tableau T, int pre, int der)
	{
		int j = pre;
		for (int i=pre; i<der; ++i)
		{
			if (T.tab[i] <= T.tab[der])
			{
				int temp = T.tab[i];
				T.tab[i] = T.tab[j];
				T.tab[j] = temp;
				j++;
			}
		}
		int temp = T.tab[der];
		T.tab[der] = T.tab[j];
		T.tab[j] = temp;
		return j;
	}
	
	public void triRapide (Tableau T, int pre, int der)
	{
		if (pre < der)
		{
			int pivot = partitionner(T, pre, der);
			triRapide(T, pre, pivot-1);
			triRapide(T, pivot+1, der);
		}
	}
	
	public void run()
	{
		// Implémenter la fonction triRapide ici
	}
	
}
