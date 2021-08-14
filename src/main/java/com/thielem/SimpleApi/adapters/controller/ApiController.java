package com.thielem.SimpleApi.adapters.controller;

import com.thielem.SimpleApi.adapters.repository.entities.Person;
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
public class ApiController {

    //@Autowired
    //private NamesRepository namesRepository;

    @GetMapping(value = "/{uuid}")
    public ResponseEntity<Person> findById(@PathVariable("uuid") UUID uuid){
        //Optional<Names> namesResult = namesRepository.findById(uuid);
        //System.out.println(namesResult.toString());

        Optional<Person> optional = Optional.of(Person.builder()
                .name("Marcio")
                .age(30)
                .build());

        System.out.println(optional.getClass().getSimpleName());
        showObject(optional.get());

        //Integer n = optional.get();

        //System.out.println(optional.getClass().getSimpleName());
        //System.out.println(n.getClass().getSimpleName());
        //System.out.println(n);

        return new ResponseEntity<Person>(optional.get(), new HttpHeaders(), HttpStatus.OK);
    }

    public void showObject (Person person){
        System.out.println(person.getClass().getSimpleName());
        System.out.println(person.toString());
    }


}
