package com.cesi.controller.nouvelleperson;

import com.cesi.controller.nouvelleperson.model.Nouvelleperson;
import com.cesi.services.nouvelleperson.NouvellepersonService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Validated
public class NouvellepersonController {

    public static final String NOT_FOUND_MESSAGE = "Person not found";

    private static final Logger LOG = LoggerFactory.getLogger(NouvellepersonController.class);

    private final NouvellepersonService nouvellepersonService;

    @Autowired
    public NouvellepersonController(NouvellepersonService nouvellepersonService) {
        this.nouvellepersonService = nouvellepersonService;
    }

    @GetMapping("/nouvellepersons")
    public List<Nouvelleperson> listPersons(@RequestParam(value = "id", required = false) String id,
                                            @RequestParam(value = "nom", required = false) String nom) {

        List<Nouvelleperson> res = new ArrayList<Nouvelleperson>();

        try {
            if (id == null &&  nom == null) {
                res = this.nouvellepersonService.getAllPersons();
            } else {
                res = this.nouvellepersonService.getPersonsFilter(id,nom);
            }

        } catch (final Exception e) {
            LOG.error("Pb du service /Person: ", e);
        }

        return res;

    }



}


