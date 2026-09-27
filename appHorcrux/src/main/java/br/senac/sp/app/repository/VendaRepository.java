package br.senac.sp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.sp.app.models.entity.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {
    
}
