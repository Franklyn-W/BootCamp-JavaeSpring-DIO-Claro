# Operações básicas com List

Nessa pasta estão os arquivos e anotações criados durante as aulas sobre List e seus exercicios.

* A interface `List` é uma coleção ordenada que permite a inclusão de elementos duplicados.
* É um dos tipos de coleção mais utilizado em Java, e as classes de implementação comuns são `ArrayList` e `LinkedList`.
* A list se assemelha a uma matrizz com comprimento dinâmico, permitindo adicionar ou remover elementos.
* A interface `List` fornece métodos úteis para adicionar elementos em posições específicas, remover ou substituir elementos com base no índice e obter sublistasusando índices.
* A classe `Collections` fornece algoritmos úteis para a manipulação de `List`, como ordenação (`sort`), embaralhamento (`shuffle`), reversão (`reverse`) e busca binária (`binarySearch`).

## Exercicios
### Operações básicas com List
1. Lista de Tarefas
Crie uma classe chamada "ListaTarefas" que possui uma lista das tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. Implemente os seguntes métodos.
* `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa à lista com a descrição fornecida.
* ``removerTarefa(String descricao)``: Remove uma tarefa da lista com base em sua descrição
* ``obterNumeroTotalTarefa()``: Retorna o número total de tarefas na lista
* ``obterDescricoesTarefas()``: Retorna uma lista contendo a descricao de todas as tarefas na lista.

2. Carrinho de compras
Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. O carrinho deve ser implementado como uma lista de itens. Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade. Implemente os seguintes métodos:

* ``adicionarItem(String nome, double preco, int quantidade)``: Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
* ``removerItem(String nome)``: Remove um item do carrinho com base no seu nome.
* ``calcularValorTotal()``: Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
* ``exibirItens()``: Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.


### Pesquisa em List
1. Catálogo de Livros
Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. Cada livro possui atributos como título, autor e ano de publicação. Implemente os seguintes métodos.
* `adicionarLivro(String titulo, String autor, int anoPublicacao)`: Adiciona uma livro ao catalogo
* `pesquisarPorAutor(String autor)`: Pesquisa livros por autor e retorna uma lista com os livros encontrados.
* `pesquisaPorIntervalorAnos(int anoInicial, int anoFinal)`: Pesquisa os livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados
* `pesquisarPorTitulo(String titulo)`: Pesquisa livros por titulo e retorna o primeiro livro encontrado.

2. Soma de números
Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos.
* ``adicionarNunmero(int numero)``: Adiciona um número à lista de números.
* ``calcularSoma()``: Calcula a soma de todos os números na lista e retorna o resultado.
* ``encontrarMaiorNumero()``: Encontra o maior número na lista e retorna o valor.
* ``encontrarMenorNumero()``: Encontra o menor número na lista e retorna o valor.
* `exbibirNumeros()`: Retorna uma lista contendo todos os números presentes na lista.