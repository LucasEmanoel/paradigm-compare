package pokemon;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
	
	private String nome;
	private Pokemon baseEvolucao;
	private Pokemon evolucao;
	private List<Tipo> tipos;
	
	public Pokemon() {}
	
	public Pokemon(String nome, Pokemon baseEvolucao, Pokemon evolucao) {
		super();
		this.nome = nome;
		this.baseEvolucao = baseEvolucao;
		this.evolucao = evolucao;
	}
	
	public Pokemon(String nome, Pokemon baseEvolucao, Pokemon evolucao, ArrayList<Tipo> tipos) {
		super();
		this.nome = nome;
		this.baseEvolucao = baseEvolucao;
		this.evolucao = evolucao;
		this.tipos = tipos;
	}

	public void addTipo(Tipo tipo) {
		this.tipos.add(tipo);
	}
	
	public void removeTipo(Tipo tipo) {
		this.tipos.remove(tipo);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pokemon getBaseEvolucao() {
		return baseEvolucao;
	}
	public void setBaseEvolucao(Pokemon baseEvolucao) {
		this.baseEvolucao = baseEvolucao;
	}
	public Pokemon getEvolucao() {
		return evolucao;
	}
	public void setEvolucao(Pokemon evolucao) {
		this.evolucao = evolucao;
	}

	public List<Tipo> getTipos() {
		return tipos;
	}

	public void setTipos(List<Tipo> tipos) {
		this.tipos = tipos;
	}

	@Override
	public String toString() {
		return "Pokemon [nome=" + nome + ", baseEvolucao=" + baseEvolucao + ", evolucao=" + evolucao;
	}
	
	
}
