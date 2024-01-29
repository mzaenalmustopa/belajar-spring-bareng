package com.spingdasar.controller;

import com.spingdasar.model.Orang;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/orang")
public class OrangController {

    @GetMapping
    public ResponseEntity<Object> data (){
        List<Orang> result = new ArrayList<>();

        Orang orang = new Orang("topa","laki-laki","11","Pamarican");
        result.add(orang);

        return ResponseEntity.ok().body(result);
    }
}
