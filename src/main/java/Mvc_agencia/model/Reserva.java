package Mvc_agencia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "Reserva")

public class Reserva {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String data_reserva;
	private Float total_reserva;
	

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuarios usuario;
	
	@ManyToOne
	@JoinColumn(name = "id_destino")
	private Destinos destino;

	}
