package br.senac.sp.app.models.response;

import java.sql.Date;

public record ClienteResponse(

        Long id,
        String nome,
        String email,
        String cpf,
        Date dataNascimento

) {

}
