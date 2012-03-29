package br.com.psychaos.padroes.estudo03.decorador;

/**
 * @author Cleber Luiz da Silva
 * @category Exemplo
 *           <p>
 *           Uma inst�ncia de <b>Componente</b> pode ser usada sozinha ou englobada por um <b>decorador</b>.
 *           </p>
 */
public interface Componente
{
	
	/**
	 * <p>
	 * M�todo arbitr�rio para Exemplo.
	 * </p>
	 * 
	 * @category Exemplo
	 * 
	 * @return Valor texto arbitr�rio qualquer para exemplo;
	 * 
	 */
	String metodo01();
	
	/**
	 * <p>
	 * M�todo arbitr�rio para Exemplo.
	 * </p>
	 * 
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 * 
	 * @return Valor inteiro arbitr�rio qualquer para exemplo
	 */
	int metodo02();
	
	/**
	 * <p>
	 * M�todo arbitr�rio para Exemplo.
	 * </p>
	 * 
	 * @author Cleber Luiz da Silva
	 * @category Exemplo
	 */
	void metodo03();
}
