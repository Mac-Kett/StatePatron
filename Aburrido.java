
public class Aburrido implements State{
	
	private Tamagotchi tamagotchi;
	
	@Override
	public void jugar() {
		System.out.println("Genial! Juguemos!");;
		tamagotchi.setEstado(new Cansado());
	}
	
	@Override
	public void alimentar() {
		System.out.println("No quiero!");;

	}
	
	@Override
	public void dormir() {
		System.out.println("No quiero!");;

	}
	
	@Override
	public void comoEstas() {
		System.out.println("Estoy aburrido, quiero jugar!");;

	}
	
	@Override
	public void setTamagotchi(Tamagotchi t) {
		this.tamagotchi = t;
	}
}
