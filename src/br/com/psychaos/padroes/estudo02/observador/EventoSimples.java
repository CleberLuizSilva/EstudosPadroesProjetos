package br.com.psychaos.padroes.estudo02.observador;

/**
 * @author Cleber Luiz da Silva
 * @category Exemplo
 *           <p>
 *           <u>Nesse excemplo</u>, a interface <b>Evento</b> é implementada por uma Classe interna.
 *           </p>
 */
public class EventoSimples<T extends Observador> implements Evento<T>
{
	private Sujeito<T> sujeito;
	
	public EventoSimples(Sujeito<T> sujeito)
	{
		this.sujeito = sujeito;
	}
	
	public Sujeito<T> getSujeito()
	{
		return sujeito;
	}
}
