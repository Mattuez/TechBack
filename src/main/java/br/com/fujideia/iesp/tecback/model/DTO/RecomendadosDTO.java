package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Series;
import br.com.fujideia.iesp.tecback.model.Usuario;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RecomendadosDTO {

    //filme recomendado
    private Filme filme;
    //série recomendada
    private Series series;
    //usuario ao qual o conteudo é recomendado
    private Usuario usuario;
}

//tabela onde a netflix filtra o conteudo assistido pelo usuario onde ele analisa os generos
//mais frequentes e em um label RECOMENDADOS, recomenda um filme/serie de genero parecido.