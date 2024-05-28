package org.librairie.model.service;

import org.librairie.model.dao.EcrivainDao;
import org.librairie.model.entity.Ecrivain;

import java.util.List;

public class EcrivainService {
   // partie service
    private EcrivainDao ecrivainDao = new EcrivainDao();
    public List getEcrivains() {
        List ecrivains = ecrivainDao.getEcrivains() ;
        return ecrivains ;
    }
    public void create(Ecrivain e) {
        ecrivainDao.create(e);
    }
    public void modifNom(int id, String nom ) {
        ecrivainDao.modifNom(id, nom );
    }
}
