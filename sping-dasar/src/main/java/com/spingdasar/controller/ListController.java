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

        Dosen dosen = new Dosen("Roni","Pria","26",new Alamat(1,"Jl.Pamarican","Sukahurip","Pamarican","Ciamis","Jabar","Indonesia"),
                "S.Kom","Np-001");
        Matakuliah matakuliah = new Matakuliah("KS001","OOP","3");
        Matakuliah matakuliah2 = new Matakuliah("KS001","Spring","3");


        List<Mahasiswa> mahasiswa = Arrays.asList(
                // tanpa alamat
                new Mahasiswa("Dani","Laki-laki","20","Informatika","Teknk",3),
                // with alamat
                new Mahasiswa("Sabil","Laki-laki","20",
                        new Alamat(1,"Jl.Pamarican","Sukahurip","Pamarican","Ciamis","Jabar","Indonesia"),
                        "Informatika","Teknk",4),
                // tanpa alamat
                new Mahasiswa("Topa","Laki-laki","20","Informatika","Teknk",5),
                // with alamat
                new Mahasiswa("Diktya","Laki-laki","20",
                        new Alamat(1,"Oke","Pamarican","Ciamis","Ciamis","Jabar","Indonesia")
                        ,"Informatika","Teknk",5)
        );

        Kelas kelas = new Kelas("KS123", matakuliah, dosen, "Senin", mahasiswa);
        result.add(kelas);
        Kelas kelas2 = new Kelas("KS123", matakuliah2, dosen, "Senin", mahasiswa);
        result.add(kelas2);

        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/kampus")
    public Kampus get(){
        return new Kampus("UGM","Jogja","Sabil");
    }
}
