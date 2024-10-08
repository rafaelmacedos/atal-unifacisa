# Sistema de Gerenciamento de Livros 

Este é um projeto simples em Java que implementa algoritmos de ordenação.

## Funcionalidades

O sistema oferece as seguintes operações no terminal:

1. **Adicionar Livro**: Permite adicionar um novo livro informando título, autor e ano de publicação.
2. **Listar Livros**: Exibe todos os livros cadastrados no sistema.
3. **Ordenar Livros**: Ordena os livros cadastrados com base no título.
4. **Buscar Livro por Título**: Busca um livro específico pelo título.

### Estrutura do Projeto

O projeto está estruturado em três arquivos principais:

- `Main.java`: Contém o menu interativo para o usuário realizar as operações.
- `SequentialList.java`: Implementa a lista sequencial para armazenar os livros e oferece operações como adicionar, remover, buscar, e ordenar.
- `Book.java`: Define o modelo de um livro com os atributos `id`, `title`, `authorName`, e `publicationYear`, além de implementar a interface `Comparable` para ordenar os livros por título.

## Como Executar o Projeto

### Pré-requisitos

- [JDK 8+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) deve estar instalado no sistema.
- Um IDE Java ou terminal configurado para compilar e executar código Java.

### Passos

1. Clone este repositório ou baixe os arquivos do projeto.

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

2. Navegue até o diretório do projeto e compile o código-fonte:

    ```cd seu-repositorio
    javac Main.java
   
3. Execute o projeto. 
    ```cd seu-repositorio
    java Main
   
4. Siga as instruções do menu no terminal para interagir com o sistema.

## Estrutura do Menu
 ```cd seu-repositorio
1 - Adicionar Livro: O usuário insere os dados do livro para adicionar à lista.
2 - Listar Livros: Exibe todos os livros cadastrados.
3 - Ordenar Livros: Ordena os livros por título.
4 - Buscar Livro por Título: Realiza a busca de um livro específico pelo título.
0 - Sair: Encerra o programa.
```

# Exemplo de Uso
Menu Inicial:
```
Escolha uma opção:
1 - Adicionar Livro
2 - Listar Livros
3 - Ordenar Livros
4 - Buscar Livro por título
0 - Sair
```

Livros Previamente Cadastrados:
O sistema já vem com os seguintes livros cadastrados:

- Senhor dos Anéis: A Sociedade do Anel (1954) - J.R.R Tolkien
- Diário de um Banana (2007) - Jeff Kinney
- Essencialismo (2014) - Greg McKeown
- Java do Zero (2023) - Daniel Abella
- Fundação (1951) - Isaac Asimov
- Fogo & Sangue (2023) - George R. R. Martin
- Como Fazer Amigos e Influenciar Pessoas (1936) - Dale Carnegie
- Harry Potter e a Pedra Filosofal (1997) - J.K. Rowling
- Senhor dos Anéis: As Duas Torres (1954) - J.R.R Tolkien
- Senhor dos Anéis: O Retorno do Rei (1954) - J.R.R Tolkien
- O Silmarillion (1977) - J.R.R Tolkien
- Entendendo Algoritmos (2017) - Aditya Bhargava

###  O usuário pode adicionar mais livros ou operar sobre os já existentes.

## Autores

- Pedro Azevedo Teixeira
- Pedro Henrique Pereira
- Gil Gilberto
- Gustavo Franklin
- Rafael Macedo
- Ramon Montenegro
