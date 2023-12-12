package Mvc_agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Mvc_agencia.model.Usuarios;

public interface UsuarioRepository extends JpaRepository <Usuarios, Long>{

}

