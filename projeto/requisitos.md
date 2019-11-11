## Descrição do módulo
O aplicativo deve permitir ao usuário requisitar a conversão de um documento
JSON no documento XML equivalente e, adicionalmente, requisitar a verificação
da conformidade tanto do conteúdo de entrada quanto da saída produzida com
relação a um XML Schema ou JSON Schema correspondente

## Requisitos

- **R1** O aplicativo deve receber via linha de comandos os argumentos para
realizar a operação desejada.

- **R2** O aplicativo deve indicar a impossibilidade de interpretar corretamente
os argumentos fornecidos. Por exemplo, se algum argumento necessário não
é fornecido, ou não existe, dentre inúmeras outras situações.

- **R3** O aplicativo deve indicar a impossibilidade de executar a requisição
corretamente interpretada. Por exemplo, se não há espaço em disco, se o
arquivo a ser consultado para leitura não possuir a permissão de leitura e
assim por diante.

- **R4** O aplicativo deve retornar um código de erro (valor diferente de 0) para
refletir a situação excepcional.

- **R5** O aplicativo deve retornar o código zero para indicar que a execução foi
realizada de forma satisfatória. 