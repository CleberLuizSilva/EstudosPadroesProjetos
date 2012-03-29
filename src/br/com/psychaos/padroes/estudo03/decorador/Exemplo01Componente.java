/**
 * @author Cleber Luiz da Silva
 */
package br.com.psychaos.padroes.estudo03.decorador;

/**
 * @author Cleber Luiz da Silva
 * @category Exemplo
 *           <p>
 *           Objeto ao qual vamos <u>adicionar dinamicamente um novo comportamento</u>. Esse objeto pode ser usado
 *           sozinho ou
 *           </p>
 */
public class Exemplo01Componente implements Componente
{
	
	/**
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 * 
	 * @see br.com.psychaos.padroes.estudo03.decorador.Componente#metodo03() Componente.metodo01()
	 * 
	 */
	@Override
	public String metodo01()
	{
		return "Exemplo01Componente";
	}
	
	/**
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 * 
	 * @see br.com.psychaos.padroes.estudo03.decorador.Componente#metodo03() Componente.metodo02()
	 * 
	 */
	@Override
	public int metodo02()
	{
		return 0;
	}
	
	/**
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 * 
	 * @see br.com.psychaos.padroes.estudo03.decorador.Componente#metodo03() Componente.metodo03()
	 * 
	 */
	@Override
	public void metodo03()
	{
	}
}
