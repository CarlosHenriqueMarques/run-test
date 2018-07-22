/*==============================================================*/
/* Table: CIRCUITO                                                */
/*==============================================================*/
CREATE TABLE IF NOT EXISTS CIRCUITO 
(
   id_circuito               				  NUMERIC(10) NOT NULL,
   nome_circuito             		          VARCHAR(30) NOT NULL,
   data_inicio_circuito 					  TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   data_fim_circuito 						  TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   CONSTRAINT "PKCIRCUITO" PRIMARY KEY (id_circuito)
);

/*==============================================================*/
/* CARGA CIRCUITO                                            	*/
/*==============================================================*/
/*
insert into CIRCUITO values (1,'Circuito das estações', '2018-01-03','2018-12-28');
insert into CIRCUITO values (2,'Circuito das estrelas', '2018-06-03','2018-10-28');
*/