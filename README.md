# run-rest
Microserviços em REST

Esse projeto está em processo de construção o intuito dele é servir de exemplo particular 

Tecnologia utilizadas :
- Swagger
- JPA - Spring Data
- Spring Boot
- Lombok
- Postgres
- Flyway


O intuito é simular o ambiente de microservices para um sistema de corrida de rua.
Os principais domínios são:
- Circuito
- Corredor
- Corrida
- Endereço
- Patrocínio

Esse projeto está aberto para sugestões de melhorias e melhores práticas no design de API.

Como preparar seu ambiente:
- Dê um clone no projeto
- Importa o projeto no eclipse utilizando o maven
    - File -> Import -> Maven -> Existing Maven Project
- Criar banco de dados run
- Iniciar o spring boot
- Acessar : http://localhost:8080/run-service/swagger-ui.html

Status do projeto
- **[x] Cadastrar corredor (Verificar se o ID já existe no banco)**  
- **[x] Consultar informações do corredor **
- [] Editar informações do corredor ** Em andamento **

- [] Cadastrar circuito
- [] Editar circuito
- [] Consultar circuito

- [] Cadastrar patrocínio
- [] Consultar patrocínio 
- [] Editar patrocínio  

- [] Cadastrar corrida com suas dependências (Circuito, patrocínio e endereço)
- [] Editar corrida com suas dependências (Circuito, patrocínio e endereço)
- [] Consultar corrida com suas dependências (Circuito, patrocínio e endereço)

- [] Associar o corredor a corrida

- [] Consultar resultado da corrida


