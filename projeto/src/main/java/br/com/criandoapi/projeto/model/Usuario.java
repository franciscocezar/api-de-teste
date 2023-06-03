package br.com.criandoapi.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotBlank(message = "Nome é obrigatório!")
    @Size(min= 3, message = "Nome deve ter no mínimo 3 caracteres")
    @Column(name = "nome", length = 200, nullable = false)
    private String nome;
    
    @Email(message = "Insira um email válido!")
    @NotBlank(message = "Email é obrigatório!")
    @Column(name = "email", length = 50, nullable = false)
    private String email;
    
    @NotBlank(message = "Senha é obrigatória!")
    @Column(name = "senha", columnDefinition = "TEXT", nullable = false)
    private String senha;
    
    @NotBlank(message = "Telefone é obrigatório!")
    @Column(name = "telefone", length = 15, nullable = false)
    private String telefone;
}
