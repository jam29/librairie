package org.librairie.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Ecrivain")
public class Ecrivain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private String prenom;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "ecrivain_livre",
            joinColumns = { @JoinColumn(name = "id_ecrivain") },
            inverseJoinColumns = { @JoinColumn(name = "id_livre") }
    )
    private List<Livre> livres;

    public Ecrivain(){}
    public Ecrivain(String nom,String prenom) {
        this.nom = nom ;
        this.prenom = prenom ;
    }

    public int getId() {
        return id;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Livre> getLivres() {
        return this.livres;
    }



}
