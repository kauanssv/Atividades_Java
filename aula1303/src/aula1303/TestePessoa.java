package aula1303;

public class TestePessoa {
	public static void main(String[] args) {
		//crir o objeto pessoa
		Pessoa p = new Pessoa(21, "Anna");
		//inicializar os atributos
		//p.setIdade(21);
		//
		p.setNome("Anna");
		System.out.println("Idade...: "+p.getIdade());
		System.out.println("Nome...: "+p.getNome());
	}
}
