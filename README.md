# Tecnologias de Construção de Software

| | |
|---|---|
| **Disciplina** | Tecnologias de Construção de Software (CMP1054) |
| **Período** | 6º |
| **Stack** | Java 11+, **Spring Boot**, Maven, NetBeans (projetos legados) |

## Visão geral

Repositório focado em **Padrões de Projeto (GoF)** e **Spring Boot**. Contém dezenas de implementações de padrões criacionais, estruturais e comportamentais, exercícios em sala e trabalhos avaliativos.

## Estrutura

```
Projetos/              # Spring Boot + Maven (trabalhos e aulas)
Desing Patter/         # Demos NetBeans/Java puros por padrão
Exercicios DO VINICIUS/ # Listas e provas (padrões + OOP)
Atividades N2/         # Atividades da segunda unidade
```

---

## Trabalhos avaliativos (`Projetos/`)

| Projeto | Padrão / tema | Descrição |
|---------|---------------|-----------|
| **n2Atividade1** | Abstract Factory | Fábricas regionais (Ceará/Goiás) para coxinha e empada |
| **n2Atividade2** | Singleton | Pista de corrida compartilhada por pilotos |
| **n2Atividade3** | Builder + Director | Montagem de carros (popular, importado, esportivo) |
| **n2Atividade4** | Prototype | Clonagem de pneus para carros e caminhões |
| **trabalhoN1** | Factory Method | Cartas de Autobots (Optimus, Bumblebee, etc.) |
| **banco** | Spring MVC | API REST de conta bancária (depósito/saque) |
| **creational-patterns-ref-01** | Factory Method | Referência Cod3r — evolução fábrica iPhone |

### Executar trabalho Spring Boot

```bash
cd Projetos/n2Atividade1
mvn spring-boot:run
```

---

## Exercícios em sala (`Projetos/ExercicoEmSala - *`)

| Data | Tópico |
|------|--------|
| 07-03-22 | `ArrayList` — pares/ímpares, estatísticas |
| 09-03-22 | `Queue` — filas par/ímpar |
| 10-03-22 | `Stack` — palíndromos em {A,B,C} |
| 14-03-22 | `Deque` — ordenação de alunos |
| 17-03-22 | CRUD `Aluno` com `HashMap` |
| 23-03-22 | Herança `Pessoa` → Cliente/Vendedor/Gerente |
| 31-03-22 | Polimorfismo — emissão CO₂ em veículos |
| 04-04-22 | **Strategy** — tipos de caneta |
| 18-05-22 | **Adapter** — Fahrenheit → Celsius |

---

## Padrões em `Desing Patter/`

| Pasta | Padrão |
|-------|--------|
| AbstractFactoryCarros, IphoneAbstractFactory | Abstract Factory |
| ProjetoFabricaComposite* | Factory Method + Composite |
| SalgadosFacade, Cervejas, CallCenter | Facade |
| DecoratorBrindes, ProjetoDecoratorCarro, coffeeShop | Decorator |
| CeasaComposite | Composite |
| ProjetoAdapter02, tvPort | Adapter |
| ProxyImagem, bank | Proxy |
| Floresta, musicPlayer | Flyweight |
| FigurasPrototype, AnimationPrototype | Prototype |
| ProjetoWar02, Singleton_Monostate | Singleton |
| AeroportoMediator* | Mediator |
| builder, FluentAPI | Builder |

---

## `Exercicios DO VINICIUS/`

Implementações compactas: `abstract-factory`, `adapter`, `singleton`, `builder`, `prototype`, `bridge`, `composite`, `autobots`, `cmp1054.exercicios` (listas N1).

---

## Requisitos

- JDK 11+
- Maven 3.6+
- IDE: IntelliJ IDEA ou VS Code (Spring Boot)

## Observação

`creational-patterns-ref` e partes de `JavaExamples` são material de referência de terceiros, mantidos para estudo.
---

## Autor

**Rodrigo Viana Quirino** — Ciência da Computação, PUC Goiás.

Repositório privado na conta [rodviana](https://github.com/rodviana).
