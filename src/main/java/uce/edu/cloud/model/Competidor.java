package uce.edu.cloud.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "competidores", schema = "atletismo")
public class Competidor {

    @Id
    @Column(name = "comp_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comp_id_seq")
    @SequenceGenerator(name = "comp_id_seq", sequenceName = "atletismo.competidores_comp_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "comp_fecha_inscripcion")
    private LocalDateTime fechaInscripcion;

    @Column(name = "comp_estado_participacion")
    private String estadoParticipacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDateTime fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getEstadoParticipacion() {
        return estadoParticipacion;
    }

    public void setEstadoParticipacion(String estadoParticipacion) {
        this.estadoParticipacion = estadoParticipacion;
    }
}
