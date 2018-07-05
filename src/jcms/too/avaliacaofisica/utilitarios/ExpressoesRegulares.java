package jcms.too.avaliacaofisica.utilitarios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jcms.too.avaliacaofisica.arquivos.ArquivoTexto;

/**
 * Classe usada para validar as linhas com os dados importados de um {@link ArquivoTexto}.
 * 
 * @author Jos� do Carmo de Melo Silva
 * @see ArquivoTexto
 * @see Matcher
 * @see Pattern
 */
public class ExpressoesRegulares {
	/**
	 * <code>Regex</code> usada para validar o tipo do exerc�cio.
	 */
	public static final String TIPO_EXERCICIO = "Exerc�cio: [A-Za-z-z����������������]{1,}";
	/**
	 * <code>Regex</code> usada para validar o nome do usu�rio que praticou o exerc�cio.
	 */
	public static final String NOME = "Nome: [A-Za-z-z����������������]{1,}";
	/**
	 * <code>Regex</code> usada para validar o sexo do usu�rio que praticou o exerc�cio.
	 */
	public static final String SEXO = "Sexo: [A-Za-z]{1,}";
	/**
	 * <code>Regex</code> usada para validar a altura do usu�rio que praticou o exerc�cio.
	 */
	public static final String ALTURA = "Altura: [0-9]{1,}[,\\.]{1,1}[0-9]{1,} [A-Za-z]{1,}";
	/**
	 * <code>Regex</code> usada para validar o peso do usu�rio que praticou o exerc�cio.
	 */
	public static final String PESO = "Peso: [0-9]{1,}[,\\.]{1,1}[0-9]{1,} [A-Za-z]{1,}";
	/**
	 * <code>Regex</code> usada para validar a data de nascimento do usu�rio que praticou o exerc�cio e a data em que o exerc�cio foi praticado.
	 */
	public static final String DATA = "Data[\\sA-Za-z����������������]{0,}: [0-9]{1,2}/[0-9]{1,2}/[0-9]{1,4}";
	/**
	 * <code>Regex</code> usada para validar o email do usu�rio que praticou o exerc�cio.
	 */
	public static final String EMAIL = "E-mail: [A-Za-z0-9\\!\\#\\$\\%\\&\\'\\*\\+\\-/\\=\\?\\^\\_\\`\\.\\{\\|\\}\\~]+@[A-Za-z]+\\.[A-Za-z]+";
	/**
	 * <code>Regex</code> usada para validar o tempo em que o exerc�cio foi praticado.
	 */
	public static final String TEMPO = "Tempo: [012]{1}[0-9]{1}:[012345]{1}[0-9]{1} - [012]{1}[0-9]{1}:[012345]{1}[0-9]{1}";
	/**
	 * <code>Regex</code> usada para validar a dura��o gasta na pr�tica do exerc�cio.
	 */
	public static final String DURACAO = "Dura��o: [012]{1}[0-9]{1}:[012345]{1}[0-9]{1}:[012345]{1}[0-9]{1}";
	/**
	 * <code>Regex</code> usada para validar a dist�ncia percorrida na pr�tica do exerc�cio.
	 */
	public static final String DISTANCIA = "Dist�ncia: [0-9]{1,}[,\\.]{1,1}[0-9]{1,} [A-Za-z]{1,}";
	/**
	 * <code>Regex</code> usada para validar as calorias perdidas na pr�tica do exerc�cio.
	 */
	public static final String CALORIA = "Calorias perdidas: [0-9]{1,}[,\\.]{0,1}[0-9]{0,} [Kk][Cc][Aa][Ll]";
	/**
	 * <code>Regex</code> usada para validar o n�mero de passos dados na pr�tica do exerc�cio.
	 */
	public static final String PASSOS = "Passos: [0-9]{1,}[,\\.]{0,1}[0-9]{0,}"; 
	/**
	 * <code>Regex</code> usada para validar as velocidades m�dia e m�xima alcan�adas na pr�tica do exerc�cio.
	 */
	public static final String VELOCIDADES = "Velocidade[\\sA-Za-z����������������]{0,}:\\s[0-9]{1,}[,\\.]{0,1}[0-9]{1,} [Kk][Mm]/[Hh]";
	/**
	 * <code>Regex</code> usada para validar os ritmos m�dio e m�ximo alcan�ados na pr�tica do exerc�cio.
	 */
	public static final String RITMOS_MEDIO_MAXIMO = "Ritmo[\\sA-Za-z����������������]{0,}: [012345]{1}[0-9]{1}\\'[012345]{1}[0-9]{1}\" /[Kk][Mm]";
	/**
	 * <code>Regex</code> usada para validar a maior e a menor eleva��o alcan�adas na pr�tica do exerc�cio.
	 */
	public static final String ELEVACAO = "[\\sA-Za-z����������������]{0,}[Ee]leva��o: [0-9]{1,}[,\\.]{0,1}[0-9]{0,} [Mm]";
	/**
	 * <code>Regex</code> usada para validar um ritmo no exerc�cio.
	 */
	public static final String RITMO_COMPLETO = "[0-9]{1,} [Kk][Mm]: [012345]{1}[0-9]{1}\\'[012345]{1}[0-9]{1}\"";
	/**
	 * Verifica se a <code>string</code> est� de acordo com o <code>regex</code>.
	 * 
	 * @param texto - <code>string</code> a ser verificada
	 * @param expressaoRegular - <code>regex</code> usada para validar a <code>string</code> recebida.
	 * @return <code><b>true</b></code> : <code>string</code> de acordo com a <code>regex</code> recebida; <code><b>false</b></code>
	 * <code>string</code> n�o bate com a <code>regex</code>
	 */
	public static boolean verificarTexto(String texto, String expressaoRegular){
		Pattern pattern = Pattern.compile(expressaoRegular);
		Matcher matcher = pattern.matcher(texto);
		
		return matcher.find();
	}
	
}
