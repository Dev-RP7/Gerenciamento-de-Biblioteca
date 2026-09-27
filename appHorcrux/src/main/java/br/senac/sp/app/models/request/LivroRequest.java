package br.senac.sp.app.models.request;

import java.sql.Date;

import br.senac.sp.app.enums.Genero;

public class LivroRequest {
     Long id;
     String titulo;
     String autor;
     Genero genero;
     Date dataLancamento;
     Date dataCompraEstoque;
     Double preco;
     Double promo;
     int qtdEstoque;
}
