package uce.edu.cloud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias", schema = "atletismo")
public class Categoria {

    @Id
    @Column(name = "cate_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cate_id_seq")
    @SequenceGenerator(name = "cate_id_seq", sequenceName = "atletismo.categorias_cate_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "cate_nombre")
    private String nombre;

    @Column(name = "cate_edad_minima")
    private Integer edadMinima;

    @Column(name = "cate_edad_maxima")
    private Integer edadMaxima;

    @Column(name = "cate_genero")
    private String genero;

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

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public Integer getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(Integer edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
}
