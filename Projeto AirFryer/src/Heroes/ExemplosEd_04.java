package Heroes;


import java.util.Scanner;


public class ExemplosEd_04 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		double n4 = input.nextDouble();
		double M = (n1 + n2 + n3 + n4) / 4;
		
		if (M >= 6) {
			System.out.println("Parabéns você passou LIXO");
		}else if (M < 3) {
			System.out.println("RETIDO");			
		}else {
			System.out.println("EXAME");
		}
		input.close();
	}
}
