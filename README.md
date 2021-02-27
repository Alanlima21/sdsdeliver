# DS DELIVER
DS DELIVER é uma aplicação full stack web e mobile construída
durante a 2ª edição da **Semana DevSuperior** (#sds2), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").
<br></br>
A aplicação consiste em um sistema de delivery, onde o cliente poderá escolher seu pedido, local de entrega e realiza-lo.

## Layout
![pagInicial](https://github.com/Alanlima21/sdsdeliver/blob/main/Sds.png)

## Modelo conceitual
![Image](https://raw.githubusercontent.com/devsuperior/sds2/master/assets/modelo-conceitual.png "Modelo conceitual")

## Padrão camadas adotado
![Image](https://raw.githubusercontent.com/devsuperior/sds2/master/assets/camadas.png "Padrão camadas")

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- React Native
- Apex Charts
- Expo
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto
### Atenção para rodar o projeto localmente, mude o aplication.properties para test
## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/Alanlima21/sdsdeliver.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/Alanlima21/sdsdeliver.git

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

Alan Souza Lima
<br></br>
email: alan.lima123@hotmail.com
