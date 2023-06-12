# Deutsche Bank Assignment

## Prerequisite

- JDK 17

## How to run

```sh
cd merchant
./gradlew bootRun
```

## How to test

```sh
cd merchant
./gradlew test
```

## Checkstyles

```sh
cd merchant
./gradlew checkstyleMain
./gradlew checkstyleTest
```

## How to QA

- Run the app

```sh
cd merchant
./gradlew test
```

- Make a put request

```sh
curl -X PUT http://localhost:8080/api/signal/1
```

- Corresponding signal execution steps should be visible in terminal
  
```sh
setUp
setAlgoParam 1,60
performCalc
submitToMarket
doAlgo
```
