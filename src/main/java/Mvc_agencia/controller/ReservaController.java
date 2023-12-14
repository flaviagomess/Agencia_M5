package Mvc_agencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Mvc_agencia.model.Reserva;
import Mvc_agencia.repository.DestinoRepository;
import Mvc_agencia.repository.ReservaRepository;
import Mvc_agencia.repository.UsuarioRepository;

@Controller
@RequestMapping("/reserva")
public class ReservaController {
	
	@Autowired
	private ReservaRepository reservaRepository; 
	@Autowired
	private UsuarioRepository usuarioRepository; 
	@Autowired 
	private DestinoRepository destinoRepository;

	@GetMapping
	public ModelAndView reserva() {
		ModelAndView modelAndView = new ModelAndView("views/reserva/index.html");

		modelAndView.addObject("listaUsuarios", usuarioRepository.findAll());
		modelAndView.addObject("listaDestinos", destinoRepository.findAll());
		modelAndView.addObject("Reserva", reservaRepository.findAll());
		modelAndView.addObject("reserva", new Reserva());

		return modelAndView;
	}


	@PostMapping("/cadastrar")
	public String cadastrar(@ModelAttribute("reserva") Reserva reserva) {

		
		Float preco = destinoRepository.findById(reserva.getDestino().getId()).get().getPreco();
		reserva.setTotal_reserva(preco);

        reservaRepository.save(reserva);

		return "redirect:/reserva";
	}

	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable Long id) {
		reservaRepository.deleteById(id);

		return "redirect:/reserva";
	}
}
