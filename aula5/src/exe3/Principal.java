package exe3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int opcao,cont,conta,numeroConta;
        double valor;
        Scanner scan = new Scanner(System.in);
        Conta conta1 = new Conta(235287, "Corrente", "Paulo", 2000);
        Conta conta2 = new Conta(246893, "Poupan�a", "Pedro", 15500);
        cont=1;
        while(cont!=0) {
            System.out.println("Qual opera��o voc� deseja realizar? ");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Ver dados da conta");
            System.out.println("0 - sair");
            opcao = scan.nextInt();
            if (opcao==1) {
                System.out.println("De qual conta voc� deseja sacar? ");
                System.out.println("1 - Conta 1");
                System.out.println("2 - Conta 2");
                conta = scan.nextInt();
                
                System.out.println("Qual valor voc� deseja sacar?");
                valor = scan.nextDouble();
                    if(conta==1) {
                        conta1.sacar(valor);
                    }
                    else {
                        conta2.sacar(valor);
                    }
                }
            
            else if (opcao==2) {
                System.out.println("Em qual conta voc� deseja depositar? ");
                System.out.println("1 - Conta 1");
                System.out.println("2 - Conta 2");
                conta = scan.nextInt();
                
                System.out.println("Qual valor voc� deseja depositar?");
                valor = scan.nextDouble();
                    if(conta==1) {
                        conta1.depositar(valor);
                    }
                    else {
                        conta2.depositar(valor);
                    }
                }
            
            else if (opcao==3) {
                System.out.println("Qual conta voc� deseja visualizar as informa��es?");
                System.out.println("1 - Conta 1");
                System.out.println("2 - Conta 2");
                conta = scan.nextInt();
                
                if (conta==1) {
                    conta1.verificarSaldo(conta);
                }
                else {
                    conta2.verificarSaldo(conta);
                }
                    
                }
            
        }
    }
}

