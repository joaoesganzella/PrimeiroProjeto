package exe3;

public class Conta {

	//atributo
	int numeroConta;
	String tipoConta, titularConta;
	double saldo, valor;
	
	//construtor
	public Conta(int numeroConta, String tipoConta, String titularConta, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.titularConta = titularConta;
		this.saldo = saldo;
	}
	
	
	//metodo
	void depositar(double valor){
		saldo = saldo + valor;
	}
	void sacar(double valor) {
		if(saldo<valor) {
			System.out.println("Saldo insuficiente.");
		} else {
			saldo = saldo - valor;
		}
	}
	void verificarSaldo(double n1, double n2) {
		
	}
	
	 void verificarSaldo(double conta) {
	        System.out.println("Títular da conta: "+titularConta);
	        System.out.println("Numero da conta: "+numeroConta);
	        System.out.println("Tipo da conta: "+tipoConta);
	        System.out.println("Saldo atual: "+saldo);
	    }
	
	
}
