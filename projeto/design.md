### Design - Aplicativo via linha de comando para conversão de JSON em XML.

* Classe Application. Contém o método main, que inicia a aplicação.
* O método main recebe dois parâmetros: O caminho do arquivo json e um argumento numérico que indica deve ser feita a verificação de conformidade (Valor 0 se não).
* A classe Application deve lançar exceções nos seguintes cenários:
  - Se o argumento é invalido, incluindo se o caminho fornecido não existe
  - Se o aplicativo é incapaz de realizar suas funções. Como por exemplo, por falta de memória ou espaço.
