## Enums
Enum é um tipo especial de classe onde os objetos são previamente criados, imutáveis e disponíveis por toda aplicação.

Usamos Enum quando o nosso modelo de negócio contém objetos de contexto que já existem de pré estabelecida com a certeza de não haver tanta alteração de valores.

Exemplos:
* **Grau de escolaridade**: Analfabeto, Fundamental, Médio e Superior.
* **Estado Civil**: Solteiro, Casado, Divorciado e Viúvo.
* **Estado Brasileiros**: São Paulo, Rio de Janeiro, Paraíba, Pernambuco, ....

> Não confunda uma lista de constante com Enum.

Enquanto que uma constante é uma variável de tipo com valor imutável, enum é um conjunto de objetos já pré-definidos na aplicação.

Como um enum é um conjunto de objetos, logo, estes objetos podem conter atributos e métodos. Veja o exemplo de um enum para disponibiliar os quatros estados brasileiros citados acima, contendo informações de: Nome, Sigla e um método que pega o nome de cada estado e já retorna para tudo maiúsculo.