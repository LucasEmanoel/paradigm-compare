package pokedex;

import java.util.List;

import pokemon.Pokemon;

public class Pokedex {
	private List<Pokemon> pokemons;

	public Pokedex() {}
	
	public Pokedex(List<Pokemon> pokemons) {
		super();
		this.pokemons = pokemons;
	}
	
	public void addPokemon(Pokemon pokemon) {
		this.pokemons.add(pokemon);
	}
	
	public void removePokemon(Pokemon pokemon) {
		this.pokemons.remove(pokemon);
	}
	
	public Pokemon searchPokemon(String name) {
		for (Pokemon pokemon : pokemons) {
			if(pokemon.getNome().equals(name)) {
				return pokemon;
			}
		}
		return null;
	}

	public List<Pokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(List<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}
	
	
}
