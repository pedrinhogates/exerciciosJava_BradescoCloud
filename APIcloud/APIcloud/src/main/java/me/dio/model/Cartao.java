package me.dio.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "cartao")
public class Cartao {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String numero;

    @Column(name = "limite_cartao", precision = 2, scale = 13 )
    private BigDecimal limite;

    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public BigDecimal getLimite() {
        return limite;
    }
    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }
    

}
