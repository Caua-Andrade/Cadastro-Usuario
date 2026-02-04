# 🚀 Cadastro de Usuários — Spring Boot API

API REST simples e objetiva para **cadastro, consulta, atualização e remoção de usuários**, desenvolvida com **Spring Boot**, **Spring Data JPA**, **H2 Database** e **Lombok**.
Projeto com foco didático e organização em camadas 🧱.

---

## 🛠️ Tecnologias Utilizadas

* ☕ Java
* 🌱 Spring Boot
* 🌐 Spring Web
* 🗄️ Spring Data JPA
* 💾 H2 Database (em memória)
* ✨ Lombok
* 📦 Maven

---

## 📁 Estrutura do Projeto

```
com.caua.cadastro_usuario
├── CadastroUsuarioApplication.java
├── business
│   └── UsuarioService.java
├── controller
│   └── UsuarioController.java
├── infrastructure
│   ├── entities
│   │   └── Usuario.java
│   └── repository
│       └── UsuarioRepository.java
└── resources
    └── application.properties
```

---

## 👤 Entidade Usuario

Representa o usuário no sistema.

📌 **Campos:**

* `id` → Identificador único (gerado automaticamente)
* `email` → Email do usuário (**único**)
* `nome` → Nome do usuário

---

## 🔗 Endpoints da API

### ➕ Criar usuário

**POST** `/usuario`

📨 **Body (JSON):**

```json
{
  "email": "exemplo@email.com",
  "nome": "Exemplo"
}
```

✅ **Resposta:** `200 OK`

---

### 🔍 Buscar usuário por email

**GET** `/usuario?email=exemplo@email.com`

📨 **Resposta (JSON):**

```json
{
  "id": 1,
  "email": "exemplo@email.com",
  "nome": "Exemplo"
}
```

---

### ✏️ Atualizar usuário por ID

**PUT** `/usuario?id=1`

📨 **Body (JSON):**

```json
{
  "email": "novo@email.com",
  "nome": "Novo Nome"
}
```

ℹ️ Apenas os campos enviados serão atualizados.

✅ **Resposta:** `200 OK`

---

### 🗑️ Deletar usuário por email

**DELETE** `/usuario?email=exemplo@email.com`

✅ **Resposta:** `200 OK`

---

## 📜 Regras de Negócio

* 🚫 Não é permitido cadastrar dois usuários com o mesmo email
* ❌ Caso o usuário não exista, uma exceção é lançada
* 🔄 Atualizações mantêm os dados antigos se o campo não for enviado

---

## 🧪 Banco de Dados

* Banco em memória **H2**
* Console disponível em:

```
http://localhost:8080/h2-console
```

🔐 **Configurações:**

* JDBC URL: `jdbc:h2:mem:usuario`
* User: `sa`
* Password: *(vazio)*

---

## ▶️ Como Executar

1. 📥 Clone o repositório
2. 💻 Abra o projeto em uma IDE compatível com Spring Boot
3. ▶️ Execute a classe `CadastroUsuarioApplication`
4. 🌐 A API estará disponível em `http://localhost:8080`

---

## 📚 Observações

Projeto ideal para estudo de:

* 🧱 Arquitetura em camadas
* 🔁 CRUD com Spring Boot
* 🗄️ JPA + H2
* ✅ Boas práticas iniciais em APIs REST
