# Consulta CEP API

Este projeto é uma API RESTful desenvolvida em Java utilizando Spring Boot, que consome a API pública do ViaCEP para buscar informações de endereço com base em um CEP fornecido.

## Tecnologias Utilizadas

- **Java 11**
- **Spring Boot**
- **Maven**
- **RestTemplate** para consumir a API externa

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **`ConsultaCepApi`**: Classe principal que expõe o endpoint `/consulta-cep/{cep}` para consulta de CEP.
- **`CepResultDTO`**: Classe DTO (Data Transfer Object) utilizada para mapear a resposta da API ViaCEP.

## Como Executar o Projeto

### Pré-requisitos

- Certifique-se de ter o Java 11 ou superior instalado.
- Instale o Maven para gerenciar as dependências do projeto.

### Passos para Executar

1. Clone o repositório:

    ```bash
    git clone https://29092213/demo-cep-api.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd demo-cep-api
    ```

3. Compile e execute o projeto usando Maven:

    ```bash
    mvn spring-boot:run
    ```

4. A API estará disponível em `http://localhost:8080`.

### Exemplo de Uso

Para consultar um CEP, faça uma requisição GET para o endpoint `/consulta-cep/{cep}`. 

**Exemplo de Requisição:**

```bash
GET http://localhost:8080/consulta-cep/01001-000
