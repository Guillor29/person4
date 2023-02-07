package com.cesi.dao.rencontre.impl;

import com.cesi.controller.rencontre.model.Rencontre;
import com.cesi.dao.rencontre.model.RencontreDTO;
import com.cesi.dao.rencontre.RencontreDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Repository
public class RencontreDAORest implements RencontreDAO {
    public RencontreDAORest() {
    }

    private RestTemplate restTemplate;

    @Autowired
    public RencontreDAORest(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public RencontreDTO addRencontre(Rencontre rencontre) {
        ResponseEntity<RencontreDTO> response;

        String url = "https://8080-romainvisbec-springcesi-pww6n510xt2.ws-eu85.gitpod.io/rencontres";

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<Rencontre> entity = new HttpEntity<Rencontre>(rencontre, headers);
        response = restTemplate.exchange(url, HttpMethod.POST, entity, RencontreDTO.class);

        return response.getBody();
    }

    @Override
    public RencontreDTO updateRencontre(Rencontre rencontre) {
        ResponseEntity<RencontreDTO> response;

        String url = "https://8080-romainvisbec-springcesi-pww6n510xt2.ws-eu85.gitpod.io/rencontres" + 1;

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Rencontre> entity = new HttpEntity<Rencontre>(rencontre, headers);
        response = restTemplate.exchange(url, HttpMethod.PUT, entity, RencontreDTO.class);

        return response.getBody();
    }

    @Override
    public RencontreDTO getRencontre(Integer id) {
        ResponseEntity<RencontreDTO> response;

        String url = "https://8080-romainvisbec-springcesi-pww6n510xt2.ws-eu85.gitpod.io/rencontres/" + id;

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<String>(headers);
        response = restTemplate.exchange(url, HttpMethod.GET, entity, RencontreDTO.class);

        return response.getBody();
    }

    @Override
    public RencontreDTO deleteRencontre(Integer id) {
        ResponseEntity<RencontreDTO> response;

        String url = "https://8080-romainvisbec-springcesi-pww6n510xt2.ws-eu85.gitpod.io/rencontres" + id;

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<Rencontre> entity = new HttpEntity<Rencontre>(headers);
        response = restTemplate.exchange(url, HttpMethod.DELETE, entity, RencontreDTO.class);

        return response.getBody();
    }
}


