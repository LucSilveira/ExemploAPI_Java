create table oportunidade(

	id BIGINT AUTO_INCREMENT NOT NULL,
	nome_prospecto VARCHAR(80) NOT NULL, 
	descricao VARCHAR(255) NOT NULL,
	valor DECIMAL(10,2),
	
	PRIMARY KEY(id)
);