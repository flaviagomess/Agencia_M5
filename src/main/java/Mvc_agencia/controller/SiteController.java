package Mvc_agencia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
    public String cadastro () {
        return "reserva";
    }

    @GetMapping("/contato")
    public String contato () {
        return "Contato";
    }
    
    @GetMapping("/mensagemEnviada")
    public String mensagemEnviada () {
        return "mensagemEnviada";
    }


}
