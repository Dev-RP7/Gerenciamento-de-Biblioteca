package br.senac.sp.app.mapper;

import br.senac.sp.app.models.entity.Cliente;
import br.senac.sp.app.models.response.ClienteResponse;

public class ClienteMapper {

    private ClienteMapper() {
    }

    public static Cliente toEntity(ClienteResponse response) {
        Cliente cliente = new Cliente();

        cliente.setNome(response.nome());
        cliente.setEmail(response.email());
        cliente.setCpf(response.cpf());
        cliente.setDataNascimento(response.dataNascimento());

        return cliente;
    }

    public static ClienteResponse toResponse(Cliente cliente) {

        return new ClienteResponse(
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getCpf(),
                cliente.getDataNascimento()
        );

    }
}
