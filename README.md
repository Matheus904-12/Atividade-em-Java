# 🚀 Atividades em Java - UMC

Este repositório contém as atividades desenvolvidas durante as aulas de Java na UMC (Universidade Mogi das Cruzes). O objetivo é organizar o aprendizado de Programação Orientada a Objetos (POO) e estruturas de dados.

## 📂 Estrutura do Repositório

O projeto está organizado por pastas datadas, cada uma representando uma aula ou atividade específica:

### 🆕 Atividades Recentes
*   **`2026-03-17-gerenciador-crud/`**: Sistema completo de gerenciamento de produtos com operações CRUD (Create, Read, Update, Delete) utilizando `ArrayList`.
*   **`2026-03-12-crudalunos/`**: Prática de manipulação de listas com um sistema de cadastro de alunos.

### 📚 Histórico de Aulas
*   **`2026-03-05-ArrayList/`**: Introdução ao uso da classe `ArrayList` em Java.
*   **`2026-03-02-poo-livro-estoque/`**: Exercício de controle de estoque de livros com métodos de empréstimo e devolução.
*   **`2026-03-02-poo-basico-lanche-carro/`**: Primeiros passos em POO com classes `Lanche` e `Carro`.
*   **`2026-02-26-lanchonete/`**: Sistema de pedidos para uma lanchonete com menu interativo.
*   **`2026-02-20-lanchonete/`**: Versão inicial do sistema de lanchonete.

---

## 🛠️ Como Executar

Para executar qualquer uma das atividades, navegue até a pasta desejada e utilize os comandos `javac` e `java`.

### Exemplo: Gerenciador de Produtos (CRUD)
```bash
cd 2026-03-17-gerenciador-crud
javac *.java
java Main
```

### Exemplo: CRUD de Alunos
```bash
cd 2026-03-12-crudalunos/CrudAlunos
javac -d bin src/*.java src/entidades/*.java
java -cp bin src.Main
```

---

## 🔧 Requisitos
*   Java Development Kit (JDK) instalado (versão 17 ou superior recomendada).
*   Configuração correta das variáveis de ambiente (`JAVA_HOME`).

## 📝 Observações
O repositório foi limpo para remover arquivos desnecessários (como o JDK completo) e manter apenas o código-fonte e configurações essenciais do projeto.
