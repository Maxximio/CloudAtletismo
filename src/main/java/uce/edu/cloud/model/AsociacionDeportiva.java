package uce.edu.cloud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "asociaciones_deportivas", schema = "atletismo")
public class AsociacionDeportiva {

    @Id
    @Column(name = "asde_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "asde_id_seq")
    @SequenceGenerator(name = "asde_id_seq", sequenceName = "atletismo.asociaciones_deportivas_asde_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "asde_nombre")
    private String nombre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}