package jcms.too.avaliacaofisica.utilitarios;
/**
 * Unidades usadas pela aplica��o.
 * 
 * @author Jos� do Carmo de Melo Silva
 * @since 0.1
 *
 */
public enum Unidades {
		/**
		 * Unidade que representa dist�ncias.
		 */
		DISTANCIA("Dist�ncia", "Km"),
		/**
		 * Unidade que representa calorias.
		 */
		CALORIA("Calorias", "kcal"),
		/**
		 * Unidade que representa eleva��es.
		 */
		ELEVACAO("Elevac�o", "m"),
		/**
		 * Unidade que representa minutos.
		 */
		MINUTO("Minuto", "\'"),
		/**
		 * Unidade que representa segundos.
		 */
		SEGUNDO("Segundo", "\""), 
		/**
		 * Unidade que representa velocidades.
		 */
		VELOCIDADE("Velocidade", "Km/h"),
		/**
		 * Unidade que representa ritmos.
		 */
		RITMO("Ritmo", "/Km"),
		/**
		 * Unidade que representa passos.
		 */
		PASSOS("Passos", "N�mero de Passos");
		
		private String nome;
		private String unidade;
		
		private Unidades(String nome, String unidade) {
			this.nome = nome;
			this.unidade = unidade;
		}

		/**
		 * Retorna o nome da enumera��o.
		 * 
		 * @return <code>string</code> : nome da enumera��o.
		 */
		public String getNome() {
			return nome;
		}

		/**
		 * Define o nome da enumera��o.
		 * 
		 * @param nome - <code>string</code> : nome da enumera��o a ser armazenado
		 */
		public void setNome(String nome) {
			this.nome = nome;
		}

		/**
		 * Retorna a unidade usada pela enumera��o.
		 * 
		 * @return <code>string</code> : unidade usada pela enumera��o.
		 */
		public String getUnidade() {
			return unidade;
		}

		/**
		 * Define a unidade usada pela enumera��o.
		 * 
		 * @param unidade - <code>string</code> : unidade usada pela enumera��o a ser armazenada.
		 */
		public void setUnidade(String unidade) {
			this.unidade = unidade;
		}
		
}