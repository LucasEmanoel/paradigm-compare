#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "pokemon.h"

int main(int argc, char* argv[]) {
   
    struct Pokemon bulbasaur, charmander, pikachu;
    strcpy(bulbasaur.nome, "Bulbasaur");
    strcpy(charmander.nome, "Charmander");
    strcpy(pikachu.nome, "Pikachu");
    
    struct Time time;
    time.quantidade = 0;
    
    adicionarPokemon(&time, &bulbasaur);
    adicionarPokemon(&time, &charmander);
    adicionarPokemon(&time, &pikachu);
    
    struct Treinador ash = criarTreinador("Ash", 10, &time);
    
    adicionarInsignia(&ash, ROCHA);
    
    printf("Treinador: %s\n", ash.pessoa.nome);
    printf("Idade: %d\n", ash.pessoa.idade);
    printf("Insignias: %d\n", ash.quantidadeInsignias);
    
    mostrarTimeDoTreinador(&ash);
    
    return 0;
}