# dao-jdbc

Projeto de exemplo para demonstração de acesso a banco de dados utilizando JDBC em Java, seguindo o padrão DAO \(Data Access Object\). O sistema gerencia entidades de vendedores \(`Seller`\) e departamentos \(`Department`\), permitindo operações CRUD e consultas relacionadas.

## Funcionalidades
- Inserção, atualização e remoção de vendedores e departamentos
- Consulta de vendedor por ID
- Listagem de todos os vendedores
- Consulta de vendedores por departamento
- Operações de CRUD para departamentos

## Tecnologias utilizadas
- Java
- JDBC
- MySQL
- IntelliJ IDEA
- MySQL Connector/J

## Como executar
1. Clone o repositório: https://github.com/jrsrezende/dao-jdbc.git
2. Configure o banco de dados MySQL e execute o script em `src/sql/script.sql`.
3. Atualize o arquivo `db.properties` com suas credenciais do banco.
4. Adicione o driver MySQL \(`mysql-connector-j-8.4.0.jar`\) ao classpath do projeto.
5. Execute a classe principal em `src/application/Program.java` ou `Program2.java` pela IDE.

## Camadas do projeto
- `application/`: Classes principais para execução dos testes e exemplos.
- `db/`: Gerenciamento de conexão e exceções do banco de dados.
- `model/entities/`: Entidades do domínio \(`Seller`, `Department`\).
- `model/dao/`: Interfaces DAO e fábrica de DAOs.
- `model/dao/implementation/`: Implementações JDBC das interfaces DAO.
- `sql/`: Scripts SQL para criação e povoamento do banco de dados.
