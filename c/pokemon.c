#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "pokemon.h"


void adicionarTipo(struct Pokemon* pokemon, enum Tipo tipo) {
    for (int i = 0; i < 3; i++) {
        if (pokemon->tipos[i] == -1) {
            pokemon->tipos[i] = tipo;
            break;
        }
    }
}


void adicionarPokemon(struct Time* time, struct Pokemon* pokemon) {
    if (time->quantidade < 6) {
        time->pokemons[time->quantidade++] = pokemon;
    }
}


void removerPokemon(struct Time* time, struct Pokemon* pokemon) {
    for (int i = 0; i < time->quantidade; i++) {
        if (time->pokemons[i] == pokemon) {
            time->pokemons[i] = NULL;
            for (int j = i; j < time->quantidade - 1; j++) {
                time->pokemons[j] = time->pokemons[j + 1];
            }
            time->quantidade--;
            break;
        }
    }
}


struct Pokemon* buscarPokemon(struct Time* time, char* nome) {
    for (int i = 0; i < time->quantidade; i++) {
        if (strcmp(time->pokemons[i]->nome, nome) == 0) {
            return time->pokemons[i];
        }
    }
    return NULL;
}


struct Pessoa criarPessoa(char* nome, int idade, struct Time* time) {
    struct Pessoa pessoa;
    strcpy(pessoa.nome, nome);
    pessoa.idade = idade;
    pessoa.time = time;
    return pessoa;
}


struct Treinador criarTreinador(char* nome, int idade, struct Time* time) {
    struct Treinador treinador;
    treinador.pessoa = criarPessoa(nome, idade, time);
    treinador.quantidadeInsignias = 0;
    return treinador;
}


void associarTimeAoTreinador(struct Treinador* treinador, struct Time* time) {
    treinador->pessoa.time = time;
}


void adicionarInsignia(struct Treinador* treinador, enum Insignias insignia) {
    if (treinador->quantidadeInsignias < 8) {
        treinador->insigniasVencidas[treinador->quantidadeInsignias++] = insignia;
    }
}


void mostrarTimeDoTreinador(struct Treinador* treinador) {
    if (treinador->pessoa.time) {
        printf("Time do Treinador %s:\n", treinador->pessoa.nome);
        for (int i = 0; i < treinador->pessoa.time->quantidade; i++) {
            if (treinador->pessoa.time->pokemons[i] != NULL) {
                printf("- %s\n", treinador->pessoa.time->pokemons[i]->nome);
            }
        }
    } else {
        printf("O treinador %s não possui um time de Pokémon.\n", treinador->pessoa.nome);
    }
}