package com.example.obrestdatajpa.controller;

import com.example.obrestdatajpa.entities.Laptop;
import com.example.obrestdatajpa.repository.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    // Atributos
    private LaptopRepository laptopRepository;

    // Constructores
    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    // CRUD sobre entidad Laptop

    /**
     * http://localhost:8080/api/laptops
     * @return
     */
    // Buscar todas las Laptops (lista de laptops)
    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        //recuperar y devolver laptops de base de datos
        return laptopRepository.findAll();
    }


//    /**
//     * Request
//     * Response
//     * @param id
//     * @return
//     */
//    // Buscar una sola laptop en base de datos segun su id
//    @GetMapping("/api/laptops/{id}")
//    public ResponseEntity <Laptop> findById(@PathVariable Long id) {
//
//        Optional<Laptop> laptopOpt = laptopRepository.findById(id);
//        // Opcion 1
//        if(laptopOpt.isPresent())
//            return ResponseEntity.ok(laptopOpt.get());
//        else
//            return ResponseEntity.notFound().build();

//        // Opcion 2
//        return laptopOpt.orElse(null);
//        return laptopOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//    }

    // Crear un nuevo libro en base de datos
    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers) {
        System.out.println(headers.get("User-Agent"));
        // guardar una laptop recibida por parametros en la base de datos
        return laptopRepository.save(laptop);
    }

}
