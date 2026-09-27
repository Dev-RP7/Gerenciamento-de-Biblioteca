package br.senac.sp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.sp.app.models.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
