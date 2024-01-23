package ec.sasf.prueba.Eduardo.Vera.Entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioRolId;

    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

    @ManyToOne
    private Rol rol;

    private LocalDateTime Fe_creacion = LocalDateTime.now();

    private LocalDateTime Fe_actualizacion;

    private boolean estado = true;

    public Long getUsuarioRolId() {
        return usuarioRolId;
    }

    public void setUsuarioRolId(Long usuarioRolId) {
        this.usuarioRolId = usuarioRolId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public LocalDateTime getFe_creacion() {
        return Fe_creacion;
    }

    public void setFe_creacion(LocalDateTime fe_creacion) {
        Fe_creacion = fe_creacion;
    }

    public LocalDateTime getFe_actualizacion() {
        return Fe_actualizacion;
    }

    public void setFe_actualizacion(LocalDateTime fe_actualizacion) {
        Fe_actualizacion = fe_actualizacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
