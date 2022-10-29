package tn.daoud.jpql.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Projet_Detail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PD_ID")
    private Long id; // Identifiant projet detail (Clé primaire)
    @Column(name = "PD_DESCRIPTION")
    private String description;
    @Column(name = "PD_TECHNOLOGIE")
    private String technologie;
    @Column(name = "PD_COUT_PROVISOIRE")
    private Long cout_provisoire;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @OneToOne(mappedBy="projetDetail")
    private Projet projet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechnologie() {
        return technologie;
    }

    public void setTechnologie(String technologie) {
        this.technologie = technologie;
    }

    public Long getCout_provisoire() {
        return cout_provisoire;
    }

    public void setCout_provisoire(Long cout_provisoire) {
        this.cout_provisoire = cout_provisoire;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }
}