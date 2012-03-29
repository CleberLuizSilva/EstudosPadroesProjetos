package br.com.psychaos.padroes.estudo02.observador;

/**
 * @author Cleber Luiz da Silva
 * @category Exemplo
 * 
 * <p><b>O Padrão OBSERVER (observador)</b> define a dependência um-para-muitos entre objetos qpara que quando um objeto
 * mude de estado todos os seus dependentes sejam avisados e atualizados automaticamente.</p>
 * <p>O observador pode ser qualquer classe que implemente a <i>interface</i> <b>Observador</b>.</p>
 * <p>Aqui, nesse exemplo, esse observador é atualizado recebendo o próprio <b>Sujeito</b>.</p>
 */
public interface ObservadorAtualizadoComSujeito extends Observador {

	/**
	 * @param sujeito Sujeito que chama a atualização.
	 * @category Exemplo
	 * <p>Nessa forma todas as informações devem ser obtidas diretamente no <b>sujeito</b>.</p>
	 */
	public void atualizar(Sujeito<?> sujeito);
}