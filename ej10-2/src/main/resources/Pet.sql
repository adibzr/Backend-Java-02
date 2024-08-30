CREATE TABLE test.Pets (
      id INTEGER auto_increment NOT NULL,
      especie varchar(100) NULL,
      nombre varchar(100) NULL,
      CONSTRAINT Animals_PK PRIMARY KEY (id)
)
    ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;