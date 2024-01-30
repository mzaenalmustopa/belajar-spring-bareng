package com.spingdasar.model;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kelas {
    private String kode;
    private Matakuliah matakuliah;
    private Dosen dosen;
    private String hari;
    private List<Mahasiswa> mahasiswa;
}
