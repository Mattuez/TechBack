package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Genero;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class FilmeDTO implements Serializable {

    private Filme titulo;
    private Filme classe_indicativa;
    private Filme diretor;
    private Filme sinopse;
    private Genero Title;
}

//tabela na qual são adicionados filmes com suas informações são escritas e o usuario pode visualizar.