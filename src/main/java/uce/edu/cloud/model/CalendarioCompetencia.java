package uce.edu.cloud.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "calendarios_competencias", schema = "atletismo")
public class CalendarioCompetencia {

    @Id
    @Column(name = "caco_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "caco_id_seq")
    @SequenceGenerator(name = "caco_id_seq", sequenceName = "atletismo.calendarios_competencias_caco_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "caco_fecha")
    private LocalDateTime fecha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    
}