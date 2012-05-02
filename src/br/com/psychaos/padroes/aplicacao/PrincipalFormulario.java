package br.com.psychaos.padroes.aplicacao;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PrincipalFormulario
{
	
	private JFrame moldura;
	private JButton padrãoEstratégiaBotão;
	private JButton padrãoObservadorBotão;
	private JButton padrãoDecoradorBotão;
	
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
			this.moldura.getContentPane().add(this.getPadrãoEstratégiaBotão());
			this.moldura.getContentPane().add(this.getPadrãoObservadorBotão());
			this.moldura.getContentPane().add(this.getPadrãoDecoradorBotão());
		}
		
		return this.moldura;
	}
	
	private void initialize()
	{
		this.getMoldura();
	}
	
	private JButton getPadrãoEstratégiaBotão()
	{
		if (this.padrãoEstratégiaBotão == null)
		{
			this.padrãoEstratégiaBotão = new JButton("Padr\u00E3o  Estrat\u00E9gia...");
			this.padrãoEstratégiaBotão.setBounds(10, 11, 150, 23);
		}
		return this.padrãoEstratégiaBotão;
	}
	
	private JButton getPadrãoObservadorBotão()
	{
		if (this.padrãoObservadorBotão == null)
		{
			this.padrãoObservadorBotão = new JButton("Padr\u00E3o Observador...");
			this.padrãoObservadorBotão.setBounds(10, 45, 150, 23);
		}
		return this.padrãoObservadorBotão;
	}
	
	private JButton getPadrãoDecoradorBotão()
	{
		if (this.padrãoDecoradorBotão == null)
		{
			this.padrãoDecoradorBotão = new JButton("Padr\u00E3o Decorador...");
			this.padrãoDecoradorBotão.setBounds(10, 79, 150, 23);
		}
		return this.padrãoDecoradorBotão;
	}
}
