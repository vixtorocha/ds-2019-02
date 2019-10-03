Crie um diagrama para o seguinte cenário, indicando quais as classes estão em quais packages, caso exista mais de um, e eventuais métodos. Cada classe e cada método deve ser acompanhado do modificador de acesso “público” ou “package-private”: um software está sendo desenvolvido para uma loja de produtos eletrônicos (computadores, tablets, celulares, …). Na iteração em questão faz parte “montar um pedido de compra”. Isso significa receber e acrescentar requisição para acréscimo de item a um dado pedido; registrar endereço de entrega para o pedido; calcular preço de frete do local da loja até o endereço de entrega; calcular o total do pedido incluindo o frete. 

Legenda:

-> Indica as relações de __ entre as classes.

#### Loja
-> Endereço
#### Cliente
#### Item
#### Pedido
-> Endereço
+ adicionaItem(): double
+ calculaFrete(): double
+ calculaPreco(): double
#### Endereço

