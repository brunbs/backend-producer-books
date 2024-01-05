# backend-producer-books
API producer for books books project where i'm practicing the use of Apache Kafka

<h3 align="center"> 
    :construction:  Project in Development  :construction:
</h3>

## Introduction / Introdução

[EN] Hello! This project intention is to practice my studies using apache kafka and event driven architecture with Java Spring Boot.
The idea is to build a simple project that uses messaging to communicate apis. There will be no focus on business logics, rules, lots of classes or complex databases commands.
This project has 3 repositories:
- An  API Producer (this repo)
- A Consumer (another repo, will link here after its develop starts)
- An Angular Front end application (will also link here when it starts)

This project will be a system that creates, lists, deletes and updates books of a library.
The way the applications will communicate and integrate will be as follows:
a) Create Book - Front end will send info to the producer, wich will create a message to the create book topic. This topic will be listened by the consumer that will consume the message, persist the info in the database and commit the message.
b) List books - Front end will call the producer api, wich will request info from the database and return to front end
c) Delete books - Front end will call the producer api wich will create a messate to the delete book topic. This topic will be listened by the consumer that will consume the message, delete the info of the database and commit the message.
D) Update books - Front end will call the producer api wich will create a messate to the update book topic. This topic will be listened by the consumer that will consume the message, update the info of the database and commit the message.

I know that this may not be the best or most correct way to use messaging and apache kafka but this is just a simples study project.
I'm no front end developer so don't mind the ugly looks of the pages, I'm a backend developer but wanting to improve frontend skills so this is a full stack project.

[PT-BR] Olá! A intenção deste projeto é de praticar e estudar uso do apache kafka com aplicações Java Spring Boot em arquiteturas baseadas em eventos.
A ideia é construir um projeto simples que usa mensageria para comunicar apis. Então não espere um projeto complexo. Não há foco em regras de negócios, elevado número de classes ou muitos comandos de banco de dados.
Este projeto tem 3 repositórioes:
- Uma API que atua como producer (este repositório)
- Um Consumer (em outro repositório, vou adicionar o link quando tiver começado o desenvolvimento dele)
- Uma aplicação Front End Angular (também linkarei quando iniciar)

Este projeto será um sistema que cria, lista, exclui e atualiza livros de uma biblioteca.
A forma como os aplicativos se comunicarão e se integrarão será a seguinte:
a) Criar Livro - O front end enviará informações ao produtor, que criará uma mensagem para o tópico criar livro. Este tópico será escutado pelo consumidor que irá consumir a mensagem, persistir as informações no banco de dados e submeter a mensagem.
b) Listar livros - O front end chamará a API do produtor, que solicitará informações do banco de dados e retornará ao front end
c) Excluir livros - O front end chamará a API do produtor que criará uma mensagem para o tópico excluir livro. Este tópico será escutado pelo consumidor que irá consumir a mensagem, deletar as informações do banco de dados e submeter a mensagem.
D) Atualizar livros - O front end chamará a API do produtor que criará uma mensagem para o tópico de atualização do livro. Este tópico será escutado pelo consumidor que irá consumir a mensagem, atualizar as informações do banco de dados e submeter a mensagem.

Eu sei que esta pode não ser a melhor ou mais correta maneira de usar mensagens e apache kafka, mas este é apenas um projeto de estudo simples.
Não sou um desenvolvedor front end então não repare nas telas feias, sou um desenvolvedor back end querendo melhorar habilidades de front end então este é um projeto full stack.

## Project Screens / Telas do Projeto:

[EN] This project will basically have 4 screens [PT-BR] Este projeto terá basicamente 4 telas:
Prototype made using Figma.

**A) Home Page / Página Inicial:**
![image](https://github.com/brunbs/backend-producer-books/assets/62837683/765bcb05-bfd4-426e-baa7-eb6ce84dbd6e)

**B) Create Book Page / Página de Criação de Livro:**
![image](https://github.com/brunbs/backend-producer-books/assets/62837683/f870acf8-ff65-4ac8-af88-3a0ca84c3c28)

**C) Catalog Page / Página de Listagem de Livros (catálogo):**
![image](https://github.com/brunbs/backend-producer-books/assets/62837683/8832fc6c-03a1-47df-9cb7-6c0cf570d71e)

**D) Update Books Page / Página de Atualização de Livros**
![image](https://github.com/brunbs/backend-producer-books/assets/62837683/d0f1a53e-eabe-4308-ac68-5cee5c771b7f)

## Solutions Diagrams / Diagramas de Solução:
**A) Create Book**
![create book](https://github.com/brunbs/backend-producer-books/assets/62837683/935eb8b5-8499-46d5-8ec6-90a577bfcae8)

**B) Catalog Page:**
![catalog drawio](https://github.com/brunbs/backend-producer-books/assets/62837683/f638e6aa-f57b-4176-b63a-c81bf84a1611)

**C) Delete Book:**
![deletar drawio](https://github.com/brunbs/backend-producer-books/assets/62837683/1f200b76-3e62-4c44-b6cd-56acaa93a454)

**D) Update Book:**
![update drawio](https://github.com/brunbs/backend-producer-books/assets/62837683/39fd9ed8-64ab-43e0-a042-4b908839efd8)
