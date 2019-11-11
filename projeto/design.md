# Design

## Pacotes
A arquitetura do software é dividida em três pacotes:

- **Client**, que é o pacote que será responsável pela interação com o usuário. 

- **Conversao**, que corresponde às classes responsáveis que usam a biblioteca de conversão para converter e verificar a conformidade.

- **Arquivos**, que corresponde às classes responsáveis por fazer manipulações de leitura e escrita de arquivos.

## Implementação

No pacote "Client":
- Classe Application. Contém o método main, que inicia a aplicação.
  - O método main recebe dois parâmetros: O caminho do arquivo json e um argumento numérico que indica deve ser feita a verificação de conformidade (Valor 0 se não).
  - A classe Application deve lançar exceções nos seguintes cenários:
    - Se o argumento é invalido, incluindo se o caminho fornecido não existe
    - Se o aplicativo é incapaz de realizar suas funções. Como por exemplo, por falta de memória ou espaço.

No pacote "Conversao":  

No pacote "Arquivos":