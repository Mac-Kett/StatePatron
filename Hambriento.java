
public class Hambriento implements State{

	private Tamagotchi tamagotchi;
	
	@Override
	public void jugar() {
		System.out.println("No quiero! Tengo hambre");;
	}
	
	@Override
	public void alimentar() {
		System.out.println("Ñam!");;
		tamagotchi.setEstado(new Aburrido());
	}
	
	@Override
	public void dormir() {
		System.out.println("No quiero!");;
	}
	
	@Override
	public void comoEstas() {
		System.out.println("Estoy hambriento! Dame de comer!");

	}
	
	@Override
	public void setTamagotchi(Tamagotchi t) {
		this.tamagotchi = t;
	}

}
