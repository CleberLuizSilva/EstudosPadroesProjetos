package br.com.psychaos.padroes.estudo01.estrategia;

/**
 * @author Cleber Luiz da Silva
 * @category Exemplo
 * 
 * <p><b>O Padrão STRATEGY (estratégia)</b> define uma família de algoritimos, encapsula cada um deles e os torna 
 * intercambiáveis. A estratégia deixa o algoritmo variar independentemente dos clientes qua o utilizam.</
 */
public class EstrategiaExemplo
	implements 
		Estrategia01,
		Estrategia02,
		Estrategia03
{
	private Comportamento01 comportamento01;
	private Comportamento02 comportamento02;
	private Comportamento03 comportamento03;
	
	public EstrategiaExemplo()
	{
		this.comportamento01 = null;
		this.comportamento02 = null;
		this.comportamento03 = null;		
	}

	@Override
	public void setComportamento(Comportamento01 comportamento) {
		this.comportamento01 = comportamento;
	}

	@Override
	public void setComportamento(Comportamento02 comportamento) {
		this.comportamento02 = comportamento;
	}
	
	@Override
	public void setComportamento(Comportamento03 comportamento) {
		this.comportamento03 = comportamento;
	}

	@Override
	public void realizarComportamento01Acao01() {
		if (this.comportamento01 != null) {
			this.comportamento01.realizarAcao01();
		}
	}
	
	@Override
	public void realizarComportamento01Acao02() {
		if (this.comportamento01!= null) {
			this.comportamento01.realizarAcao02();
		}
	}
	
	@Override
	public void realizarComportamento02Acao01() {
		if (this.comportamento02 != null) {
			this.comportamento02.realizarAcao01();
		}
	}
	
	@Override
	public void realizarComportamento02Acao02() {
		if (this.comportamento02 != null) {
			this.comportamento02.realizarAcao02();
		}
	}
	
	@Override
	public void realizarComportamento02Acao03() {
		if (this.comportamento02 != null) {
			this.comportamento02.realizarAcao03();
		}
	}
	
	@Override
	public void realizarComportamento03Acao01() {
		if (this.comportamento03 != null) {
			this.comportamento03.realizarAcao01();
		}
	}
	
	@Override
	public void realizarComportamento03Acao02() {
		if (this.comportamento03 != null) {
			this.comportamento03.realizarAcao02();
		}
	}
	
	@Override
	public void realizarComportamento03Acao03() {
		if (this.comportamento03 != null) {
			this.comportamento03.realizarAcao03();
		}
	}
	
	@Override
	public void realizarComportamento03Acao04() {
		if (this.comportamento03 != null) {
			this.comportamento03.realizarAcao04();
		}
	}
}
