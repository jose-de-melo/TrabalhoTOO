package jcms.too.avaliacaofisica.arquivos;

import jcms.too.avaliacaofisica.modelo.Usuario;

/**
 * Classe usada para representar um registro de um arquivo da classe {@link ArquivoUsuario}
 * 
 * @author Jos� do Carmo de Melo Silva
 *@since 0.2
 *@see ArquivoUsuario
 *
 */
public class IndiceUsuario {
	private String nomeUser, // 60 caracteres = 120bytes
			       emailUser; // 60 caracteres = 120bytes
	
	private int numeroRegistro; // 4 bytes
	
	/**
	 * Cria uma nova inst�nica IndiceUsuario a partir dos valores passados por par�metro.
	 * 
	 * @param nomeUser - nome do usu�rio a ser referenciado 
	 * @param emailUser - email do usu�rio a ser referenciado 
	 * @param numeroRegistro - n�mero do registro no arquivo onde o objeto referenciado foi gravado.
	 */
	public IndiceUsuario(String nomeUser, String emailUser, int numeroRegistro) {
		this.nomeUser = nomeUser;
		this.emailUser = emailUser;
		this.numeroRegistro = numeroRegistro;
	}

	/**
	 * Retorna o nome do usu�rio referenciado pelo objeto.
	 * 
	 * @return - {@link String} o nome do usu�rio.
	 */
	public String getNomeUser() {
		return nomeUser;
	}

	/**
	 * Define o nome do usu�rio referenciado pelo objeto.
	 * 
	 * @param nomeUser - {@link String} o nome do usu�rio.
	 */
	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}

	/**
	 * Retorna o email do usu�rio referenciado pelo objeto.
	 * 
	 * @return - {@link String} o email do usu�rio.
	 */
	public String getEmailUser() {
		return emailUser;
	}

	/**
	 * Define o email do usu�rio referenciado pelo objeto.
	 * 
	 * @param emailUser - {@link String} o email do usu�rio.
	 */
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	/**
	 * Retorna o n�mero do registro no arquivo onde o objeto {@link Usuario} referenciado foi gravado.
	 * 
	 * @return - <code><b>int</b></code> o n�mero do registro.
	 */
	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	/**
	 * Define o n�mero do registro no arquivo onde o objeto {@link Usuario} referenciado foi gravado.
	 * 
	 * @param numeroRegistro - <code><b>int</b></code> o n�mero do registro.
	 */
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	/**
	 * Verifica se o objeto faz refer�ncia ao o objeto {@link Usuario} passado como par�metro. 
	 * 
	 * @param usuario - {@link Usuario} a verificar se est� sendo referenciado pelo objeto
	 * @return - <code><b>true</b></code> se o objeto fizer refer�ncia ao usu�rio, caso contr�rio, <code><b>false</b></code>.
	 */
	public boolean verificaUsuario(Usuario usuario){
		return usuario.getEmail().equals(emailUser);
	}
	
	/**
	 * Retorna a representa��o textual do objeto. Caso o valor de <code>emailUser</code> seja <code><b>null</b></code>, retorna
	 * no formato ("%s", <code>nomeUser</code>), caso n�o seja, retorna no formato ("%s (%s)", <code>nomeUser</code>, <code>emailUser</code>),
	 * 
	 * 
	 * @return - {@link String} com a representa��o textual do objeto. 
	 */
	@Override
	public String toString() {
		if(emailUser != null)
			return String.format("%s (%s)", nomeUser, emailUser);
		else
			return String.format("%s", nomeUser);
	}
}