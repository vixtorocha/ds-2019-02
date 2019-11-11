# Análise de requisitos

## Diagram de contexto

O aplicativo conversor deve receber requisitos de um usuário, via linha de
comandos, para realizar a conversão entre documentos (arquivos) nos formatos
JSON e XML. Neste sentido, conforme ilustrado abaixo, o aplicativo tanto obtém
o conteúdo de arquivos do sistema de arquivos quanto persiste conteúdos
convertidos. Adicionalmente, a conversão é realizada por biblioteca de
terceiros (biblioteca Conversor).
   
![Diagrama de Contexto](https://user-images.githubusercontent.com/1735792/65259901-d94e6f80-dadb-11e9-8e34-bc5c760f53e8.png)


## Possíveis interações (protótipo)

Além de ilustrar possíveis interações, registram as várias situações excepcionais que podem ocorrer, o que é relevante para o design.
Devemos identificar todos os casos de uso. 

Exibe informações de uso do aplicativo (Json-XML Converter)
```shell script
> jxc

O JSON-XML Converter é um conversor de JSON e XML e vice-versa
Uso:  
    jxc [caminho]
    (Em que "caminho" é um caminho para um arquivo JSON ou XML de entrada que será convertido.)

    jxc [caminho] -check
    (Faz a conversão e checa quanto a conformidade do resultado)

```

Converte o conteúdo do arquivo x.json, a ser procurado no diretório corrente, para o
conteúdo equivalente no formato XML. 
```shell script
> jxc x.json
[...]
Conversão completa.
```

Arquivo não foi encontrado no caminho correspondente.
```shell script
> jxc x.json 
[...]
Arquivo não encontrado.
```

Converte o conteúdo do arquivo x.json no diretório corrente, e verifica a conformidade do conteúdo de entrada e o de saída.
```shell script
> jxc x.json -check
```

O software identifica um erro de conformidade
```shell script
> jxc x.json -check
[...]
x.json não está conforme.
```

O software identifica um erro de conformidade no resultado final
```shell script
> jxc x.json -check
[...]
x.xml não está conforme.
```

Ocorreu um erro desconhecido.
```shell script
> jxc x.json -check
[...]
Ocorreu um erro.
```