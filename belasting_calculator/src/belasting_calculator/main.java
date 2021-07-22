package belasting_calculator;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double belasting = 0;
		double bruto = 0;
		
		//scanner object om data te invoeren
		Scanner invoer = new Scanner(System.in);
		
		System.out.println("Voer uw bruto salaris in: ");
	
		//nextDoouble() geeft je de mogelijkheid om gebroken getallen (data tye = double) in te voeren	
		//Alterntieven; nextInt(), nextLine
		bruto = invoer.nextDouble();
		
		
		if (bruto < 2500){
			belasting = bruto * 0.10;	
		}else {
			belasting = bruto * 0.20;
		}
		
		System.out.println("Uw belasting bedraagt "+ belasting);
		
		System.out.println("Netto salaris " + (bruto -belasting));
	}
}
