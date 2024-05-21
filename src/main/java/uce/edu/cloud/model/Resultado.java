package uce.edu.cloud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "resultados", schema = "atletismo")
public class Resultado {

    @Id
    @Column(name = "resu_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "resu_id_seq")
    @SequenceGenerator(name = "resu_id_seq", sequenceName = "atletismo.resultados_resu_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "resu_intento")
    private Integer intento;

    @Column(name = "resu_marca")
    private String marca;

    @Column(name = "resu_medida")
    private String medida;

    @Column(name = "resu_unidad")
    private String unidad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIntento() {
        return intento;
    }

    public void setIntento(Integer intento) {
        this.intento = intento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    
}