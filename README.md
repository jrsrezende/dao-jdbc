# 💾 Projeto DAO JDBC

 Este projeto demonstra a implementação do padrão DAO (Data Access Object) em Java, utilizando JDBC para acesso a banco de dados MySQL. O objetivo é apresentar uma estrutura organizada para operações CRUD (Create, Read, Update, Delete) em entidades como Seller e Department.

## ✨ Funcionalidades

 - Buscar vendedor por ID
 - Buscar vendedores por departamento
 - Listar todos os vendedores
 - Inserir novo vendedor
 - Atualizar dados de um vendedor
 - Deletar vendedor por ID

## 🛠️ Tecnologias Utilizadas

 - Java
 - JDBC (MySQL Connector)
 - SQL 
 - IntelliJ IDEA

## 🚀 Como executar
 1. Clone o repositório: git clone https://github.com/jrsrezende/dao-jdbc.git
 2. Configure o banco de dados:
     - Execute o script em src/sql/script.sql para criar as tabelas e inserir dados iniciais.
     - Ajuste as credenciais do banco em db.properties.
 4. Execute a classe src/application/Program.java.

## 📁 Camadas do projeto
 - `application`: Contém as classes principais para execução e testes das operações.
 - `model.entities`: Define as entidades do domínio (Seller, Department).
 - `model.dao`: Interfaces DAO e fábrica de DAOs.
 - `model.dao.implementation`: Implementações JDBC das interfaces DAO.
 - `db`: Utilitários para conexão e tratamento de exceções do banco de dados.
 - `sql`: Scripts SQL para criação e popularização do banco de dados.
