PRUEBA CONEXIA restaurante “LA MEJOR COCINA”.

Se utilizaron las siguientes opciones para realizar la prueba
* El framework de desarrollo Spring Boot. 
* Como manejador de Base de Datos: H2 Database, se incorpora script de creacion de datos en la BD. Solo es necesario iniciar la aplicacion para crear la BD e instanciar los datos.
* Maven como manejador de paquetes.
* En el archivo application.properties estan las configuraciones del sistema.
* En el archivo data.sql estan los scripts para cargar la data de prueba en la BD.

Para realizar la ejecucion del sistema se deben tomar las siguientes recomendaciones:
* Clonar repositorio.
* Abrir proyecto y ejecutar en STS.

Consideraciones
* Se realizo una correccion en el esquema de Base de Datos, esto debido a que se 1 Cocinero puede tener mas de 1 Plato, y este no tiene relacion directo con el DetalleFactura por consiguiente se crea la entidad Plato, donde se relaciona con el Cocinero y en DetalleFactura se relaciona con Plato.