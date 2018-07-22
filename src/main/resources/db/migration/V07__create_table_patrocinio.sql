/*==============================================================*/
/* Table: PATROCINIO                                            */
/*==============================================================*/
CREATE TABLE IF NOT EXISTS PATROCINIO 
(
   id_patrocinio               				  NUMERIC(10) NOT NULL,
   nome_patrocinio   		             	  VARCHAR(60) NOT NULL,
   CONSTRAINT "PKPATROCINIO"  PRIMARY KEY (id_patrocinio)
);

/*==============================================================*/
/* CARGA PATROCINIO                                            	*/
/*==============================================================*/
--insert into PATROCINIO values (1,'02');