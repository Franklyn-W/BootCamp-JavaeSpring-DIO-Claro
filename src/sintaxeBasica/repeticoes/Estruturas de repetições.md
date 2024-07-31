## Estruturas de repetição
Laços de repetição, também conhecidos como laços de iteração ou simplesmente *loops*, são comandos que permitem iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes.

Laços ou repetições são representados pela seguintes estruturas:
* **For** (para)
* **While** (enquanto)
* **Do While** (faça enquanto)

### For
O comando **for** (tradução literal: para) permite que uma variável contadora seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando for recebe como entrada uma variável contaadora, a condição e o valor de incrementação.

A estrutura de sintaaxe do laço de repetição **for** segue o seguinte padrão:
``` Java
for (bloco de inicialização; expressão booleana de validação; bloco de atualização ){
    //Comando que será executado enquanto a expressão de validação for verdadeira
    
}
```

Tambem usamos o controle  de fluxo **for** para interagir sobre *arrays* e coleções

Obs: Observe que como os arrays começam com indice igual a 0 (zero), iniciamos a nossa váriavel de inicialização do laço tambem com valor zero e validamos a quantidade de repetições a partir da quantidade de elementos do array.

### For Each
O uso do **for/each** es´ta fortemente relacionado com um cénario onde contenha um array ou coleção, e assim, a interação é baseada nos elementos da coleção


### Break e continue
**Break** significa quebrar, parar, frear, interromper. E é isso que se faz quando o Java encontra esse comando pela frente. **Continue**, como o nome diz, ele 'continua' o laço. O comando **break** interrompe o laço, já o **continue** interrompe somente a iteração atual.

### While
O laço **while** (lit. "enquanto") determina que enquanto uma condição for válida, o bloco de código será executado. O laço **while** testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.

A estrutura de sintaxe de controle de repetição **while** é exibida abaixo
``` Java
while (expressão booleana de validação){
    
    // Comando a ser executado até a validação ser falsa
}
```

### Do While
O laço **do/while** (lit. faça/enquanto), assim como o laço while, considera que enquanto uma determinada condição for válida o bloco de código será executado. Entretanto, **do/while** testa a condição após executar o código, sendo assim, mesmo que a condição seja inválida no primeiro teste o bloco será executado pelo menos uma vez.

A estrutura de sintaxe do **do/while** é exibida abaixo
```Java
do{
    // Comando que será executado inicialmente
    // e será repetido caso a condição a seguir seja verdadeira
}
while (expressão booleana de validação);
```