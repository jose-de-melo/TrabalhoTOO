package jcms.too.avaliacaofisica.utilitarios;

import javax.swing.JComboBox;

import org.jfree.chart.JFreeChart;

import jcms.too.avaliacaofisica.gui.IGGraficos;

/**
 * Armazena todas as constantes usadas na aplica��o.
 * 
 * @author Jos� do Carmo de Melo Silva
 */
public class Constantes {
	/*
	 * -------------------------------------------- Constantes usadas nos arquivos  -------------------------------------------- 
	 */
	/**
	 * Representa o n�mero de caracteres usados para representar um tipo do exerc�cio.
	 */
	public static final int TAMANHO_STRING_TIPO_EXERCICIO  = 30;
	/**
	 * Representa o n�mero de caracteres usados para representar um email.
	 */
	public static final int TAMANHO_STRING_EMAIL  = 60;
	/**
	 * Representa o n�mero de caracteres usados para representar uma data.
	 */
	public static final int TAMANHO_STRING_DATA  = 15;
	/**
	 * Representa o n�mero de caracteres usados para representar um tempo (00:00 - 00:00)..
	 */
	public static final int TAMANHO_STRING_TEMPO  = 20;
	/**
	 * Representa o n�mero de caracteres usados para representar uma dura��o em hora.
	 */
	public static final int TAMANHO_STRING_DURACAO_EM_HORA = 15;
	/**
	 * Representa o n�mero de caracteres usados para representar um ritmo.
	 */
	public static final int TAMANHO_STRING_RITMO = 15;
	/**
	 * Representa o n�mero de caracteres usados para representar um ritmo completo (0 Km: 00'00").
	 */
	public static final int TAMANHO_STRING_RITMO_COMPLETO = 35;
	/**
	 * Representa o n�mero de caracteres usados para representar o nome de um arquivo.
	 */
	public static final int TAMANHO_STRING_NOME_ARQUIVO = 30;
	/**
	 * Representa o n�mero de caracteres usados para representar o nome de um usu�rio.
	 */
	public static final int TAMANHO_STRING_NOME_USUARIO = 60;
	/**
	 * Representa o n�mero de caracteres usados para representar o sexo de um usu�rio.
	 */
	public static final int TAMANHO_STRING_SEXO_USUARIO = 15;
	/**
	 * Representa o n�mero de caracteres usados para representar a altura de um usu�rio.
	 */
	public static final int TAMANHO_STRING_ALTURA_USUARIO = 10;
	/**
	 * Representa o n�mero de caracteres usados para representar o peso de um usu�rio.
	 */
	public static final int TAMANHO_STRING_PESO_USUARIO = 10;


	/**
	 * Define o nome da aplica��o.
	 */
	public static final String NOME_PROGRAMA = "Avalia��o F�sica";
	/**
	 * Representa o nome de um tipo de gr�fico
	 */
	public static final String TIPO_DE_GRAFICO_1  = "Gr�fico de Colunas";
	/**
	 * Representa o nome de um tipo de gr�fico
	 */
	public static final String TIPO_DE_GRAFICO_1_POR_TIPO  = "Gr�fico de Colunas - Por Tipo de Exerc�cio";
	/**
	 * Representa o nome de um tipo de gr�fico
	 */
	public static final String TIPO_DE_GRAFICO_2 = "Gr�fico de Linhas";
	/**
	 * Representa o nome de um tipo de gr�fico
	 */
	public static final String TIPO_DE_GRAFICO_2_POR_TIPO  = "Gr�fico de Linhas - Por Tipo de Exerc�cio";
	/**
	 * Representa o nome de um tipo de gr�fico
	 */
	public static final String TIPO_DE_GRAFICO_3  ="Gr�fico de Colunas - Geral";
	/**
	 * Define um valor "todos" para os {@link JComboBox} usados na aplica��o.
	 */
	public static final String VALOR_TODOS_COMBO_BOX = "--- Todos ---";
	/**
	 * Especifica o caminho onde est�o armazenadas as imagens usadas na aplica��o.
	 */
	public static final  String CAMINHO_IMAGENS = "/" + "jcms" + "/" + "too" +"/" + "avaliacaofisica" + "/"+"gui" + "/" + "imagens" + "/";
	/**
	 * Mensagem padr�o de exporta��o bem sucedida.
	 */
	public static final String MENSAGEM_EXPORTACAO_CONCLUIDA = "Exporta��o conclu�da com �xito.";
	/**
	 * Mensagem padr�o de exporta��o abortada ou falha.
	 */
	public static final String MENSAGEM_EXPORTACAO_CANCELADA = "Opera��o cancelada.";
	
