package ec.sasf.prueba.Eduado.Vera.Controllers;


import ec.sasf.prueba.Eduado.Vera.Entities.Autenticacion;
import ec.sasf.prueba.Eduado.Vera.Entities.Usuario;
import ec.sasf.prueba.Eduado.Vera.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService _service;


    @PostMapping
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok(_service.registrarUsuario(usuario));
    }

    @PostMapping("/Login")
    public ResponseEntity<Usuario> buscarCredenciales(@RequestBody Autenticacion autenticacion){
        return ResponseEntity.ok(_service.buscarCredenciales(autenticacion));
    }

}
