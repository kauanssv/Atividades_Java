
public class l02ex03 {
	public static void main(String[]args) {
		int n = 0;
		for(int c = 1; c <= 15; c++) {
			if(c % 2 == 1) {
				n+=c;
			}
		}
		System.out.println(n);
	}
}
