## Getters e Setters
Seguindo a convensão Java Beans

Os métodos "Getters" e "Setters" são utilizados para buscar valores de atributos ou definir novos valores de atributos de instâncias de classes.

O método **Getter** retorna o valor do atributo especificado.

O método **Setter** define outro novo valore para o atributo especificado.

Veja nos arquivos da pasta o código da criação de um objeto Aluno com nome e idade

Seguindo a convenção Java Beans, um classe que contém esta estrutura de estados deverá seguir as regras abaixo:
* Os atributos precisar ter o modificador de acesso `private`.
* Como agora os atributos estarão "visiveis" somente a nível de classe, precisaremos dos métodos **get**X e **set**X, exemplo: getNome() e SetNome(String novoNome);
* O método **get** é responsável por obter o valor atual do atributo, logo ele ser `public` e retornar um tipo correspondente ao valor, exemplo: `public String getNome(){}`.
* O método **set** é responsável por definir ou modificar o valor de um atributo em um objeto, logo ele tambpem precisa ser `public`, receber um parâmetro do mesmo tipo da variável, mas não retorna nenhum valor, pois é do tipo void. Exemplo: `public void setName(String newNome)`.