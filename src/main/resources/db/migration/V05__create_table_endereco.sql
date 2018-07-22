/*==============================================================*/
/* Table: Endereço                                                */
/*==============================================================*/
CREATE TABLE IF NOT EXISTS ENDERECO 
(
   id_endereco               				  NUMERIC(10) NOT NULL,
   rua   		             		          VARCHAR(60) NOT NULL,
   estado 					                  VARCHAR(60) NOT NULL,
   cidade             						  VARCHAR(60) NOT NULL,
   CONSTRAINT "PKENDERECO" PRIMARY KEY (id_endereco)
);

/*==============================================================*/
/* CARGA CIRCUITO                                            	*/
/*==============================================================*/
/*
insert into ENDERECO values (1,'Alameda Eduardo do Exu', 'São Paulo','São Paulo');
insert into ENDERECO values (2,'Rua dos Orixás', 'Bahia','Salvador');
*/