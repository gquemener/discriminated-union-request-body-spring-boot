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

You may now access:

- [Swagger UI](http://localhost:8080/swagger-ui/index.html)
- [OpenApi Spec (json)](http://localhost:8080/v3/api-docs)
- [OpenApi Spec (yaml)](http://localhost:8080/v3/api-docs.yaml)

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
