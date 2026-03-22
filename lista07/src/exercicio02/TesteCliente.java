package exercicio02;

public class TesteCliente {
	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.setNomeCliente("FULANO");
		c.setCpfCliente("234232323");
		System.out.println("NOME: "+c.getNomeCliente());
		System.out.println("CPF: "+c.getCpfCliente());
	}
}
