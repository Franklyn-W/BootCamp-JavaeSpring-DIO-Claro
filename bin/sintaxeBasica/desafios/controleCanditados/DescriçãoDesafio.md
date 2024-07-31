# Criando um pequeno sistema para validação de processo seletivo

## Cases
Vamos explorar alguns cenários com fluxos condicionais, repetições e excepcionais.

### Case 1:
Vamos imaginar que em um processo seletivo existe o valor base salarial de R$ 2.000,00 e o slário pretendido pelo candidato. Vamos elaborar um controle de fluxo onde:
* Se o valor salario base for maior que o valor salario pretendido, imprima **LIGAR PARA O CANDIDATO**;
* Senão, se o valor salario base for igual ao valor pretendido, imprima: **LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA**;
* Senão, imprima: **AGUARDANDO RESULTADO DEMAIS CANDIDATOS**;

### Case 2:
Foi solicitado que nosso sistema garanta que diante das inúmera candidaturas sejam selecionados apenas no máximo 5 candidatos para entrevista onde o salário seja menor ou igual ao salario base.

```Java
// Array com a lista dos candidatos

String [] candidatos = { "Wulublor", "Queosisn", "Tyuiskeo", "Beutiuns", "Haidamal", "Dieziaxo", "Muwehier","Fionuxun", "Buealbia", "Xuinuois" };

// Método que simula o valor pretendido

import java.util.concurrent.ThreadLocalRandom;

static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
}
```

### Case 3:
Agora é hora de imprimir a lista dos candidatos selecionados para disponibilizar para o RH entrar em contato.

### Case 4:
O RH deverá realizar uma ligação com no máximo 03 tentativas para cada candidato selecionado e caso o candidato atenda, deve-se imprimir
* **"CONSEGUIMOS CONTATO COM [CANDIDATO] APÓS [TENTATIVAS].**
* do contrário, imprima: **NÃO CONSEGUIMOS CONTATO COM O [CANDIDATO]**
