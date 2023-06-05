package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_genero")
public class Genero {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;

    private String titulo;
}

//genero dos filmes e séries.