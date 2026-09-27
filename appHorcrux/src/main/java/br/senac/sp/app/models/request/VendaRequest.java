package br.senac.sp.app.models.request;

import java.sql.Date;

import br.senac.sp.app.enums.Pagamento;

public class VendaRequest {
    Long id;
    Double valorTotal;
    Date dataVenda;
    boolean cupom;
    Pagamento tipoPagamento;
}
