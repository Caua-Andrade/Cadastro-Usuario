package com.caua.cadastro_usuario.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    // o unique mostra que não pode ter dois usuários com o mesmo email
    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;
}