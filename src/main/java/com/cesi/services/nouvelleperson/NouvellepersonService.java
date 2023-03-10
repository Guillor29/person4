package com.cesi.services.nouvelleperson;

import com.cesi.controller.nouvelleperson.model.Nouvelleperson;
import com.cesi.controller.person.model.Person;
import com.cesi.dao.person.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NouvellepersonService {

    private final PersonDAO personDAO;

    @Autowired
    public NouvellepersonService(@Qualifier("personDaoBDD") final PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public List<Nouvelleperson> getAllPersons() {
        List<Nouvelleperson> nouvelleperson = this.personDAO.getAllPersons();
        for(Nouvelleperson person : nouvelleperson){
            person.setVictoryOrDefeat(getVictoryOrDefeat(person.getId()));
        }
        return nouvelleperson;
    }

    private int getVictoryOrDefeat(Integer id) {

    }

    // fonction qui permet de récupérer le nombre de victoire et de défaite par rapport à la rencontre entre personne

//    public int getVictoryOrDefeat(int id1, int id2){
//        int victory = 0;
//        int defeat = 0;
//        int result = 0;
//        List<Person> nouvelleperson = this.personDAO.getAllPersons();
//        for(Rencontre rencontre : rencontre){
//            if(rencontre.getId() == id1){
//                victory = rencontre.nuGagnant();
//                defeat = rencontre.nuPerdant();
//            }
//        }
//        if(victory > defeat){
//            result = 1;
//        }else if(victory < defeat){
//            result = -1;
//        }else{
//            result = 0;
//        }
//        return result;
//    }
}
