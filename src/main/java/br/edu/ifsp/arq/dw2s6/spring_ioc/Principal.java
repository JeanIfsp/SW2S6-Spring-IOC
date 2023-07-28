package br.edu.ifsp.arq.dw2s6.spring_ioc;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		var checkout =  context.getBean(Checkout.class);
		checkout.finalizar();
		((ConfigurableApplicationContext)context).close();
	}

}
