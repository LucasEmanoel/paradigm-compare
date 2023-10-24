#ifndef POKEMON_H
#define POKEMON_H


enum Tipo {
    VENENO, GRAMA, INSETO, FOGO, AGUA, TERRA, AR
};

enum Insignias {
    ROCHA, CASCATA, TROVAO, ALMA
};


struct Pokemon {
    char nome[50];
    struct Pokemon* baseEvolucao;
    struct Pokemon* evolucao;
    enum Tipo tipos[3];
};


struct Time {
    struct Pokemon* pokemons[6];
    int quantidade;
};


struct Pessoa {
    char nome[50];
    int idade;
    struct Time* time;
};


struct Treinador {
    struct Pessoa pessoa;
    enum Insignias insigniasVencidas[8];
    int quantidadeInsignias;
};

void adicionarTipo(struct Pokemon* pokemon, enum Tipo tipo);

void adicionarPokemon(struct Time* time, struct Pokemon* pokemon);

void removerPokemon(struct Time* time, struct Pokemon* pokemon);

struct Pokemon* buscarPokemon(struct Time* time, char* nome);

struct Pessoa criarPessoa(char* nome, int idade, struct Time* time);

struct Treinador criarTreinador(char* nome, int idade, struct Time* time);

void associarTimeAoTreinador(struct Treinador* treinador, struct Time* time);

void adicionarInsignia(struct Treinador* treinador, enum Insignias insignia);

void mostrarTimeDoTreinador(struct Treinador* treinador);

#endif
