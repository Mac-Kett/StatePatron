
public class Tamagotchi {

	private State estado;
	
	public Tamagotchi() {
		setEstado(new Aburrido());
	}
	
	public void setEstado(State estado) {
		this.estado = estado;
		this.estado.setTamagotchi(this);
	}
	
	public void jugar() {
		this.estado.jugar();
	}
	
	public void alimentar() {
		this.estado.alimentar();
	}
	
	public void dormir() {
		this.estado.dormir();
	}
	
	public void comoEstas() {
		this.estado.comoEstas();
	}
	
}
