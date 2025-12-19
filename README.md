# REST-API-Banking-Challenge-with-Java-Spring-Boot
Este projeto consiste no desenvolvimento evolutivo de um sistema bancário, originado a partir de um desafio técnico para gestão de transações financeiras. O objetivo central é a implementação de uma API REST de alta performance, utilizando o ecossistema moderno do Java e Spring Boot.

# Sobre o Projeto - Bank Transaction API (Simulação Bancária)

A aplicação foi inicialmente concebida como uma solução para um desafio técnico focado em processamento de estatísticas e transações em tempo real. Identificando o potencial de expansão, o projeto evoluirá para uma arquitetura mais robusta, indo além do escopo inicial para implementar padrões rigorosos de Clean Code, segurança na manipulação de dados e regras de negócio complexas, alinhadas às exigências atuais do mercado financeiro.

# Detalhes dobre o desafio técnico (Desenvolvido inicialmente)

Na fase inicial do desafio, a aplicação foi desenvolvida sob premissas específicas para testar a lógica de gerenciamento de dados:
    **Persistência:** Implementação de banco de dados simulado em memória (In-memory storage).
    **Arquitetura:** Estrutura simplificada focada em lógica de serviço, evoluindo gradualmente para padrões com Entidades e Mappers e testes.
    **Estatísticas em Tempo Real:** Processamento ágil de dados para geração de métricas instantâneas por periodo de tempo.


## Contexto Original (Desafio Técnico)
Este projeto iniciou-se como base para a resolução de um desafio técnico de mercado.

**Objetivo do Desafio:**
Desenvolver uma API REST que recebe Transações e retorna Estatísticas sobre transações por periodo de tempo:
1. A API deve ser desenvolvida em Java ou Kotlin usando Spring boot.
2. A API não deve conter banco de dados como MySql e afins e simulação de banco de dados como o H2.
3. A API deve ter três end points que são: POST /transacao, DELETE /transacao e GET /estatistica.
4. A API deve aceitar e responder com JSON.
5. A API deve ter um tempo para processar as estatisticas

*Para ver o escopo completo e original do desafio, consulte o arquivo [docs/escopo-do-desafio-Itau.md](./docs/escopo-do-desafio-Itau.md).*


## Status do Projeto
**Versão Atual:** 1.0.0 (MVP)
> Como menciondao antes a versão 1.0.0 se trata ainda da aplicação seguindo o escopo disposto em [docs/escopo-do-desafio-Itau.md](./docs/escopo-do-desafio-Itau.md) onde se trata de uma versão ainda limitada e focada apenas na lógica de serviço.

---

## Evolução e Melhorias (Portfólio)
*Esta seção descreve as melhorias implementadas ALÉM do escopo original do desafio.*

Atualmente, o projeto conta com:
- [x] Estrutura base da API (Controller, Service, Exceptions)
- [ ] Entity, DTO, mapper (Em breve)
- [ ] Implementação de Docker (Em breve)
- [ ] Autenticação com Spring Security (Em breve)
- [x] Documentação Swagger

---

## Tecnologias
- Java 25
- Spring Boot
- Spring doc (Swagger)
- Maven
