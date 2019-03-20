import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Calculatrice {
	
	String OperationAdmi[]={"+","-","/","*"};
	List<String> list = Arrays.asList(OperationAdmi);
	
	public double saisieNombre() {
		Scanner sc = new Scanner(System.in);
		double i = sc.nextDouble();
		return i;
	}
	
	public String saisieOperation() throws OperationException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez une opération : ( '+' / '-' / '*' / '/')");
		String oper = sc.next();
		if (!list.contains(oper)){
			throw new OperationException(oper + " n'est pas un opérateur");
		}
		return oper;
	}
	
	public void Log(double nombre, String oper, double nombre2, double res) throws IOException {
		while(true) {
			try {
				String timeStamp = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss").format(Calendar.getInstance().getTime());
				FileWriter w = new FileWriter("log.txt",true);
				w.write(timeStamp + " Calcul : " + nombre + oper + nombre2 + " = " + res +"\n");
				w.close();
				break;
			}
			catch(IOException e) {
				e.getMessage();
			}
		}
	}
	
	public double lancementCalcul() {
		Scanner sc = new Scanner(System.in);
		boolean checkDouble = false;
		boolean checkOper = false;
		double nombre = 0;
		double res = 0;
		String oper = "";
		
		while(checkDouble == false) {
			try {
				System.out.println("Entrez un nombre : ");
				nombre = saisieNombre();
				System.out.println("Votre nombre est " + nombre);
				checkDouble = true;
			}
			catch(Exception e) {
				System.out.println("Erreur.");
			}
		}
		
		while(checkOper == false) {
			try {
				oper = saisieOperation();
				System.out.println("Vous avez choisi " + oper + " comme opérateur.");
				checkOper = true;
			}
			catch(OperationException e) {
				System.out.println(e.getClass().getName()+" : "+e.getMessage());
			}
		}
		
		checkDouble = false;
		
		while(checkDouble == false) {
			try {
				System.out.println("Entrez le deuxième nombre : ");
				double nombre2 = saisieNombre();
				switch(oper) {
					case "+" :
						res = nombre + nombre2;
						break;
					case "-" :
						res = nombre - nombre2;
						break;
					case "*" :
						res = nombre * nombre2;
						break;
					case "/" :
						res = nombre / nombre2;
						break;
				}
				System.out.println("Le résultat est : " + res);
				Log(nombre, oper, nombre2, res);
				checkDouble = true;
			}
			catch(Exception e) {
				System.out.println(e.getClass().getName()+" : entrez un nombre");
			}
		}
		
		sc.close();
		return res;
	}
	
}
