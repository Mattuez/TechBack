package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Usuario;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class UsuarioDTO implements Serializable {

    private Usuario nome;
    private Usuario login;
    private Usuario senha;
}

//tabela do usuario onde estão suas informações pessoais.