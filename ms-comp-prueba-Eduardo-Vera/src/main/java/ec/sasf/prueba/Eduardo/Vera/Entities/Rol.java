package ec.sasf.prueba.Eduardo.Vera.Entities;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="roles")
public class Rol {

    @Id
    private Long rolId;
    private String rolNombre;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "rol")
    private Set<UsuarioRol> usuarioRoles = new HashSet<>();

    private LocalDateTime Fe_creacion = LocalDateTime.now();

    private LocalDateTime Fe_actualizacion;

    private boolean estado = true;

    public Rol() {
    }

    public Rol(Long rolId, String rolNombre, LocalDateTime fe_creacion, LocalDateTime fe_actualizacion, boolean estado) {
        this.rolId = rolId;
        this.rolNombre = rolNombre;
        Fe_creacion = fe_creacion;
        Fe_actualizacion = fe_actualizacion;
        this.estado = estado;
    }

    public Long getRolId() {
        return rolId;
    }

    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }

    public String getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    public Set<UsuarioRol> getUsuarioRoles() {
        return usuarioRoles;
    }

    public void setUsuarioRoles(Set<UsuarioRol> usuarioRoles) {
        this.usuarioRoles = usuarioRoles;
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