	/**
	 * Valor usado para identificar a situa��o de um arquivo importado pela aplica��o.
	 */
	public static final int ARQUIVO_DE_DADOS_INVALIDO_OU_SEM_DADOS_INTEGROS = -1;
	/**
	 * Valor usado para identificar a situa��o de um arquivo importado pela aplica��o.
	 */
	public static final int ARQUIVO_PARCIALMENTE_INTEGRO = 0;
	/**
	 * Valor usado para identificar a situa��o de um arquivo importado pela aplica��o.
	 */
	public static final int ARQUIVO_INTEGRO = 1;

	/**
	 * Posi��o do gr�fico de barras por dura��o dentro do <code>ArrayList</code> de {@link JFreeChart} usado na classe {@link IGGraficos}.
	 */
	public static final int POSICAO_GRAFICO_BARRAS_POR_TIPO_EXERCICIO_DURACAO = 0;
	/**
	 * Posi��o do gr�fico de barras por calorias dentro do <code>ArrayList</code> de {@link JFreeChart} usado na classe {@link IGGraficos}.
	 */
	public static final int POSICAO_GRAFICO_BARRAS_POR_TIPO_EXERCICIO_CALORIAS = 1;
	/**
	 * Posi��o do gr�fico de barras por dist�ncia dentro do <code>ArrayList</code> de {@link JFreeChart} usado na classe {@link IGGraficos}.
	 */
	public static final int POSICAO_GRAFICO_BARRAS_POR_TIPO_EXERCICIO_DISTANCIA = 2;
	/**
	 * Posi��o do gr�fico de barras por passos dentro do <code>ArrayList</code> de {@link JFreeChart} usado na classe {@link IGGraficos}.
	 */
	public static final int POSICAO_GRAFICO_BARRAS_POR_TIPO_EXERCICIO_PASSOS = 3;
	/**
	 * Posi��o do gr�fico de barras por velocidade dentro do <code>ArrayList</code> de {@link JFreeChart} usado na classe {@link IGGraficos}.
	 */
	public static final int POSICAO_GRAFICO_BARRAS_POR_TIPO_EXERCICIO_VELOCIDADE = 4;
	/**
	 * Posi��o do gr�fico de barras por ritmo dentro do <code>ArrayList</code> de {@link JFreeChart} usado na classe {@link IGGraficos}.
	 */
	public static final int POSICAO_GRAFICO_BARRAS_POR_TIPO_EXERCICIO_RITMO = 5;

	
	/**
	 * Posi��o do gr�fico de barras geral por total de passos dentro do <code>ArrayList</code> de {@link JFreeChart} usado na classe {@link IGGraficos}.
	 */
	public static final int POSICAO_GRAFICO_BARRAS_GERAL_TOTAL_PASSOS = 0;
	/**
	 * Posi��o do gr�fico de barras geral por m�dia de calorias dentro do <code>ArrayList</code> de {@link JFreeChart} usado na classe {@link IGGraficos}.
	 */
	public static final int POSICAO_GRAFICO_BARRAS_GERAL_MEDIA_CALORIAS = 1;
	/**
	 * Posi��o do gr�fico de barras geral por total de calorias dentro do <code>ArrayList</code> de {@link JFreeChart} usado na classe {@link IGGraficos}.
	 */
	public static final int POSICAO_GRAFICO_BARRAS_GERAL_TOTAL_CALORIAS = 2;
	/**
	 * Posi��o do gr�fico de barras geral por dist�ncia total percorrida dentro do <code>ArrayList</code> de {@link JFreeChart} usado na classe {@link IGGraficos}.
	 */
	public static final int POSICAO_GRAFICO_BARRAS_GERAL_TOTAL_DISTANCIA = 3;
	/**
	 * Posi��o do gr�fico de barras geral por m�dia de dist�ncia percorrida dentro do <code>ArrayList</code> de {@link JFreeChart} usado na classe {@link IGGraficos}.
	 */
	public static final int POSICAO_GRAFICO_BARRAS_GERAL_MEDIA_DISTANCIA = 4;

	
	/**
	 * Posi��o do gr�fico de linhas por dist�ncia percorrida dentro do <code>ArrayList</code> de {@link JFreeChart} usado na classe {@link IGGraficos}.
	 */
	public static final int POSICAO_GRAFICO_LINHAS_DISTANCIA = 0;
	/**
	 * Posi��o do gr�fico de linhas por calorias dentro do <code>ArrayList</code> de {@link JFreeChart} usado na classe {@link IGGraficos}.
	 */
	public static final int POSICAO_GRAFICO_LINHAS_CALORIAS = 1;
	/**
	 * Posi��o do gr�fico de linhas por passos dados dentro do <code>ArrayList</code> de {@link JFreeChart} usado na classe {@link IGGraficos}.
	 */
	public static final int POSICAO_GRAFICO_LINHAS_PASSOS = 2;

}
