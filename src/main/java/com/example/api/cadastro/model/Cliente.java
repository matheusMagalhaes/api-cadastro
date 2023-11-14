package com.example.api.cadastro.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

   @Column(name = "nome")
    private String nome;

   @Column(name = "email")
    private String email;

   @Column(name = "IMG_PERFIL")
    private List<Byte> imgPerfil;
}
