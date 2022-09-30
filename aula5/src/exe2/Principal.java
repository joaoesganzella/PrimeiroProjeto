package exe2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno("Jairo", 24);
		
		double n1, n2, n3, media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = scan.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3 = scan.nextDouble();
	
		aluno.calcularMedia(n1,  n2, n3);
		aluno.verificarAprovacao();

	}

}
