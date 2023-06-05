package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_genero")
public class Visualizados {

    @Id
    @Column(nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn
    private Filme filme;{
        int min_atual;
    }

    @ManyToOne
    @JoinColumn
    private Series series;{
        int min_atual;
    }


}


//tabela qual é utilizada pela tabela "recomendados" para analisar os
// filmes/series assistidos por cada usuario.