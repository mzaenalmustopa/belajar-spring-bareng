package com.spingdasar.controller;

import com.spingdasar.model_diktya_v2.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @GetMapping
    public ResponseEntity<Object> data(){
        List<Ruangan> result = new ArrayList<>();

        Dokter dokter = new Dokter("Dr Agus","Pria","47 Tahun",
                new Alamat("A01","Jl Pamarican","Muktisari","Bantarsari","Pamarican","Ciamis","Jabar","Indonesia"),"DA-001","Dokter Umum",
                new WaktuPraktek("Ada","07:00 - 09:30","15:30-17:30"));
        List<Pasien> pasiens = List.of(
                new Pasien("Bayu", "Pria", "30 tahun",
                        new Alamat("B-002", "Jl Raya Ciamis", "Purwaharja", "Purwaharja", "Purwaharja", "Banjar", "Jabar", "Indonesia"), "P-001", "Umum", "Kelas 1")
        );
        Ruangan ruangan = new Ruangan("R-001","Tulip",dokter,pasiens);
        result.add(ruangan);

        return ResponseEntity.ok().body(result);
    }

}
