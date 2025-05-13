package com.CordyTech.cl.Puerto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Puerto")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Puerto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPuerto;

    @Column(nullable=true)
    private String nombrePuerto;

    @Column(nullable=false)
    private float tarifaHora;
    
    @Column(nullable=false)
    private float tarifaEslora;

    @Column(nullable=false)
    private boolean dispo; 

}
