package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Series;
import br.com.fujideia.iesp.tecback.model.Usuario;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class VisualizadosDTO {

    private Usuario usuario;
    private Filme filme;
    private Series series;

}


//tabela qual é utilizada pela tabela "recomendados" para analisar os
// filmes/series assistidos por cada usuario.