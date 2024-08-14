# Pilares da Programação Orientada a Objetos em Java

## Pilares do POO

**Programação orientada a objetos** (**POO**, ou **OOP** segundo as suas siglas em inglês) é um paradigma de programação baseaso no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como *atributos*, e códigos, na forma de procedimentos, também conhecidos como *métodos*.

Como se trata de um contexto análogo ao mundo real, tudo no qual nos referimos são objetos, exemplo: Conta bancária, Aluno, Veículo, Transferência e etc.

A programação orientada a objetos é bem requisitada no contexto das aplicações mais atuais no mercado devido a possibilidade de reutilização de código e a capacidade de representação do sistema ser muito mais próximo do mundo real.

Para uma linguagem ser considerada orientada a objetos, esta deve seguir o que denominamos como **Os quatro pilares da orientação a objetos**.
* **Encapsulamento**: Nem tudo precisa estar visível, grande parte do nosso algoritmo pode ser distribuido em método com finalidades específicas que complementa uma ação em nossa aplicação. Exemplo: Ligar um veículo exige muitas etapas para a engenharia, mas o condutos só visualiza a ignição, dar a apartida e a "magia" acontece.
* **Herança**: Característics e comportamentos comuns podem ser elevados e compartilhados atra´ves de uma hierarquia de objetos. Exemplo: Um Carro e uma Motocicleta possuem propriedades como chasse, ano de fabricação e métodos como acelerar, frear. Logo para não ser um processo de codificação redundante, podemos desfrutar da herança criando uma classe **Veiculo** para que seja herdada por Carro e Motocicleta.
* **Abstração**: É a indisponibilidade para determinar a lógica de um ou vários comportamentos em um objeto. Exemplo: **Veiculo** determina duas ações como acelerar e frear, logo estes comportamentos deverão ser *abstratos*, pois existem mais de uma maneia de se realizar a mesma operação.
* **Polimorfismo**: São inúmera maneiras de ser realizar uma mesma ação. Exemplo: Veiculo determina duas ações acelerar e frear, primeiramente precisamos identificar se estaremos nos referindo a **Carro** ou **Motocicleta** para determinar a lógica de aceleração e frenagem dos respectivos veículos.

## Encapsulamento
>Nem tudo precisa estar disponivel para todos.

Já imaginou você instalar o MSN Menssenger e ao querer enviar uma mensagem, te fosse solicitado verificar se o computador está conectado a internet e depois, pedir para você salva a mensagem no histórico? Ou, ao tentar enviar um SMS pelo celular, primeiro você precisasse consultar manualmente o seu saldo?

Acredito que não seria uma experiência tão agradável de ser executada recorrentemente pelos usuários.

Mesmo ainda sendo necessária algumas etapas nos processos citados, não é um requisito uma visibilidade pública, isso quer dizer que, além da própria classe que possui a responsabilidade de uma determinada ação.

Quanto ao MSN Messenger, para nós, só é relevante saber que podemos e como devemos enviar e receber a mensagem, logo, as demais funcionalidades poderão ser consideradas privadas (private). E é ai qye se caracteriza as necessidades do pilar de Encapsulmaneto, o que esconder?

## Herança
>Nem tudo se copia, as vezes se herda!

Já imaginou você ter sido classificado para a vaga de emprego dos seus sonhos e como desafio, justamente você teria que criar um diagrama de classes em sequencia os respectivos arquivos.java que apresentasse os fundamentos de POO com base no contexto de vários aplicativos de mensagens instantâneas?

Além de uma compreensão do desafio, é necessário, que tenhamos domínio dos pilares de POO e aplicá-los em situações iguais a esta.

Podemos avaliar a importância de compreender os pilares do POO para ter uma melhor implementação, reaproveitamento e reutilização de código em qualquer contexto das nossas aplicações, mas não para por ai.

> Será que todos os sistemas de mensanges realizam as suas operações de uma mesma maneira? e agora? Este é um trabalho para os pilares **Abstração** e **Polimorfismo**.

## Abstração
> Para você ser é preciso você fazer

Sabemos que qualquer sistema de mensagens instantâneas realiza as mesmas operações de Enviar e Receber Mensagem, dentre outras operações comuns ou exclusivas de cada aplicativo disponível no mercado.

Mas será que as ações realizadas contém o mesmo comportamento? Acreditamos que não.

O que vale destacar para compreender aqui é que todo e qualquer sistema de mensagem precisa sim no mínimo Enviar e Receber Mensagem, logo, consideramos se firma um "contrato" para qualquer um que queira se apresentar assim para o mercado.

> Em Java o conceito de abstração é representado pela palavra resevada **abstract** e métodos que **NÃO** possuem corpo na classe abstrata(pai).

## Polimorfismo
> Um mesmo comportamento de várias maneiras

Podemos observar no contexto de **Abstração** e **Herança** que conseguimos criar uma singularidade estrutural de nossos elementos. Isso quer dizer que, qualquer classe que deseja representar um serviço de mensagens, basta estender a classe `ServicoMensagemInstantanea` e implementar os respectivos métodos *abstratos*. O que vale reforçar aqui é, cada classe terá a mesma ação executando procedimentos de maneira especializada.

> Para concluirmos a compreensão, Polimorfismo permite que as classes mais absdtratas determinem ações uniformes para que cada classe filha concreta implementem os comportamento de forma específica.

**Modificador protected**

Com o modificador `private` somente a classe conhece a implementação, quanto ao modificador `public` todos passarão a conhecer. Mas gostaríamos que somente as classes filha soubessem. Bem, é ai que entra o modificador `protected`.

## Interface
> Antes de tudo, **NÃO** estamos nos referindo a interface gráfica.

Como vimos anteriormente, **Herança** é um dos pilares de POO, mas uma curiosidade que se deve ser esclarecida na linguagem Java é que a mesma não permite o que conhecemos como **Herança Múltipla**.

A medida que vão surgindo novas necessidades, novos equipamentos (objetos) nascem para atender as expectitativas de oferecer ferramentas com finalidades bem específicas, como por exemplo: Impressoras, Digitalizadoras, Copiadoras, etc.

Observem que não há uma especificação de marca, modelo e ou capacidade de execução das classes citadas acima, isto é o que considemos o nível mais abstrato da orientação a objetos que denominamos como **interfaces**.

> Então o que você está dizendo é que **interfaces** é o mesmo que **classes**?
> Um molde para a representação dos objetos reais?

Este é um dos maiores questionamento dos desenvolvedores no que se refere a modelo de classes da aplicação.

Como citado acima Java não permite herança multipla, logo, vamos imagina que recebmos o desafio de projetar uma nova classe para criar objetos que representam as três caracteristicas citadas acima e que iremos denominar de **EquipamentoMuntifuncional**.

Antes de iniciarmo a representação via código, devemos compreender que, assim como em classes e métodos abstratos, quando herdamos de uma interface, precisamos implementar todos os seu métodos, pois os mesmos são implicitamente `public abstract`.
