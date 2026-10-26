
```markdown
# 🎉 Party Hall Reservation System (Sistema de Reservas de Espaço de Festas)

API REST desenvolvida em **Java** com **Spring Boot**, criada com o objetivo de aplicar conceitos sólidos de arquitetura em camadas, persistência com JPA/Hibernate e boas práticas no desenvolvimento de APIs RESTful. O projeto está em constante evolução, com novas funcionalidades sendo adicionadas de forma incremental.

---

## 🚀 Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA / Hibernate**
* **H2 Database** (Banco de dados em memória para ambiente de desenvolvimento/testes)
* **Lombok**
* **Maven**

---

## 🏗️ Arquitetura

O projeto segue o padrão de **Arquitetura em Camadas** (Layered Architecture), garantindo a separação de responsabilidades:

```text
src/main/java/com/example/reservas
├── controller    # Camada de Apresentação (Endpoints REST)
├── service       # Camada de Regras de Negócio
├── repository    # Camada de Acesso a Dados (Spring Data JPA)
└── model         # Entidades de Domínio

```

---

## 📌 Status do Projeto & Roadmap

### ✔️ Implementado

* **Cadastro e Listagem de Clientes:** Operações básicas de CRUD para gerenciamento de clientes.
* **Persistência de Dados:** Integração com o Spring Data JPA utilizando H2 Database em memória.

### 🚧 Em Desenvolvimento / Próximas Etapas

* **Validação de Dados:** Uso de Bean Validation (`jakarta.validation`) e bloqueio de cadastro com e-mails duplicados.
* **Tratamento Global de Erros:** Padronização de respostas de erro HTTP (códigos 400, 404 e 409).
* **Módulo de Reservas:** Vínculo de reservas aos clientes, implementando regras de negócio críticas (proibição de datas retroativas e prevenção de conflitos/duplo agendamento).

---

## ⚙️ Como Executar o Projeto

1. **Pré-requisitos:**
* Java Development Kit (JDK) 17 ou superior instalado.
* Maven configurado.


2. **Clone o repositório:**
```bash
git clone [https://github.com/SEU_USUARIO/party-hall-reservation-system.git](https://github.com/SEU_USUARIO/party-hall-reservation-system.git)
cd party-hall-reservation-system

```


3. **Execute a aplicação:**
```bash
mvn spring-boot:run

```


4. **Acesse o console do H2 (opcional):**
* URL: `http://localhost:8080/h2-console`
* JDBC URL: `jdbc:h2:mem:testdb`
* User: `sa` / Password: *(vazio)*



---

## 👤 Autor

**Rodrigo Almeida**

* Estudante de Engenharia de Software na UCSal | Foco em Back-end & Sistemas Escaláveis
* [GitHub](https://www.google.com/search?q=https://github.com/SEU_USUARIO) | [LinkedIn](https://www.google.com/search?q=https://www.linkedin.com/in/rodrigo-almeida-751324369)

```

---

<ElicitationsGroup message="Para evoluir ainda mais este projeto para o seu portfólio:">
  <Elicitation label="Configurar PostgreSQL e Docker Compose no projeto" query="Como configuro o PostgreSQL e o Docker Compose para substituir o banco H2 neste projeto?"/>
  <Elicitation label="Implementar testes unitários com JUnit 5 e Mockito" query="Quais são as melhores práticas para estruturar testes unitários com JUnit 5 e Mockito em uma API Spring Boot?"/>
</ElicitationsGroup>

```
