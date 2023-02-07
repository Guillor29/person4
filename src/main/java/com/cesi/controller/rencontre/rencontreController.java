package com.cesi.controller.rencontre;

import com.cesi.controller.rencontre.model.Rencontre;
import com.cesi.dao.rencontre.model.RencontreDTO;
import com.cesi.services.rencontre.RencontreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class rencontreController {

    public static final String NOT_FOUND_MESSAGE = "Rien";

    public final RencontreService rencontreService;

    @Autowired
    public rencontreController(RencontreService rencontreService ){
        this.rencontreService = rencontreService;
    }

    @PostMapping("/rencontre")
    public Rencontre tartentpion(@RequestBody Rencontre rencontre){
        RencontreDTO blabla = rencontreService.addRencontre(rencontre);
        return null;
    }

    @GetMapping("/rencontre/{id}")
    public Rencontre getRencontre(@PathVariable Integer id) throws ClassNotFoundException {
        RencontreDTO get = rencontreService.getRencontre(id);
        if(id == null){
            throw new ClassNotFoundException(NOT_FOUND_MESSAGE);
        }
        return null;
    }

    @PutMapping("/rencontre/{id}")
    public Rencontre updateRencontre(@RequestBody Rencontre rencontre){
        RencontreDTO update = rencontreService.updateRencontre(rencontre);
        return null;
    }

    @DeleteMapping("/rencontres/{id}")
    public RencontreDTO deleteRencontre(@PathVariable Integer id){
        return rencontreService.deleteRencontre(id);
    }
}
