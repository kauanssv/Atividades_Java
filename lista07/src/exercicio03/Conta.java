package exercicio03;

public class Conta {
	double saldo;
	String nrAgencia;
	String titular;
	String nrConta;
	int codBanco;
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNrAgencia() {
		return nrAgencia;
	}
	public void setNrAgencia(String nrAgencia) {
		this.nrAgencia = nrAgencia;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNrConta() {
		return nrConta;
	}
	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}
	public int getCodBanco() {
		return codBanco;
	}
	public void setCodBanco(int codBanco) {
		this.codBanco = codBanco;
	}
}
