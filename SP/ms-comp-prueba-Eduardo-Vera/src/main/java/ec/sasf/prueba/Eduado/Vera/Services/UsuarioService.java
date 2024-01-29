package ec.sasf.prueba.Eduado.Vera.Services;

import ec.sasf.prueba.Eduado.Vera.Entities.Autenticacion;
import ec.sasf.prueba.Eduado.Vera.Entities.Usuario;

public interface UsuarioService {

    Usuario registrarUsuario(Usuario usuario);

    Usuario buscarCredenciales(Autenticacion autenticacion);
}
