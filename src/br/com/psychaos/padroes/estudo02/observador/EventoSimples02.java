/**
 * @author Cleber Luiz da Silva
 */
package br.com.psychaos.padroes.estudo02.observador;

/**
 * @author Cleber Luiz da Silva
 * @category Exemplo
 *           <p>
 *           <u>Nesse excemplo</u>, a interface <b>Evento</b> é implementada por uma Classe interna.
 *           </p>
 */
public class EventoSimples02<T extends Observador> implements Evento<T>
{
	
	private Sujeito<T> sujeito;
	
	/**
	 * @author Cleber Luiz da Silva
	 * @param sujeito
	 */
	public EventoSimples02(Sujeito<T> sujeito)
	{
		this.sujeito = sujeito;
	}
	
	/**
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 * @see br.com.psychaos.padroes.estudo02.observador.Evento#getSujeito()
	 */	
	@Override
	public Sujeito<T> getSujeito()
	{
		return this.sujeito;
	}
}
