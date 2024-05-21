package uce.edu.cloud.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "campeonatos", schema = "atletismo")
public class Campeonato {

    @Id
    @Column(name = "camp_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "camp_id_seq")
    @SequenceGenerator(name = "camp_id_seq", sequenceName = "atletismo.campeonatos_camp_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "camp_nombre")
    private String nombre;

    @Column(name = "camp_organizador")
    private String organizador;

    @Column(name = "camp_sede")
    private String sede;

    @Column(name = "camp_fecha_inicio")
    private LocalDateTime fechaInicio;

    @Column(name = "camp_fecha_fin")
    private LocalDateTime fechaFin;

    @Column(name = "camp_inscripcion_inicio")
    private LocalDateTime inscripcionInicio;

    @Column(name = "camp_inscripcion_fin")
    private LocalDateTime inscripcionFin;

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

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDateTime getInscripcionInicio() {
        return inscripcionInicio;
    }

    public void setInscripcionInicio(LocalDateTime inscripcionInicio) {
        this.inscripcionInicio = inscripcionInicio;
    }

    public LocalDateTime getInscripcionFin() {
        return inscripcionFin;
    }

    public void setInscripcionFin(LocalDateTime inscripcionFin) {
        this.inscripcionFin = inscripcionFin;
    }

    
}
