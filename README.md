# Kafka Producer

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Apache Kafka](https://img.shields.io/badge/Apache%20Kafka-000?style=for-the-badge&logo=apachekafka)

Este projeto foi construído utilizando **Java, Spring e Kafka.**

Ele é um producer e faz parte de uma simulação de um sistema de venda de produtos onde ocorre uma comunicação assícrona. A API irá realizar uma chamada onde será feito o envio de uma mensagem para um tópico do Kafka.

No projeto, o tópico foi criado e configurado contendo duas partições. Em outros projetos citados abaixo, criamos dois consumers, onde cada um ficará responsável por consumir as mensagens que chegarão em cada partição respectivamente.

## Table of Contents

- [Pré requisitos](#Pré-requisitos)
- [Instalação](#Instalação)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Authentication](#authentication)
- [Database](#database)
- [Contribuicoes](#contribuições)

## Pré-requisitos

1. [Docker](https://www.docker.com/)

## Instalação


1. Baixar a imagem do Kafka

```bash
docker pull apache/kafka:3.8.0
```

2. Rodar o container do Kafka
```bash
docker run -d --name broker-kafka-1 -p 9092:9092 apache/kafka:3.8.0
```

3. Clonar o repositório:

```bash
git clone https://github.com/eraldoplimajr/kafka-producer.git
```

4. Instalar as dependências do Maven

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080


## API Endpoints
The API provides the following endpoints:

```markdown
GET /partners - Retrieve a list of all partners.

GET /partners/{partnerId} - Retrieve a specific partner by ID.

POST /partners - Register a new partner (ADMIN access required).

GET /partners/search - Search for partners near a specified location.

POST /auth/login - Login into the App

POST /auth/register - Register a new user into the App
```

## Authentication
The API uses Spring Security for authentication control. The following roles are available:

```
ROLE_USER - Standard user role for logged-in users.
ROLE_ADMIN - Admin role for managing partners (registering new partners).
```
To access protected endpoints as an ADMIN user, provide the appropriate authentication credentials in the request header.

## Database
The project utilizes [PostgresSQL](https://www.postgresql.org/) as the database. The necessary database migrations are managed using Flyway.

Also, this project is using the PostgresSQL extension [Postgis](https://postgis.net/) to store coordinates in [GeoJson](https://geojson.org/) pattern.

## Contribuições

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing to this project, please follow the existing code style, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), and submit your changes in a separate branch.




