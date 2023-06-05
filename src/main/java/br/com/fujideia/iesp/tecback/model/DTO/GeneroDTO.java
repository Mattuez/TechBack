package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Genero;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GeneroDTO {
    private Genero Title;
}

//genero dos filmes e séries.