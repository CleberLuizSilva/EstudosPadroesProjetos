package br.com.psychaos.padroes.aplicacao;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PrincipalFormulario
{
	
	private JFrame moldura;
	private JButton padr�oEstrat�giaBot�o;
	private JButton padr�oObservadorBot�o;
	private JButton padr�oDecoradorBot�o;
	
	public PrincipalFormulario()
	{
		this.initialize();
	}
	
	void show()
	{
		this.getMoldura().setVisible(true);
	}
	
	void hide()
	{
		this.getMoldura().setVisible(false);
	}
	
	private JFrame getMoldura()
	{
		if (this.moldura == null)
		{
			this.moldura = new JFrame();
			this.moldura.setBounds(100, 100, 184, 149);
			this.moldura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.moldura.getContentPane().setLayout(null);
			this.moldura.getContentPane().add(this.getPadr�oEstrat�giaBot�o());
			this.moldura.getContentPane().add(this.getPadr�oObservadorBot�o());
			this.moldura.getContentPane().add(this.getPadr�oDecoradorBot�o());
		}
		
		return this.moldura;
	}
	
	private void initialize()
	{
		this.getMoldura();
	}
	
	private JButton getPadr�oEstrat�giaBot�o()
	{
		if (this.padr�oEstrat�giaBot�o == null)
		{
			this.padr�oEstrat�giaBot�o = new JButton("Padr\u00E3o  Estrat\u00E9gia...");
			this.padr�oEstrat�giaBot�o.setBounds(10, 11, 150, 23);
		}
		return this.padr�oEstrat�giaBot�o;
	}
	
	private JButton getPadr�oObservadorBot�o()
	{
		if (this.padr�oObservadorBot�o == null)
		{
			this.padr�oObservadorBot�o = new JButton("Padr\u00E3o Observador...");
			this.padr�oObservadorBot�o.setBounds(10, 45, 150, 23);
		}
		return this.padr�oObservadorBot�o;
	}
	
	private JButton getPadr�oDecoradorBot�o()
	{
		if (this.padr�oDecoradorBot�o == null)
		{
			this.padr�oDecoradorBot�o = new JButton("Padr\u00E3o Decorador...");
			this.padr�oDecoradorBot�o.setBounds(10, 79, 150, 23);
		}
		return this.padr�oDecoradorBot�o;
	}
}
