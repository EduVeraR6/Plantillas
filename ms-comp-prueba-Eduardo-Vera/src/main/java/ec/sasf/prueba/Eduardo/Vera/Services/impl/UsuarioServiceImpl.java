package ec.sasf.prueba.Eduardo.Vera.Services.impl;

import ec.sasf.prueba.Eduardo.Vera.Entities.Usuario;
import ec.sasf.prueba.Eduardo.Vera.Entities.UsuarioRol;
import ec.sasf.prueba.Eduardo.Vera.ExceptionHandler.BadRequestException;
import ec.sasf.prueba.Eduardo.Vera.ExceptionHandler.LocalNotFoundException;
import ec.sasf.prueba.Eduardo.Vera.Repositories.RolRepository;
import ec.sasf.prueba.Eduardo.Vera.Repositories.UsuarioRepository;
import ec.sasf.prueba.Eduardo.Vera.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;


    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception  {
        Usuario usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
        if(usuarioLocal != null){
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya esta presente");
        }
        else{
            for(UsuarioRol usuarioRol:usuarioRoles){
                rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }

    @Override
    public Usuario obtenerUsuario(String username) throws LocalNotFoundException {

        Usuario usuario = usuarioRepository.findByUsername(username);

        if(usuario == null){
            throw  new LocalNotFoundException("Usuario no encontrado");
        }

        return usuario;
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {

        usuarioRepository.deleteById(usuarioId);
    }
}
