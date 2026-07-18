# Projeto-pagamento-pix

## Introdução

Projeto de estudo para implementar uma API REST em Java (Spring Boot) para operações de transferência PIX. O objetivo é aprender padrões de arquitetura (hexagonal / portas e adaptadores), boas práticas de código e desenvolver endpoints REST (GET, POST, DELETE e PATCH).

## Arquitetura

Este projeto segue a arquitetura hexagonal (Ports & Adapters). Estrutura lógica atual:

```
com.projeto.itau
├── adapter/                    # Adaptadores (entrada/saída)
│   ├── in/                     # Adaptadores de entrada (Controllers, APIs)
│   │   └── http/               # Requisições HTTP
│   │       └── controller/     # REST Controllers
│   └── out/                    # Adaptadores de saída (Banco, APIs externas)
│       └── persistence/        # Banco de dados
├── application/                # Lógica da aplicação
│   ├── port/                   # Interfaces (contratos)
│   │   ├── in/                 # Portas de entrada (Use Cases)
│   │   └── out/                # Portas de saída (Repository contracts)
│   └── service/                # Implementações dos casos de uso
├── domain/                     # Domínio (entidades, DTOs, enums)
│   ├── entity/
│   ├── dto/
│   └── exception/
└── config/                     # Configurações da aplicação
```

