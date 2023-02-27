# gateway
![img.png](img.png)




### 1. service id,url,predicates 정리

        - id: service1
          uri: http://service1.taskoo.net
          predicates:
          - Path=/services/**
        - id: service31
          uri: http://client.taskoo.net
          predicates:
            - Path=/client/**

### 2. config server와의 연결 
