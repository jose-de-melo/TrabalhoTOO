package jcms.too.avaliacaofisica.utilitarios;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 * Fornece m�todos que ser�o usados com frequ�ncia pela aplica��o.
 * 
 * @author Jos� do Carmo de Melo Silva
 * 	@since 0.5
 */
public class Utilitarios {
	
		/**
		 * Define se os {@link JButton} recebidos est�o ou n�o ativados.
		 * 
		 * @param estado : <code><b>true</b></code> os bot�es ser�o ativados, <code><b>false</b></code> os bot�es ser�o desativados.
		 * @param botoes : bot�es a definir se est�o ou n�o ativados.
		 */
		public static void alterarEnabledBotoes(boolean estado, JButton... botoes){
			for (JButton botao : botoes) {
				botao.setEnabled(estado);
			}
		}
		
		/**
		 * Limpa o texto dos {@link JLabel} recebidos.
		 * 
		 * @param labels - {@link JLabel} a serem limpados.
		 */
		public static void limparLabels(JLabel... labels){
			for (JLabel label : labels) {
				label.setText("");
			}
		}
		
		/**
		 * Define se os {@link JButton} recebidos est�o ou n�o vis�veis.
		 * 
		 * @param visible : <code><b>true</b></code> - os bot�es ter�o sua visibilidade ativada,
		 *  <code><b>false</b></code> os bot�es ter�o sua visibilidade desativada.
		 * @param botoes : bot�es a definir se est�o ou n�o ativados.
		 */
		public static void alterarVisibleBotoes(boolean visible, JButton... botoes){
			for (JButton botao : botoes) {
				botao.setVisible(visible);
			}
		}
		
		/**
		 * Retorna um {@link Icon} com tamanho definido pelos par�metros.
		 * 
		 * @param nomeImagem - <code>string</code> : caminho completo da imagem a ser usada para criar o {@link Icon}
		 * @param width - tamanho da largura do <code>Icon</code>
		 * @param height - tamanho da altura do <code>Icon</code>
		 * @return {@link Icon} : com a imagem especificada e com o tamanho especificado.
		 */
		public static Icon getIconAjustado(String nomeImagem, int width, int height) {
			ImageIcon icone = new ImageIcon(Recurso.obterLocalizacao(Constantes.CAMINHO_IMAGENS +  nomeImagem));
			RedimensionadorDeImagem.redimensionar(icone, width, height);
			return icone;
		}
		
		/**
		 * Define os itens do {@link JComboBox} recebido como par�metro.
		 * 
		 * @param comboBox - {@link JComboBox} : componente a ter os itens definidos.
		 * @param objetos - objetos a serem setados no {@link JComboBox}
		 */
		public static void carregarComboBox(JComboBox<Object> comboBox, Object... objetos) {
			for (Object objeto : objetos) {
				comboBox.addItem(objeto);
			}
		}
}