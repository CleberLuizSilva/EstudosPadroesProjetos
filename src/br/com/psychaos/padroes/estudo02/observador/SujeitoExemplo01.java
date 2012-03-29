
package br.com.psychaos.padroes.estudo02.observador;

import java.util.ArrayList;

/**
 * @author Cleber Luiz da Silva
 * @category Exemplo
 * <p>Esse exemplo atualiza todos os observadores registrados/adicionados passando a cada um a próprias instância.</p>
 */
public class SujeitoExemplo01 implements Sujeito<ObservadorAtualizadoComSujeito> {
	
	private ArrayList<ObservadorAtualizadoComSujeito> observadores;
	
	public SujeitoExemplo01()
	{
		this.observadores = new ArrayList<ObservadorAtualizadoComSujeito>();
	}

	/**
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 */
	@Override
	public void adicionarObservador(ObservadorAtualizadoComSujeito observador) {	
		this.observadores.add(observador);
	}

	/**
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 */
	@Override
	public void removerObservador(ObservadorAtualizadoComSujeito observador) {
		if (this.observadores.contains(observador)) {
			this.observadores.remove(observador);
		}
	}
	
	/**
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 * <p>Atualiza todos os observadores registrados/adicionados passando a cada um a prórias instância.</p>
	 */
	@Override
	public void notificarObservadores() {
		for (ObservadorAtualizadoComSujeito observador : this.observadores) {
			observador.atualizar(this);
		}
	}
}
