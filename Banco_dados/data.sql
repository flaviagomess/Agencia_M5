CREATE DATABASE RBrasil;
USE RBrasil;
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

insert into Reserva (data_reserva, id_usuario, id_destino, total_reserva) values 
('10/09/2023', '2', '1', 345.5),
('09/09/2023', '1', '2', 445.5),
('11/09/2023', '3', '4', 390.5),
('15/09/2023', '4', '3', 545.5);