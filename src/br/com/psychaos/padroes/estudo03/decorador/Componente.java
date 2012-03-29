package br.com.psychaos.padroes.estudo03.decorador;

/**
 * @author Cleber Luiz da Silva
 * @category Exemplo
 *           <p>
 *           Uma instância de <b>Componente</b> pode ser usada sozinha ou englobada por um <b>decorador</b>.
 *           </p>
 */
public interface Componente
{
	
	/**
	 * <p>
	 * Método arbitrário para Exemplo.
	 * </p>
	 * 
	 * @category Exemplo
	 * 
	 * @return Valor texto arbitrário qualquer para exemplo;
	 * 
	 */
	String metodo01();
	
	/**
	 * <p>
	 * Método arbitrário para Exemplo.
	 * </p>
	 * 
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 * 
	 * @return Valor inteiro arbitrário qualquer para exemplo
	 */
	int metodo02();
	
	/**
	 * <p>
	 * Método arbitrário para Exemplo.
	 * </p>
	 * 
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 */
	void metodo03();
}
