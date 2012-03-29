
package br.com.psychaos.padroes.estudo02.observador;

import java.util.ArrayList;

/**
 * @author Cleber Luiz da Silva
 * @category Exemplo
 * <p>Esse exemplo atualiza todos os observadores registrados/adicionados passando a cada um uma instância de Evento.</p>
 */
public class SujeitoExemplo03 implements Sujeito<ObservadorAtualizadoComSujeitoEvento> {
	
	private ArrayList<ObservadorAtualizadoComSujeitoEvento> observadores;
	
	public SujeitoExemplo03()
	{
		this.observadores = new ArrayList<ObservadorAtualizadoComSujeitoEvento>();
	}

	/**
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 */
	@Override
	public void adicionarObservador(ObservadorAtualizadoComSujeitoEvento observador) {
		this.observadores.add(observador);
	}

	/**
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 */
	@Override
	public void removerObservador(ObservadorAtualizadoComSujeitoEvento observador) {
		if (this.observadores.contains(observador)) {
			this.observadores.remove(observador);
		}
	}
	
	/**
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 * <p>Atualiza todos os observadores registrados/adicionados passando a cada um uma instância de Evento.</p>
	 */
	@Override
	public void notificarObservadores() {
		EventoSimples<ObservadorAtualizadoComSujeitoEvento> evento = new EventoSimples<ObservadorAtualizadoComSujeitoEvento>(this);
		//...atualizar a instância de evento com as informações que possam ser relevantes para o observador.
		
		for (ObservadorAtualizadoComSujeitoEvento observador : this.observadores) {
			observador.atualizar(this, evento);
		}
	}
}
