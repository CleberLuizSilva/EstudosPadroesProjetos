package br.com.psychaos.padroes.estudo02.observador;

/**
 * @author Cleber Luiz da Silva
 * @category Exemplo
 * 
 * <p><b>O Padr�o OBSERVER (observador)</b> define a depend�ncia um-para-muitos entre objetos qpara que quando um objeto
 * mude de estado todos os seus dependentes sejam avisados e atualizados automaticamente.</p>
 * <p>O observador pode ser qualquer classe que implemente a <i>interface</i> <b>Observador</b>.</p>
 * <p>Aqui, nesse exemplo, esse observador � atualizado recebendo o pr�prio <b>sujeito</b> e ainda um <b>evento</b>.</p>
 */
public interface ObservadorAtualizadoComSujeitoEvento extends Observador {

	/**
	 * 
	 * @param sujeito Sujeito que chama a atualiza��o.
	 * @param evento Objeto de dados passado pelo Sujeito que chama a atualiza��o.
	 * @category Exemplo
	 * <p>Nessa forma as informa��es podem ser obtidas diretamente do <b>sujeito</b>> ou ainda do
	 * <b>evento</b>.</p>
	 */
	public abstract void atualizar(Sujeito<?> sujeito, Evento<?> evento);
}