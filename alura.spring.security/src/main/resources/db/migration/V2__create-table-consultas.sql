CREATE TABLE consultas (
    id BIGINT IDENTITY(1,1) NOT NULL,
    medico_id BIGINT NOT NULL,
    paciente VARCHAR(100) NOT NULL,
    data DATETIME NOT NULL,
    CONSTRAINT pk_consultas PRIMARY KEY (id),
    CONSTRAINT fk_consultas_medico_id 
        FOREIGN KEY (medico_id) REFERENCES medicos(id)
);