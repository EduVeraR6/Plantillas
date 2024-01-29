package ec.sasf.prueba.Eduardo.Vera.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "evera_roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String rol;
}
