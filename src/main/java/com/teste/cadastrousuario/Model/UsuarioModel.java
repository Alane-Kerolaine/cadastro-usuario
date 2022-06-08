package com.teste.cadastrousuario.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 200)
    private String nome;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(length = 10)
    private String dataNasc;

    @Column(length = 50)
    private String genero;

    @Column(length = 20)
    private String cpf;
}
