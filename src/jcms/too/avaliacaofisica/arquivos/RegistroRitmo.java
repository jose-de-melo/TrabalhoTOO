package jcms.too.avaliacaofisica.arquivos;

import jcms.too.avaliacaofisica.modelo.ExercicioAerobico;
import jcms.too.avaliacaofisica.modelo.Ritmo;

/**
 * Classe usada para representar o registro de um arquivo da classe {@link ArquivoRitmo}
 * 
 * @author Jos� do Carmo de Melo Silva
 * @since 0.3
 * @see ArquivoRitmo
 */
public class RegistroRitmo {
	private Ritmo ritmo;
	private int numeroRegistro;
	
	/**
	 * Cria uma nova inst�ncia <code>RegistroRitmo</code> a partir dos par�metros passados.
	 * 
	 * @param ritmo - objeto {@link Ritmo}
	 * @param numeroRegistro - <code><b>int</b></code> n�mero do registro no arquivo onde o objeto {@link ExercicioAerobico} que cont�m o det�m o <code>Ritmo</code>
	 * referenciado nesse objeto foi gravado.
	 */
	public RegistroRitmo(Ritmo ritmo, int numeroRegistro) {
		this.ritmo = ritmo;
		this.numeroRegistro = numeroRegistro;
	}

	/**
	 * Retorna o ritmo referenciado pelo objeto.
	 * 
	 * @return - {@link Ritmo} referenciado pelo objeto.
	 */
	public Ritmo getRitmo() {
		return ritmo;
	}

	/**
	 * Retorna o n�mero do registro no arquivo onde o objeto {@link ExercicioAerobico} que cont�m o det�m o <code>Ritmo</code>
	 * referenciado nesse objeto foi gravado.
	 * 
	 * @return <code><b>int</b></code> :  n�mero do registro no arquivo onde o objeto {@link ExercicioAerobico} que cont�m o det�m o <code>Ritmo</code>
	 * referenciado nesse objeto foi gravado.
	 */
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
}