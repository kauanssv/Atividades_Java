import java.util.Scanner;
public class l01ex03 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a largura");
		double largura = sc.nextDouble();
		System.out.println("Digite o comprimento");
		double comprimento = sc.nextDouble();
		double area = largura * comprimento;
		System.out.println("A Area é: "+area);
	}
}
