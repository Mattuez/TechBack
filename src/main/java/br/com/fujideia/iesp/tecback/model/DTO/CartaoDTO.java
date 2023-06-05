package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Cartao;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class CartaoDTO implements Serializable {

    private Cartao nome;
    private Cartao numero;
    private Cartao vencimento;

    private Integer cvc;
}

//tabela de cartão como uma forma de pagamento (simplificado e com validations).