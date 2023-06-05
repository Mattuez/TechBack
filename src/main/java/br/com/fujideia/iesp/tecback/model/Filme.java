package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_filme")
public class Filme implements Serializable {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;

    private String titulo;

    private int classe_indicativa;

    private String diretor;

    private String idioma;

    private String legenda;

    //dado em segundos
    public int min_atual;

    @Column(name = "ds_sinopse", length = 500)
    private String sinopse;

    @ManyToOne
    @JoinColumn(name = "genero_id", referencedColumnName = "id")
    private Genero genero;
}

//tabela na qual são adicionados filmes com suas informações são escritas e o usuario pode visualizar.