# myContacts

CRUD feito com JSF, JPA, Hibernate e Primefaces

Trata-se de uma aplicação web para que o usuário possa cadastrar uma lista de contatos. Para isso, ele deve inserir nome, email, endereço e telefone. Ao entrar na aplicação, é exibida uma tabela com todos os contatos que já foram salvos e as opções de editar contato, apagar contato e adicionar um novo contato.

### Itens cumpridos

Dado os itens pedidos no edital, além de usar JSF (A) e persistência (B) em um banco de dados (obrigatório), o projeto conta com o uso do Hibernate e do JPA (C) para a persistência no banco de dados MySQL. Como parte visual, foi utilizado os componentes do Primefaces (G). O projeto foi publicado no Heroku (J), mas estou usando um banco de dados gratuito (ClearDB) e, por isso, as vezes a aplicação fica lenta e/ou apresenta erros que são corrigidos apenas atualizando a página.

### Para executar o projeto

O projeto foi desenvolvido usando a IDE Eclipse e o Tomcat v9.0, então basta adicionar o projeto nesse ambiente, e executar utilizando esse server, que o mesmo já irá começar a funcionar. O banco de dados está online, mas também pode ser usado localmente.
Para usar localmente o banco de dados, basta alterar o arquivo persistence.xml colocando as novas informação de URL, user e password. Além disso, é necessário ter um banco de dados já criado chamado crudbd, ou um nome qualquer que também deve ser atualizado no arquivo persistence.xml.

### Possíveis erros

Como já foi dito anteriormente, foi feito deploy da aplicação no Heroku e foi usado um banco mySQL gratuito (ClearDB) com muitas limitações, então as vezes a aplicação fica lenta e/ou apresenta erros se for acessada online (https://app-mycontacts.herokuapp.com/), mas esse problema é resolvido apenas atualizando a página.
