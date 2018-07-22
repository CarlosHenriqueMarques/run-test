/*==============================================================*/
/* Table: CORRIDA                                                */
/*==============================================================*/
CREATE TABLE IF NOT EXISTS CORRIDA 
(
   id_corrida               				  NUMERIC(10) NOT NULL,
   nome_corrida   		             		  VARCHAR(60) NOT NULL,
   data_corrida 					          TIMESTAMP WITHOUT TIME ZONE NOT NULL,
   tamanho_percurso             			  NUMERIC NOT NULL,
   id_endereco               				  NUMERIC(10) NOT NULL,
   id_circuito               				  NUMERIC(10) NOT NULL,
   CONSTRAINT "PKCORRIDA"  PRIMARY KEY (id_corrida),
   CONSTRAINT "FKCIRCUITO" FOREIGN KEY (id_circuito) REFERENCES CIRCUITO,
   CONSTRAINT "FKENDERECO" FOREIGN KEY (id_endereco) REFERENCES ENDERECO
);

/*==============================================================*/
/* CARGA CIRCUITO                                            	*/
/*==============================================================*/

--insert into CORRIDA values (1,'Corrida de verão', '2018-01-03', 5,1,1);