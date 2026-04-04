import java.util.Scanner;
public class l01ex04 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 4 valores inteiros");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int soma = n1 + n2 + n3 + n4;
		int media = soma / 4;
		System.out.println("A some é: "+soma);
		System.out.println("A média é: "+media);
	}
}
