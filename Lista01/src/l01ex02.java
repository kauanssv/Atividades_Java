import java.util.Scanner;
public class l01ex02 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor e a quantidade do item 1");
		double valor1 = sc.nextDouble();
		int quant1 = sc.nextInt();
		System.out.println("Digite o valor e a quantidade do item 2");
		double valor2 = sc.nextDouble();
		int quant2 = sc.nextInt();
		
		double r = (valor1 * quant1) + (valor2  * quant2);
		System.out.println("Resultado: "+r);
	}
}
