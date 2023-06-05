package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_planos")
public class Planos implements Serializable {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;
    private String nome;
    private Float valor;
}

//tabela onde estão os planos que o usuario pode escolher para então prosseguir para tabela de forma de pagamento.