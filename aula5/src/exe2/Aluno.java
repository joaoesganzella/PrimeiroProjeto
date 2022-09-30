package exe2;

public class Aluno {

	String nome;
	int idade;
	double n1, n2, n3, media;
	
	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	void calcularMedia(double n1, double n2, double n3) {
		media = (n1 + n2 + n3) / 3;
		System.out.println("M�dia = "+media);
	}
	
	void verificarAprovacao() {		
		if(media >= 7) {
			System.out.println(nome+" de "+idade+" anos, voc� est� Aprovado");
		} else if(media >= 5) {
			System.out.println(nome+" de "+idade+" anos, voc� est� em Exame");
		} else {
			System.out.println(nome+" de "+idade+" anos, voc� est� Reprovado");
		}		
	}
	

}