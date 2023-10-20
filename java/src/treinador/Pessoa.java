package treinador;

import pokedex.Time;

public abstract class Pessoa {
	
	private String nome;
	private Integer idade;
	private Time time;
	
	public Pessoa(String nome, Integer idade, Time time) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.time = time;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Time gettime() {
		return time;
	}
	public void settime(Time time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Treinador [nome=" + nome + ", idade=" + idade;
	}
	
}
