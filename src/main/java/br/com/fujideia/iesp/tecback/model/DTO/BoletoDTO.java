package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Boleto;
import br.com.fujideia.iesp.tecback.model.Usuario;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class BoletoDTO implements Serializable {

    private Boleto cod_de_barra;
    private Boleto vencimento;
    private Usuario nome;
}

//tabela de boleto referente a um tipo de pagamento.