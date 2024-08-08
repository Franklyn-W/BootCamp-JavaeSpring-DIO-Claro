## Pacotes
A linguagem Java é composta por milhares de classes com as finalidades de, por exemplo: tipos de dados, representação de texto, números. data, arwuivos, diretórios, conexão a banco de dados, entre outras. Imagina todas estas classes existirem em um único nível de documentos? E as coisas desenvolvidas por nós, meros desenvolvedores de aplicações de vários outros gêneros? Imagina como ficaria o diretório!

Para prevenir este acontecimento, a linguagem dispõe de um recurso que organiza as classes padrão e criadas por nós, que conhecemos como pacote (package). Os pacotes são subdiretórios a partir da pasta src do nosso projeto onde estão localizadas as classes da lingugagem e novas que forem criadas para o projeto. Existem algumas convenções para criação de pacotes já utilizados no mercado.

### Nomenclatura
Vamos imaginar que sua empresa se chama **PowerSoft** e ela está desenvolvendo softwares comercial, governamental e um software livre ou de código aberto. Abaixo teríamos os pacotes sugeridos conforme baixo:
* **Comercial**: com.powersoft
* **Governamental**: gov.powersoft
* **Código aberto**: org.powersoft

Bem, acima já podemos perceber que existe uma definição para o uso do nome dos pacotes, porém podemos organizar ainda mais um poucos as nossas classes mediante a proposta de sua existencia:
* **model**: Classes que representam a camada e modelo da aplicação: Cliente, Pedido, NotaFiscal, Usuario.
* **repository**: Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados: ClienteRepository
* **service**: Classes que contém regras de negócio do sistema: ClienteService possui o método de validar o CPF do cliente cadastrado.
* **controller**: Classes que possuem a finalidade de disponibilizar os nosso recursos da aplicação para outras aplicações via padrão HTTP.
* **view**: Classes que possuem alguma interação com a interface gráfica acessada pelo usuário.
* **util**: Pacote que contém as  classes utilitárias do sistema: FormatadorNumeroUtil, ValidadorUtil.

### Identificação
Uma das caractéristicas de uma classe é sua identificação, Cliente, NotaFiscal,TituloPagar, porém quando esta classe é organizada por pacotes, ela passa a ter duas identificações. O nome simples (**própeio nome**) e agora o nome qualificado (**endereçamento do pacote + nome**), exemplo: Considere a classe `Usuario` que está endereçada no pacote `com.controle.acesso.model`, o nome qualificado desta classe é `com.controle.acesso.model.Usuario`

### Package versus Import
A localização de uma classe é definida pela palavra reservada package, logo, uma classe só contém uma definição de package no arquivo, sempre na primeira linha do código. Para a utilização de uma classe existente em outro pacote, necessitamos realizar a importação das mesmas, seguindo a recomendação abaixo:
```Java
package caminho.pacote.classe;

import caminho.classe.importada1;
import caminho.classe.importada2;

public class MinhaClasse;{
}
```

### Por que é tão importante compreender de pacotes?
A linguagem Java é composta por milhares de classes internas, classes desenvolvidas em projetos disponíveis através de bibliotecas e as classes do nosso projeto. Logo, existe uma enorme possibilidade da existência de classes de mesmo nome.

É nesta hora, que nós desenvolvedores precisamos detectar qual classes iremo importar em nosso projeto.

Um exemplo clássico é a existencia das classes `java.sql.Date` e `java.util.Date` da própria linguagem.