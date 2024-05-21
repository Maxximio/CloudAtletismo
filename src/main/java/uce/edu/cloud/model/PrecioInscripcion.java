package uce.edu.cloud.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "precios_inscripciones", schema = "atletismo")
public class PrecioInscripcion {

    @Id
    @Column(name = "prin_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prin_id_seq")
    @SequenceGenerator(name = "prin_id_seq", sequenceName = "atletismo.precios_inscripciones_prin_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "prin_costo_socio")
    private BigDecimal costoSocio;

    @Column(name = "prin_costo_no_socio")
    private BigDecimal costoNoSocio;

    @Column(name = "prin_costo_prueba_adicional")
    private BigDecimal costoPruebaAdicional;

    @Column(name = "prin_cuenta_bancaria")
    private String cuentaBancaria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCostoSocio() {
        return costoSocio;
    }

    public void setCostoSocio(BigDecimal costoSocio) {
        this.costoSocio = costoSocio;
    }

    public BigDecimal getCostoNoSocio() {
        return costoNoSocio;
    }

    public void setCostoNoSocio(BigDecimal costoNoSocio) {
        this.costoNoSocio = costoNoSocio;
    }

    public BigDecimal getCostoPruebaAdicional() {
        return costoPruebaAdicional;
    }

    public void setCostoPruebaAdicional(BigDecimal costoPruebaAdicional) {
        this.costoPruebaAdicional = costoPruebaAdicional;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
}