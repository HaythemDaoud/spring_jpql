package tn.daoud.jpql.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "T_ENTREPRISE")
public class Entreprise implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ENTREPRISE_ID")
    private Long id; // Identifiant entreprise (Clé primaire)

    @Column(name = "ENTREPRISE_NOM")
    private String nom;

    @Column(name = "ENTREPRISE_ADRESSE")
    private String adresse;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Equipe> Equipes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Set<Equipe> getEquipes() {
        return Equipes;
    }

    public void setEquipes(Set<Equipe> equipes) {
        Equipes = equipes;
    }
}