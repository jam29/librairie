package org.librairie;

import org.librairie.controller.EcrivainController;
import org.librairie.model.entity.Ecrivain;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EcrivainController ec = new EcrivainController();
//        ec.afficheEcrivains();
//        ec.create(new Ecrivain("Pinker","Steve"));
//        ec.create(new Ecrivain("Smith","Jacke"));
        // créer la vue pour saisir le Scanner.
        // ec.modifNom(4,"Fondax");
        ec.afficheEcrivain(2);
    }
}