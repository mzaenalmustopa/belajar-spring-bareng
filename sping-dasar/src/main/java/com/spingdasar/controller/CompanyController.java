package com.spingdasar.controller;

import com.spingdasar.model_diktya.Alamat;
import com.spingdasar.model_diktya.Department;
import com.spingdasar.model_diktya.Leader;
import com.spingdasar.model_diktya.Operator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @GetMapping
    public ResponseEntity<Object> data(){
        List<Department> result = new ArrayList<>();

        Leader leader = new Leader("Adam","Pria","35tahun","0025","S.P.V","10tahun", new Alamat("A-01","Jl Baru","Sumanding","Pataruman","Banjar","Banjar","Jabar","Indonesia"));

        List<Operator> operators = Arrays.asList(
                new Operator("Ziyad","Pria","27tahun",
                        new Alamat("E-05","Jl Raya Jawa Tengah", "Randegan","Randegan","Pataruman","Banjar","Jabar","Indonesia"), "Opt-001","Pagi","A01-05"),
                new Operator("Sasa","Wanita","25Tahun","Opt-002","Pagi","A06-010")
        );

        Department department = new Department("D-001",leader,operators);
        result.add(department);

        return ResponseEntity.ok().body(result);
    }
}
