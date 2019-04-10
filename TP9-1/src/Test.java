
public class Test {

	public static void main(String[] args) {
		
		Tonneau T2 = new Tonneau("T2", 12, 4, null);
		Tonneau T1 = new Tonneau("T1", 5, 1, T2);
		
		T1.start();
		T2.start();

	}

}
