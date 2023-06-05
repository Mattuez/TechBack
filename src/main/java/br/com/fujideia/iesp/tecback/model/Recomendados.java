package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_genero")
public class Recomendados {

    @Id
    @Column(nullable = false)
    private Integer id;


    @ManyToOne
   @JoinColumn
    private Filme filme;

    @ManyToOne
   @JoinColumn
    private Series series;

    @ManyToOne
    @JoinColumn
    private Usuario usuario;
}

//tabela onde a netflix filtra o conteudo assistido pelo usuario onde ele analisa os generos
//mais frequentes e manda um filme/serie de genero parecido.