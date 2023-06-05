package br.com.fujideia.iesp.tecback.model;

import br.com.fujideia.iesp.tecback.model.DTO.EnderecoDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_endereco")
public class Endereco implements Serializable {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;

    //coluna para que seja descrito o endereço (rua, numero, etc.)
    @Column(name = "ds_endereco", length = 500)
    private String endereco;
}

//tabela referente ao endereço que envia fatura e localiza o usuario que possui cadastro na netflix.