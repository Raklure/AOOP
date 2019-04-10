
public class Test {

	public static void main(String[] args) {
		
		int[] tab = {2, 3, 5, 1, 13, 28, 5};
		Tableau T = new Tableau(tab);
		
		T.start();
		for (int i=0; i<tab.length; ++i)
		{
			System.out.println(T.tab[i]);
		}

	}

}
