# Design

## Pacotes
A arquitetura do software é dividida em três pacotes:

- **Client**, que é o pacote que será responsável pela interação com o usuário. 

- **Conversao**, que corresponde às classes responsáveis que usam a biblioteca de conversão para converter e verificar a conformidade.

- **Arquivos**, que corresponde às classes responsáveis por fazer manipulações de leitura e escrita de arquivos.

## Implementação

#### No pacote "Client":
- Classe Application.
  - Contém o método main, que inicia a aplicação.
    - O método main recebe dois parâmetros: O caminho do arquivo e adicionalmente um argumento que indica se deve ser feita a verificação de conformidade (string que deve estar escrito "-check").
    - Chama o método leitor() da classe ManipuladorArquivo, passando como parâmetro o caminho para o arquivo.
    - O método main verifica se o usuário requisitou a verificação de conformidade. Se sim, é chamado o método check() da classe Converter para verificar se a **entrada** está conforme.
    - O método main chama o método converte() da classe Converter.
    - Após a conversão, o método main verifica se o usuário requisitou a verificação de conformidade dos arquivos, se sim, é chamado o método check() da classe Converter para verificar se a **saída** está conforme.
    - Chama o método escritor() da classe ManipuladorArquivo, passando como parâmetro o caminho em que o arquivo será escrito, ou seja, o diretório em que o arquivo de entrada se encontra.
    - A classe Application deve lançar exceções nos seguintes cenários:
      - Se o caminho fornecido não existe
      - Se o segundo argumento é inválido, caso o usuário escreva errado ou tente usar uma função que não existe.
      - Se o aplicativo é incapaz de realizar suas funções. Como por exemplo, por falta de memória ou espaço.

#### No pacote "Conversao":
- Classe Converter  
A classe converter deve fazer uso de uma biblioteca de conversão de XML para JSON e vice-versa.
  - Método converte(). 
    - O método converte recebe o arquivo de entrada e checa se o arquivo é XML ou JSON.
    - Se o arquivo for JSON, é chamado o método jsonToXML().
    - Se o arquivo for XML, é chamado o método xmlToJSON().
    - É retornado o arquivo de saída.
  - Método jsonToXML()
    - Recebe o arquivo de entrada em JSON.
    - O método jsonToXML() implementa a biblioteca de conversão, chamando o método da bilioteca que faça a conversão de JSON para XML.
    - Retorna o arquivo convertido para XML
  - Método xmlToJSON()
    - Recebe o arquivo de entrada em XML.
    - O método xmlToJSON() implementa a biblioteca de conversão, chamando o método da bilioteca que faça a conversão de XML para JSON.
    - Retorna o arquivo convertido para XML

  
#### No pacote "Arquivos":
- Classe ManipuladorArquivo
  - Importa as bibliotecas de leitura e escrita do java (FileInputStream, FileOutputStream)
  - Método leitor().
    - Recebe o caminho do arquivo que será lido.
    - Instacia o arquivo usando o FileInputStream.
    - Retorna a instância do arquivo.
  - Método escritor()
    - Recebe o arquivo que deverá ser escrito.
    - Grava o arquivo usando o FileOutputStream.
