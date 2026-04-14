# Java (Maven + JUnit 5)

## Prerequisites

- JDK 17+
- Maven 3.9+

## Setup

No extra install beyond Maven resolving dependencies:

```bash
cd java
mvn -q -DskipTests dependency:resolve
```

## Run tests

```bash
mvn test
```

## Layout

- **Implementations:** `src/main/java/com/example/livecoding/<package>/`
- **Tests:** `src/test/java/com/example/livecoding/<package>/`
- **New problems:** copy `com.example.livecoding.template.NewProblem` (class + test) into the right package and rename.

Packages mirror practice areas: `arrays`, `hashmaps`, `strings`, `twopointers`, `stacksqueues`, `recursion`.
