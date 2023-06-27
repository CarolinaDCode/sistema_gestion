package academy.atl.panel.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping("/prueba")
    public String hacerAlgo(){
        return "Hola";
    }
}
