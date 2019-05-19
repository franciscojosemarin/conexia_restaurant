/*
insert into CAMARERO (NOMBRE, APELLIDO1, APELLIDO2) values('Friedrich','Wilhelm','Nietzsche');
insert into CAMARERO (NOMBRE, APELLIDO1, APELLIDO2) values('Avram','Noam','Chomsky');

insert into CLIENTE (NOMBRE, APELLIDO1, APELLIDO2, OBSERVACIONES) values('Albert','Einstein','Baviera', 'Muy Bueno');
insert into CLIENTE (NOMBRE, APELLIDO1, APELLIDO2, OBSERVACIONES) values('Karl','Werner','Heisenberg', 'Bueno');
insert into CLIENTE (NOMBRE, APELLIDO1, APELLIDO2, OBSERVACIONES) values('Christian August','Hausen','', 'Regular');
insert into CLIENTE (NOMBRE, APELLIDO1, APELLIDO2, OBSERVACIONES) values('Ernest Pascual','Jordan','', 'Malo');

insert into COCINERO (NOMBRE, APELLIDO1, APELLIDO2) values('Anthony Michael','Bourdain','');
insert into COCINERO (NOMBRE, APELLIDO1, APELLIDO2) values('José Ramón','Andrés','Puerta');

insert into MESA (NUMERO_MAX_COMENSALES, UBICACION) values(3,'Centro');
insert into MESA (NUMERO_MAX_COMENSALES, UBICACION) values(2,'Frente');
insert into MESA (NUMERO_MAX_COMENSALES, UBICACION) values(2,'Esquina Izquierda');
insert into MESA (NUMERO_MAX_COMENSALES, UBICACION) values(2,'Esquina Derecha');

insert into PLATO (NOMBRE, ID_COCINERO, IMPORTE) values('Caviar',1,50000.0);
insert into PLATO (NOMBRE, ID_COCINERO, IMPORTE) values('Pan',1,1000.0);
insert into PLATO (NOMBRE, ID_COCINERO, IMPORTE) values('Sopa',2,20000.0);
insert into PLATO (NOMBRE, ID_COCINERO, IMPORTE) values('Pescado',2,25000.0);
insert into PLATO (NOMBRE, ID_COCINERO, IMPORTE) values('Arroz con Pollo',1,30000.0);

insert into FACTURA (ID_CAMARERO, ID_CLIENTE, ID_MESA, FECHA_FACTURA) values(1, 1, 1, '2019-01-09');
insert into FACTURA (ID_CAMARERO, ID_CLIENTE, ID_MESA, FECHA_FACTURA) values(1, 2, 2, '2019-01-09');
insert into FACTURA (ID_CAMARERO, ID_CLIENTE, ID_MESA, FECHA_FACTURA) values(2, 3, 4, '2019-02-09');
insert into FACTURA (ID_CAMARERO, ID_CLIENTE, ID_MESA, FECHA_FACTURA) values(1, 4, 3, '2019-01-09');
insert into FACTURA (ID_CAMARERO, ID_CLIENTE, ID_MESA, FECHA_FACTURA) values(2, 2, 2, '2019-01-09');
insert into FACTURA (ID_CAMARERO, ID_CLIENTE, ID_MESA, FECHA_FACTURA) values(2, 4, 3, '2019-03-09');

insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(1, 2, 10000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(1, 2, 1000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(1, 5, 40000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(2, 1, 200000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(2, 4, 25000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(3, 1, 200000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(3, 1, 200000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(4, 5, 300000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(5, 5, 10000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(5, 4, 10000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(5, 3, 30000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(5, 2, 10000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(5, 1, 20000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(5, 1, 10000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(6, 1, 40000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(6, 2, 10000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(6, 3, 10000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(6, 4, 50000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(6, 5, 10000.0);
insert into DETALLE_FACTURA  (ID_FACTURA, ID_PLATO, IMPORTE) values(6, 5, 20000.0);*/