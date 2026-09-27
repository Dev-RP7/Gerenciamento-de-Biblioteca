package br.senac.sp.app.models.entity;

import java.sql.Date;

import br.senac.sp.app.enums.Genero;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter
@Table(name = "livro")
@NoArgsConstructor
@AllArgsConstructor
public class Livro {
    

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String autor;

    @Column (nullable = false)
    private Genero genero;

    @Column(nullable = false)
    private Date dataLancamento;

    @Column(nullable = false)
    private Date dataCompraEstoque;

    @Column(nullable = false)
    private Double preco;

    @Column (nullable = false)
    private Double promo;

    @Column (nullable = false)
    private int qtdEstoque;
}
