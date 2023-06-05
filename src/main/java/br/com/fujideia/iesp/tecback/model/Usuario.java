package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tb_usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer id;

    private String nome;

    @Column(length = 11)
    private String numero;

    //apenas os números
    @Column(length = 11)
    private Integer cpf;

    @NotNull
    @Column(unique = true)
    private String login;

    @Email @NotEmpty
    private String email;

    @NotNull
    private Date data_nasc;

    @NotNull
    private String senha;

    @ManyToOne
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "visualizados_id", referencedColumnName = "id")
    private Visualizados visualizados;

    @ManyToOne
    @JoinColumn(name = "recomendados_id", referencedColumnName = "id")
    private Recomendados recomendados;
}

//tabela do usuario onde estão suas informações pessoais.