## Examples

```
curl -X POST --location "http://localhost:8080/api/v1/animals" \
    -H "Content-Type: application/json" \
    -d '{
          "type": "Cat",
          "name": "Felix"
        }'

HTTP/1.1 200 
Content-Type: text/plain;charset=UTF-8
Content-Length: 26
Date: Thu, 23 Oct 2025 13:51:36 GMT

Felix the cat was created!
```

```
curl -X POST --location "http://localhost:8080/api/v1/animals" \
    -H "Content-Type: application/json" \
    -d '{
          "type": "Fish",
          "salty": true
        }'
        
HTTP/1.1 200 
Content-Type: text/plain;charset=UTF-8
Content-Length: 19
Date: Thu, 23 Oct 2025 13:52:19 GMT

Salty fish created!  
```
