package br.com.psychaos.padroes.estudo02.observador;

/**
 * 
 * @author Cleber Luiz da Silva
 * @category Exemplo
 */
public interface Evento<T extends Observador>
{
	/**
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 * @return Sujeito que gerou o evento de atualização
	 *         <p>
	 *         Esse método pode ou não existir.<br />
	 *         Pessoamente aconselho a ser <u>sempre usado</u>.<br />
	 *         Aconselho ainda que a classe que implemente <b>Evento</b> seja imutável.<br />
	 *         </p>
	 */
	public Sujeito<T> getSujeito();
}
