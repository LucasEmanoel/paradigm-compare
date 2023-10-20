package treinador;

import pokedex.Time;

public class LiderGym extends Pessoa{
	private Insignias insignia;
	
	public LiderGym(String nome, Integer idade, Time time, Insignias i) {
		super(nome, idade, time);
		this.insignia = i;
	}

	public Insignias getInsignia() {
		return insignia;
	}

	public void setInsignia(Insignias insignia) {
		this.insignia = insignia;
	}
	
	
}
