package org.librairie.controller;

import org.librairie.model.entity.Ecrivain;
import org.librairie.model.service.EcrivainService;
import org.librairie.view.EcrivainView;

import java.util.List;

public class EcrivainController {
    private EcrivainService ecrivainService = new EcrivainService();
    private EcrivainView ecrivainView = new EcrivainView();
    public void afficheEcrivains() {
        List<Ecrivain> ecrivains = ecrivainService.getEcrivains();
        ecrivainView.AfficheEcrivains(ecrivains);
    }
    public void create(Ecrivain e) {
        System.out.println(e.getNom());
        ecrivainService.create(e);
    }
    public void modifNom(int id, String nouveauNom) {
        ecrivainService.modifNom(id,nouveauNom);
    }
}