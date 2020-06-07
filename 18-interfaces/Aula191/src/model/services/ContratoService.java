package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Prestacao;

public class ContratoService {

	private PagamentoOnlineService pagamentoOnlineService;

	public ContratoService(PagamentoOnlineService pagamentoOnlineService) {
		this.pagamentoOnlineService = pagamentoOnlineService;
	}

	public void processarContrato(Contrato contrato, int meses) {
		double valorBasico = contrato.getValorTotal() / meses;
		for (int i = 1; i <= meses; i++) {
			Date data = addMeses(contrato.getData(), i);
			double atualizacao = valorBasico + pagamentoOnlineService.jurosSimples(valorBasico);
			double valorTotal = atualizacao + pagamentoOnlineService.taxaPagamento(atualizacao, i);
			contrato.addPrestacao(new Prestacao(data, valorTotal));
		}
	}

	private Date addMeses(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

}
