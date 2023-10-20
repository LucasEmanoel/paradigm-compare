package main;

import java.util.ArrayList;
import java.util.Arrays;

import pokedex.*;
import pokemon.Pokemon;
import pokemon.Tipo;
import treinador.Insignias;
import treinador.Treinador;


public class main {

	public static void main(String[] args) {
		
		Time time = new Time(new ArrayList<Pokemon>());
		Treinador treinador = new Treinador("Lucas", 24, new Time());
		
		Pokemon bulbasaur = new Pokemon("Bulbasaur", null, null, new ArrayList<Tipo>(Arrays.asList(Tipo.VENENO,Tipo.GRAMA)));
		Pokemon ivysaur = new Pokemon("Ivysaur", bulbasaur, null, new ArrayList<Tipo>(Arrays.asList(Tipo.VENENO,Tipo.GRAMA)));
		Pokemon venusaur = new Pokemon("Venusaur", ivysaur, null, new ArrayList<Tipo>(Arrays.asList(Tipo.VENENO,Tipo.GRAMA)));
		
		bulbasaur.setEvolucao(ivysaur);
		ivysaur.setEvolucao(venusaur);
		
		time.addPokemon(venusaur);
		time.addPokemon(ivysaur);
		

		
		
		for (Pokemon p : time.getPokemons()) {
			System.out.println(p.getNome());
		}
		
	}

}
