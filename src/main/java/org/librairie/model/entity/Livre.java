package org.librairie.model.entity;

import javax.persistence.*;

@Entity
@Table(name="Livre")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Titre ;
    @ManyToOne
    @JoinColumn(name = "id_ecrivain")
    private Ecrivain ecrivain; // un seul écrivain par livre.

   public Livre(){}
    public Livre (String titre) {
        this.Titre = titre;
    }
    public int getId() {
        return id;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public Ecrivain getEcrivain() {
        return ecrivain;
    }

    public void setEcrivain(Ecrivain ecrivain) {
        this.ecrivain = ecrivain;
    }
}
