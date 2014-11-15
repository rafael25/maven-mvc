CREATE TABLE usuarios (
    id_usuario  INTEGER PRIMARY KEY AUTO_INCREMENT,
    nombre      VARCHAR(120),
    edad        INTEGER,
    sueldo      FLOAT
);

CREATE TABLE direcciones (
    id_direccion    INTEGER PRIMARY KEY AUTO_INCREMENT,
    calle           VARCHAR(120),
    colonia         VARCHAR(120),
    estado          VARCHAR(50),
    id_usuario      INTEGER,
    CONSTRAINT fk_direccion_usuario FOREIGN KEY id_usuario REFERENCES usuarios(id_usuario)
);
