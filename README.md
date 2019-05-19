PRUEBA CONEXIA restaurante “LA MEJOR COCINA”.

Se utilizaron las siguientes opciones para realizar la prueba
* El framework de desarrollo Spring Boot. 
* El manejador de plantillas Thymeleaf
* Como manejador de Base de Datos: H2 Database, se agrega archivo de BD con datos de prueba.
* Maven como manejador de paquetes.

Para realizar la ejecucion del sistema se deben tomar las siguientes recomendaciones:
* Clonar repositorio.
* Abrir proyecto y ejecutar en STS.
* Acceder al sistema en la URL http://localhost:8080/.

Consideraciones
* Se realizo una correccion en el esquema de Base de Datos, esto debido a que 1 Cocinero puede tener mas de 1 Plato, y este no tiene relacion directo con el DetalleFactura por consiguiente se crea la entidad Plato, donde se relaciona con el Cocinero y en DetalleFactura se relaciona con Plato.
* En el archivo application.properties estan las configuraciones del sistema.
* Para acceder al sistema ir a la URL http://localhost:8080/.
* Para acceder a la Base de Datos ir a la URL http://localhost:8080/h2-console/.
* En el archivo data.sql estan los scripts para cargar la data de prueba en la BD, actualmente comentados.
* En caso de desear generar la BD en blanco solamente es necesario cambiar en el archivo de configuracion application.properties la variable spring.jpa.hibernate.ddl-auto(none) por create. Y descomentar los scripts del archivo data.sql.

FJMA