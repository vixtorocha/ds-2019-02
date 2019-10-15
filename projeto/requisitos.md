# Conversor XML <-> JSON 
Design de um aplicativo via linha de comandos para conversão de documento XML para JSON e
vice-versa.

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

## Análise de requisitos

### Diagram de contexto

O aplicativo conversor deve receber requisitos de um usuário, via linha de
comandos, para realizar a conversão entre documentos (arquivos) nos formatos
JSON e XML. Neste sentido, conforme ilustrado abaixo, o aplicativo tanto obtém
o conteúdo de arquivos do sistema de arquivos quanto persiste conteúdos
convertidos. Adicionalmente, a conversão é realizada por biblioteca de
terceiros (biblioteca Conversor).
   
![Diagrama de Contexto](https://user-images.githubusercontent.com/1735792/65259901-d94e6f80-dadb-11e9-8e34-bc5c760f53e8.png)


### Possíveis interações (protótipo)

Além de ilustrar possíveis interações, registram as várias situações excepcionais que podem ocorrer, o que é relevante para o design.
Devemos identificar todos os casos de uso. 

Exibe informações de uso do aplicativo (Json-XML Converter)
```shell script
> jxc 
```

Converte o conteúdo do arquivo x.json, a ser procurado no diretório corrente, para o
conteúdo equivalente no formato XML. 
```shell script
> jxc x.json 
Conversão completa.
```

Arquivo não foi encontrado no caminho correspondente.
```shell script
> jxc x.json 
Arquivo não encontrado.
```

Converte o conteúdo do arquivo x.json no diretório corrente, e verifica a conformidade do conteúdo de entrada e o de saída.
```shell script
> jxc x.json -c
```

O software identifica um erro de conformidade
```shell script
> jxc x.json -c
x.json não está conforme.
```

O software identifica um erro de conformidade no resultado final
```shell script
> jxc x.json -c
x.xml não está conforme.
```

Ocorreu um erro desconhecido.
```shell script
> jxc x.json -c
Ocorreu um erro.
```