package jcms.too.avaliacaofisica.utilitarios;

import java.net.URL;

/**
 * Fornece o m�todo para se obter a localiza��o de um recurso no sistema.
 */
public class Recurso {
		/**
		 * Obt�m a localiza��o de um recurso no sistema de arquivos do sistema operacional. 
		 * 
		 * @param nome - nome do recurso a ser localizado no sistema de arquivos.
		 * 
		 * @return {@link URL} : localiza��o do recurso no sistema
		 */
		public static URL obterLocalizacao(String nome) {
			return Recurso.class.getResource(nome);
		}
}
