# Sistema-Bancario

Este é um repositório de backend que implementa um sistema bancário, com o controle entre contas bancárias e agências. O sistema oferece uma API que permite operações CRUD (Create, Read, Update e Delete) para estabelecer tais operações, além de fornecer informações em formato JSON.

# Tecnologias utilizadas
> **Spring Boot**: Framework Java para desenvolvimento da API REST.
>
> **MySql**: Banco de dados relacinal para o armazenamento dos dados em ambiente de produção.
>
>  **H2**: Banco de dados relacional para o armazenamento dos dados em ambiente de teste.
>
> **JUnit**: Framework Java para executar testes ao sistema.
>
> **JSON**: Formato de retorno e entrada de dados.
>
> **Maven**: Ferramenta de gerenciamento de build e dependências para projetos Java.


# Cadastro

## Cliente Agencia Conta Bancaria Cartao
Os clientes possuem os seguintes campos:

- Identificador;
- Nome;
- Contas;
- Nascimento.

## Agência
As agencias possuem os seguintes campos:

- Identificador;
- quantidadeClientes.

## Conta Banária
As contas bancárias possuem os seguintes campos:

- Numero.
- Saldo.
- Cliente.
- Cartao;

## Cartao
Os cartões possuem os seguintes campos:

- Identificador;
- CVV.

# Chamadas dos Serviços

## Cliente 

> GET /cliente: Retorna a lista de todos os clientes cadastrados.

> GET /cliente/id: Retorna os detalhes um cliente especificado pelo ID presente no PATH da requisição.

> POST /cleiente: Cria um novo cliente especificado no Body da requisição.

> PUT /cliente/id: Atualiza os dados de um cliente existente especificado pelo ID presente no PATH da requisição.

> DELETE /cliente/id: Remove um cliente existente especificado pelo ID presente no PATH da requisição.

## Agencia 

> GET /contaBancaria: Retorna a lista de todas as contas bancárias.

> GET /contaBancaria/id: Retorna os detalhes uma conta bancaária especificada pelo ID presente no PATH da requisição.

> POST /contaBancaria: Cria uma nova conta bancária especificada no Body da requisição.

> PUT /contaBancaria/id: Atualiza os dados de uma conta bancária existente especificado pelo ID presente no PATH da requisição.

> DELETE /cliente/id: Remove uma conta bancária existente especificado pelo ID presente no PATH da requisição.


## Conta Bancaria 

> GET /contaBancaria: Retorna a lista de todas as contas bancárias.

> GET /contaBancaria/id: Retorna os detalhes uma conta bancaária especificada pelo ID presente no PATH da requisição.

> POST /contaBancaria: Cria uma nova conta bancária especificada no Body da requisição.

> PUT /contaBancaria/id: Atualiza os dados de uma conta bancária existente especificado pelo ID presente no PATH da requisição.

> DELETE /contaBancaria/id: Remove uma conta bancária existente especificado pelo ID presente no PATH da requisição.


## Cartao

> GET /cartao: Retorna a lista de todas os cartões.

> GET /cartao/id: Retorna os detalhes um cartão especificado pelo ID presente no PATH da requisição.

> POST /cartao: Cria um novo cartão especificado no Body da requisição.

> PUT /cartao/id: Atualiza os dados de um cartão existente especificado pelo ID presente no PATH da requisição.

> DELETE /cartao/id: Remove um cartão existente especificado pelo ID presente no PATH da requisição.
