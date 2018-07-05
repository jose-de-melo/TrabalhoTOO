package jcms.too.avaliacaofisica.main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import jcms.too.avaliacaofisica.gui.AvaliacaoFisica;
import jcms.too.avaliacaofisica.out.Mensagem;
import jcms.too.avaliacaofisica.utilitarios.Constantes;

/**
 * Classe respons�vel por iniciar e definir o <i>LookAndFeel</i> do programa . 
 * A aplica��o trabalha sobre arquivos textos com dados espec�ficos, afim de realizar an�lises sobre exerc�cios praticados por 
 * usu�rios de um determinado personal trainer.
 * 
 * @author Jos� do Carmo de Melo Silva
 * @see UIManager
 * @see AvaliacaoFisica
 */
public class Main {
	/**
	 * Inicia e define o <i>LookAndFeel</i> da aplica��o.
	 * @param args - n�o utiliza par�metros de linha de comando.
	 * @throws ClassNotFoundException disparada quando houver algum erro na defini��o do <code>LookAndFeel</code>
	 * @throws InstantiationException disparada quando houver algum erro na defini��o do <code>LookAndFeel</code>
	 * @throws IllegalAccessException disparada quando houver algum erro na defini��o do <code>LookAndFeel</code>
	 * @throws UnsupportedLookAndFeelException disparada quando houver algum erro na defini��o do <code>LookAndFeel</code>
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			Mensagem.msgErro("N�o foi poss�vel alterar o LookAndFeel do programa!", Constantes.NOME_PROGRAMA);
		}
		new AvaliacaoFisica();
	}
}