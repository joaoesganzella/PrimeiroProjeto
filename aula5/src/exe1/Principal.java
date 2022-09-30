package exe1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Calculadora cal = new Calculadora();
		
		Scanner scan = new Scanner(System.in);
		
		double n1, n2;
		
		
		System.out.println("Digite um número: ");
		n1 = scan.nextDouble();
		System.out.println("Digite outro número: ");
		n2 = scan.nextDouble();
		
		cal.soma(n1,n2);
		cal.sub(n1,n2);
		cal.mult(n1,n2);
		cal.div(n1,n2);
		
		
	}

}
