# language: es

Característica: Realizar casos de pruebas para la plataforma DemoQA
dada la pagina https://demoqa.com/
Como usuario de la pagina
Quiero poder interactuar con la pagina web

  Esquema del escenario: Validar WebTables en el portal DemoQA
    Dado que Ivan ingresa a la url correspondiente
    Cuando ingresa los datos al formulario y elimina un dato de la lista
      | firstname   | lastname   | email   | age   | salary | departament  |
      | <firstname> | <lastname> | <email> | <age> |<salary>| <departament>|
    Entonces el valida el resultado esperado

    Ejemplos:
      | firstname | lastname    | email             | age | salary  | departament|
      | Pruebas   | Alejandra   |test123@yopmail.com| 25  | 7000000 | Calidad    |

  Esquema del escenario: Validar Datapicker en el portal DemoQA
    Dado que Ivan ingresa a la url correspondiente
    Cuando ingresa las fechas seleccionadas
      | mes   | year   | dia   | hora   |
      | <mes> | <year> | <dia> | <hora> |

    Ejemplos:
      | mes      | year | dia | hora  |
      | November | 2021 | 10  | 17:00 |

  Escenario: Validar Alertas en el portal DemoQA
    Dado que Ivan ingresa a la url correspondiente
    Cuando selecciona las alertas correspondientes
