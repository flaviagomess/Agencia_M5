package Mvc_agencia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Mvc_agencia.model.Usuarios;

@Controller
public class SiteController {


    @GetMapping({"/", "index"})
    public String home () {
        return "index";
    }

    @GetMapping("/destino")
    public String destino () {
        return "destino";
    }

    @GetMapping("/promoções")
    public String promocoes () {
        return "promoções";
    }

    @GetMapping("/reservar")
    public String reservar () {
        return "reservar";
    }

    @GetMapping("/contato")
    public String contato () {
        return "Contato";
    }
    
    @GetMapping("/mensagemEnviada")
    public String mensagemEnviada () {
        return "mensagemEnviada";
    }
    @GetMapping("/formUsuario")
    public String formUsuario(Model model) {
        model.addAttribute("usuario", new Usuarios());
        return "formUsuario";
    }
    
}
