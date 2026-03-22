package aula0603;
import java.util.Scanner;
public class App2 {
	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro valor");
		n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior valor é o n1, valor: " + n1);
		}else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior valor é o n2, valor: " + n2);
		}else if(n3 > n1 && n3 > n2){
			System.out.println("O maior valor é o n3, valor: " + n3);
		}
	}

}
