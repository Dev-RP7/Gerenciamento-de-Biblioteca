package br.senac.sp.app.controller;

import br.senac.sp.app.models.entity.Cliente;
import org.springframework.web.bind.annotation.*;

import br.senac.sp.app.models.request.ClienteRequest;
import br.senac.sp.app.models.response.ClienteResponse;
import br.senac.sp.app.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/cadastrar")
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        return clienteService.cadastrar(cliente);
    }

    @GetMapping("/clientes")
    public List<Cliente> listarClientes()
}