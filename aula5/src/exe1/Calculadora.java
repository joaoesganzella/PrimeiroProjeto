package exe1;

public class Calculadora {

	double n1;
	double n2;
	
	void soma(double n1, double n2) {
		double result = n1 + n2;
		System.out.println("A soma dos valores �: "+result);
	}
	void sub(double n1, double n2) {
		double result = n1 - n2;
		System.out.println("A subtra��o dos valores �: "+result);
	}
	void mult(double n1, double n2) {
		double result = n1 * n2;
		System.out.println("A multiplica��o dos valores �: "+result);
	}
	void div(double n1, double n2) {
		double result = n1 / n2;
		System.out.println("A divis�o dos valores �: "+result);
	}
}
