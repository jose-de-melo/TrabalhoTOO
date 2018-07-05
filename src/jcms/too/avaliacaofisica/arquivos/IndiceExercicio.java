package jcms.too.avaliacaofisica.arquivos;

import jcms.too.avaliacaofisica.modelo.Exercicio;
/**
 * Classe usada para representar um registro do arquivo da classe {@link ArquivoIndiceExercicio}
 * 
 * @author Jos� do Carmo de Melo Silva
 * @since 0.2
 * @see IndiceExercicio
 */
public class IndiceExercicio {
	private String tipoExercicio, chaveEmail, chaveData, chaveTempo, nomeArquivo;
	private int numeroRegistroNoArquivo;
	
	/**
	 * /**
	 * Cria uma nova inst�ncia <code>IndiceExercicio</code> a partir das strings <code><i>tipoExerc�cio</i></code>, <code><i>chaveEmail</i></code>,
	 * <code><i>chaveData</i></code>, <code><i>chaveTempo</i></code> e <code><i>nomeArquivo</i></code> e do n�mero do registro
	 * no arquivo correspondente.
	 * 
	 * @param tipoExercicio - tipo do exerc�cio referenciado
	 * @param chaveEmail - email do usu�rio que praticou o exerc�cio
	 * @param chaveData - data em que o exerc�cio foi praticado
	 * @param chaveTempo - tempo gasto na pr�tica do arquivo
	 * @param nomeArquivo - arquivo onde o exerc�cio foi gravado
	 * @param numeroRegistroNoArquivo - n�mero do registro no arquivo onde foi gravado
	 */
	public IndiceExercicio(String tipoExercicio, String chaveEmail, String chaveData, String chaveTempo, String nomeArquivo, int numeroRegistroNoArquivo) {
		this.tipoExercicio = tipoExercicio;
		this.chaveEmail = chaveEmail;
		this.chaveData = chaveData;
		this.chaveTempo = chaveTempo;
		this.nomeArquivo = nomeArquivo;
		this.numeroRegistroNoArquivo = numeroRegistroNoArquivo;
	}

	/**
	 * Retorna o tipo do exerc�cio referenciado.
	 * 
	 * @return {@link String} : tipo do exerc�cio referenciado
	 */
	public String getTipoExercicio() {
		return tipoExercicio;
	}

	/**
	 * Define o tipo do exerc�cio referenciado.
	 * 
	 * @param tipoExercicio - {@link String} :  com o tipo do exerc�cio referenciado.
	 */
	public void setTipoExercicio(String tipoExercicio) {
		this.tipoExercicio = tipoExercicio;
	}

	/**
	 * Retorna o tipo do exerc�cio referenciado.
	 * 
	 * @return  {@link String} : email do usu�rio que praticou o exerc�cio referenciado.
	 */
	public String getChaveEmail() {
		return chaveEmail;
	}

	/**
	 * Define email do usu�rio que praticou o exerc�cio referenciado
	 * 
	 * @param chaveEmail  {@link String} : email do usu�rio que praticou o exerc�cio referenciado.
	 */
	public void setChaveEmail(String chaveEmail) {
		this.chaveEmail = chaveEmail;
	}

	/**
	 * Retorna a data em que o exerc�cio referenciado foi praticado.
	 * 
	 * @return - {@link String} data em que o exerc�cio referenciado foi praticado.
	 */
	public String getChaveData() {
		return chaveData;
	}

	/**
	 * Define a data em que o exerc�cio referenciado foi praticado.
	 * 
	 * @param chaveData  {@link String} : data em que o exerc�cio referenciado foi praticado.
	 */
	public void setChaveData(String chaveData) {
		this.chaveData = chaveData;
	}

	/**
	 * Retorna o tempo gasto na pr�tica do exerc�cio referenciado.
	 * 
	 * @return - {@link String} tempo gasto na pr�tica do exerc�cio referenciado.
	 */
	public String getChaveTempo() {
		return chaveTempo;
	}

	/**
	 * Define o tempo gasto na pr�tica do exerc�cio referenciado.
	 * 
	 * @param chaveTempo {@link String} : tempo gasto na pr�tica do exerc�cio referenciado.
	 */
	public void setChaveTempo(String chaveTempo) {
		this.chaveTempo = chaveTempo;
	}

	/**
	 * Retorna o nome do arquivo onde o exerc�cio referenciado foi gravado.
	 * 
	 * @return {@link String} : nome do arquivo onde o exerc�cio referenciado foi gravado.
	 */
	public String getNomeArquivo() {
		return nomeArquivo;
	}

	/**
	 * Define o nome do arquivo onde o exerc�cio referenciado foi gravado.
	 * 
	 * @param nomeArquivo - {@link String} : nome do arquivo onde o exerc�cio referenciado foi gravado.
	 */
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	/**
	 * Retorna o n�mero do registro no arquivo onde o exerc�cio referenciado foi gravado.
	 * 
	 * @return <code>int</code> : n�mero do registro.
	 */
	public int getNumeroRegistroNoArquivo() {
		return numeroRegistroNoArquivo;
	}

	/**
	 * Define o n�mero do registro no arquivo onde o exerc�cio referenciado foi gravado.
	 * 
	 * @param numeroRegistroNoArquivo - <code>int</code> com o n�mero do registro.
	 */
	public void setNumeroRegistroNoArquivo(int numeroRegistroNoArquivo) {
		this.numeroRegistroNoArquivo = numeroRegistroNoArquivo;
	}

	/**
	 * Verifica se o objeto {@link IndiceExercicio} faz refer�ncia ao objeto {@link Exercicio} em arquivo {@link ArquivoIndiceExercicio}.
	 * 
	 * @param exercicio - objeto a ser verificado
	 * @return - <code><b><i>true</i></b></code> quando o objeto {@link IndiceExercicio} referenciar o objeto {@link Exercicio}, <code><b><i>false</i></b></code> quando n�o referenciar.
	 */
	public boolean verificaDadosExercicio(Exercicio exercicio){
		if(exercicio.getTempo().toString().equals(chaveTempo) && exercicio.getData().toString().equals(chaveData) && exercicio.getUsuario().getEmail().equals(chaveEmail)){
			return true;
		}else{
			return false;
		}
	}
}