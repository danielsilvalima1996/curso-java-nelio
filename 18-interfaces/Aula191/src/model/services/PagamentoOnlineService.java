package model.services;

public interface PagamentoOnlineService {
	
	double jurosSimples(double valor);
	double taxaPagamento(double valor, int meses);

}
