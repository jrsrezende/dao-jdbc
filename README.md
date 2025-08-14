# DAO JDBC

 Este projeto demonstra a implementação do padrão DAO (Data Access Object) utilizando JDBC em Java para realizar operações CRUD em um banco de dados relacional. O sistema gerencia entidades de vendedores (Seller) e departamentos (Department), permitindo inserção, atualização, remoção e consulta de dados

## Tecnologias Utilizadas

 - Java
 - MySQL Connector/J
 - SQL 
 - IntelliJ IDEA

## Como executar
 1. Clone o repositório: git clone https://github.com/jrsrezende/dao-jdbc.git
 2. Configure o banco de dados:
     - Execute o script em src/sql/script.sql para criar as tabelas e inserir dados iniciais.
     - Ajuste as credenciais do banco em db.properties.
 4. Execute a classe src/application/Program.java.

## Camadas do projeto
 - `application/`: Camada de aplicação, responsável pela execução dos testes e interação com o usuário.
 - `model/entities/`: Contém as classes de entidades do domínio (Seller, Department).
 - `model/dao/`: Interfaces DAO e fábrica de DAOs (SellerDao, DepartmentDao, DaoFactory).
 - `model/dao/implementation/`: Implementações concretas das interfaces DAO utilizando JDBC.
 - `db/`: Utilitários para conexão e tratamento de exceções do banco de dados.
 - `sql/`: Scripts SQL para criação e popularização do banco de dados.
