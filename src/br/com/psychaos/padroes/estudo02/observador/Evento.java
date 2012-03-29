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
	 * @return Sujeito que gerou o evento de atualiza��o
	 *         <p>
	 *         Esse m�todo pode ou n�o existir.<br />
	 *         Pessoamente aconselho a ser <u>sempre usado</u>.<br />
	 *         Aconselho ainda que a classe que implemente <b>Evento</b> seja imut�vel.<br />
	 *         </p>
	 */
	public Sujeito<T> getSujeito();
}
