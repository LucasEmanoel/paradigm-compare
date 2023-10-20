package treinador;

import java.util.List;

import pokedex.Time;

public class Treinador extends Pessoa{
	private List<Insignias> insigniasVencidas;
	
	public Treinador(String nome, Integer idade, Time time) {
		super(nome, idade, time);
	}
	
	public void addInsignia(Insignias i) {
		this.insigniasVencidas.add(i);
	}
		
	public List<Insignias> getInsigniasVencidas() {
		return insigniasVencidas;
	}

	public void setInsigniasVencidas(List<Insignias> insigniasVencidas) {
		this.insigniasVencidas = insigniasVencidas;
	}
	
	
	
}
