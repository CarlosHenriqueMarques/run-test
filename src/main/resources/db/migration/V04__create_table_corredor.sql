/*==============================================================*/
/* Table: Corredor                                                */
/*==============================================================*/
CREATE TABLE IF NOT EXISTS CORREDOR 
(
   id_corredor 					     SERIAL PRIMARY KEY,
   nome_corredor             		 VARCHAR(30) NOT NULL,
   data_nascimento 				     TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   cpf             				     CHARACTER VARYING(11) NOT NULL
);

/*==============================================================*/
/* CARGA CIRCUITO                                            	*/
/*==============================================================*/
/*
insert into CORREDOR values (1,'Carlos Henrique', '1989-06-23', '81745057099');
insert into CORREDOR values (2,'Layla Guadalupe', '1986-03-15', '38621382083');
*/