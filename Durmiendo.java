
public class Durmiendo implements State{

	private Tamagotchi tamagotchi;
	
	@Override
	public void jugar() {
		System.out.println("Zzz");;
	}
	
	@Override
	public void alimentar() {
		System.out.println("Zzz");;

	}
	
	@Override
	public void dormir() {
		System.out.println("Zzz");;
		tamagotchi.setEstado(new Dormir());

	}
	
	@Override
	public void comoEstas() {
		System.out.println("Zzz");;

	}
	
	@Override
	public void setTamagotchi(Tamagotchi t) {
		this.tamagotchi = t;
		
		Timer timer = new Timer();
		time.schedule(new TimerTask() {
			
			@Override
			public void run() {
				Durmiendo.this.tamagotchi.setEstado(new Hambriento);
			}
		}, 30000);
	}
}
