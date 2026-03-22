package aula0603;

public class App3 {
	public static void main(String[] args) {
		int resultado = 0;
		//Array e Vetores
		String nome[] = new String[3];
		nome[0] = "Kauan";
		nome[1] = "Anna";
		nome[2] = "Saulo";
		
		int valor[] = {10, 10, 10};
		
		for(int i = 0; i < 3; i++) {
			int nGuardado = valor[i];
			resultado += nGuardado;
		}
		System.out.println("Valor somado: " + resultado);
	}
}
