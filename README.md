## Bootcamp Santander Java Backend Developer
API RESTful Java para CRUD de conta de Ragnarok Online em um Banco de Dados.

Projeto desenvolvido utilizando Java e Spring Framework.

## Diagrama de Classes
```mermaid
classDiagram
    class Account {
        -String username
        -String password
        -String email
        -String gender
        -String birthdate
        +Character characters
    }

    class Character {
        -String charname
        -String jobclass
        -int blvl
        -int jlvl
        -String zeny
        -String guild
        -String status
    }

    Account "1" *-- "N" Character
```
