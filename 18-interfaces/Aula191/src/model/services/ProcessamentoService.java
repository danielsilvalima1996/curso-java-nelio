package model.services;

public class ProcessamentoService implements PagamentoOnlineService {
	
	private static final double TAXA_PAGAMENTO = 0.01;
	private static final double JUROS_SIMPLES = 0.02;

	@Override
	public double jurosSimples(double valor) {
		return valor * JUROS_SIMPLES;
	}

	@Override
	public double taxaPagamento(double valor, int meses) {
		return valor * TAXA_PAGAMENTO * meses;
	}

}
