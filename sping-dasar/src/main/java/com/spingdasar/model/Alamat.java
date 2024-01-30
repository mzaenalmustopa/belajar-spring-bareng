package com.spingdasar.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alamat {
    private Integer id;
    private String jalan;
    private String desa;
    private String kecamatan;
    private String kabupaten;
    private String provinsi;
    private String country;

}
