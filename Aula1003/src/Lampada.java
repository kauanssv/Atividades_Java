
public class Lampada {
	private boolean status;
	
	private void ligar() {
		status = true;
	}
	private void desligar() {
		status = false;
	}
	private void observar() {
		if(status == true) {
			System.out.println("Lampada LIGADA");
		}else if(status == false) {
			System.out.println("Lampada DESLIGADA");
		}
	}
}
