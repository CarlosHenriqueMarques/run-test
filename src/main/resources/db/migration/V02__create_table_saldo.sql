/*==============================================================*/
/* Table: BPCSLD                                                */
/*==============================================================*/
CREATE TABLE IF NOT EXISTS SALDO 
(
   numero_matricula        		          NUMERIC(15)           NOT NULL,
   id_susep               				  NUMERIC(10)           NOT NULL,
   id_investimento               		  NUMERIC(3)            NOT NULL,
   id_conta_reserva           			  NUMERIC(3)            NOT NULL,
   id_custeio               				  NUMERIC(3)            NOT NULL,
   quantidade_cotas           			  NUMERIC(29,16),
   valor_nominal              			  NUMERIC(15,2),
   numero_processo_susep_formatado           VARCHAR(30),
   nome_fantasia_investimento           	  VARCHAR(30),
   nome_conta_reserva           			  VARCHAR(200),
   nome_responsavel_custeio           	  VARCHAR(30),
   data_transacao               			  DATE,
   cpf               					  VARCHAR(11),
   taf									  NUMERIC(15,2),
   data_taf_inicio						  DATE,
   data_taf_fim							  DATE,
   CONSTRAINT "PBPCSLD" PRIMARY KEY (numero_matricula, id_susep, id_investimento, id_conta_reserva, id_custeio)
);

/*==============================================================*/
/* CARGA Saldo                                          	*/
/*==============================================================*/
insert into SALDO values (1000001,2,1,4,5,5,1000.00,'TESTE NR_SSP_FMT','NM_FTS_INV','NM_CTA_RSV','NM_RPV_CUS','1985-12-02','30314279040',0.7,null,null);
insert into SALDO values (1000002,3,2,4,5,4,2000.00,'TESTE NR_SSP_FMT','NM_FTS_INV','NM_CTA_RSV','NM_RPV_CUS','2018-12-02','63366588055',0.7,null,null);
insert into SALDO values (1000003,3,3,4,5,3,3000.00,'TESTE NR_SSP_FMT','NM_FTS_INV','NM_CTA_RSV','NM_RPV_CUS','2017-12-02','20279403089',0.7,null,null);
insert into SALDO values (1000004,5,4,4,5,2,4000.00,'TESTE NR_SSP_FMT','NM_FTS_INV','NM_CTA_RSV','NM_RPV_CUS','2016-12-02','93487642093',0.7,null,null);

insert into SALDO values (1000006,6,5,5,5,1000,75.0,'070.011.578-91','RT FIX','Nome Conta Reserva 1','Nome Custeio 1','2016-12-02','05495640047',0.7,null,null);
insert into SALDO values (1000006,7,6,6,6,1000,50.00,'070.011.578-92','Composto','Nome Conta Reserva 2','Nome Custeio 2','2016-12-02','05495640047',2.0,null,null);
insert into SALDO values (1000006,8,7,7,7,1000,25.00,'070.011.578-93','Renda Fixa','Nome Conta Reserva 3','Nome Custeio 3','2016-12-02','05495640047',1.5,null,null);
insert into SALDO values (1000006,9,8,8,8,0,00.00,'070.011.578-94','Multifundos','Nome Conta Reserva 3','Nome Custeio 4','2016-12-02','05495640047',0,null,null);