# Definição e conceitos de testes de software

## Definição
Testes de software é o processo de execução de um produto para determinar se ele atingiu suas especificações e funcionou corretamente no ambiente para o qual foi projetado. (Dias Neto)

Testes podem ser usados para mostrar a presença de bugs, mas nunca para mostrar sua ausência. (Edsger W. Dijkstra)

## Conceitos básicos

### Defeito, Erro e Falha. Parecem iguais, mais são totalmente diferentes.

* Falha é todo cenário inesperado com o qual o usuário acaba tendo contato. Toda falha tem por trás um erro.
* Erro é todo cénario pelo qual a pessoa desenvolvedora talvez não tenha se atentado e esqueceu de testar. Todo erro evidencia um defeito.
* Defeito é um erro técnico, algo foi desenvolvido de forma incorreta, faz referencia a linhas de codigo.

### Verificação X Validação

* Verificação: Estamos construindo o sistema certo?
* Validação: Estamos construindo o software certo?

# Níveis e técnicas de teste
1. Entender os níveis de teste
2. Entender as técnicas de teste

### Níveis de teste

Unidade > Integração > Sistema > Regressão > Aceitação

* Unidade - Também conhecido como teste unitário, este teste é direcionado as pequenas unidades do software.
  * Métodos, entradas, resultado
  * Ferramentas: JUnit, PHPUnit, Unitest
* Integração - Realizado para testar uma estrutura maior do software, como por exemplo conexão com banco de dados, simulação de api, etc.
* Sistema - Teste de uma versão minimamente estavel da aplicação em ambiente de homologação, aberto para alguns usuários.
* Regressão - Momento de validação das novas features do sistema, verificando se as funções anteriores não quebraram
* Aceitação: Momento que os sistema é analisado pelo cliente final e se atende a suas expectativas.

### Categorias de teste
Os testes podem ser dividos em três fases: Alpha, Beta e Canary.
* Alpha: Versão inical de desenvolvimento da proxima versão de um sistema, pode contar muitos bugs, geralmente testado por desenvolvedores.
* Beta: 
* Canary: Versão pré pronta da proxima versão da aplicação, que passará por teste de alguns usuários selecionados.

### Técnicas de teste
#### Caixa Branca
Teste realizado quando se conhece o código da aplicação, sabe-se como funciona por baixo dos panos.
* Também conhecido como Teste Estrutural.
* Validar dados, controles, fluxos, chamadas.
* Garantir a qualidade da implementação.
* Níveis: Unidade, Integração e Regressão

#### Caixa Preta
Teste realizado sobre a versão de validação do sistema, onde ser realizado teste sobre as funcionalidades e observa o resultado, se esta de acordo com o esperado.
* Teste funcional.
* Verificar saídas usando vários tipos de entrada.
* Teste sem conhecer a estrutura interna do software
* Niveis: Integração, Sistema e Aceitação

#### Caixa Cinza
É realizado os testes e tambem se tem acesso aos códigos do sistema ou como o sistema funciona internamente.
* Mescla técnicas de caixa branca e caixa preta.
* Analisa parte lógica e também funcionalidades.
* Engenharia Reversa
* Exemplo: Ter acesso a documentação do funcionamento do código

### Testes não funcionais

#### O que são testes não funcionais?

Testes não funcionais estão ligados a requisitos não funcionais:
* Comportamento do sistema.
* Perfomance
* Escalabilidade
* Segurança
* Infraestrutura

Exemplo: Qual plataforma o Sistema deverá rodar?

#### Sendo assim...

Testes não funcinoais tem como objetivo testar aspectos dos software que não são associados as regras de negócio, mas sim a requisitos não funcinoais.

#### Como? 

Ferramentas que usam técnicas para apurar o compotamento do sistema em determinadas circunstâncias.

#### Teste de carga

O teste de carga é realizado para verificar qual o volume de transações, acessos simultâneos ou usuários que um servidor/software/sistema suporta. Alguns pontos de atenção:
* Objetivos para clareza de resultados
* Ambiente
* Cenários
* Execução de testes
* Análise de resultado

#### Testes de stress

Teste de stress é realizado para submeter o software a situações extremas. Basaicamente, o teste de stress baseia-se em testar os limites do software e valaiar seu comportamento. Assim, avalia-se até quando o software pode ser exigido e quais as falha (se existirem) decorrentes do teste.

#### Testes de segurança

O teste de segurança é um processo crítico de segurança cibernética que visa detectar vulnerabilidade em sistemas, software, redes e aplicativos.

### Pirâmide de teste

A pirâmide de testes representa os vários niveis e as varias formas de testar um software.

Na base estão presentes os teste mais isolados e rápidos, como os teste unitários, subindo mais estão os testes de integrações e no topo estão os testes mais integrados e lentos, como os testes de UI e end to end.
