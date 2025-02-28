package br.com.fiap.money_control_api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.money_control_api.model.Listing;

@RestController
public class ListingController {

    private List<Listing> cars = new ArrayList<>();

    @GetMapping("/listings")
    public List<Listing> index(){
        return cars;
    }

    @PostMapping("/listings")
    public ResponseEntity<Listing> create (@RequestBody Listing listing){
        System.out.println("Cadastrando o anúncio"+ listing.getName());
        cars.add(listing);
        return ResponseEntity.status(201).body(listing);
    }

    @GetMapping("/listings/{id}")
    public ResponseEntity<Listing> get(@PathVariable Long id){
        System.out.println("Buscando anúncio"+id);
        var listing = cars.stream()
        .filter(l -> l.getId().equals(id))
        .findFirst();
    
        if (listing.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(listing.get());
    }
}
