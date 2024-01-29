package com.spingdasar.controller;

import com.spingdasar.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/orang")
public class ListController {

    @GetMapping
    public ResponseEntity<Object> data (){
        List<Kelas> result = new ArrayList<>();

        Dosen dosen = new Dosen("Roni","Pria","26","Lampung","S.Kom","Np-001");
        Matakuliah matakuliah = new Matakuliah("KS001","OOP","3");

        List<Mahasiswa> mahasiswa = Arrays.asList(
                new Mahasiswa("Dani","Laki-laki","20","Pamarican","Informatika","Teknk",3),
                new Mahasiswa("Sabil","Laki-laki","20","Pamarican","Informatika","Teknk",4),
                new Mahasiswa("Topa","Laki-laki","20","Pamarican","Informatika","Teknk",5),
                new Mahasiswa("Diktya","Laki-laki","20","Pamarican","Informatika","Teknk",5)
        );

        Kelas kelas = new Kelas("KS123", matakuliah,dosen,"Senin",mahasiswa);
        result.add(kelas);


        return ResponseEntity.ok().body(result);
    }
}