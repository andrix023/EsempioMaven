# EsempioMaven

Questo è un progetto Maven di esempio che dimostra la struttura delle cartelle standard.

## Struttura del Progetto

```
EsempioMaven/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/example/
│   │   │       ├── App.java
│   │   │       └── util/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── org/example/
│               └── AppTest.java
├── docs/
│   └── README.md
└── pom.xml
```

## Come Compilare

```bash
mvn clean compile
```

## Come Eseguire i Test

```bash
mvn test
```

## Come Eseguire l'Applicazione

```bash
mvn exec:java -Dexec.mainClass="org.example.App"
```