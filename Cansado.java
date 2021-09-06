
public class Cansado implements State{

	private Tamagotchi tamagotchi;
	
	@Override
	public void jugar() {
		System.out.println("No quiero!");;
	}
	
	@Override
	public void alimentar() {
		System.out.println("No quiero!");;

	}
	
	@Override
	public void dormir() {
		System.out.println("Buenas noches!");;
		tamagotchi.setEstado(new Durmiendo());

	}
	
	@Override
	public void comoEstas() {
		System.out.println("Estoy cansado, quiero dormir.");;

	}
	
	@Override
	public void setTamagotchi(Tamagotchi t) {
		this.tamagotchi = t;
	}
}

