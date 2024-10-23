# Kafka Producer

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Apache Kafka](https://img.shields.io/badge/Apache%20Kafka-000?style=for-the-badge&logo=apachekafka)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)

Este projeto foi construído utilizando **Java, Spring e Kafka.**

Ele é um producer e faz parte de uma simulação de um sistema de venda de produtos onde ocorre uma comunicação assícrona. A API irá realizar uma chamada onde será feito o envio de uma mensagem para um tópico do Kafka.

No projeto, o tópico foi criado e configurado contendo duas partições. Em outros projetos citados abaixo, criamos dois consumers, onde cada um ficará responsável por consumir as mensagens que chegarão em cada partição respectivamente.

## Table of Contents

- [Pré requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Uso](#uso)
- [API Endpoints](#api-endpoints)

## Pré-requisitos

1. [Docker](https://www.docker.com/)
2. [Git](https://git-scm.com/)

## Instalação

1. Com o docker, baixar a imagem do Kafka

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

## Uso

1. Iniciar a aplicação com o Maven
2. A aplicação estará disponível em http://localhost:8081


## API Endpoints
A API fornece o seguinte endpoint simulando o envio de mensagem para o tópico:

```markdown
POST /orders - Faz o envio de uma ordem de venda para o tópico.
```
```json
{
    "name": "PS5 slim",
    "description": "console PS5",
    "amount": "3000.00"
}
```




