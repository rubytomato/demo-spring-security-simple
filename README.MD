# Spring Security With Spring Boot 2.2 Demo simple application

Development environment

* OpenJDK 14.0
* Spring Boot 2.2.7
* Spring Security 5.2.4
* H2
* Gradle 6.3

## Build & Run

build

```
gradlew clean build --warning-mode all
```

run

```
gradlew bootRun
```

or

```
java -jar .\build\libs\demo.jar
```

## Demo simple application top page

```
http://localhost:8080/
```

**top page**

![top](https://raw.githubusercontent.com/rubytomato/demo-spring-security-simple/master/images/top.png)

**after login**

![top](https://raw.githubusercontent.com/rubytomato/demo-spring-security-simple/master/images/top_after_login.png)


## database

using h2

```
DROP TABLE IF EXISTS login_user;
CREATE TABLE login_user (
  id BIGINT AUTO_INCREMENT                    COMMENT 'ユーザーID',
  name VARCHAR(60) NOT NULL                   COMMENT 'ユーザー名',
  email VARCHAR(120) NOT NULL                 COMMENT 'メールアドレス',
  password VARCHAR(120) NOT NULL              COMMENT 'パスワード',
  roles VARCHAR(120)                          COMMENT 'ロール',
  enable_flag TINYINT(1) NOT NULL DEFAULT 1   COMMENT '1:有効 0:無効',
  PRIMARY KEY (id),
  UNIQUE KEY (email)
)
ENGINE = INNODB
DEFAULT CHARSET = UTF8MB4;
```

h2-console

```
http://localhost:8080/h2-console
```