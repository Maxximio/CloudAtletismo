package uce.edu.cloud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "documentos_usuarios", schema = "atletismo")
public class DocumentoUsuario {

    @Id
    @Column(name = "dous_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dous_id_seq")
    @SequenceGenerator(name = "dous_id_seq", sequenceName = "atletismo.documentos_usuarios_dous_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "dous_nombre")
    private String nombre;

    @Column(name = "dous_link")
    private String link;

    @Column(name = "dous_extension")
    private String extension;

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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
    
}