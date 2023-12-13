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
@Table (name = "Destinos")

public class Destinos {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	 //atributos
		private Long id;
		private String nome;
		private String descricao;
		private Float preco;
		
}
