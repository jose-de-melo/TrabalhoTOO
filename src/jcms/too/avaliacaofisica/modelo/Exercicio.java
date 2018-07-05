package jcms.too.avaliacaofisica.modelo;

/**
 * Classe usada para representar um exerc�cio lido de um arquivo de dados que foi importado.
 * 
 * @author Jos� do Carmo de Melo Silva
 * @since 0.1
 *
 */
public class Exercicio implements Comparable<Exercicio>{
	private String tipoExercicio;
	private Usuario usuario;
	private Data dataExercicio;
	private Tempo tempo;
	private Hora duracao;
	private double distancia;
	private double caloriasPerdidas;
	private int passosDados;

	/**
	 * Cria uma inst�ncia <code>Exercicio</code> com valores default.
	 */
	public Exercicio() { }

	/**
	 * Cria uma inst�ncia <code>Exercicio</code> com os valores recebidos como par�metros.
	 * 
	 * @param tipoExercicio - tipo do exer�cio
	 * @param data - data em que foi praticado. Formato (DD/MM/AAAA)
	 * @param tempo - hora de inicio e fim da pr�tica do exerc�cio. Formato (HH:MM - HH:MM)
	 * @param duracao - tempo gasto na pr�tica do exerc�cio. Formato (HH:MM:SS)
	 * @param distancia - dist�ncia percorrida na pr�tica do exerc�cio
 	 * @param caloriasPerdidas - calorias perdidas na pr�tica do exerc�cio
	 * @param passosDados - passos dados na pr�tica do exerc�cio
	 * @param usuario- usu�rio que praticou o exer�cio
	 */
	public Exercicio(String tipoExercicio, Data data, Tempo tempo, Hora duracao, double distancia, double caloriasPerdidas, int passosDados, Usuario usuario) {
		this.tipoExercicio = tipoExercicio;
		this.dataExercicio = data;
		this.tempo = tempo;
		this.duracao = duracao;
		this.distancia = distancia;
		this.caloriasPerdidas = caloriasPerdidas;
		this.passosDados = passosDados;
		this.usuario = usuario;
	}

	/**
	 * Retorna o tipo do exerc�cio
	 * 
	 * @return <code>String</code> : tipo do exerc�cio
	 */
	public String getTipoExercicio() {
		return tipoExercicio;
	}

	/**
	 * Define o tipo do exerc�cio
	 * 
	 * @param tipoExercicio - <code>String</code> : tipo do exerc�cio
	 */
	public void setTipoExercicio(String tipoExercicio) {
		this.tipoExercicio = tipoExercicio;
	}

	/**
	 * Retorna o <code>Usuario</code> que praticou o exerc�cio
	 * 
	 * @return {@link Usuario} que praticou o exerc�cio
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Define o <code>Usuario</code> que praticou o exerc�cio
	 * 
	 * @param usuario : usu�rio que praticou o exerc�cio a ser armazenado 
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Retorna a data em que o exerc�cio foi praticado.
	 * 
	 * @return <code><b>Data</b></code> : data em que o exerc�cio foi praticado
	 */
	public Data getData() {
		return dataExercicio;
	}

	/**
	 * Define a data em que o exerc�cio foi praticado.
	 * 
	 * @param data : {@link Data} em que o exerc�cio foi praticado a ser armazenada.
	 */
	public void setData(Data data) {
		this.dataExercicio = data;
	}

	/**
	 * Retorna o tempo em que o exerc�cio foi realizado
	 * 
	 * @return {@link Tempo} : tempo em que o exerc�cio foi realizado
	 */
	public Tempo getTempo() {
		return tempo;
	}

	/**
	 * Define o tempo em que o exerc�cio foi realizado
	 * 
	 * 
	 * @param tempo {@link Tempo} : tempo em que o exerc�cio foi realizado a ser armazenado
	 */
	public void setTempo(Tempo tempo) {
		this.tempo = tempo;
	}

	/**
	 * Retorna o tempo gasto (dura��o) na pr�tica do exerc�cio.
	 * 
	 * @return {@link Hora} : tempo gasto no exerc�cio. 
	 */
	public Hora getDuracao() {
		return duracao;
	}

	/**
	 * Define o tempo gasto (dura��o) na pr�tica do exerc�cio.
	 * 
	 * @param duracao - {@link Hora} : tempo gasto no exerc�cio a ser armazenado
	 */
	public void setDuracao(Hora duracao) {
		this.duracao = duracao;
	}

	/**
	 * Retorna a dist�ncia percorrida na pr�tica do exerc�cio
	 * 
	 * @return <code><b>double</b></code> : dist�ncia percorrida na pr�tica do exerc�cio
	 */
	public double getDistancia() {
		return distancia;
	}

	/**
	 * Define a dist�ncia percorrida na pr�tica do exerc�cio
	 * 
	 * @param distancia - <code><b>double</b></code> : dist�ncia percorrida na pr�tica do exerc�cio a ser armazenada
	 */
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	/**
	 * Retorna as calorias perdidas na pr�tica do exerc�cio
	 * 
	 * @return <code><b>double</b></code> : calorias perdidas na pr�tica do exerc�cio
	 */
	public double getCaloriasPerdidas() {
		return caloriasPerdidas;
	}

	/**
	 * Define as calorias perdidas na pr�tica do exerc�cio
	 * 
	 * @param caloriasPerdidas - <code><b>double</b></code> : calorias perdidas na pr�tica do exerc�cio a ser armazenada
	 */
	public void setCaloriasPerdidas(double caloriasPerdidas) {
		this.caloriasPerdidas = caloriasPerdidas;
	}

	/**
	 * Retorna o n�mero de passos dados na pr�tica do exerc�cio
	 * 
	 * @return <code><b>int</b></code> : passos dados na pr�tica do exerc�cio
	 */
	public int getPassosDados() {
		return passosDados;
	}

	/**
	 * Define o n�mero de passos dados na pr�tica do exerc�cio
	 * 
	 * @param passosDados - <code><b>int</b></code> : passos dados na pr�tica do exerc�cio a ser armazenada
	 */
	public void setPassosDados(int passosDados) {
		this.passosDados = passosDados;
	}

	/**
	 * Retorna a representa��o textual do objeto. 
	 * 
	 * @return {@link String} : representa��o textual do objeto. Formato "Tipo do Exerc�cio -- Data em que foi praticado -- Tempo em que foi praticado"
	 */
	@Override
	public String toString() {
		return String .format(tipoExercicio + " -- " + dataExercicio.toString() + " -- " + tempo.toString());
	}

	/**
	 * Compara o objeto <code>this</code> com o objeto {@link Exercicio} recebido por par�metro. A compara��o � feita usando os valores
	 * dos campos <code>email</code> do objeto {@link Usuario} que representa o usu�rio que praticou o exerc�cio, <code>data</code> e 
	 * <code>tempo</code>.
	 * 
	 * @param exercicio : objeto a ser comparado com <code>this</code>
	 * 
	 * @return 0 quando for exerc�cios iguais; 1 quando n�o for.
	 */
	@Override
	public int compareTo(Exercicio exercicio) {
		if(exercicio.usuario.getEmail().compareTo(usuario.getEmail()) == 0 && 
			 exercicio.getData().compareTo(dataExercicio) == 0 && 
			 exercicio.getTempo().toString().compareTo(tempo.toString()) == 0)
			return 0;
		else{
			return 1;
		}
	}
}