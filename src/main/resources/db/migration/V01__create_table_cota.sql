
/*==============================================================*/
/* Table: BPCCOT                                                */
/*==============================================================*/
CREATE TABLE IF NOT EXISTS COTA 
(
   id_investimento_cota           NUMERIC(3,0)          NOT NULL,
   data_cota               DATE,
   valor_cota               NUMERIC(13,10),
   CONSTRAINT "PBPCCOT" PRIMARY KEY (id_investimento_cota)
);
/*
insert into COTA values (1,'1985-12-02',10);
insert into COTA values (2,'2018-12-02',20);
insert into COTA values (3,'2017-12-02',30);
insert into COTA values (4,'2016-12-02',40);
insert into COTA values (5,'2016-12-02',200);
insert into COTA values (6,'2016-12-02',300);
insert into COTA values (7,'2016-12-02',50);
insert into COTA values (8,'2016-12-02',0);
*/