# Atividades em Java (UMC)
Repositorio organizado por aula para facilitar estudo e revisao.
## Estrutura final (3 atividades)
- `2026-03-02-poo-basico-lanche-carro/`
- `2026-03-02-poo-livro-estoque/`
- `2026-02-26-lanchonete/`
## O que foi feito em cada aula
### 1) `2026-03-02-poo-basico-lanche-carro`
- Pratica de POO basica com classes simples.
- Classe `Lanche` com atributos (`nome`, `preco`, `descricao`) e metodo `exibir()`.
- Classe `Carro` com atributos (`modelo`, `marca`, `ano`) e metodo `exibirInformacoes()`.
- `Main` instancia objetos e mostra dados no console.
### 2) `2026-03-02-poo-livro-estoque`
- Classe `Livro` com construtor e controle de estoque.
- Metodos principais:
  - `emprestaLivro(int quantidade)`
  - `devolveLivro(int quantidade)`
  - `valorTotal()`
  - `exibirInformacoes()`
- `Main` cria livros, simula emprestimo/devolucao e exibe resultado.
### 3) `2026-02-26-lanchonete`
- Atividade de lanchonete com `Main` e entidade `Lanche` em `src/entidades`.
- Aplicacao com menu no console para:
  - realizar pedido
  - atualizar estoque
  - alterar preco e descricao
  - consultar informacoes do lanche
## Como compilar e executar
### Atividade 1: POO basico
```bash
cd /home/bcr/Projetos/Atividades/UMC/Atividade-em-Java/2026-03-02-poo-basico-lanche-carro
mkdir -p out
javac -d out src/*.java
java -cp out Main
```
### Atividade 2: Livro e estoque
```bash
cd /home/bcr/Projetos/Atividades/UMC/Atividade-em-Java/2026-03-02-poo-livro-estoque
mkdir -p out
javac -d out src/*.java
java -cp out Main
```
### Atividade 3: Lanchonete
```bash
cd /home/bcr/Projetos/Atividades/UMC/Atividade-em-Java/2026-02-26-lanchonete
mkdir -p out
javac -d out src/Main.java src/entidades/Lanche.java
java -cp out Main
```
## Observacao
Se o comando `java` ou `javac` nao existir no terminal, instale o JDK e tente novamente.
