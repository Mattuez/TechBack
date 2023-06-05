package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Endereco;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class EnderecoDTO implements Serializable {

    //coluna para que seja descrito o endereço (rua, numero, etc.)
    private Endereco endereco;
}

//tabela referente ao endereço que envia fatura e localiza o usuario que possui cadastro na netflix.