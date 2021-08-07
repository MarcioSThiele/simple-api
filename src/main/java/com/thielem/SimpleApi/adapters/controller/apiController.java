package com.thielem.SimpleApi.adapters.controller;

import com.thielem.SimpleApi.adapters.repository.NamesRepository;
import com.thielem.SimpleApi.adapters.repository.entities.Names;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("/names")
public class apiController {

    @Autowired
    private NamesRepository namesRepository;

    @GetMapping(value = "/{uuid}")
    public ResponseEntity<String> findById(@PathVariable("uuid") UUID uuid){
        Optional<Names> namesResult = namesRepository.findById(uuid);
        System.out.println(namesResult.toString());
        return new ResponseEntity<String>("Marcio", new HttpHeaders(), HttpStatus.OK);
    }
}
