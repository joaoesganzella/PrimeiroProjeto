package exe1;

public class Calculadora {

	double n1;
	double n2;
	
	void soma(double n1, double n2) {
		double result = n1 + n2;
		System.out.println("A soma dos valores é: "+result);
	}
	void sub(double n1, double n2) {
		double result = n1 - n2;
		System.out.println("A subtração dos valores é: "+result);
	}
	void mult(double n1, double n2) {
		double result = n1 * n2;
		System.out.println("A multiplicação dos valores é: "+result);
	}
	void div(double n1, double n2) {
		double result = n1 / n2;
		System.out.println("A divisão dos valores é: "+result);
	}
}
