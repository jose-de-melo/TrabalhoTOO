package jcms.too.avaliacaofisica.modelo;

import java.util.ArrayList;

/**
 * Classe usada para representar um exerc�cio, com dados de atividades aer�bicas, lido de um arquivo de dados que foi importado.
 * 
 * @author Jos� do Carmo de Melo Silva
 * @since 0.2
 *
 */
public final class ExercicioAerobico extends Exercicio {
	private double velocidadeMedia, velocidadeMaxima;
	private Ritmo ritmoMedio, ritmoMaximo;
	private double menorElevacao, maiorElevacao;
	private ArrayList<Ritmo> ritmosNoExercicio;
	
	/**
	 * Cria uma nova inst�ncia <code>ExercicioAerobico</code> com valores default
	 * 
	 */
	public ExercicioAerobico() {
		ritmoMaximo = new Ritmo();
		ritmoMaximo = new Ritmo();
		ritmosNoExercicio = new ArrayList<Ritmo>();
	}

	/**
	 * Retorna a velocidade m�dia na pr�tica do exerc�cio.
	 * 
	 * @return <code><b>double</b></code> : velocidade m�dia na pr�tica do exerc�cio
	 */
	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}

	/**
	 * Define a velocidade m�dia na pr�tica do exerc�cio.
	 * 
	 * @param velocidadeMedia - <code><b>double</b></code> : velocidade m�dia na pr�tica do exerc�cio a ser armazenada
	 */
	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	/**
	 * Retorna a velocidade m�xima na pr�tica do exerc�cio.
	 * 
	 * @return <code><b>double</b></code> : velocidade m�xima na pr�tica do exerc�cio
	 */
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	/**
	 * Define a velocidade m�dia na pr�tica do exerc�cio.
	 * 
	 * @param velocidadeMaxima - <code><b>double</b></code> : velocidade m�xima na pr�tica do exerc�cio a ser armazenada
	 */
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	/**
	 * Retorna o ritmo m�dio do exerc�cio.
	 * 
	 * @return <code><b>Ritmo</b></code> : ritmo m�dio do exerc�cio
	 */
	public Ritmo getRitmoMedio() {
		return ritmoMedio;
	}

	/**
	 * Define o ritmo m�dio do exerc�cio.
	 * 
	 * @param ritmoMedio - <code><b>Ritmo</b></code> : ritmo m�dio do exerc�cio ser armazenado.
	 */
	public void setRitmoMedio(Ritmo ritmoMedio) {
		this.ritmoMedio = ritmoMedio;
	}

	/**
	 * Retorna o ritmo m�ximo do exerc�cio.
	 * 
	 * @return <code><b>Ritmo</b></code> : ritmo m�ximo do exerc�cio
	 */
	public Ritmo getRitmoMaximo() {
		return ritmoMaximo;
	}

	/**
	 * Define o ritmo m�ximo do exerc�cio.
	 * 
	 * @param ritmoMaximo- <code><b>Ritmo</b></code> : ritmo m�ximo do exerc�cio ser armazenado.
	 */
	public void setRitmoMaximo(Ritmo ritmoMaximo) {
		this.ritmoMaximo = ritmoMaximo;
	}

	/**
	 * Retorna a menor eleva��o alcan�ada no exerc�cio.
	 * 
	 * @return <code><b>double</b></code> : menor eleva��o alcan�ada no exerc�cio
	 */
	public double getMenorElevacao() {
		return menorElevacao;
	}

	/**
	 * Define a menor eleva��o alcan�ada no exerc�cio.
	 * 
	 * @param menorElevacao - <code><b>double</b></code> : menor eleva��o alcan�ada no exerc�cio a ser armazenada
	 */
	public void setMenorElevacao(double menorElevacao) {
		this.menorElevacao = menorElevacao;
	}

	/**
	 * Retorna a maior eleva��o alcan�ada no exerc�cio.
	 * 
	 * @return <code><b>double</b></code> : maior eleva��o alcan�ada no exerc�cio
	 */
	public double getMaiorElevacao() {
		return maiorElevacao;
	}

	/**
	 * Define a maior eleva��o alcan�ada no exerc�cio.
	 * 
	 * @param maiorElevacao - <code><b>double</b></code> : maior eleva��o alcan�ada no exerc�cio a ser armazenada
	 */
	public void setMaiorElevacao(double maiorElevacao) {
		this.maiorElevacao = maiorElevacao;
	}
	
	/**
	 * Define os ritmos do exerc�cio.
	 * 
	 * @param ritmosNoExercicio - {@link ArrayList} <{@link Ritmo}> : ritmos do exerc�cio a serem armazenados
	 */
	public void setRitmosNoExercicio(ArrayList<Ritmo> ritmosNoExercicio) {
		this.ritmosNoExercicio = ritmosNoExercicio;
	}

	/**
	 * Retorna os ritmos do exerc�cio.
	 * 
	 * @return ritmosNoExercicio - {@link ArrayList} <{@link Ritmo}> : ritmos do exerc�cio
	 */
	public ArrayList<Ritmo> getRitmosNoExercicio() {
		return ritmosNoExercicio;
	}
}