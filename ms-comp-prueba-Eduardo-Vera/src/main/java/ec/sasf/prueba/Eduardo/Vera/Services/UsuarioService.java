package ec.sasf.prueba.Eduardo.Vera.Services;

import ec.sasf.prueba.Eduardo.Vera.Entities.Usuario;
import ec.sasf.prueba.Eduardo.Vera.Entities.UsuarioRol;
import ec.sasf.prueba.Eduardo.Vera.ExceptionHandler.BadRequestException;
import ec.sasf.prueba.Eduardo.Vera.ExceptionHandler.LocalNotFoundException;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario , Set<UsuarioRol> usuariosRoles) throws Exception;

    public Usuario obtenerUsuario(String username) throws LocalNotFoundException;


    public void eliminarUsuario(Long usuarioId);



}
