package uce.edu.cloud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pruebas", schema = "atletismo")
public class Prueba {

    @Id
    @Column(name = "prue_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prue_id_seq")
    @SequenceGenerator(name = "prue_id_seq", sequenceName = "atletismo.pruebas_prue_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "prue_nombre")
    private String nombre;

    @Column(name = "prue_intentos")
    private Integer intentos;

    @Column(name = "prue_tipo")
    private String tipo;

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

    public Integer getIntentos() {
        return intentos;
    }

    public void setIntentos(Integer intentos) {
        this.intentos = intentos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}