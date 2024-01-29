package ec.sasf.prueba.Eduado.Vera.Services.Impl;

import ec.sasf.prueba.Eduado.Vera.Entities.Autenticacion;
import ec.sasf.prueba.Eduado.Vera.Entities.Usuario;
import ec.sasf.prueba.Eduado.Vera.Repositories.UsuarioRepository;
import ec.sasf.prueba.Eduado.Vera.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository _repository;


    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        _repository.evera_registrarUsuario(usuario.getUsername(), usuario.getPassword(), usuario.getRol(), usuario.getEstado(), usuario.getFe_creacion());
        Usuario usuario1 = _repository.findByUsername(usuario.getUsername());
        return usuario1;
    }

    @Override
    public Usuario buscarCredenciales(Autenticacion autenticacion) {

        Long id = _repository.EVERA_BUSCARCREDENCIALES(autenticacion.getUsername() , autenticacion.getPassword());

        Optional<Usuario> usuario1 = _repository.findById(id);

        return usuario1.get();
    }
}
