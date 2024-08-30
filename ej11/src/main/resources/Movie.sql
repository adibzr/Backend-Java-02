CREATE TABLE test.Movies (
         id BIGINT auto_increment NOT NULL,
         movieName varchar(50) NULL,
         description varchar(100) NULL,
         yearOfRelease INT NULL,
         CONSTRAINT Movies_PK PRIMARY KEY (id)
)
    ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;