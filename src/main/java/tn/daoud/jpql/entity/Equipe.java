package tn.daoud.jpql.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "T_EQUIPE")
public  class Equipe implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EQUIPE_ID")
    private Long id; // Identifiant equipe (Clé primaire)

    @Column(name = "EQUIPE_NOM")
    private String nom;

    @Column(name = "EQUIPE_SPECIALITE")
    private String specialite;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Projet> projets;

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

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Set<Projet> getProjets() {
        return projets;
    }

    public void setProjets(Set<Projet> projets) {
        this.projets = projets;
    }
}