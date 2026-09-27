package br.senac.sp.app.models.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record ClienteRequest(

        @NotBlank(message = "Nome é obrugatorio")
        String nome,

        @NotBlank(message = "Email é obrigatorio")
        String email,

        @NotBlank(message = "CPF é obrigatorio")
        String cpf,

        @NotNull
        Date dataNascimento,

        Long qtdCompras

) {}
