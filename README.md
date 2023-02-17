# Projeto Final Lab_Beach - Backend (Módulo 1- Futuro DEV)

<img src="imagem1-readme.png" alt="imagem 1">

> Olá! Bem vindo ao repositório do projeto Lab_Beach. Este repositório é referente ao projeto final do curso FuturoDEV do SENAI-SC em parceria com a Prefeitura de Florianópolis. É a criação de um back-end de um sistema (API REST) de listas de praias da cidade de Florianópolis na linguagem Java, utilizando o modelo CRUD e desenvolvido com as ferramentas Spring Boot, IntelliJ IDEA, PostgresSQL e Insomnia como API REST Client.

## 💻 Pré-requisitos

:white_check_mark: Requisito geral da aplicação:

- Utilização de Spring: Boot, MVC, Data
- Criação de API Rest
- Utilização de Git com GitHub
- Uso do banco de dados PostgreSQL

:white_check_mark: Antes de começar, verifique se você atendeu aos seguintes requisitos:
<!---Estes são apenas requisitos de exemplo. Adicionar, duplicar ou remover conforme necessário--->
* Preferencialmente utilize o IntelliJ IDEA para abrir e rodar o projeto `<https://www.jetbrains.com/pt-br/idea/>`
* Para acessar o banco de dados PostgreSQL, utilize o pgAdmin 4 `<https://www.pgadmin.org/download/>`
* Caso queira o Insomnia como API REST Client `<https://insomnia.rest/download>`.

:white_check_mark: Requisitos Cumpridos do Projeto:
- Cadastro de bairro:
    - Não permitir cadastro duplicado
    - Não permitir cadastro com campos inválidos
    - Campos necessários:
        - Identificador da categoria: Único, autogerado.
        - Nome do bairro: Única, tipo texto, preenchimento obrigatório.
        - Descrição do bairro: Tipo texto, preenchimento não obrigatório.
        - População do bairro: Tipo inteiro, preenchimento não obrigatório.
- Listagem de bairros:
    - Listar todas os bairros cadastrados com seus respectivos campos
- Exclusão de bairro:
    - Deletar um bairro por identificador
    - Não permitir deletar um bairro caso tenha uma praia cadastrada.
- Cadastro de praia:
    - Não permitir cadastro duplicado
    - Não permitir cadastro com campos inválidos
    - Campos necessários:
        - Identificador da praia: Único, autogerado
        - Identificador do bairro: Utilizar categoria válida e já criada
        - Nome da praia: Tipo texto, preenchimento obrigatório
        - Possui acessibilidade: Tipo booleano, preenchimento obrigatório
        - Status da praia (Própria ou Imprópria): Tipo texto, preenchimento obrigatório.
- Listagem de praias:
    - Listar todos as praias cadastradas com seus respectivos campos.
    - Listagem de praias conforme o status.
    - Listagem de praias com acessibilidade.
    - Listagens de praias por população no bairro.
    - Listar praias com população até um certo número definido pelo usuário.
        - Ex. praias em bairros com população até 15000 pessoas.
- Edição de praia:
    - Editar as informações da praia por identificador.
- Exclusão de praia:
    - Deletar uma praia por identificador.


## ☕ Usando Projeto Final - Lab_Beach no Insomnia

Para usar Projeto Final - Lab_Beach no Insomnia, siga estas etapas:
- Quando cadastrar o Status das PRAIAS, opte pelas palavras:  
```
Própria
```
ou
```
Imprópria
```
- Ao procurar praias em bairros com determinado valor de população utilize o seguinte "name" na opção "Query" do GET no Insomnia:
```
num
```
e a seguir, em value, o valor inteiro referente à população que você deseja.
## 🤝 Colaboradores

Agradeço aos professores Elder e Jaime pos todos os conhecimentos adquiridos até aqui e me apresento como proprietária do projeto:

<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/12567465?v=4" width="100px;" alt="Prof. Jaime Maretoli"/><br>
        <sub>
          <b>Prof. Jaime Maretoli</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/8507840?v=4" width="100px;" alt="Prof. Elder Pereira"/><br>
        <sub>
          <b>Prof. Elder Pereira</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/112433872?v=4" width="100px;" alt="Gabriela Riedel"/><br>
        <sub>
          <b>Gabriela Riedel</b>
        </sub>
      </a>
    </td>
  </tr>
</table>


[⬆ Voltar ao topo](#nome-do-projeto)<br>
