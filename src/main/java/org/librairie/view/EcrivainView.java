package org.librairie.view;

import org.librairie.model.entity.Ecrivain;
import org.librairie.model.entity.Livre;

import java.util.List;

public class EcrivainView {
    public void AfficheEcrivains(List<Ecrivain> ecrivains) {
        for(Ecrivain ecrivain: ecrivains) {
            System.out.println(ecrivain.getNom()+" "+ecrivain.getPrenom());
            for(Livre l: ecrivain.getLivres()) {
                System.out.println(l.getTitre());
            }
        }
    }
}

