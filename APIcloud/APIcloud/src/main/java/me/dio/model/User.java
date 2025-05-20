package me.dio.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    @OneToOne (cascade = CascadeType.ALL)
    private String conta;
    @OneToOne (cascade = CascadeType.ALL)
    private String cartao;
    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<feature> features;
    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<noticias> noticias;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public String getCartao() {
        return cartao;
    }
    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    public List<feature> getFeatures() {
        return features;
    }
    public void setFeatures(List<feature> features) {
        this.features = features;
    }
    public List<noticias> getNoticias() {
        return noticias;
    }
    public void setNoticias(List<noticias> noticias) {
        this.noticias = noticias;
    }
    
}
