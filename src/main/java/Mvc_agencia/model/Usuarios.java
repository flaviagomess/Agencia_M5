package Mvc_agencia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "Usuarios")

public class Usuarios {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
    //atributos
	private Long id;
	private String nome;
	private String email;
	private String senha;
	
}
