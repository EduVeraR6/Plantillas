package ec.sasf.prueba.Eduado.Vera.Repositories;

import ec.sasf.prueba.Eduado.Vera.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.time.LocalDate;

public interface UsuarioRepository extends JpaRepository<Usuario , Long> {


    @Procedure(name = "EVERA.evera_registrarUsuario")
    Long evera_registrarUsuario(String username , String password , String rol , char estado , LocalDate fe_creacion);

    @Procedure(name = "EVERA_BUSCARCREDENCIALES")
    Long EVERA_BUSCARCREDENCIALES(String username , String password);
    Usuario findByUsername(String username);


}
