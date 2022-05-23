Feature: Validar respuesta Ok
    Como usuario administrativo
    deseo realizar una peticion get
    para validar la respuesta

    Scenario: Validar respuesta Ok
        When realizo una solicitud a un endpoint con parametros definidos
        Then se obtiene una respuesta 200 ok