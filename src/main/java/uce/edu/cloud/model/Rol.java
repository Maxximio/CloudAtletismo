package uce.edu.cloud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roles", schema = "atletismo")
public class Rol {

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_id_seq")
    @SequenceGenerator(name = "role_id_seq", sequenceName = "atletismo.roles_role_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "role_descripcion")
    private String descripcion;

    @Column(name = "role_codigo")
    private String codigo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
}