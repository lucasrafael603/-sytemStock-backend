CREATE TABLE system_user(

    user_id uuid NOT NULL DEFAULT uuid.generate_v4(),
    username VARCHAR(30) NOT NULL,
    postal_code INT(8),
    address VARCHAR(40),
    state_province VARCHAR (30),
    telephone INT(11),
    email VARCHAR(30),
    password varchar(12) NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE,
    updated_at TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT system_user_pk PRIMARY KEY (user_id)

);






--CREATE SEQUENCE pessoa_id_seq AS BIGINT START WITH 1 INCREMENT BY 1;
--CREATE TABLE pessoa (
--  codigo BIGINT GENERATED BY DEFAULT AS SEQUENCE pessoa_id_seq PRIMARY KEY,
--  nome VARCHAR(80) NOT NULL,
--  cpf VARCHAR(11) NOT NULL
--);