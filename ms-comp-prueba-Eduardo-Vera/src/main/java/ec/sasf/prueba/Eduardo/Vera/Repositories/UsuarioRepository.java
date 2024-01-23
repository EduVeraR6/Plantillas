package ec.sasf.prueba.Eduardo.Vera.Repositories;

import ec.sasf.prueba.Eduardo.Vera.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    public Usuario findByUsername(String username);
}
