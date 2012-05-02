/**
 * 
 */
package br.com.psychaos.padroes.aplicacao;

import java.awt.EventQueue;

public class Aplicacao
{
	public static void main(final String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					final PrincipalFormulario formulario = new PrincipalFormulario();
					formulario.show();
				}
				catch (final Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
