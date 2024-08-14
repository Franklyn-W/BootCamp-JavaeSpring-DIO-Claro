# Conceitos Básicos e Estrutura do Banco de Dados Relacional

### Tipos de banco de dados
* Relacionais/SQL
* Não Relacionais/NoSQL
* Orientado a Objetos
* Hierárquico

Um banco de dados por si só não é auto-controlado, sendo necessario o uso de um SGBD (Sistema de Gerenciamento de Banco de Dados), ele vão nos fornecer um conjunto de ferramentas e recursos para que seja possivel criar e manipular os banco de dados e suas informações que forem armazenadas.

### Funcionalidades básicas
* Create (Criar)
* Read (Ler)
* Update (Atualizar)
* Delete (Apagar)

### Estrutura de um BD Relacional

* Banco de dados
  * Tabela
    * Colunas
      * Tuplas/linhas/registros

### Características
* Relacionamento entre tabelas
* Linguagem de Consulta Estruturada (SQL)
* Integridade referencial
* Normalização dos dados
* Segurança
* Flexibilidade e extensibilidade
* Suporte a transações ACID

#### ACID
* Atomicidade - Garante a execução de todas as transações em caso de sucesso ou o cancelamento da execução da transação caso haja algum erro, mantendo o estado anterior das informações.
* Consistência - Garante a consistencia das informções armazenadas após cada transação, repeitando todas as regras pré-existentes.
* Isolamento - Cada transação é executada de forma isolada
* Durabilidade - Uma vez que a transação foi confirmada, a alteração nos dados é permante e não será resetado por alguma problema posterior

## Conceitos Básicos de SQL

### Organização da SQL
* DQL - Linguagem de Consulta de Dados
  * SELECT
* DML - Linguagem de Manipulação de dados
  * INSERT, UPDATE e DELETE
* DDL - Linguagem de Definição de Dados
  * CREAT, ALTER, DROP.
* DCL - Linguagem de Controle de dados
  * GRANT, REVOKE
* DTL - Linguagem de Transação de Dados
  * BEGIN, COMMIT, ROLLBACK

### Sintaxe Básica: Nomenclatura
* Os nome devem começar com uma letra ou com um caractere de sublinhado (_)
* Sensibilidade a maiúsculas e minúsculas

## MER e DER: Modelagem de banco de dados

* MER: Modelo de Entidade de Relacionamento
  * Modelo conceitutal utilizada para visualizar a estrutura geral do banco de dados.
  * Descreve as entidades, atributos e relacionamento entre as entidades.
* DER: Diagrama de Entidade de Relacionamento
  * Represenração gráfica do MER
  * Utiliza simbolos e convenções para apresentar as entidades, atributos e relacionamentos

### Entidades
As entidade são nomeadas com subtantivos concretos ou abstratos que representem de forma clara sua função dentro do domínio.

### Atributos
Os atributos são as características ou propriedades das entidades. Eles descrevem informações específicas sobre uma entidade.

### Relacionamentos
Os relacionamentos representam as associações entre entidades.