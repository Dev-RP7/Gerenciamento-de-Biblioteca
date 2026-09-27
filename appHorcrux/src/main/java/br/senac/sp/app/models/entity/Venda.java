package br.senac.sp.app.models.entity;

import java.sql.Date;

import br.senac.sp.app.enums.Genero;
import br.senac.sp.app.enums.Pagamento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter
@Table(name = "venda")
@NoArgsConstructor
@AllArgsConstructor
public class Venda {
    

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double valorTotal;

    @Column(nullable = false)
    private Date dataVenda;

    @Column (nullable = false)
    private boolean cupom = false;

    @Column (nullable = false)
    private Pagamento tipoPagamento;

    //@OneToMany
    //@Column(nullable = false)
    //private Cliente clienteId;

    //@ManyToOne 
    //@Column (nullable = false)
    //private Livro livroId;

}
