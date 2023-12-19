CREATE DATABASE Recode_Brasil;

USE Recode_Brasil;

CREATE TABLE Usuarios (
    id_usuario INTEGER PRIMARY KEY auto_increment,
    nome_usuario VARCHAR (40),
    email_usuario VARCHAR (80),
    senha_usuario VARCHAR (40)
);

CREATE TABLE Destinos (
    id_destino INTEGER PRIMARY KEY auto_increment,
    nome_destino VARCHAR (80),
    descricao_destino VARCHAR (150),
    preco_destino FLOAT (10)
);

CREATE TABLE Reserva (
    id_reserva INTEGER PRIMARY KEY auto_increment,
    data_reserva VARCHAR (10),
    fk_Usuarios_id_usuario INTEGER,
    fk_Destinos_id_destino INTEGER,
    total_reserva FLOAT (10)
);

CREATE VIEW usuario_destino As 
select r.id_reserva, r.data_reserva, r.total_reserva, d.*, u.* from Reserva r, Destinos d, Usuarios u
where r.fk_Destinos_id_destino = d.id_destino and r.fk_Usuarios_id_usuario = u.id_usuario;

select * from Destinos;
select * from Usuarios;
select * from Reserva;
select * from usuario_destino order by id_reserva;

select r.id_reserva, r.data_reserva, r.total_reserva, d.*, u.* 
from Reserva r, Destinos d, Usuarios u 
where r.fk_Destinos_id_destino = d.id_destino and r.fk_Usuarios_id_usuario = u.id_usuario;

insert into Usuarios (nome, email, senha) values
('Fernanda', 'fernanda@gmail.com', '123'),
('Diego', 'diego@gmail.com', '345'),
('Otavio', 'otavio@gmail.com', '123'),
('Bruna', 'bruna@gmail.com', '345');

insert into Destinos (nome, descricao, preco) values 
('Recife', 'Recife te espera com suas belezas naturais e culturais', 345.5),
('Floripa', 'Floripa te espera com suas belezas naturais e culturais', 445.5),
('Porto de Galinha', 'Porto te espera com suas belezas naturais e culturais', 545.5),
('Noronha', 'Noronha te espera com suas belezas naturais e culturais', 390.5);

insert into Reserva (data_reserva, total_reserva, id_usuario, id_destino) values 
('10/09/2023', '2', '1', 345.5);
(default, '09/09/2023', '1', '2', 445.5),
(default, '11/09/2023', '3', '4', 390.5),
(default, '15/09/2023', '4', '3', 545.5);