/*==============================================================*/
/* Table: CORREDOR_CORRIDA                                            */
/*==============================================================*/
CREATE TABLE IF NOT EXISTS CORREDOR_CORRIDA 
(
   id_corredor_corrida               				  SERIAL NOT NULL,
   id_corredor   		             	              SERIAL NOT NULL,
   id_corrida 					                      SERIAL NOT NULL,
   tempo_chegada 					                  TIMESTAMP WITHOUT TIME ZONE,
   CONSTRAINT "PKCORREDORCORRIDA"  PRIMARY KEY (id_corredor_corrida),
   CONSTRAINT "FKCORREDORCORRIDA"    FOREIGN KEY (id_corredor) REFERENCES CORREDOR,
   CONSTRAINT "FKCORRIDACORREDOR"     FOREIGN KEY (id_corrida) REFERENCES CORRIDA
);

/*==============================================================*/
/* CORREDOR_CORRIDA                                           	*/
/*==============================================================*/
--insert into CORREDOR_CORRIDA values (1,1,1,'2018-01-03');