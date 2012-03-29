package br.com.psychaos.padroes.estudo02.observador;

/**
 * @author Cleber Luiz da Silva
 * @category Exemplo
 */
public interface Sujeito<T extends Observador> {
	/**
	 * @param observador Observador a ser adicionado.
	 * @category Exemplo
	 * <p>Adiciona um observador para ser avisado quando algo ocorrer.</p>
	 */
	void adicionarObservador(T observador);

	/**
	 * @param observador Observador a ser removido.
	 * @category Exemplo
	 * <p>Remove um observador. O observador removido não será mais avisado quando algo ocorrer.</p>
	 */
	void removerObservador(T observador);

	/**
	 * @category Exemplo
	 * <p>Avisa que algo ocorreu a todos os observadores registrados/adicionados.</p> 
	 */
	void notificarObservadores();
}
