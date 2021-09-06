import java.util.Scanner;

public class Menu {

	Tamagotchi tamagotchi;
	
	public Menu(Tamagotchi t) {
		this.tamagotchi = t;
	}
	
	public void display() {
		Scanner scanner = new Scanner(System.in);
		char opcion;
		String mensajeOpciones = "Realizar opción: " + "a) alimentar d) dormir j) jugar p) preguntar s)salir";
		boolean loop = true;
		
		while(loop) {
			System.out.println(mensajeOpciones);
			opcion = scanner.next().charAt(0);
			switch(opcion) {
			case 'a' : tamagotchi.alimentar();
			break;
			case 'd' : tamagotchi.dormir();
			break;
			case 'j' : tamagotchi.jugar();
			break;
			case 'p' : tamagotchi.comoEstas();
			break;
			case 's' : System.out.println("Hasta pronto!");
			loop = false;
			break;
			default : System.out.println("Opción no válida.");
			}
		}
	}
}
