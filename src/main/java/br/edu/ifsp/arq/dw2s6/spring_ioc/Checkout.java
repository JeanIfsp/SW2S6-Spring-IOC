package br.edu.ifsp.arq.dw2s6.spring_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Checkout {
	@Autowired
	@Qualifier("impressoraEpson")
	private Impressora impressora;
	
	public void finalizar() {
		
		//var impressoraHp = new ImpressoraHP();
		impressora.imprimir("Compra certa");
	}
}
