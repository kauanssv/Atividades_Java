
public class Eleitoral {
	private String nome;
	private int idade;
	
	public Eleitoral(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public void imprimir() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
	}
	public void verificar() {
		if(idade < 16) {
			System.out.println("O Eleitor não pode votar");
		}else if(idade >= 16 && idade <= 65) {
			System.out.println("O Eleitor deve Votar");
		}else if(idade > 65) {
			System.out.println("Voto facultativo");
		}
	}
}
