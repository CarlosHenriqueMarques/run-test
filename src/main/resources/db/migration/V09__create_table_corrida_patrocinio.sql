/*==============================================================*/
/* Table: patrocinio_corrida                                            */
/*==============================================================*/
CREATE TABLE IF NOT EXISTS PATROCINIO_CORRIDA 
(
   id_patrocinio_corrida              				  SERIAL NOT NULL,
   id_patrocinio   		             	              SERIAL NOT NULL,
   id_corrida 					                      SERIAL NOT NULL,
   contribuicao 					                  NUMERIC(15,2) NOT NULL,   
   CONSTRAINT "PKPATROCINIOCORRIDA"  PRIMARY KEY (id_patrocinio_corrida),
   CONSTRAINT "FKPATROCINIOCORRIDA"    FOREIGN KEY (id_patrocinio) REFERENCES CORREDOR,
   CONSTRAINT "FKCORRIDAPATROCINIO"     FOREIGN KEY (id_corrida) REFERENCES CORRIDA
);

/*==============================================================*/
/* PATROCINIO_CORRIDA                                           	*/
/*==============================================================*/
--insert into PATROCINIO_CORRIDA values (1,1,1,100.0);