package org.librairie.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Livre")
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Titre ;

    @ManyToMany(mappedBy="livres")
    private List<Ecrivain> ecrivains ; // plusieurs écrivains par livre.

    public int getId() {
        return id;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public List getEcrivains() {
        return ecrivains;
    }

}
