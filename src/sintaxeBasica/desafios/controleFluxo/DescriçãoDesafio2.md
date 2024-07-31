# Desafio Controle de Fluxo

Desenvolver um sistema que deverá receber dois parâmetros via terminal que representarão dois número inteiros, com estes dois números você deverá obter a quantidade máxima de interações (for) e realizar a impressão no console (Sysout) dos números incrementados, exemplo:

* Se você passar os números 12 e 30, logo teremos uma interação (for) com ocorrências para imprimir os números, exemplo: `"Imprimindo o número 1"`, `"Imprimindo o número 2"` e assim por diante.
* Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lança a exceção customizada chamada de `ParametrosInvalidosException` com a seguinte mensagem: "O segundo parâmetro deve ser maior que o primeiro".

1. Crie o projeto `DesafioControleFluxo`
2. Dentro do projeto, crie a classe `Contador.java` para realizar toda a codificação do nosso programa.
3. Dentro do projeto, crie a classe `ParamtrosInvalidosException` que representará a exceção de negócio no sistema. 