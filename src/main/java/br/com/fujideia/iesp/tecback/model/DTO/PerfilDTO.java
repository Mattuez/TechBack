package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Endereco;
import br.com.fujideia.iesp.tecback.model.Perfil;
import br.com.fujideia.iesp.tecback.model.Usuario;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class PerfilDTO implements Serializable {

    private Perfil nome;
    private Usuario usuario;
    private Endereco endereco;
}

//tabela dos perfis alteraveis do usuario, onde ele pode possuir vários (de acordo com seu plano).