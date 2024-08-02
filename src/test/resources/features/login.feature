# language: es

Característica: Login y Navegación

  Escenario: Logueo Exitoso
    Dado el usuario ingresa a la página web
    Cuando el usuario ingresa las credenciales
    Entonces el usuario se logueo exitosamente

 Escenario: Crear un nuevo recluta
   Dado el usuario ingresa a la opción Recruitment
   Y el usuario ingresa en la opción +add
   Y el usuario introduce los datos full name
   Y el usuario introduce el Email
   Cuando el usuario guarda los datos
   Entonces se muestra los datos del recluta creado
