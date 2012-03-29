
package br.com.psychaos.padroes.estudo02.observador;

import java.util.ArrayList;

/**
 * @author Cleber Luiz da Silva
 * @category Exemplo
 * <p>Esse exemplo atualiza todos os observadores registrados/adicionados passando a cada um uma instância de Evento.</p>
 */
public class SujeitoExemplo02 implements Sujeito<ObservadorAtualizadoComEvento> {
	
	private ArrayList<ObservadorAtualizadoComEvento> observadores;
	
	public SujeitoExemplo02()
	{
		this.observadores = new ArrayList<ObservadorAtualizadoComEvento>();
	}

	/**
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 */
	@Override
	public void adicionarObservador(ObservadorAtualizadoComEvento observador) {
		this.observadores.add(observador);
	}

	/**
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 */
	@Override
	public void removerObservador(ObservadorAtualizadoComEvento observador) {
		if (this.observadores.contains(observador)) {
			this.observadores.remove(observador);
		}
	}
	
	/**
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 * <p>Atualiza todos os observadores registrados/adicionados passando a cada um a próprias instância e uma instância
	 * de Evento.</p>
	 */
	@Override
	public void notificarObservadores() {
		EventoSimples<ObservadorAtualizadoComEvento> evento = new EventoSimples<ObservadorAtualizadoComEvento>(this);
		//...atualizar a instância de evento com as informações que possam ser relevantes para o observador.
		
		for (ObservadorAtualizadoComEvento observador : this.observadores) {
			observador.atualizar(evento);
		}
	}
}
