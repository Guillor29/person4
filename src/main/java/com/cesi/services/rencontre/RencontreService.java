package com.cesi.services.rencontre;

import com.cesi.controller.rencontre.model.Rencontre;
import com.cesi.dao.rencontre.RencontreDAO;
import com.cesi.dao.rencontre.model.RencontreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RencontreService {
    private final RencontreDAO rencontreDAO;


    @Autowired
    public RencontreService(RencontreDAO rencontreDAO){
        this.rencontreDAO = rencontreDAO;
    }

    public RencontreDTO addRencontre(Rencontre rencontre) {
        return rencontreDAO.addRencontre(rencontre);
    }
    public RencontreDTO getRencontre(Integer id){ return rencontreDAO.getRencontre(id); }
    public RencontreDTO updateRencontre(Rencontre rencontre) { return rencontreDAO.updateRencontre(rencontre); }
    public RencontreDTO deleteRencontre(Integer id) { return rencontreDAO.deleteRencontre(id); }

    public RencontreDTO[] getRencontres() { return rencontreDAO.getRencontres(); }
}
