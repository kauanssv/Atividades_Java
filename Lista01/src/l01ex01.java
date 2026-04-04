import java.util.Scanner;
public class l01ex01 {
	public static void main(String[]args) {
		System.out.println("Digite 3 nomes");
		Scanner sc = new Scanner(System.in);
		String nome1 = sc.nextLine();
		String nome2 = sc.nextLine();
		String nome3 = sc.nextLine();
		System.out.println(nome1 + "\n" + nome2 + "\n" + nome3);
	}
}
