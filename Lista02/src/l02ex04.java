import java.util.Scanner;
import java.util.Random;
public class l02ex04{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Digite um numero minimo e depois um maximo");
		int min = sc.nextInt();
		int max = sc.nextInt();
		int r = rd.nextInt(max - min + 1) + min;
		System.out.println(r);
	}

}
