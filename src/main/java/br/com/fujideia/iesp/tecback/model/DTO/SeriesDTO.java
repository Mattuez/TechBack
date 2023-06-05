package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Genero;
import br.com.fujideia.iesp.tecback.model.Series;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class SeriesDTO implements Serializable {

    private Series titulo;
    private Series classe_indicativa;
    private Series diretor;
    private Series idiomas;
    private Series legendas;
    private Series episodios;
    public Series min_atual;
    private Series sinopse;
    private Genero genero;

}

//tabela onde estão as series que podem ser inseridas e então visualizadas por usuarios.