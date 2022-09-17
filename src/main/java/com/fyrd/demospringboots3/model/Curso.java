package com.fyrd.demospringboots3.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Curso {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    @NonNull
    private String titulo;
    
    private String imagenPath;
    
    @Transient
    private String imagenUrl;
    
}
