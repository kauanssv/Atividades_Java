package exercicio03;

public class TesteConta {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.setNrAgencia("1");
		c.setCodBanco(234);
		c.setNrConta("01945");
		c.setTitular("FULANO");
		c.setSaldo(10000);
		System.out.println("AGENCIA: "+c.getNrAgencia()+" BANCO: "+c.getCodBanco());
		System.out.println("CONTA CORRENTE: "+c.getNrConta());
		System.out.println("TITULAR: "+c.getTitular());
		System.out.println("SALDO: "+c.getSaldo());
	}
}
