package aula0603;
import java.util.Scanner;

public class App1 {
	public static void main(String[] args) {
		// Entrada de dados via teclado
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um nome");
		String nome = sc.nextLine();
		System.out.println("Digite sua idade");
		int idade = sc.nextInt();	
		System.out.println("Digite uma nota");
		double nota = sc.nextDouble();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Nota: " + nota);
	}
}
