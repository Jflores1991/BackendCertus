package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200/")
public class nameController {

    //@Autowired nameInterface ob;
    //@GetMapping(value = "/grett/{name}/{correo}/{edad}")
   // public ResponseEntity<String> grett(@PathVariable("name") String name, @PathVariable("correo") String correo, @PathVariable("edad") int edad){

        //nameEntity insertar = new nameEntity(name,correo,edad);
        //ob.save(insertar);

       // return new ResponseEntity<>("Hello " +name + correo + edad, HttpStatus.OK);
    //}

    @Autowired
    private nameInterface nameInterface;

    @GetMapping
    public List <nameEntity> persona(){
        return (List <nameEntity>) nameInterface.findAll();
    }

    @PostMapping
    public void insertar (@RequestBody nameEntity nE){
        nameInterface.save(nE);
    }

    @PutMapping
    public void modificar (@RequestBody nameEntity nE){
        nameInterface.save(nE);
    }

    @DeleteMapping (value = "/{id}")
    public void eliminar (@PathVariable("id") Integer id){
        nameInterface.deleteById(id);
    }

}
