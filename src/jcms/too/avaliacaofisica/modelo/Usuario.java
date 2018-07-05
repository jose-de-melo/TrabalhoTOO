package jcms.too.avaliacaofisica.modelo;

import java.util.List;

/**
 * Representa um usu�rio que realizou um dos exerc�cios importados pela aplica��o
 * 
 * @author Jos� do Carmo de Melo Silva
 * @since 0.1
 * @see Data
 *
 */
public class Usuario implements Comparable<Usuario>{

	private String nome, email, sexo, altura, peso;
	private Data dataNascimento;
	
	/**
	 * Cria uma nova inst�ncia <code>Usuario</code>.
	 */
	public Usuario() {
	}

	/**
	 * Cria uma nova inst�ncia <code>Usuario</code> com os valores recebidos como par�metro.
	 * 
	 * @param nome - <code>String</code> : nome do usu�rio
	 * @param email - <code>String</code> : email do usu�rio
	 * @param sexo - <code>String</code> : sexo do usu�rio
	 * @param dataNascimento - {@link Data} : data de nascimento do usu�rio
	 * @param altura - <code>String</code> : altura do usu�rio
	 * @param peso - <code>String</code> : peso do usu�rio 
	 */
	public Usuario(String nome, String email, String sexo, Data dataNascimento, String altura, String peso) {
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
		this.peso = peso;
	}

	
	/**
	 * Retorna o nome do usu�rio.
	 * 
	 * @return  <code>String</code> : nome do usu�rio
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define o nome do usu�rio
	 * 
	 * @param nome - <code>String</code> : nome do usu�rio a ser armazenado
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna o email do usu�rio.
	 * 
	 * @return  <code>String</code> : email do usu�rio
	 */
	public String getEmail() {
		return email;
	}

	
	/**
	 * Define o email do usu�rio
	 * 
	 * @param email - <code>String</code> : email do usu�rio a ser armazenado
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	
	/**
	 * Retorna o sexo do usu�rio.
	 * 
	 * @return  <code>String</code> : sexo do usu�rio
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Define o sexo do usu�rio
	 * 
	 * @param sexo - <code>String</code> : sexo do usu�rio a ser armazenado
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	/**
	 * Retorna a data de nascimento do usu�rio
	 * 
	 * @return {@link Data} : data de nascimento do usu�rio
	 */
	public Data getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * Define a data de nascimento do usu�rio
	 * 
	 * @param dataNascimento - {@link Data} : data de nascimento do usu�rio a ser armazenado
	 */
	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * Retorna a altura do usu�rio
	 * 
	 * @return <code>String</code> : altura do usu�rio
	 */
	public String getAltura() {
		return altura;
	}

	/**
	 * Define a altura do usu�rio
	 * 
	 * @param altura - <code>String</code> : altura do usu�rio a ser armazenada
	 */
	public void setAltura(String altura) {
		this.altura = altura;
	}

	
	/**
	 * Retorna o peso do usu�rio
	 * 
	 * @return <code>String</code> : peso do usu�rio
	 */
	public String getPeso() {
		return peso;
	}

	/**
	 * Define o peso do usu�rio
	 * 
	 * @param peso - <code>String</code> : peso do usu�rio a ser armazenado
	 */
	public void setPeso(String peso) {
		this.peso = peso;
	}

	/**
	 * Compara o objeto <code>this</code> com o objeto {@link Usuario} recebido. Usa o campo <code>nome</code> como refer�ncia.
	 * 
	 * ATEN��O : esse m�todo � usado apenas para ordenar {@link List} de {@link Usuario} pelo nome, e n�o foi usado para verificar se 
	 * o usu�rio armazenado j� foi cadastrado no banco de dados da aplica��o.
	 * 
	 * @param usuario : objeto a ser comparado ao <code>this</code>
	 * 
	 * @return <code>int</code> : 0 quando o <code>nome</code> dos usu�rios forem iguais, -1 quando o a representa��o lexicogr�fica
	 * do <code>nome</code> do usu�rio recebido preceder a representa��o do <code>nome</code> do usu�rio armazenado no objeto
	 * <code>this</code> e 1 quando for o contr�rio.
	 */
	@Override
	public int compareTo(Usuario usuario) {
		return nome.compareTo(usuario.nome);
	}
}