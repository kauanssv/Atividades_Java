
public class Lampada {
	boolean status;
	public void ligar() {
		status = true;
	}
	public void desligar() {
		status = false;
	}
	public void observar() {
		if(status == true) {
			System.out.println("A lampada está: ligada");
		}else {
			System.out.println("A lampada está: desligada ");
		}
	}
	
}
