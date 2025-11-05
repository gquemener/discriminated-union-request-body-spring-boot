# Polymorphic API with Spring Boot

## Introduction

This project illustrates the usage of a polymorphic payload
using [OpenAPI oneOf feature](https://swagger.io/docs/specification/v3_0/data-models/inheritance-and-polymorphism/#polymorphism)
and Spring Boot.

## Execution

Start the application through your IDE or CLI:

```
$ ./gradlew bootRun
```

## Examples

```
$ curl -X POST --location "http://localhost:8080/api/v1/animals" \
    -H "Content-Type: application/json" \
    -d '{
          "type": "Cat",
          "name": "Felix"
        }'
        
(...)

Felix the cat was created!
```

```
$ curl -X POST --location "http://localhost:8080/api/v1/animals" \
    -H "Content-Type: application/json" \
    -d '{
          "type": "Fish",
          "salty": true
        }'
        
(...)

Salty fish created!  
```
