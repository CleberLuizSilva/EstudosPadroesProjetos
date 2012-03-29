package br.com.psychaos.padroes.estudo02.observador;

/**
 * @author Cleber Luiz da Silva
 * @category Exemplo
 * 
 * <p><b>O Padr�o OBSERVER (observador)</b> define a depend�ncia um-para-muitos entre objetos qpara que quando um objeto
 * mude de estado todos os seus dependentes sejam avisados e atualizados automaticamente.</p>
 * <p>O observador pode ser qualquer classe que implemente a <i>interface</i> <b>Observador</b>.</p>
 * <p>Aqui, nesse exemplo, esse observador � atualizado recebendo um Evento.</p>
 * <p>Aconselho sempre o uso dessa forma, e, tamb�m, que a <i><b>interface</b></i> <b>Evento</b> tenha um 
 * <b><i>getter</i></b> que aponte para um <b>Sujeito</b>.</p>
 */
public interface ObservadorAtualizadoComEvento extends Observador {

	/**
	 * @param evento Objeto de dados passado pelo Sujeito que chama a atualiza��o.
	 * @category Exemplo
	 * <p>Nessa forma todas as informa��es devem ser obtidas diretamente no <b>evento</b>.</p>
	 */
	public void atualizar(Evento<?> evento);
}