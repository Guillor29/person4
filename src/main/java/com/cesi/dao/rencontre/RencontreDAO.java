package com.cesi.dao.rencontre;

import com.cesi.controller.rencontre.model.Rencontre;
import com.cesi.dao.rencontre.model.RencontreDTO;

public interface RencontreDAO {
    RencontreDTO addRencontre(Rencontre rencontre);
    RencontreDTO getRencontre(Integer id);
    RencontreDTO updateRencontre(Rencontre rencontre);
    RencontreDTO deleteRencontre(Integer id);
    RencontreDTO[] getRencontres();
}
