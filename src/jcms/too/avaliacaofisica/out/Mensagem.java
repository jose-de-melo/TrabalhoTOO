package jcms.too.avaliacaofisica.out;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.Component;
/**
 * Define m�todos para realizar a sa�da de dados em uma interface gr�fica. 
 * 
 * @author Jos� do Carmo de Melo Silva
 *
 * @version 0.2
 */
public class Mensagem {
	/**
	 * Exibe uma mensagem informativa em uma caixa de di�logo.
	 * 
	 * @param mensagem - texto a ser exibido na caixa de di�logo.
	 * @param titulo - texto a ser exibido na barra de t�tulo da caixa de di�logo.
	 */
	public static void msgInfo(String mensagem, String titulo){
		showMessageDialog(null, mensagem, titulo, INFORMATION_MESSAGE);
	}

	/**
	 * Exibe uma mensagem de erro em uma caixa de di�logo.
	 * 
	 * @param mensagem - texto a ser exibido na caixa de di�logo.
	 * @param titulo - texto a ser exibido na barra de t�tulo da caixa de di�logo.
	 */
	public static void msgErro(String mensagem, String titulo){
		showMessageDialog(null, mensagem, titulo, ERROR_MESSAGE);
	}

	/**
	 * Exibe uma mensagem informativa em uma caixa de di�logo.
	 * 
	 * @param componente - componente GUI a ser exibido na caixa de di�logo.
	 * @param mensagem - texto a ser exibido na barra de t�tulo da caixa de di�logo.
	 */
	public static void msgInfo(Object componente, String mensagem){
		showMessageDialog(null, componente, mensagem, INFORMATION_MESSAGE);
	}
	
	/**
	 * Exibe uma mensagem informativa em uma caixa de di�logo.
	 * 
	 * @param janelaPai - componente GUI sobre o qual a mensagem ser� exibida.
	 * @param mensagem - texto a ser exibido na barra de t�tulo da caixa de di�logo.
	 * @param titulo - texto a ser exibido na barra de t�tulo da caixa de di�logo.
	 */
	public static void msgInfo(Component janelaPai,String mensagem,  String titulo){
		showMessageDialog(janelaPai , mensagem, titulo, INFORMATION_MESSAGE);
	}
}