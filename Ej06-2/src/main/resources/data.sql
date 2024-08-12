CREATE TABLE IF NOT EXISTS TarjetaCredito (
     id INT auto_increment NOT NULL,
     numero varchar(100) NOT NULL,
     titular varchar(100) NULL
);

CREATE TABLE IF NOT EXISTS TarjetaDebito (
      id INT auto_increment NOT NULL,
      numero varchar(100) NOT NULL,
      titular varchar(100) NULL
);

INSERT INTO TarjetaCredito (numero,titular) VALUES ('4554 1487 5447 9878', 'Victor M');
INSERT INTO TarjetaCredito (numero,titular) VALUES ('4554 9874 5847 3654', 'Lewis H');
INSERT INTO TarjetaCredito (numero,titular) VALUES ('4554 8747 8475 2147', 'Sergio Perez');