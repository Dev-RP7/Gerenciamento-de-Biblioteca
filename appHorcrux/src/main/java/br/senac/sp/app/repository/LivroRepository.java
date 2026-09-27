package br.senac.sp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.sp.app.models.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    
}
