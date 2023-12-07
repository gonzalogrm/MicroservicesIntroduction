# Microservices Introduction
Proyecto de introducción a la arquitectura de microservicios.
Se incluyen tres proyectos creados con Spring para simular tres servicios independientes y desacoplados.
- BookData-Service
- BookList-Service
- BookRating-Service

La idea es que la información esté compartimentada en bloques distintos.
- La parte de datos del libro (titulo, autor, sinopsis) se almacena en BookData-Service
- La parte de rating (nota media, número de votos) se almacena en BookRating-Service
- Finalmente, BookList-Service contiene acceso a usuarios y a su colección de libros. Este servicio llama a los dos anteriores y une todas las pizas de información.
- Cada servicio accede a tablas independientes en BBDD que no están conectadas entre sí mediante claves primarias/foráneas para incidir en el desacoplamiento de la aplicación y sus microservicios independientes.

NOTA SOBRE INFORMACIÓN SENSITIVA
- Al tratarse de un proyecto de ejemplo se incluye un archivo de configuración con usuario y contraseña ficticios para que el proyecto esté listo para ser utilizado.
- En casos reales no se debe incluir información sensitiva en archivos de configuración en repositorios públicos.
