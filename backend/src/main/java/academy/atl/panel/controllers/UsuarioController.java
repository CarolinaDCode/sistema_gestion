package academy.atl.panel.controllers;

import academy.atl.panel.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping("/api/usuarios")
    public String hacerAlgo(){

        Usuario user = new Usuario();
        user.setId();
        return "[\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"nombre\": \"lucas\",\n" +
                "        \"apellido\": \"moy\",\n" +
                "        \"telefono\": \"21312323\",\n" +
                "        \"email\": \"lucasmoy.dev@atl.acdemmy\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"nombre\": \"lucas\",\n" +
                "        \"apellido\": \"moy\",\n" +
                "        \"telefono\": \"21312323\",\n" +
                "        \"email\": \"lucasmoy.dev@atl.acdemmy\"\n" +
                "    }\n" +
                "]";
    }
}
