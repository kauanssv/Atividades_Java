package exercicio01;

public class TesteAgencia {
	public static void main(String[] args) {
		Agencia a = new Agencia();
		a.setNrAgencia("1");
		a.setCodBanco(234);
		System.out.println("AGENCIA: "+a.getNrAgencia());
		System.out.println("BANCO: "+a.getCodBanco());
	}
}
