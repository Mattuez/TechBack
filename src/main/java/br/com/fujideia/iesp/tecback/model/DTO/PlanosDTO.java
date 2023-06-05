package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Planos;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class PlanosDTO implements Serializable {

    private Planos id;
    private Planos nome;
    private Planos valor;
}

//tabela onde estão os planos que o usuario pode escolher para então prosseguir para tabela de forma de pagamento.